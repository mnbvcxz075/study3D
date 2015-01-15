package models;

public class Camera {
	Point3 point;

	Camera(int x,int y,int z){
		point = new Point3(x,y,z);
	}
	Camera(Point3 p){
		point = p;
	}
}
