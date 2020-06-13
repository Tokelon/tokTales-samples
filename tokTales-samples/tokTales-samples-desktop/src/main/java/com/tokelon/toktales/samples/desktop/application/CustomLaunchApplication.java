package com.tokelon.toktales.samples.desktop.application;

import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.core.engine.IEngineLauncher;
import com.tokelon.toktales.core.game.IGameAdapter;
import com.tokelon.toktales.desktop.application.TokTalesApplication;
import com.tokelon.toktales.desktop.engine.IDesktopEngineLauncher;
import com.tokelon.toktales.samples.core.DefaultAdapter;
import com.tokelon.toktales.tools.core.sub.inject.config.IHierarchicalInjectConfig;

public class CustomLaunchApplication extends TokTalesApplication {


	@Override
	public void launchEngine(IEngineLauncher defaultLauncher) throws EngineException {
		// The instances returned from makeDefault* methods are just defaults
		// In this method we can use whichever implementations we want, or combine them
		Class<? extends IGameAdapter> gameAdapter = makeDefaultGameAdapter();

		// defaultLauncher is the launcher we create in makeDefaultEngineLauncher()
		defaultLauncher.launch(gameAdapter);
	}

	@Override
	public IDesktopEngineLauncher makeDefaultEngineLauncher(IHierarchicalInjectConfig defaultInjectConfig) {
		return getLauncherFactory()
				.createDefaultLauncherBuilder()
				.withWindow(
						getWindowFactory().createBuilder(800, 600, "Custom Launch Application"),
						getWindowFactory().getDefaultHintsConfigurator())
				.build();
	}

	@Override
	public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
		return DefaultAdapter.class;
	}

}
