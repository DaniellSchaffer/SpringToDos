/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao;

import java.util.List;
import co.edu.utb.softeng.springtodos.entity.Comment;
/**
 *
 * @author windows7
 */
public interface CommentDao {
    
    public Comment getById(Long id);
    public List<Comment> getAll();
}
