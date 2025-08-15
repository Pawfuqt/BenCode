package BankingSystem;

public class BankingClass {
    private int[] accountNumbers;
    private int[] pins;
    private int accountCount;

    public BankingClass() {
        accountNumbers = new int[10]; 
        pins = new int[10];
        accountCount = 0;

        
        accountNumbers[accountCount] = 123123;
        pins[accountCount] = 137982;
        accountCount++;
    }

    public boolean registerAccount(int accountNo, int pin) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i] == accountNo) {
                return false; 
            }
        }

        if (accountCount < accountNumbers.length) {
            accountNumbers[accountCount] = accountNo;
            pins[accountCount] = pin;
            accountCount++;
            return true;
        } else {
            System.out.println("Account storage is full!");
            return false;
        }
    }

    public boolean verifyAccount(int accountNo, int pin) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i] == accountNo && pins[i] == pin) {
                return true;
            }
        }
        return false;
    }
}
