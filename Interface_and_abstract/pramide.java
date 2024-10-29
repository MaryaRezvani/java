// package mypackage;

public class pramide extends Regtangle {
	private float lenght;
	
	public pramide(float width,float height,float length){
		super(width,height);
		this.lenght = length;
	}
	
	@Override
	public float volume(){
		return (float)1/3*(this.lenght*this.Area());
	}
}
