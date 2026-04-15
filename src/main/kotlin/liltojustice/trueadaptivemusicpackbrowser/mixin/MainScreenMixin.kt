package liltojustice.trueadaptivemusicpackbrowser.mixin

import liltojustice.trueadaptivemusic.client.gui.screen.MainScreen
import liltojustice.trueadaptivemusicpackbrowser.gui.PackBrowserScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject

@Mixin(MainScreen::class)
class MainScreenMixin {
    @Inject(method = ["init"], at = [At("TAIL")])
    fun init() {
        val thisObject = this as MainScreen
        //thisObject.addPackBrowserSupport(PackBrowserScreen(thisObject))
    }
}