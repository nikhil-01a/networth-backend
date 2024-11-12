package com.networth.networthbackend.service.impl;

import com.networth.networthbackend.data.Category;
import com.networth.networthbackend.db.CategoryRepository;
import com.networth.networthbackend.pojo.CategoriesResponse;
import com.networth.networthbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoriesResponse getAll() {
        CategoriesResponse response = new CategoriesResponse();
        List<Category> categories = categoryRepository.findAll();
        response.setCategories(categories);
        response.setSuccessMsg("Successfully loaded all categories!");
        return response;
    }

}
