package world.cepi.movement

import net.minestom.server.chat.ChatColor
import net.minestom.server.command.CommandSender
import net.minestom.server.command.builder.Command
import net.minestom.server.entity.Player
import world.cepi.kstom.addSyntax
import world.cepi.kstom.arguments.asSubcommand

class TestCmd : Command("gravity") {
    init {
        val on = "on".asSubcommand()
        val off = "off".asSubcommand()

        addSyntax(on) { player ->
            val p = player as Player
            p.setNoGravity(false)
            p.sendMessage("${ChatColor.DARK_CYAN}Gravity has been turned on!")
        }

        addSyntax(off) { player ->
            val p = player as Player
            p.setNoGravity(true)
            p.sendMessage("${ChatColor.DARK_GREEN}Gravity has been turned off!")
        }

//        setDefaultExecutor { sender: CommandSender, cmd: String[], _ ->
//            val player = sender as Player
//
//            player.setGravity(2.0, 2.0,2.0)
//        }
    }
}