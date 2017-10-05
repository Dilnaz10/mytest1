package kz.kaznitu.lessons;


public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Bul zertkhanalyk zhumystyn maksaty:");
        System.out.println("GitHub-pen zhumys zhasap uirenu.");

        int a = MyMath.kvadrat(a: 5);
        int b = MyMath.kub(a: 5);

        System.out.println("a= " + a);
        System.out.println("b= " +b);

        System.out.println(MyMath.max(a: 8, b: 9));
    }
}
