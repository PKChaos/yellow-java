package yellow.weapons;

import arc.*;
import arc.flabel.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.mod.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

public class YellowWeapons{
    public static Weapon
    
    meltdownShotgun; /*bullethell, gigaDiamond, stopSign,
    deleter, pingIncreaser*/
    
    public static void init(){
        meltdownShotgun = new Weapon("meltdown-shotgun"){{
            reload = 60f;
            x = 56f;
            mirror = true;
            shots = 15;
            inaccuracy = 30f;
            bullet = new ContinuousLaserBulletType(){{
                damage = 100f;
                width = 8f;
                length = 240f;
                lifetime = 60f;
            }};
        }};
    }
}