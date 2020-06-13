package com.tokelon.toktales.samples.core;

import com.tokelon.toktales.core.engine.IEngineContext;
import com.tokelon.toktales.core.game.EmptyGameAdapter;

import javax.inject.Inject;

public class DefaultAdapter extends EmptyGameAdapter {


    private final DefaultGamestate defaultGamestate;

    @Inject
    public DefaultAdapter(DefaultGamestate defaultGamestate) {
        this.defaultGamestate = defaultGamestate;
    }


    @Override
    public void onCreate(IEngineContext engineContext) {
        // Add any gamestates here
        engineContext.getGame().getStateControl().addState("DefaultGamestate", defaultGamestate);

        // Select the startup defaultGamestate
        engineContext.getGame().getStateControl().changeState("DefaultGamestate");
    }

}
