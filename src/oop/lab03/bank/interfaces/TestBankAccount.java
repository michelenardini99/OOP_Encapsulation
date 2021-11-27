package oop.lab03.bank.interfaces;

import oop.lab03.bank.AccountHolder;
import oop.lab03.bank.SimpleBankAccount;
import oop.lab03.bank.StrictBankAccount;

public final class TestBankAccount {

    private TestBankAccount() {
    }

    @SuppressWarnings("unused")
    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1
         */
        /*
         * 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2
         */
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di Mario
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Luigi Bianchi (ammontare iniziale = 0)
         */
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        /*
         * 6) Prelevare €15000 da entrambi i conti
         */
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        /*
         * 8) Qual è il risultato e perché?
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        /*
         * 12) Qual è il risultato e perché?
         */
        @SuppressWarnings("unused")
        AccountHolder rossi = new AccountHolder("Mario","Rossi",1);
        AccountHolder bianchi = new AccountHolder("Luigi","Bianchi",2);
        BankAccount ros_acc = new SimpleBankAccount(1,0);
        BankAccount bia_acc = new StrictBankAccount(2,0);
        ros_acc.deposit(1, 10000);
        bia_acc.deposit(2, 10000);
        ros_acc.withdraw(1, 15000);
        bia_acc.withdraw(2, 15000);
        System.out.println("Rossi: "+ros_acc.getBalance() + "\n Bianchi: "+ bia_acc.getBalance());
        ros_acc.deposit(1, 10000);
        bia_acc.deposit(2, 10000);
        ros_acc.chargeManagementFees(1);
        bia_acc.chargeManagementFees(2);
        System.out.println("Rossi: "+ros_acc.getBalance() + "\n Bianchi: "+ bia_acc.getBalance());

    }
}
