package com.relic.cornmod.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFood {

    public static final FoodComponent CORN = (new FoodComponent.Builder()).hunger(2).saturationModifier(.2f).build();
    public static final FoodComponent ROASTED_CORN = (new FoodComponent.Builder()).hunger(5).saturationModifier(.4f).build();
    public static final FoodComponent POPCORN = (new FoodComponent.Builder()).hunger(1).saturationModifier(.1f).snack().build();
    public static final FoodComponent BAG_OF_POPCORN = (new FoodComponent.Builder()).hunger(2).saturationModifier(.2f).snack().build();

    public static final FoodComponent CORNED_BEEF = (new FoodComponent.Builder())
            .hunger(10)     .saturationModifier(.8f)    .meat()
            .statusEffect(
                    new StatusEffectInstance(StatusEffects.REGENERATION, 60, 0),
                    1.00f // 100% chance of happening
            )
            .build();


}
