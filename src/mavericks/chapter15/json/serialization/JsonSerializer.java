package mavericks.chapter15.json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JsonSerializer {


    public static String serialize(Person person) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json =  mapper.writeValueAsString(person);
            return json;
        }catch (JsonProcessingException exception){
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception);
        }
    }

    public static Person deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Person.class);
    }
}
