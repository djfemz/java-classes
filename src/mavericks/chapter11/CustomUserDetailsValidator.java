package mavericks.chapter11;

public class CustomUserDetailsValidator implements UserDetailsValidator{
    @Override
    public void validateUserDetails(String userDetails)  {
//        if (userDetails.isBlank()) throw new InvalidDetailsException();
        System.out.println(":)");
    }
}
