public class Outer {
    private int out;
    private static int sout = 30;

    public Outer(int out){
        this.out = out;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }



    public void display(){
        System.out.println(out+" "+":with inner"+Inner.sin);
    }

    public class Inner{
        private int in;
        private static int sin = 50;

        public Inner(int in){
            this.in = in;
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }

        public void display(){
            System.out.println(in+" "+":with outer"+sout);
        }
    }
}
