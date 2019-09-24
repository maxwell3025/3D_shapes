package isocahedron;

import java.awt.Graphics;

import javax.swing.JFrame;

public class window extends JFrame{

	public window() {
		setSize(1000, 1000);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		
	}
	public point to2d (int a, int b, int c){
		return new point(a+c, b+c);
	}

}
