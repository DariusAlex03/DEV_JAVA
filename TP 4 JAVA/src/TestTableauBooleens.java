public class TestTableauBooleens {

    public static void main(String[] args) {
        boolean[] t1 = {false, false, false, false};

        TableauBooleens a=new TableauBooleens(t1);

        System.out.println("a avant : " + a);
        t1[0]=true;
        System.out.println("a après : " + a);

        TableauBooleens b=new TableauBooleens(a);
        t1[1]=true;
        b.set(2, true);
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
