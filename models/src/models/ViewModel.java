package models;

public class ViewModel {
	Camera camera;
	Models model;

	public static void main(String args[]){
		ViewModel view= new ViewModel();

		view.model = new Models(0,0,0);
		view.model.setSquare();

		view.camera=new Camera(0,0,600);
	}
}
