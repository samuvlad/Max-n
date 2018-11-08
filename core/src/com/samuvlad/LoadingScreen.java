package com.samuvlad;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;


public class LoadingScreen extends BaseScreen {

    public LoadingScreen(MainGame game) {
        super(game);


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if(game.getManager().update()){
            game.finishLoading();
        }
    }
}
