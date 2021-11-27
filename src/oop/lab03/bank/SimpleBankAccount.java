package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount{

	private int userID;
	private double balance;
	private int nTransactions;
	private static double ATM_TRANSACTION_FEE = 1;

    /*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int userID: id del possessore del conto (già dichiarato: si veda al riguardo il metodo checkUser dichiarato in fondo alla classe)
     * - int nTransactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     */

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */

    /*
     * Si aggiungano selettori per: 
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */
	public SimpleBankAccount(int userID, double balance) {
	        super();
	        this.userID = userID;
	        this.balance = balance;
	}

        public int getUserID() {
            return userID;
        }

        public double getBalance() {
            return balance;
        }

        public int getnTransactions() {
            return nTransactions;
        }

        public void deposit(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
            if(this.userID == usrID) {
                this.nTransactions++;
                this.balance+=amount;
            }
        }

        public void withdraw(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
            if(this.userID == usrID) {
                this.nTransactions++;
                this.balance-=amount;
            }
        }

        @SuppressWarnings("static-access")
        public void depositFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
            if(this.userID == usrID) {
                this.nTransactions++;
                this.balance+=(amount-this.ATM_TRANSACTION_FEE);
            }
        }

        @SuppressWarnings("static-access")
        public void withdrawFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
            if(this.userID == usrID) {
                this.nTransactions++;
                this.balance-=(amount+this.ATM_TRANSACTION_FEE);
            }
        }

        @Override
        public void chargeManagementFees(int usrID) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public int getTransactionsCount() {
            return this.nTransactions;
        }
}
