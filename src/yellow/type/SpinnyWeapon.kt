package yellow.type

import arc.util.Time
import mindustry.entities.units.WeaponMount
import mindustry.type.Weapon

import yellow.entities.units.*

/** An extension of Weapon that rotates indefinitely. Taken from Ion.*/
open class SpinnyWeapon(name: String, displayName: String, var spinSpeed: Float = 0.8f): DisableableWeapon(name, displayName) {

    init{
        rotate = false
        shootCone = 360f
        baseRotation = 1f
    }

    override fun update(unit: mindustry.gen.Unit, mount: WeaponMount){
        if(!(mount as DisableableWeaponMount).enabled) return
        super.update(unit, mount)

        mount.weapon.baseRotation += Time.delta * spinSpeed
        mount.rotation += Time.delta * spinSpeed
        mount.targetRotation += Time.delta * spinSpeed
    }
}