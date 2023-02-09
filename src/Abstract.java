public class Abstract {
    public static void main(String[] args) {

    }
}

abstract class X extends Object implements Y, Z {

    private String string;
    public int i=0;

    abstract void x();
    private static void p() {
    }

    public X(String string, int i) {
        this.string = string;
        this.i = i;
    }
}

interface Y {

    public static final String s="s";

    static void y() {
    }
    abstract void n();

    public void abc();
    private void toS () {
    }
}

interface Z {
    public static final String s="s";
}

