package yellow;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import yellow.internal.*;

public class Yellow extends Mod{

    public Yellow(){
        //YellowVars.onImport();

        String yellow = "yellow! ";
        for(int i = 0; i < 5; i++) yellow += yellow;
        Log.info(yellow);
        
        Events.run(ClientLoadEvent.class, YellowVars::load);
    }

    @Override
    public void loadContent(){
        Time.mark();
        YellowContentLoader.load();
        Log.info("Loaded all Yellow content and special disableable weapon mirror in @ seconds", Time.elapsed());
    }
}
