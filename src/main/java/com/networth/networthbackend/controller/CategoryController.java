package com.networth.networthbackend.controller;

import com.networth.networthbackend.pojo.CategoriesResponse;
import com.networth.networthbackend.service.CategoryService;
import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/api/category/get-all")
    public ResponseEntity<CategoriesResponse> getAll() {
        CategoriesResponse response = categoryService.getAll();
        HttpStatus code = StringUtils.isNotBlank(response.getErrorMsg())? HttpStatus.BAD_REQUEST : HttpStatus.OK;
        return new ResponseEntity<>(response,code);
    }

}
