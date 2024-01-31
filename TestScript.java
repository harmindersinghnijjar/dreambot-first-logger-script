import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Logger;

@ScriptManifest(name = "Script Name", description = "My script description!", author = "Developer Name",
                version = 1.0, category = Category.WOODCUTTING, image = "")
public class TestScript extends AbstractScript {

        @Override
    public int onLoop() {
        Logger.log("My first script!");

        return 1000;
    }

}
