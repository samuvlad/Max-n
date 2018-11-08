package com.samuvlad;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class MainGame extends Game {

    public BaseScreen gameScreen, loadingScreen;

    private AssetManager manager;

    @Override
    public void create() {


        manager = new AssetManager();

        manager.load("torpedo.png", Texture.class);


        loadingScreen = new LoadingScreen(this);
        setScreen(loadingScreen);



    }

    public void finishLoading(){
        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }

    public AssetManager getManager() {
        return manager;
    }
}
