package models;


public class ModelObject{

	Models model;
	Matrix turn;
	Matrix move;

//	ModelObject(){
//		point = new Point3(0,0,0);
//		model = new Models();
//		turn = new Matrix(4,4);
//		move = new Matrix(4,4);
//	}
	ModelObject(int x,int y,int z){
		this(new Models(),x,y,z);
	}
	ModelObject(Models model){
		this(model,0,0,0);
	}
	ModelObject(Models model,int x,int y,int z){
		this.model = new Models(model);
		turn = new Matrix(new int[][] {{1,0,0,0},{0,1,0,0},{0,0,1,0}});
		move = new Matrix(new int[][] {{1,0,0,0},{0,1,0,0},{0,0,1,0},{x,y,z,0}});
	}

//	public Models setToWorld(){
//
//	}

}
