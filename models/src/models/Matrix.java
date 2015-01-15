package models;

public class Matrix {

	int[][] mat;
	int row,col;
	Exception e;
	Matrix(int row,int col){
		mat = new int[col][row];
		for(int i = 0;i<col;i++){
			for(int j=0;j<row;j++){
				mat[i][j]=0;
			}
		}
		this.col=col;
		this.row=row;
	}
	Matrix(int[][] a){
		for(int i=0;i<a.length;i++){
			if(a[i].length!=a[0].length){
				System.out.print("Matrix error");
				System.exit(0);
			}
		}
		mat=a;
		this.row = a[0].length;
		this.col = a.length;
	}

	public static void main(String args[]){
		Matrix a = new Matrix(new int[][] {{3,3},{2,2},{1,1}});
		printMat(a);
		System.out.print(mul(new Matrix(new int[][] {{3,3,3},{2,2,2}}),new Point3(1,2,3)));
	}

	static Matrix plus(Matrix a,Matrix b){
		if(a.row!=b.row||a.col!=b.col){
			System.out.print("Matrix.puls error");
			System.exit(0);
		}

		 Matrix ans = new Matrix(a.row,a.col);
		for(int i=0;i<a.row;i++){
			for(int j=0;j<a.col;j++){
				ans.mat[i][j]=a.mat[i][j]+b.mat[i][j];
			}
		}
		return ans;
	}

	static Matrix mul(Matrix a,Matrix b){
		if(a.row!=b.col){
			System.out.print("Matrix.mul error");
			System.exit(0);
		}

		 Matrix ans = new Matrix(b.row,a.col);
			for(int i=0;i<b.row;i++){
				for(int j=0;j<a.col;j++){
					ans.mat[j][i]=0;
				}
			}
			for(int i=0;i<b.row;i++){
				for(int j=0;j<a.col;j++){
					for(int k=0;k<a.row;k++){
						System.out.println(i+","+j+","+k+","+a.mat[j][k]);
						ans.mat[j][i]+=a.mat[j][k]*b.mat[k][i];
						System.out.println(",");
					}
				}
			}
		return ans;
	}
	static Point3 mul(Matrix a,Point3 b){
		if(a.row!=3){
			System.out.print("Matrix.mul error2");
			System.exit(0);
		}
		int x=0,y=0,z=0;
		for(int i=0;i<a.col;i++){
			x+=a.mat[i][0]*b.x;
		}
		for(int i=0;i<a.col;i++){
			y+=a.mat[i][1]*b.y;
		}
		for(int i=0;i<a.col;i++){
			z+=a.mat[i][2]*b.z;
		}
		return new Point3(x,y,z);
	}
	static void printMat(Matrix a){

		for(int i=0;i<a.col;i++){
			for(int j=0;j<a.row;j++){
				System.out.print(a.mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
