/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao;

import java.util.List;
import co.edu.utb.softeng.springtodos.entity.Category;
/**
 *
 * @author windows7
 */
public interface CategoryDao {
    
    public Category getById(Long id);
    public List<Category> getAll();
    
}
