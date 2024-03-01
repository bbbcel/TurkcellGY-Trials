package com.bilgehw.hw2.dataAccess.concretes;

import com.bilgehw.hw2.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.bilgehw.hw2.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // bu sınıf bi data access nesnesidir.
public class InMemoryProgrammingLanguageRepositoryImpl implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;
    public InMemoryProgrammingLanguageRepositoryImpl() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(0,"C++", "Bjarne Stroustrup"));
        programmingLanguages.add(new ProgrammingLanguage(1,"C#", "Anders Hejlsberg"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Python", "Guido van Rossum"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Python", "Guido van Rossum"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void addLang(ProgrammingLanguage language) {
        programmingLanguages.add(language);
    }

    @Override
    public void deleteLang(ProgrammingLanguage language) {
        programmingLanguages.remove(language);
    }

    @Override // Streams are used to perform complex data processing operations like filtering, matching, mapping, etc on stored data such as arrays, collections, or I/O resources.
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage pl : programmingLanguages) {
            if (pl.getId() == id) {
                return pl;
            }
        }
        return null;
        //return programmingLanguages.stream().filter(pl -> pl.getId() == id).findFirst().orElse(null);
    }

}
