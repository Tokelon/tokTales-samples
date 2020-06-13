package com.tokelon.toktales.samples.core;

import com.tokelon.toktales.core.game.model.ICamera;
import com.tokelon.toktales.core.game.state.BaseGamestate;
import com.tokelon.toktales.core.game.state.scene.IGameScene;
import com.tokelon.toktales.core.screen.surface.ISurface;

import javax.inject.Inject;

public class DefaultGamestate extends BaseGamestate<IGameScene> {


    @Inject
    public DefaultGamestate() {
        // Inject any dependencies here
    }


    @Override
    public void onEngage() {
        super.onEngage();

        // Setup this gamestate here
    }

    @Override
    public void onUpdate(long timeMillis) {
        super.onUpdate(timeMillis);

        // Update this gamestate here
    }

    @Override
    public void onRender() {
        super.onRender();

        // Render this gamestate here
    }


    @Override
    protected void onSurfaceChanged(ISurface surface) {
        super.onSurfaceChanged(surface);

        if(!surface.equals(getCurrentSurface())) {
            // Only apply changes from the current surface
            return;
        }


        // Adjust the camera according to viewport changes here
        float targetCameraWidth = surface.getViewport().getWidth();
        float targetCameraHeight = surface.getViewport().getHeight();

        ICamera camera = getStateRenderer().getCurrentCamera();
        camera.setSize(targetCameraWidth, targetCameraHeight);
    }

}
