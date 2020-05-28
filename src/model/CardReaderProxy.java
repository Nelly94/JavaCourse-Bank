package model;

public class CardReaderProxy implements TransactionInfo {

    private static CardReader cardReader = new CardReader();
    private static int attempts = 0;

    @Override
    public void startTransaction(Card card) {
        if(attempts<3){
            cardReader.startTransaction(card);
            attempts++;
        }else{
            System.out.println("You don't have the rights to perform this operation");
        }
    }
}
