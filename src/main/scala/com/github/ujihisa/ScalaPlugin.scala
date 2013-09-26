package com.github.ujihisa
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler

class ScalaPlugin extends JavaPlugin with Listener {
	override def onEnable {
		println('cool)
		getServer.getPluginManager.registerEvents(this, this);
	}

    @EventHandler
    def onPlayerJoin(evt: org.bukkit.event.player.PlayerJoinEvent) {
		val player = evt.getPlayer
		player.sendMessage("welcome to minecraft!")
    }
}
