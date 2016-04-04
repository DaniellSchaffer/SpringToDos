/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service;

import co.edu.utb.softeng.springtodos.entity.Comment;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author labsoftware03
 */
@Service
@Transactional
public interface CommentService {
    
    public Comment getCommentById(Long id);
    public List<Comment> getAllComments();
    
}
