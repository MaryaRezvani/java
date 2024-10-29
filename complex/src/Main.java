
public class Main {
    public static void main(String[] args) throws Exception {

        complex obj = new complex(2.1,2.2);
        complex obj1 = new complex(1.2, 2.3);
        complex obj3 = new complex();
        obj3 = obj.add(obj1);
        obj3.print();

    }
}
