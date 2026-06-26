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
import arc.graphics.*;
import arc.math.*;
import mindustry.ai.types.BuilderAI;
import mindustry.ai.types.DefenderAI;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.content.*;

import static arc.math.Angles.randLenVectors;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.stroke;
import static mindustry.Vars.tilesize;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

import oblivion.unit.HadeanUnitType;


public class OblivionUnitTypes{
    public static UnitType
    //region standard

    //mech
    prevail;
    //endregion

    public static void load(){
        //region ground attack

        prevail = new HadeanUnitType("prevail"){{
            faceTarget = true;
            drag = 0.1f;
            speed = 0.5f;
            hitSize = 26f;
            health = 46000;
            armor = 32f;
            lightRadius = 300f;
            lightColor = Color.valueOf("ff4f00");


            legCount = 6;
            legMoveSpace = 0.8f;
            legLength = 75f;
            stepShake = 1f;
            legLengthScl = 0.93f;
            rippleScale = 3f;
            legSpeed = 0.19f;
            lockLegBase = true;
            legContinuousMove = true;
            legExtension = -18;
            legForwardScl = 1;
            envDisabled = 0;
            legBaseOffset = 10;
            legPairOffset = 5;
            rotateSpeed = 1.5f;
            legSplashDamage = 120;

            legSplashRange = 60;

            hovering = true;
            shadowElevation = 1.2f;
            groundLayer = Layer.legUnit + 1f;

            for(int i = 0; i < 5; i++){
                int fi = i;
                parts.add(new RegionPart("-spine"){{
                    y = 21f / 4f - 45f / 4f * fi / 4f;
                    moveX = 21f / 4f + Mathf.slope(fi / 4f) * 1.25f;
                    moveRot = 10f - fi * 14f;
                    float fin = fi  / 4f;
                    progress = PartProgress.recoil.inv().mul(1.3f).add(0.1f).sustain(fin * 0.34f, 0.14f, 0.14f);
                    layerOffset = -0.001f;
                    mirror = true;
                }});
            }

            weapons.add(new Weapon("prevail-cannon"){{
                reload = 3f;
                x = 30f;
                y = 0f;
                top = false;
                ejectEffect = Fx.none;
                bullet = new BasicBulletType(2.5f, 9){{
                    width = 0.1f;
                    height = 0.1f;
                    speed = 8f;
                    damage = 42f;
                    despawnEffect= Fx.none;
                    status = StatusEffects.melting;
                    hittable = false;
                    lightOpacity = 0;
                    reflectable = false;
                    statusDuration = 60f * 25;
                    lifetime = 60f;
                    pierce = true;
                    pierceBuilding = true;
                    incendAmount = 15;
                }};
            }});
        }};
        //endregion
    }
}