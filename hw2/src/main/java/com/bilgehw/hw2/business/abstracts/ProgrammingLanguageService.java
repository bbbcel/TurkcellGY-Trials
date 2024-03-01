package com.bilgehw.hw2.business.abstracts;

import com.bilgehw.hw2.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getALL();
    void addLang(ProgrammingLanguage language);
    void deleteLang(ProgrammingLanguage language);
    ProgrammingLanguage getById(int id);
}
