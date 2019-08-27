package com.codingdojo.queriesandjoins.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.queriesandjoins.repositories.CityRepo;
import com.codingdojo.queriesandjoins.repositories.CountryRepo;
import com.codingdojo.queriesandjoins.repositories.LanguageRepo;

@Service 
public  class  ApiService {
    private CountryRepo countryRepo;
    private CityRepo cityRepo;
    private  LanguageRepo langRepo;
    public ApiService(CountryRepo countryRepo, CityRepo cityRepo, LanguageRepo langRepo) {
        this.countryRepo = countryRepo;
        this.cityRepo = cityRepo;
        this . langRepo = langRepo;
    }

    public List<Object[]> slovene() {
        List<Object[]> table = countryRepo.joinAllCountriesSlovene();
//        for(Object[] row: table) {
//            Country country = (Country) row[0];
//            Language language = (Language) row[1];
//        }
        return table;
    }
    public List<Object[]> totalcities() {
        List<Object[]> table = countryRepo.findAllCountriesTotalCities();
        return table;
    }
    public List<Object[]> mexico() {
        List<Object[]> table = cityRepo.findCitiesMexicoPopulation500k();
        return table;
    }
    public List<Object[]> mainlang() {
        List<Object[]> table = langRepo.findAllLangsSpokenOver89();
        return table;
    }
    public List<Object[]> surfacepop() {
        List<Object[]> table = countryRepo.findCountriesBySize();
        return table;
    }
    public List<Object[]> firstworldmonarchy() {
        List<Object[]> table = countryRepo.findCountriesConstMonarchySA200LE75();
        return table;
    }
    public List<Object[]> argentina() {
        List<Object[]> table = cityRepo.findCitiesArgentinaPop500k();
        return table;
    }
    public List<Object[]> regions() {
        List<Object[]> table = countryRepo.findCountriesRegions();
        return table;
    }


}