package oblivion.unit;

import mindustry.content.StatusEffects;
import mindustry.type.unit.ErekirUnitType;
import mindustry.world.meta.Env;
import oblivion.graphics.OblivionPal;

public class HadeanUnitType extends ErekirUnitType {

    public HadeanUnitType(String name) {
        super(name);
        outlineColor = OblivionPal.HadeanUnitOutline;
        envDisabled = Env.space;
        outlineRadius = 4;
        immunities.addAll(StatusEffects.burning, StatusEffects.melting);
        researchCostMultiplier = 7.5f;
    }
}