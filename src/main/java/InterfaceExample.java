public class InterfaceExample implements MyInterface {
    public static void main(String[] args) {
        InterfaceExample example = new InterfaceExample();
        example.defaultMethod();
        MyInterface.staticMethod();
    }
}