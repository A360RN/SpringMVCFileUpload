/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.a360rn.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.a360rn.dao.DocumentDao;
import pe.com.a360rn.model.Document;
import pe.com.a360rn.service.DocumentService;

/**
 *
 * @author alonsorn
 */
@Service("documentService")
@Transactional
public class DocumentServiceImpl implements DocumentService{
    
    @Autowired
    private DocumentDao documentDao;

    @Override
    public Document findById(int id) {
        return documentDao.findById(id);
    }

    @Override
    public List<Document> findAll() {
        return (List<Document>) documentDao.findAll();
    }

    @Override
    public void saveDocument(Document document) {
        documentDao.save(document);
    }

    @Override
    public void deleteDocument(int id) {
        documentDao.deleteById(id);
    }
    
}
