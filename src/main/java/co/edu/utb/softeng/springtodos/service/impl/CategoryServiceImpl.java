/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service.impl;

import java.util.List;
import co.edu.utb.softeng.springtodos.dao.CategoryDao;
import co.edu.utb.softeng.springtodos.entity.Category;
import co.edu.utb.softeng.springtodos.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author windows7
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryDao dao;

    @Override    
    public Category getCategoryById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return dao.getAll();
    }
}
