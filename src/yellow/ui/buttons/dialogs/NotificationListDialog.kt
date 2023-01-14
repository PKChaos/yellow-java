package yellow.ui.buttons.dialogs

import arc.scene.ui.Dialog
import arc.struct.Seq
import mindustry.ui.dialogs.BaseDialog
import yellow.ui.Notification

open class NotificationListDialog() : BaseDialog("Notifications") {
    init {
        addCloseButton()
    }

    fun show(set: Seq<Notification>): Dialog{
        cont.clear()

        cont.pane{
            set.each{pep ->
                it.add(pep.table).height(270f).growX().update{the ->
                    if(pep.getRemoved()) it.removeChild(the)
                }.row()
            }
        }.grow()
        return super.show()
    }
}