package mavericks.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HugeIntegerTest {


    @Test
    public void testParse(){
        String number = "99822347892564738937646538392927755456446849983764648748357";
        HugeInteger hugeNumber = HugeInteger.parse(number);
        assertNotNull(hugeNumber);

    }
}
