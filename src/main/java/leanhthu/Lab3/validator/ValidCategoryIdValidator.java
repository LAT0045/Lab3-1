package leanhthu.Lab3.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import leanhthu.Lab3.entity.Category;
import leanhthu.Lab3.validator.annotation.ValidCategoryId;


public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context)
    {
        return category != null && category.getId() != null;
    }
}
