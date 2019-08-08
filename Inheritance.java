class A {
    String str = "This str is from class A";

    public String getClassName() {
        return "This method is from class A";
    }
}

class B extends A {
    String str = "This str is from class B";
    
    public String getClassName() {
        return "This method is from class B";
    }
}

class C extends B { }

class Example {
    // 
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // C c = new C();

        System.out.println("Class A variable: " + a.str);
        System.out.println("Class B variable: " + b.str);
        // System.out.println("Class C variable: " + c.str);

        System.out.println();

        System.out.println("Class A method: " + a.getClassName());
        System.out.println("Class B method: " + b.getClassName());
        // System.out.println("Class C method: " + c.getClassName());
    }
}