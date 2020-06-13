package com.tokelon.toktales.samples.android;

import com.tokelon.toktales.android.application.TokTalesApp;
import com.tokelon.toktales.core.game.IGameAdapter;
import com.tokelon.toktales.samples.core.DefaultAdapter;

public class DefaultApp extends TokTalesApp {


    @Override
    public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
        return DefaultAdapter.class;
    }

}
