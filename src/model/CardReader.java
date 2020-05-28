package model;

public class CardReader implements TransactionInfo{

    public CardReader() {
    }

    @Override
    public void startTransaction(Card card) {
        ((RegisteredUserCard)card).connect();
    }
}
