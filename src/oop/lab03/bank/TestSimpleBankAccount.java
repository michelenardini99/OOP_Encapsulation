package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
        AccountHolder rossi = new AccountHolder("Mario","Rossi",1);
        AccountHolder bianchi = new AccountHolder("Luigi","Bianchi",2);
        SimpleBankAccount ros_acc = new SimpleBankAccount(1,500);
        SimpleBankAccount bia_acc = new SimpleBankAccount(2,500);
        ros_acc.deposit(1, 200);
        ros_acc.depositFromATM(1, 100);
        ros_acc.withdraw(1, 300);
        ros_acc.withdrawFromATM(1, 50);
        bia_acc.deposit(2, 100);
        bia_acc.depositFromATM(2, 50);
        bia_acc.withdraw(2, 700);
        bia_acc.withdrawFromATM(2, 300);
        System.out.println("Rossi: "+ros_acc.getBalance()+"\n Bianchi: "+bia_acc.getBalance());
        ros_acc.deposit(2, 100);
        System.out.println("Rossi: "+ros_acc.getBalance()+"\n Bianchi: "+bia_acc.getBalance());
    }
}
