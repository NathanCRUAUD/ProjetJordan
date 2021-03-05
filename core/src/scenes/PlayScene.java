package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import managers.GameSceneManager;
import sprites.Monstre;
import utils.Resizer;

public class PlayScene extends GameScene {

	private Texture background;
	private Monstre monstre;
	
	public PlayScene(GameSceneManager gsm) {
		super(gsm);
		this.background = Resizer.resize("PNG/vlite.png");
		this.monstre = new Monstre(300,300);
	}

	@Override
	protected void handleInput() {
		
		if(Gdx.input.isKeyPressed(Input.Keys.A)) {this.gsm.push(new Home(this.gsm));}
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {this.monstre.moveLeft();}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {this.monstre.moveRight();}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)) {this.monstre.moveUp();;}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {this.monstre.moveDown();}

	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		this.handleInput();
		this.monstre.update(dt);
	}

	@Override
	public void render(SpriteBatch sb) {
		sb.begin();
		sb.draw(this.background, 0,0);
		sb.draw(this.monstre.getTexture(), this.monstre.getPosition().x, this.monstre.getPosition().y);
		sb.end();

	}

	@Override
	public void dispose() {
		this.background.dispose();

	}

}
