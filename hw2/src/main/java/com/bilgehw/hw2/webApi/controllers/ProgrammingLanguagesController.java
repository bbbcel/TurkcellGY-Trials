package com.bilgehw.hw2.webApi.controllers;

import com.bilgehw.hw2.business.abstracts.ProgrammingLanguageService;
import com.bilgehw.hw2.business.concretes.ProgrammingLanguageServiceImpl;
import com.bilgehw.hw2.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Spring her dosyayı tarayıp bu kontroller'ı @RestController'ı arayıp buluyor.
// bu @ ile yazılan şeylere annotation deniyormuş.

//@RequestMapping ise ulaşımı sağlıyor. tamam bunda sıkıntı yok. flask'ım @app.route'u
@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageServiceImpl programmingLanguageService;
    public ProgrammingLanguagesController(ProgrammingLanguageServiceImpl programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getALL();
    }
    @PostMapping("/addLang")
    public void add(@RequestBody ProgrammingLanguage pl){
        this.programmingLanguageService.addLang(pl);
    }
    @PostMapping("/deleteLang")
    public void delete(@RequestBody ProgrammingLanguage pl){
        this.programmingLanguageService.deleteLang(pl);
    }
    @GetMapping("/get/{id}")
    public ProgrammingLanguage getById(@PathVariable int id){
        return programmingLanguageService.getById(id);
    }
}
