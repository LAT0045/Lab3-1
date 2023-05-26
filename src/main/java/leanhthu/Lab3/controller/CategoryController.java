package leanhthu.Lab3.controller;

import jakarta.validation.Valid;
import leanhthu.Lab3.entity.Book;
import leanhthu.Lab3.entity.Category;
import leanhthu.Lab3.servies.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllCategories(Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        return "category/list-category";
    }


    @GetMapping("/add-category")
    public String addCategoryForm(Model model)
    {
        model.addAttribute("category", new Category());
        return "category/add-category";
    }

    @PostMapping("/add-category")
    public String addCategory(@ModelAttribute("category") Category category)
    {
        categoryService.addCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/edit-category/{id}")
    public String editCategoryForm(@PathVariable("id") Long id, Model model) {
        Category category = categoryService.getCategoryById(id);
        if (category != null) {
            model.addAttribute("category", category);
            return "category/edit-category";
        } else {
            return "not-found";
        }
    }

    @PostMapping("/edit-category")
    public String editCategory(@ModelAttribute("category") Category category) {
        categoryService.editCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/delete-category/{id}")
    public String deleteBook(@PathVariable("id") Long id)
    {
        categoryService.deleteCategory(id);
        return "redirect:/categories";
    }
}
