package oblivion;

import mindustry.mod.*;
import template.gen.*;

public class ModTemplate extends Mod{
    @Override
    public void loadContent(){
        EntityRegistry.register();
    }
}
package oblivion;

import arc.Events;
import arc.math.Mathf;
import arc.util.Log;
import oblivion.entities.EntityRegister;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BulletType;
import mindustry.game.EventType;
import mindustry.gen.Unit;
import mindustry.mod.Mod;
import mindustry.mod.Mods;
//import exogenesis.gen.*;

import static arc.Core.app;

public class OblivionMod extends Mod{
    public static Mods.LoadedMod MOD;
    public static final boolean DEBUG = true;

    @Override
    public void loadContent(){
        //EntityRegistry.register();
        EntityRegister.load();
        OblivionUnitTypes.load();
        Utils.init();
    }
}