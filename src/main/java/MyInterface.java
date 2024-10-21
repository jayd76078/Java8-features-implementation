interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static Method");
    }
}