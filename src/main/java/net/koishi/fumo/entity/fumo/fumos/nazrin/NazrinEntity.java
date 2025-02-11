package net.koishi.fumo.entity.fumo.fumos.nazrin;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.init.ModItemsInit;

public class NazrinEntity extends FumoEntity {
    public NazrinEntity(EntityType<? extends FumoEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        fumoDeathSequence(ModItemsInit.NAZRIN_ITEM.get(), player);
        return InteractionResult.SUCCESS;
    }
}

