package com.samuvlad.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class LeftEntity extends Actor {

    Texture texture;

    public LeftEntity(Texture texture) {
        this.texture = texture;

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture,getX(),getY());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
