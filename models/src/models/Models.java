package models;

import java.util.Vector;

public class Models {

	Vector<Point3> model;
	Point3 point;
	Matrix turn;


	Models(){
		model = new Vector<Point3>();
		point = new Point3();
	}
	Models(int x,int y,int z){
		model = new Vector<Point3>();
		this.point=new Point3(x,y,z);
	}
	Models(Point3 p){
		model = new Vector<Point3>();
		this.point=p;
	}
	Models(Models model){
		this(model,0,0,0);
	}
	Models(Models model,int x,int y,int z){
		this(model,new Point3(x,y,z));
	}
	Models(Models model,Point3 p){
		this.model = new Vector<Point3>();
		for(int i=0;i<model.model.size();i++){
			this.model.add(model.model.get(i));
		}
		this.point=p;
	}


	public void setSquare(){
		model.add(new Point3(1,-1,1));
		model.add(new Point3(1,1,1));
		model.add(new Point3(-1,1,1));
		model.add(new Point3(-1,-1,1));
		model.add(new Point3(1,-1,-1));
		model.add(new Point3(1,1,-1));
		model.add(new Point3(-1,1,-1));
		model.add(new Point3(-1,-1,-1));
	}

}
