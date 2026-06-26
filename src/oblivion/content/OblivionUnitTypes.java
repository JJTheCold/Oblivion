package oblivion.content;

//General Imports
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;

//Oblivion Imports

//Mindustry Imports
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class UnitTypes{
    //region standard

    //mech
    public static @EntityDef({Unitc.class, Mechc.class}) UnitType mace, dagger, crawler, fortress, scepter, reign, vela;

    //mech, legacy
    public static @EntityDef(value = {Unitc.class, Mechc.class}, legacy = true) UnitType nova, pulsar, quasar;

    //legs
    public static @EntityDef({Unitc.class, Legsc.class}) UnitType corvus, atrax,
    merui, cleroi, anthicus,
    tecta, collaris;

    //legs, legacy
    public static @EntityDef(value = {Unitc.class, Legsc.class}, legacy = true) UnitType spiroct, arkyid, toxopid;

    //hover
    public static @EntityDef({Unitc.class, ElevationMovec.class}) UnitType elude;

    //air
    public static @EntityDef({Unitc.class}) UnitType flare, eclipse, horizon, zenith, antumbra,
    avert, obviate;

    //air, legacy
    public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType mono;

    //air, legacy
    public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType poly;

    //air + payload
    public static @EntityDef({Unitc.class, Payloadc.class}) UnitType mega,
    evoke, incite, emanate, quell, disrupt;

    //air + payload, legacy
    public static @EntityDef(value = {Unitc.class, Payloadc.class}, legacy = true) UnitType quad;

    //air + payload + legacy (different branch)
    public static @EntityDef(value = {Unitc.class, Payloadc.class}, legacy = true) UnitType oct;

    //air, legacy
    public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType alpha, beta, gamma;

    //naval
    public static @EntityDef({Unitc.class, WaterMovec.class}) UnitType risso, minke, bryde, sei, omura, retusa, oxynoe, cyerce, aegires, navanax;

    //special block unit type
    public static @EntityDef({Unitc.class, BlockUnitc.class}) UnitType block;

    //special building tethered (has payload capability, because it's necessary sometimes)
    public static @EntityDef({Unitc.class, BuildingTetherc.class, Payloadc.class}) UnitType manifold, assemblyDrone;

    //tank
    public static @EntityDef({Unitc.class, Tankc.class}) UnitType stell, locus, precept, vanquish, conquer;

    //endregion

    //missile definition, unused here but needed for codegen
    public static @EntityDef({Unitc.class, TimedKillc.class}) UnitType missile;

    //region neoplasm

    public static @EntityDef({Unitc.class, Crawlc.class}) UnitType latum, renale;

    //endregion

    public static void load(){
        //region ground attack

        prevail = new UnitType("prevail"){{
            researchCostMultiplier = 0.5f;
            speed = 0.5f;
            hitSize = 8f;
            health = 150;
            stepSoundVolume = 0.4f;

            weapons.add(new Weapon("large-weapon"){{
                reload = 13f;
                x = 4f;
                y = 2f;
                top = false;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(2.5f, 9){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
        //endregion
    }
}