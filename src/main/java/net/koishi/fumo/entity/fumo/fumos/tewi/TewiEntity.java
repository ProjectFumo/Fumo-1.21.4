package net.koishi.fumo.entity.fumo.fumos.tewi;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.init.ModItemsInit;

public class TewiEntity extends FumoEntity {
    public TewiEntity(EntityType<? extends FumoEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        fumoDeathSequence(ModItemsInit.TEWI_ITEM.get(), player);
        return InteractionResult.SUCCESS;
    }
}

