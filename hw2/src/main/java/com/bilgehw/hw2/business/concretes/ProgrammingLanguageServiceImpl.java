package com.bilgehw.hw2.business.concretes;

import com.bilgehw.hw2.business.abstracts.ProgrammingLanguageService;
import com.bilgehw.hw2.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.bilgehw.hw2.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // business nesnesi
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {
    // iş kuralları
    private final ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageServiceImpl(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getALL() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void addLang(ProgrammingLanguage language) {
        if(language.getName().isEmpty() || language.getInventor().isEmpty())
            throw new IllegalArgumentException("name or inventor can't be empty!!");
        if(getALL().contains(language)){
            throw  new IllegalArgumentException("Our database already contains" + language.getName() + " written by " + language.getInventor());
        }
        programmingLanguageRepository.addLang(language);
    }

    @Override
    public void deleteLang(ProgrammingLanguage language) {
        if(!getALL().contains(language)){
            throw new IllegalArgumentException("Since it don't exist, we can't delete this language.");
        }
        programmingLanguageRepository.deleteLang(language);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id) ;
    }
}
