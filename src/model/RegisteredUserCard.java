package model;

public class RegisteredUserCard implements Card {

    public String cardNumber;

    @Override
    public void connect() {
        BankCardAdapter bankCardAdapter = new BankCardAdapter(new BankCard("123456"));
        bankCardAdapter.connect();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
