import inf.v3d.obj.*; // for objects
import inf.v3d.view.*; // for plotting

public class letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an empty canvas
		Viewer v = new Viewer();
		
		// create polyline
		Polyline pol1 = new Polyline();
		Polyline pol2 = new Polyline();
		Sphere dot = new Sphere(8.75,0.5,0);
		dot.setRandomColor();
		dot.setRadius(0.15);

		for (int j = 0; j<6; j++) {
			for (int i = 0; i < 16;i++) {
				pol1.addVertex(i,j,0);
				pol1.setColor("gray");
			}
			pol1.startNew();
		}
		for (int j = 0; j<16; j++) {
			for (int i = 0; i < 6;i++) {
				pol1.addVertex(j,i,0);
				pol1.setColor("gray");
			}
			pol1.startNew();
		}
		// letter P
		pol2.addVertex(1.5,1,0);
		pol2.addVertex(1.5,3.95,0);
		pol2.addVertex(3.5,3.95,0);
		pol2.addVertex(3.5,2.5,0);
		pol2.addVertex(1.5,2.5,0);
		pol2.startNew();
		
		// letter H
		pol2.addVertex(4.5, 1, 0);
		pol2.addVertex(4.5, 4 ,0);
		pol2.startNew();
		pol2.addVertex(4.5,2.5,0);
		pol2.addVertex(6.5,2.5,0);
		pol2.startNew();
		pol2.addVertex(6.5, 1, 0);
		pol2.addVertex(6.5, 4 ,0);
		pol2.startNew();
		
		// letter A
		pol2.addVertex(7.5, 1, 0);
		pol2.addVertex(8.5 , 3.95, 0);
		pol2.addVertex(9 , 3.95, 0);
		pol2.addVertex(10 , 1, 0);
		pol2.startNew();
		pol2.addVertex(8 , 2.5, 0);
		pol2.addVertex(9.5 , 2.5, 0);
		pol2.startNew();

		// letter M
		pol2.addVertex(11, 1,0);
		pol2.addVertex(11, 3.95,0);
		pol2.addVertex(11.5, 3.95,0);
		pol2.addVertex(12, 2.5,0);
		pol2.addVertex(12.5, 2.5,0);
		pol2.addVertex(13,3.95,0);
		pol2.addVertex(13.5, 3.95,0);
		pol2.addVertex(13.5, 1,0);
		
		Tube tube = new Tube(pol2);
		tube.setRandomColor();
		tube.setRadius(0.1);
		
		v.addObject3D(dot);
		v.addObject3D(pol1);
		v.addObject3D(tube);

		v.setVisible(true);
	}

}
