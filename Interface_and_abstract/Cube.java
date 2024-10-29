// package mypackage;

public class Cube  extends Regtangle {
	private float length;
	
	
	public Cube(float width,float height,float length){
		super(height,width);
		this.length = length;
		
	}
	
	@Override
	public float volume(){
		return this.length*this.Area();
	}
	
}
