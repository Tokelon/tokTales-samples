package com.tokelon.toktales.samples.desktop;

import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.samples.desktop.application.DefaultApplication;

public class DefaultMain {


	public static void main(String[] args) throws EngineException {
		// The main method only needs to run the application
		new DefaultApplication().run(args);
	}

}
