package week2;


class K {
    void ride() {
        System.out.println("Inside class K");
    }    
}

class O extends K {
    @Override
    void ride() {
        System.out.println("Inside class O");
    }    
}

class L extends K {
    @Override
    void ride() {
        System.out.println("Inside class L");
    }    
}



class Load {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println( "Method Overriding");
        K obj = new O();    //k is the reference type and o is the object type
        obj.ride();       
        					//dynamic method dispatch
        obj = new L();    
        obj.ride();

        System.out.println(" Method Overloading");
        Load l = new Load();
        System.out.println(l.add(2, 8));
        System.out.println( l.add(2, 9, 4));
    }
}
