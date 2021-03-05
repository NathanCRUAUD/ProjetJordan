package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import utils.Constants;

public class Monstre {

	private Texture texture;
	private Vector2 position;
	private Vector2 direction;
	
	public Monstre(float x, float y) {
		this.texture = new Texture("PNG/greenery_2.png");
		this.position = new Vector2(x, y);
		this.direction = new Vector2(0,0);
		
		
	}
	public void update(float dt) {
		int x = 0;
		int y = 0;
		
		
		this.direction.add(x*Constants.SPEED, y*Constants.SPEED);
		this.direction.scl(dt);
		this.position.add(this.direction);
		this.direction.scl(1/dt);
		
		if(this.position.y < Constants.MIN_Y) {
			this.position.y = Constants.MIN_Y;
			this.direction.y = 0;
		}
		else if(this.position.y > Constants.MAX_Y) {
			this.position.y = Constants.MAX_Y;
			this.direction.y = 0;
		}
		else if(this.position.x > Constants.MAX_X) {
			this.position.x = Constants.MAX_X;
			this.direction.x = 0;
		}
		else if(this.position.x < Constants.MIN_X) {
			this.position.x = Constants.MIN_X;
			this.direction.x = 0;
		}
		
	}
	public void moveRight() {
		this.position.x+=Constants.SPEED;
	}
	public void moveLeft() {
		this.position.x-=Constants.SPEED;
	}
	public void moveUp() {
		this.position.y+=Constants.SPEED;
	}
	public void moveDown() {
		this.position.y-=Constants.SPEED;
	}
	public Texture getTexture() {
		return this.texture;
	}
	public Vector2 getPosition() {
		return this.position;
	}
	public void dispose() {
		this.texture.dispose();
	}
}
