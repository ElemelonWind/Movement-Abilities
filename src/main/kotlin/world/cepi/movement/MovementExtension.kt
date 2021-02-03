package world.cepi.movement

import net.minestom.server.extensions.Extension

//import net.minestom.server.movement.MovementExtension;

class MovementExtension : Extension() {

    override fun initialize() {
        logger.info("[Movement-Abilities] has been enabled!")
    }

    override fun terminate() {
        logger.info("[Movement-Abilities] has been disabled!")
    }
}