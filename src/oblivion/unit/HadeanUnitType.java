package exogenesis.type.unit;

import mindustry.type.UnitType;
import mindustry.world.meta.Env;

public class HadeanUnitType extends UnitType {

    public HadeanUnitType(String name) {
        super(name);
        outlineColor = ExoPal.geoComplexOutline;
        envDisabled = Env.space;
        outlineRadius = 4;
        immunities.addAll(StatusEffects.burning, StatusEffects.melting);
        researchCostMultiplier = 7.5f;
    }
}