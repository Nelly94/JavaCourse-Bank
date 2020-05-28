package model;

public class Application {

    public static void main(String[] args){

        CardReaderProxy crProxy = new CardReaderProxy();
        crProxy.startTransaction(new RegisteredUserCard());
        crProxy.startTransaction(new RegisteredUserCard());
        crProxy.startTransaction(new RegisteredUserCard());
        crProxy.startTransaction(new RegisteredUserCard());
        crProxy.startTransaction(new RegisteredUserCard());

    }

}
