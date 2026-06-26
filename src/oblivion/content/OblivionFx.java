package oblivion.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.util.*;
import mindustry.entities.*;
import mindustry.graphics.*;
import mindustry.type.UnitType;

import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static arc.math.Angles.randLenVectors;
import static arc.math.Interp.*;
import static mindustry.Vars.state;
import static mindustry.Vars.tilesize;
import static mindustry.graphics.Drawf.light;


public class OblivionFx {
    public static final Rand rand = new Rand();
    public static final Vec2 v = new Vec2();

    public static final Effect
            FillerEffect = new Effect(1f, 1f, e -> {});
}