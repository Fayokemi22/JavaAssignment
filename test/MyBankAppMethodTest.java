import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyBankAppMethodTest {
    MyBankAppMethod myBankAppMethod;

    @BeforeEach
    void setUp() {
        myBankAppMethod = new MyBankAppMethod();

    }

    @Test
    void testForDeposit() {
        double deposit = 1000;
        double actual = myBankAppMethod.deposit(deposit);
        double expected = deposit;
        assertEquals(actual, expected);

    }

    @Test
    void testForWithdraw() {
        myBankAppMethod.setPin(2486);
        myBankAppMethod.deposit(10000);

        double actual = myBankAppMethod.withdraw(7000, myBankAppMethod.getPin());
        assertEquals(3000, actual);
    }

    @Test
    void testForBalance() {

        myBankAppMethod.setPin(2486);
        myBankAppMethod.setBalance(20000);

        double actual = myBankAppMethod.checkBalance(2486);

        assertEquals(20000, actual);
    }
}