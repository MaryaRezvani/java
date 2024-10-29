// package mypackage;

public abstract class Regtangle implements Shape {
	private float height;
	private float width;
	
	public Regtangle(float a,float b){
		this.height = a;
		this.width = b;
	}
	
	@Override
	public float Area(){
		return this.height*this.width;
	}
	
	@Override
	public float primeter(){
		return 2*(this.height+this.width);
	}
	
	abstract float volume();
}
