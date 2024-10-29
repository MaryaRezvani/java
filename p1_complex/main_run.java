package p1_complex;

public class main_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		complex obj1 = new complex(1.0,2.3);
		complex obj2 = new complex(3.2,5.4);
		complex obj3 = new complex();
		complex obj4 = new complex();
		obj3.add(obj1, obj2);
		obj3.print();
		obj4 = obj1.add(obj2);
		obj4.print();
	}

}
