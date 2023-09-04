package yellow;

import mindustry.*;
import mindustry.mod.*;
import yellow.internal.*;
import yellow.internal.util.*;
import yellow.ui.buttons.*;
import yellow.ui.buttons.dialogs.*;

import static mindustry.Vars.*;

public class YellowVars{


    public static boolean debugMode = false;

    public static YellowControl yellowControl;
    public static WeaponInfoDialog weaponInfo;
    public static NotificationListDialog notifs;

    public static void load(){
        yellowControl = new YellowControl();
        weaponInfo = new WeaponInfoDialog();
        notifs = new NotificationListDialog();

        yellowControl.build(ui.hudGroup);

        //YellowUtils.emptyHudButtonRow();

        Mods.ModMeta meta = getSelf().meta;

        MetaChaos.load();

        YellowUtils.loop(1f, () -> {
            meta.subtitle = MetaChaos.getSubtitles().random();
            meta.description = MetaChaos.getDescriptions().random();
        });
    }

    public static void onImport(){
        //Vars.ui.showStartupInfo("Hi there!"); this was NOT a good idea
    }

    public static Mods.LoadedMod getSelf(){
        return Vars.mods.getMod("yellow-java");
    }
}
