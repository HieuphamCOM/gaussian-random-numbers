import inf.v3d.obj.*; // for objects
import inf.v3d.view.*; // for plotting
import java.util.*;

public class randomGraph {

	public static void main(String[] args) {
		Viewer v = new Viewer();

		Glyph gl1 = new Glyph();
		Glyph gl2 = new Glyph();
		Glyph gl3 = new Glyph();

		gl1.setSymbol(Glyph.SPHERE);
		gl1.setRandomColor();
		gl1.setScaleFactor(0.015);

		gl2.setSymbol(Glyph.SPHERE);
		gl2.setRandomColor();
		gl2.setScaleFactor(0.02);


		
		gl3.setSymbol(Glyph.SPHERE);
		gl3.setRandomColor();
		gl3.setScaleFactor(0.04);


		
		int n1 = 5000;
		int n2 = 5000;
		int n3 = 10000;

		double scale = 0.2;
		double scale2 = 0.05;

		Random r = new Random(1);
		
		for (int i = 0; i<n1; i++) {
			double x = r.nextDouble();
			double y = r.nextDouble();
			double z = r.nextDouble();
			gl1.addPoint(x, y,z);
		}
		
		for (int i = 0; i<n2; i++) {
			double x = r.nextGaussian() ;
			double y = r.nextGaussian();
			double z = r.nextGaussian();
			gl2.addPoint(x*scale + 1.5, y*scale +0.5 , z*scale+0.5);
		}
		for (int i = 0; i<n2; i++) {
			double x = r.nextGaussian();
			x = Math.exp(x);
			double y = r.nextGaussian();
			y = Math.exp(y);
			double z = r.nextGaussian();
			z = Math.exp(z);
			gl3.addPoint(x*scale2 + 2, y*scale2  , z*scale2);
		}
		
		v.addObject3D(gl1);
		v.addObject3D(gl2);
		v.addObject3D(gl3);

		v.setVisible(true);
	}

}
