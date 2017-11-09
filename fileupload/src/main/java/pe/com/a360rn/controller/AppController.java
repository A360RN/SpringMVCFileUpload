/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.a360rn.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import pe.com.a360rn.model.Document;
import pe.com.a360rn.service.DocumentService;
import pe.com.a360rn.util.FileBucket;

/**
 *
 * @author alonsorn
 */
@Controller
public class AppController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String listDocuments(ModelMap model) {
        List<Document> documents = documentService.findAll();
        model.addAttribute("documents", documents);
        FileBucket fileBucket = new FileBucket();
        model.addAttribute("fileBucket", fileBucket);
        return "documentList";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String addDocument(@ModelAttribute("fileBucket") FileBucket fileBucket) {
        try {
            saveDocument(fileBucket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return "redirect:/list";
    }

    public void saveDocument(FileBucket fileBucket) throws IOException {
        Document document = new Document();

        MultipartFile file = fileBucket.getFile();

        document.setType(file.getContentType());
        document.setName(file.getName());
        document.setContent(file.getBytes());
        documentService.saveDocument(document);
    }
}
