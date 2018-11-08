package com.samuvlad;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.samuvlad.entities.LeftEntity;

public class GameScreen extends BaseScreen {


	Stage stage;

	LeftEntity leftEntity;

	Texture torpedo;

	public GameScreen(MainGame game) {
		super(game);

		stage = new Stage();
		torpedo = game.getManager().get("torpedo.png");
		leftEntity = new LeftEntity(torpedo);

		stage.addActor(leftEntity);
	}

	@Override
	public void show() {
		super.show();
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
	}

	@Override
	public void hide() {
		super.hide();
	}

	
	@Override
	public void dispose () {

	}
}
