package com.bilgehw.hw2.dataAccess.abstracts;

import com.bilgehw.hw2.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    void addLang(ProgrammingLanguage language);
    void deleteLang(ProgrammingLanguage language);
    ProgrammingLanguage getById(int id);
}
