//makes the yellow ContentList accessible by js and console

global.YellowUnitTypes = Reflect.get(Vars.mods.getMod("yellow-java").main, "yellowContent")[0];
global.YellowStatusEffects = Reflect.get(Vars.mods.getMod("yellow-java").main, "yellowContent")[1];
global.YellowPlanets = Reflect.get(Vars.mods.getMod("yellow-java").main, "yellowContent")[2];