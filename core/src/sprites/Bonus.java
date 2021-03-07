package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import scenes.GameScene;
import utils.Transform;

public class Bonus extends GameObject {

	private Sound disparitionSound;
	private Sound apparitionSound;
	private Circle body;

	public Bonus(GameScene scene, float x, float y, Array<String> tags) {
		super(scene, tags);
		this.texture = new Texture(Gdx.files.internal("PNG/decor_7.png"));
		this.apparitionSound = Gdx.audio.newSound(Gdx.files.internal("appearBonusSound.wav"));
		this.disparitionSound = Gdx.audio.newSound(Gdx.files.internal("bonus2Sound.wav"));
		this.transform = new Transform(new Vector2(x, y));
		this.body = new Circle();
		this.body.radius = Math.min(texture.getHeight(),texture.getWidth())/2;
	    this.body.setPosition(this.transform.getPosition());
	    
	}
	public Bonus(GameScene scene, float x, float y) {
		this(scene, x, y, new Array<String>());
	}

	@Override
	public void update(float dt) {	
	}
	
	public boolean overlaps(Circle c) {
		return this.body.overlaps(c);
	}
	
	public void playDisparitionSound() {
		this.disparitionSound.play();
	}
	
	public void playApparitionSound() {
		this.apparitionSound.play();
	}

	public Texture getTexture() {
		return texture;
	}
	
	public Vector2 getTexturePosition() {
		return new Vector2(this.getX()-(this.texture.getWidth()/2), this.getY()-(this.texture.getHeight())/2);
	}
	
}
