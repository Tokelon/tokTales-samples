package com.tokelon.toktales.samples.desktop.application;

import com.tokelon.toktales.core.game.IGameAdapter;
import com.tokelon.toktales.desktop.application.TokTalesApplication;
import com.tokelon.toktales.samples.core.DefaultAdapter;

public class DefaultApplication extends TokTalesApplication {


    @Override
    public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
        return DefaultAdapter.class;
    }

}
