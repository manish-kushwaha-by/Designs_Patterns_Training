package Creational_Extra;

public class Client {

    public static void main(String[] args) {
        F16Builder f16Builder = new F16Builder();

        Director director = new Director(f16Builder);

        director.construct(false);


    }
}
