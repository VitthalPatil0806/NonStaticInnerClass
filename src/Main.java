//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Outer out = new Outer(80);
        out.display();

        Outer.Inner inout = out.new Inner(60);
        inout.display();
    }
}