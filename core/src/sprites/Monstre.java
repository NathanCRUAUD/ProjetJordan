package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import scenes.GameScene;
import utils.Constants;
import utils.Transform;

public class Monstre extends GameObject{

	private Circle body;
	private GameObject nearestBonus;
	private GameObject nearestEnnemis;
	
	
	public Monstre(GameScene scene, float x, float y, Array<String> tags) {
		super(scene, tags);
		this.texture = new Texture("PNG/greenery_2.png");
		this.transform = new Transform(new Vector2(0, 0));
		float radius = Math.min(this.texture.getHeight(),this.texture.getWidth())/2;
		this.body = new Circle(this.transform.getPosition(), radius);	
	}
	
	public Monstre(GameScene scene, float x, float y) {
		this(scene, x, y, new Array<String>());
	}
	
	public void update(float dt) {
		
		nearestBonus = this.nearest("bonus");
		if(this.tags.contains("Equipe1", false)) {
			nearestEnnemis = this.nearest("Equipe2");
		}
		if(this.tags.contains("Equipe2", false)) {
			nearestEnnemis = this.nearest("Equipe1");
		}
		if (nearestBonus!=null) {
			this.moveToward(nearestBonus);
		}
		else if (nearestBonus==null && nearestEnnemis!=null) {
			this.moveToward(nearestEnnemis);
		}
		
		//GameObject nearestBonus = this.nearest("bonus");
//		if(nearest!=null) {
//			System.out.println("nearest: "+nearest+"\n"+this.getPosition().dst(nearest.getPosition())+" unités");
//		}
		
		
		
		if(this.transform.getY() < Constants.MIN_Y) {
			this.transform.setY(Constants.MIN_Y);
		}
		else if(this.transform.getY() > Constants.MAX_Y) {
			this.transform.setY(Constants.MAX_Y);
		}
		else if(this.transform.getX() > Constants.MAX_X) {
			this.transform.setX(Constants.MAX_X);
		}
		else if(this.transform.getX() < Constants.MIN_X) {
			this.transform.setX(Constants.MIN_X);
		}
		
		this.body.setPosition(this.transform.getPosition());
	}
	
	public void moveRight() {
		this.transform.setX(this.transform.getX()+Constants.SPEED * Gdx.graphics.getDeltaTime());
	}
	public void moveLeft() {
		this.transform.setX(this.transform.getX()-Constants.SPEED * Gdx.graphics.getDeltaTime());
	}
	public void moveUp() {
		this.transform.setY(this.transform.getY()+Constants.SPEED * Gdx.graphics.getDeltaTime());
	}
	public void moveDown() {
		this.transform.setY(this.transform.getY()-Constants.SPEED * Gdx.graphics.getDeltaTime());
	}
	public Texture getTexture() {
		return this.texture;
	}
	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	public Circle getBody() {
		return body;
	}
	public void dispose() {
		this.texture.dispose();
	}
}
