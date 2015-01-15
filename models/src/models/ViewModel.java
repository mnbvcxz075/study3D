package models;

public class ViewModel {
	Camera camera;
	ModelObject model;

	public static void main(String args[]){
		ViewModel view= new ViewModel();

		view.model = new ModelObject(0,0,0);
		view.model.model.setSquare();;

		view.camera=new Camera(0,0,600);
	}
}
