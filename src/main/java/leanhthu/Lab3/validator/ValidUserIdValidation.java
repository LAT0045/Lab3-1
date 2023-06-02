package leanhthu.Lab3.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import leanhthu.Lab3.entity.User;
import leanhthu.Lab3.validator.annotation.ValidUserId;

public class ValidUserIdValidation implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context)
    {
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
