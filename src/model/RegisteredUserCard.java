package model;

public class RegisteredUserCard implements Card {
    @Override
    public void connect() {
        BankCardAdapter bankCardAdapter = new BankCardAdapter(new BankCard("123456"));
        bankCardAdapter.connect();
    }
}
