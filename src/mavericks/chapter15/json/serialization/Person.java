package mavericks.chapter15.json.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person person){
        return this.dateOfBirth.compareTo(person.dateOfBirth);
    }
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;
    @JsonProperty("dob")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String phoneNumber;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Sex gender;

    @Override
    public String toString(){
        return "person--->{name: "+name+", date_of_birth: "+dateOfBirth
                +", phone_number: "+phoneNumber+", gender: "+gender+"}";
    }

    public Person(){}

    public Person(String name, LocalDate dateOfBirth, String phoneNumber, Sex gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
