package utils;
import java.util.List;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import scenes.GameScene;


public abstract class GameObject {
	
	private GameScene scene;
	private Texture texture;
	private Transform transform;
	private List<String> tags;
	
	

	public GameObject() {}
	
	public abstract GameObject nearest(String tag, int rang);
	public GameObject nearest(String tag) {
		List<GameObject> lgo = this.scene.gameObjects;
		GameObject tmp = null;
		if (lgo.size()>1) {
			float min = this.transform.getPosition().dst(lgo.get(0).transform.getPosition());
			float dist = min;
			for(GameObject go : lgo) {
				if (!go.equals(this)) {
					dist = this.transform.getPosition().dst(go.transform.getPosition());
					if (dist<min) {
						min=dist;
						tmp = go;
					}
					
					
				}
			}
			return tmp;
		} return null;
	}




	public void setTexture(Texture texture) {
		this.texture = texture;
	}


}
