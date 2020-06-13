package com.tokelon.toktales.samples.android;

import com.tokelon.toktales.android.application.TokTalesApp;
import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.core.engine.IEngineLauncher;
import com.tokelon.toktales.samples.core.DefaultAdapter;

public class CustomLaunchApp extends TokTalesApp {


    @Override
    public void launchEngine(IEngineLauncher defaultLauncher) throws EngineException {
        // Here we create the engine launcher directly and launch it with our game adapter
        getLauncherFactory()
                .createDefaultLauncher(getApplicationContext())
                .launch(DefaultAdapter.class);
    }

}
