/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.a360rn.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import pe.com.a360rn.dao.AbstractDao;
import pe.com.a360rn.dao.DocumentDao;
import pe.com.a360rn.model.Document;

/**
 *
 * @author alonsorn
 */
@Repository("documentDao")
public class DocumentDaoImpl extends AbstractDao<Integer, Document> implements DocumentDao{

    @Override
    public List<Document> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Document>) criteria.list();
    }

    @Override
    public Document findById(int id) {
        Document document = findById(id);
        return document;
    }

    @Override
    public void save(Document document) {
        persist(document);
    }

    @Override
    public void deleteById(int id) {
        Document document = findById(id);
        delete(document);
    }
    
    
}
