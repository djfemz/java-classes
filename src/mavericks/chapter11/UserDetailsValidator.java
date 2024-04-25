package mavericks.chapter11;

public interface UserDetailsValidator {
    void validateUserDetails(String userDetails) throws InvalidDetailsException;
}
