package net.koishi.fumo.entity.fumo.fumos.reimublue;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.init.ModItemsInit;

public class ReimuBlueEntity extends FumoEntity {
    public ReimuBlueEntity(EntityType<? extends FumoEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        fumoDeathSequence(ModItemsInit.REIMU_BLUE_ITEM.get(), player);
        return InteractionResult.SUCCESS;
    }
}

