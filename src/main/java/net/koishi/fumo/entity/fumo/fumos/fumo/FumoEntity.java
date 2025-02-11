package net.koishi.fumo.entity.fumo.fumos.fumo;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.ForgeRegistries;
import net.koishi.fumo.init.ModItemsInit;
import org.jetbrains.annotations.Nullable;

public class FumoEntity extends Animal {


    public FumoEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }


    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.getEntity() != null) {
            if (source.getEntity().isCrouching()) {
                    //Level _level = this.level()
                    //_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((this.getX() + 0.5), (this.getY() + 1), (this.getZ() + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), this.level().getServer(), null).withSuppressedOutput(), ("/summon " + Fumo.MODID + ":" + this.getType() + " ~ ~ ~ " + "{Rotation:[" + (source.getEntity().getYRot() - 180) + "f]}"));
                this.setYRot(source.getEntity().getYRot() - 180);
                this.yHeadRot = this.getYRot();
                this.yBodyRot = this.getYRot();
                //this.hasImpulse = true; // Optional: Mark the entity as needing an update
                this.playSound(SoundEvents.WOOL_BREAK,1.0f, 1.0f);

            }
        }
        return false; // Immune to all damage sources.
    }


    public void fumoDeathSequence(ForgeSpawnEggItem itemToSpawn, Player player){
        if (player.isCrouching()) {
            this.spawnAtLocation(itemToSpawn);
            this.playSound(SoundEvents.WOOL_BREAK,1.0f, 1.0f);
            this.remove(Entity.RemovalReason.KILLED);
        }
    }


    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        fumoDeathSequence(ModItemsInit.FUMO_ITEM.get(), player);
        return InteractionResult.SUCCESS;
    }


    @Override
    public @Nullable SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break"));
    }


    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break"));
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }
}

