/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.a360rn.service;

import java.util.List;
import pe.com.a360rn.model.Document;

/**
 *
 * @author alonsorn
 */
public interface DocumentService {
    
    Document findById(int id);
    
    List<Document> findAll();
    
    void saveDocument(Document document);
    
    void deleteDocument(int id);
}
