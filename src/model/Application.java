package model;

public class Application {

    public static void main(String[] args){

        CardReader cr = new CardReader();
        cr.startTransaction(new RegisteredUserCard());

    }

}
