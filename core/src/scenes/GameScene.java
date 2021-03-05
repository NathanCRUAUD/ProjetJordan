package scenes;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import managers.GameSceneManager;
import utils.GameObject;

public abstract class GameScene {

	
	protected OrthographicCamera cam;
	protected GameSceneManager gsm;
	protected Texture background;
	public List<GameObject> gameObjects;
	
	public GameScene(GameSceneManager gsm) {
		this.cam = new OrthographicCamera();
		this.gsm = gsm;
		this.gameObjects = new ArrayList();
	}
	protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
    
	public void setBackground(Texture background) {
		this.background = background;
	}
  
}
