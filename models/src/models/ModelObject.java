package models;


public class ModelObject{

	Models model;
	Point3 point;
	Matrix turn;
	Matrix move;

	ModelObject(){
		point = new Point3(0,0,0);
		model = new Models();
	}
	ModelObject(int x,int y,int z){
		this(new Point3(x,y,z));
	}
	ModelObject(Point3 p){
		this(new Models(),p);
	}
	ModelObject(Models model){
		this(model,0,0,0);
	}
	ModelObject(Models model,int x,int y,int z){
		this(model,new Point3(x,y,z));
	}
	ModelObject(Models model,Point3 p){
		this.model = new Models(model);
		this.point=p;
	}

}
