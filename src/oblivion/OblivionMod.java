package oblivion;

import arc.Events;
import arc.math.Mathf;
import arc.util.Log;
import oblivion.content.OblivionUnitTypes;
import oblivion.entities.EntityRegister;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BulletType;
import mindustry.game.EventType;
import mindustry.gen.Unit;
import mindustry.mod.Mod;
import mindustry.mod.Mods;
import oblivion.util.Utils;
//import exogenesis.gen.*;

import static arc.Core.app;

public class OblivionMod extends Mod{
    public static Mods.LoadedMod MOD;
    public static final boolean DEBUG = true;

    @Override
    public void loadContent(){
        EntityRegister.load();
        Utils.init();
        EntityRegister.load();
        OblivionUnitTypes.load();
    }
}