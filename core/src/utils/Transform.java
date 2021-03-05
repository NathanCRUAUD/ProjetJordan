package utils;

import com.badlogic.gdx.math.Vector2;

public class Transform {
	
	private Vector2 position;
	private Vector2 rotation;
	private double scale;
	
	public Transform() {
	}

	public Transform(Vector2 position, Vector2 rotation, double scale) {
		this.position = position;
		this.rotation = rotation;
		this.scale = scale;
	}
	public Transform(Vector2 position) {
		this(position, new Vector2(0,0), 1.0);
	}
	public Transform(int x, int y) {
		this(new Vector2(x,y), new Vector2(0,0), 1.0);
	}

	public Vector2 getPosition() {
		return position;
	}
	public int getX() {
		return (int)position.x;
	}
	public int getY() {
		return (int)position.y;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public Vector2 getRotation() {
		return rotation;
	}

	public void setRotation(Vector2 rotation) {
		this.rotation = rotation;
	}

	public double getScale() {
		return scale;
	}

	public void setScale(double scale) {
		this.scale = scale;
	}
	


}
