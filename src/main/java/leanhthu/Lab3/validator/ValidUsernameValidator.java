package leanhthu.Lab3.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import leanhthu.Lab3.repository.IUserRepository;
import leanhthu.Lab3.validator.annotation.ValidUserName;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUserName, String> {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context)
    {
        if(userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
