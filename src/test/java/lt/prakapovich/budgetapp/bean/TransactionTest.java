package lt.prakapovich.budgetapp.bean;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {


    Calendar cal1 = Calendar.getInstance();
    Transaction t1 = new Transaction();

    @Test
    void testEquals() {
        cal1.set(23, 4, 12);
        t1.setDate(cal1);
        t1.setType("PURCHASE");
        t1.setParty("UAB Intelligent Communica Vilnius LT");
        t1.setNarrative("09/05/2023 420845******1170 MCC-4789 REF: 327304");
        t1.setAmount(5.20);
        System.out.println("test");
        System.out.println(t1);

        Transaction t2 = new Transaction(cal1, "PURCHASE", "UAB Intelligent Communica Vilnius LT",
                "09/05/2023 420845******1170 MCC-4789 REF: 327304", 5.20);
        assertEquals(t2, t1);
    }
}
