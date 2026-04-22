package liltojustice.trueadaptivemusicpackbrowser.client

import liltojustice.trueadaptivemusic.client.TAMClient
import liltojustice.trueadaptivemusicpackbrowser.gui.PackBrowserScreen
import net.fabricmc.api.ClientModInitializer

class TrueAdaptiveMusicPackBrowserClientInitializer: ClientModInitializer {
    override fun onInitializeClient() {
        TAMClient.addPackBrowserSupport { parent -> PackBrowserScreen(parent) }
    }
}