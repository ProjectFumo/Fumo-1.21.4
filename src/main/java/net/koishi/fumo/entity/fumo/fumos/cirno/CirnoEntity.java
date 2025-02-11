package net.koishi.fumo.entity.fumo.fumos.cirno;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.init.ModEntitiesInit;
import net.koishi.fumo.init.ModItemsInit;

public class CirnoEntity extends FumoEntity {
    public CirnoEntity(EntityType<? extends FumoEntity> type, Level level) {
        super(type, level);
    }


    @Override
    public void thunderHit(ServerLevel level, LightningBolt lightning) {
        super.thunderHit(level, lightning);

        // Replace this entity with another entity
        FumoEntity newEntity = ModEntitiesInit.TAN_CIRNO_ENTITY.get().create(level);
        if (newEntity != null) {
            newEntity.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
            newEntity.yHeadRot = this.getYRot();
            newEntity.yBodyRot = this.getYRot();
            level.addFreshEntity(newEntity); // Add the new entity to the world
            this.discard(); // Remove the old entity
        }
    }


    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        fumoDeathSequence(ModItemsInit.CIRNO_ITEM.get(), player);
        return InteractionResult.SUCCESS;
    }
}

