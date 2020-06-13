package com.tokelon.toktales.samples.android;

import com.tokelon.toktales.android.application.TokTalesApp;
import com.tokelon.toktales.core.game.IGameAdapter;
import com.tokelon.toktales.samples.core.DefaultAdapter;

public class DefaultApp extends TokTalesApp {
    // Android knows to use this implementation because it is set in AndroidManifest.xml


    @Override
    public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
        return DefaultAdapter.class;
    }

}
