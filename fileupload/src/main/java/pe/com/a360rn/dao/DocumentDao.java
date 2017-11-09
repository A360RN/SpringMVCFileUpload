/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.a360rn.dao;

import java.util.List;
import pe.com.a360rn.model.Document;

/**
 *
 * @author alonsorn
 */
public interface DocumentDao {
    
    List<Document> findAll();
    
    Document findById(int id);
    
    void save(Document document);
    
    void deleteById(int id);
}
