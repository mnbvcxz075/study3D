package models;

import java.util.Vector;

public class Models {

	Vector<Point3> model;


	Models(){
		model = new Vector<Point3>();
	}
	Models(Models m){
		model=new Vector<Point3>();
		for(int i=0;i<m.model.size();i++){
			this.model.add(m.model.get(i));
		}
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
