public class InterfaceDemo implements A , B {
    @Override
    public void printMessage() {
        System.out.println("Print interface A");
    }

    @Override
    public void printNewText() {
        System.out.println("Print interface B");
    }
}
