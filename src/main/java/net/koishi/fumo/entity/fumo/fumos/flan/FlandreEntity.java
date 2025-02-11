package net.koishi.fumo.entity.fumo.fumos.flan;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.init.ModItemsInit;

public class FlandreEntity extends FumoEntity {
    public FlandreEntity(EntityType<? extends FumoEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        fumoDeathSequence(ModItemsInit.FLAN_ITEM.get(), player);
        return InteractionResult.SUCCESS;
    }
}

