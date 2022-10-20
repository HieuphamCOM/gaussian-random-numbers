import inf.v3d.obj.*; // for objects
import inf.v3d.view.*; // for plotting

public class object {

	public static void main(String[] args) {
		
		// create an empty canvas
		Viewer v = new Viewer();
		
		
		// create box
		Box box1 = new Box(-1,0,0);
		box1.setColor("red");
		box1.setSize(1, 1, 1);
		Box box2 = new Box(1,0,0);
		box2.setColor("green");
		box2.setSize(1, 0.5, 1);
		Cone cone = new Cone(0.5,0,0.5);
		cone.setColor("yellow");
		cone.setHeight(1.5);
		Sphere sphere = new Sphere(0.5, 1.75, 0.5);
		sphere.setColor("blue");
		sphere.setRadius(0.25);
		
		//
		
		
		// assign the box
		v.addObject3D(box1);
		v.addObject3D(box2);
		v.addObject3D(cone);
		v.addObject3D(sphere);

		v.setVisible(true);
	}

}
