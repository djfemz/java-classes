package mavericks.chapter15.json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static mavericks.chapter15.json.serialization.Sex.MALE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonSerializerTest {


    @Test
    public void testSerialize(){
        Person person = new Person();
        person.setName("Aramide");
        LocalDate dateOfBirth = LocalDate.of(2020, 10, 10);
        person.setDateOfBirth(dateOfBirth);
        person.setPhoneNumber("");

        String json = JsonSerializer.serialize(person);
        System.out.println(json);
        String expected =
                "{\"name\":\"Aramide\",\"dob\":\"2024-03-03\",\"phoneNumber\":\"09034567321\",\"gender\":\"SHIM\"}";
        assertEquals(expected, json);
    }


    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John", LocalDate.now(), "0908543625", MALE);
        String json = JsonSerializer.serialize(person);
        Person personFromJson = JsonSerializer.deserialize(json);
        System.out.println("person from json: "+personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(MALE, personFromJson.getGender());
        assertEquals("John", personFromJson.getName());
        assertEquals("0908543625", personFromJson.getPhoneNumber());
    }

}