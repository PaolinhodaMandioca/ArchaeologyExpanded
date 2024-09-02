package me.pmnq.ArchaeologyExpanded.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

public class ModBrush extends Item {
    public static final int ANIMATION_DURATION = 10;
    private static final int USE_DURATION = 200;


    public ModBrush(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        if (player != null && this.calculateHitResult(player).getType() == HitResult.Type.BLOCK) {
            player.startUsingItem(context.getHand());
        }

        return InteractionResult.CONSUME;
    }

    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BRUSH;
    }

    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return USE_DURATION;
    }

    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int remainingUseDuration) {
        if (remainingUseDuration >= 0 && livingEntity instanceof Player player) {
            HitResult hitresult = this.calculateHitResult(player);
            if (hitresult instanceof BlockHitResult blockhitresult) {
                if (hitresult.getType() == HitResult.Type.BLOCK) {
                    int i = this.getUseDuration(stack, livingEntity) - remainingUseDuration + 1;
                    boolean flag = i % ANIMATION_DURATION == 5;
                    if (flag) {
                        BlockPos blockpos = blockhitresult.getBlockPos();
                        BlockState blockstate = level.getBlockState(blockpos);
                        HumanoidArm humanoidarm = livingEntity.getUsedItemHand() == InteractionHand.MAIN_HAND ? player.getMainArm() : player.getMainArm().getOpposite();
                        if (blockstate.shouldSpawnTerrainParticles() && blockstate.getRenderShape() != RenderShape.INVISIBLE) {
                            this.spawnDustParticles(level, blockhitresult, blockstate, livingEntity.getViewVector(0.0F), humanoidarm);
                        }

                        Block var15 = blockstate.getBlock();
                        SoundEvent soundevent;
                        if (var15 instanceof BrushableBlock) {
                            BrushableBlock brushableblock = (BrushableBlock)var15;
                            soundevent = brushableblock.getBrushSound();
                        } else {
                            soundevent = SoundEvents.BRUSH_GENERIC;
                        }

                        level.playSound(player, blockpos, soundevent, SoundSource.BLOCKS);
                        if (!level.isClientSide()) {
                            BlockEntity var18 = level.getBlockEntity(blockpos);
                            if (var18 instanceof BrushableBlockEntity) {
                                BrushableBlockEntity brushableblockentity = (BrushableBlockEntity)var18;
                                boolean flag1 = brushableblockentity.brush(level.getGameTime(), player, blockhitresult.getDirection());
                                if (flag1) {
                                    EquipmentSlot equipmentslot = stack.equals(player.getItemBySlot(EquipmentSlot.OFFHAND)) ? EquipmentSlot.OFFHAND : EquipmentSlot.MAINHAND;
                                    stack.hurtAndBreak(1, livingEntity, equipmentslot);
                                }
                            }
                        }
                    }

                    return;
                }
            }

            livingEntity.releaseUsingItem();
        } else {
            livingEntity.releaseUsingItem();
        }

    }

    private HitResult calculateHitResult(Player player) {
        return ProjectileUtil.getHitResultOnViewVector(player, (p_281111_) -> {
            return !p_281111_.isSpectator() && p_281111_.isPickable();
        }, player.blockInteractionRange());
    }

    private void spawnDustParticles(Level level, BlockHitResult hitResult, BlockState state, Vec3 pos, HumanoidArm arm) {
        double d0 = 3.0;
        int i = arm == HumanoidArm.RIGHT ? 1 : -1;
        int j = level.getRandom().nextInt(7, 12);
        BlockParticleOption blockparticleoption = new BlockParticleOption(ParticleTypes.BLOCK, state);
        Direction direction = hitResult.getDirection();
        DustParticlesDelta brushitem$dustparticlesdelta = DustParticlesDelta.fromDirection(pos, direction);
        Vec3 vec3 = hitResult.getLocation();

        for(int k = 0; k < j; ++k) {
            level.addParticle(blockparticleoption, vec3.x - (double)(direction == Direction.WEST ? 1.0E-6F : 0.0F), vec3.y, vec3.z - (double)(direction == Direction.NORTH ? 1.0E-6F : 0.0F), brushitem$dustparticlesdelta.xd() * (double)i * 3.0 * level.getRandom().nextDouble(), 0.0, brushitem$dustparticlesdelta.zd() * (double)i * 3.0 * level.getRandom().nextDouble());
        }

    }

    public boolean canPerformAction(ItemStack stack, ItemAbility itemAbility) {
        return ItemAbilities.DEFAULT_BRUSH_ACTIONS.contains(itemAbility);
    }

    static record DustParticlesDelta(double xd, double yd, double zd) {

        DustParticlesDelta(double xd, double yd, double zd) {
            this.xd = xd;
            this.yd = yd;
            this.zd = zd;
        }

        public static DustParticlesDelta fromDirection(Vec3 pos, Direction direction) {
            double d0 = 0.0;
            DustParticlesDelta var10000;
            switch (direction) {
                case DOWN:
                case UP:
                    var10000 = new DustParticlesDelta(pos.z(), 0.0, -pos.x());
                    break;
                case NORTH:
                    var10000 = new DustParticlesDelta(1.0, 0.0, -0.1);
                    break;
                case SOUTH:
                    var10000 = new DustParticlesDelta(-1.0, 0.0, 0.1);
                    break;
                case WEST:
                    var10000 = new DustParticlesDelta(-0.1, 0.0, -1.0);
                    break;
                case EAST:
                    var10000 = new DustParticlesDelta(0.1, 0.0, 1.0);
                    break;
                default:
                    throw new MatchException((String)null, (Throwable)null);
            }

            return var10000;
        }

        public double xd() {
            return this.xd;
        }

        public double yd() {
            return this.yd;
        }

        public double zd() {
            return this.zd;
        }
    }
}
