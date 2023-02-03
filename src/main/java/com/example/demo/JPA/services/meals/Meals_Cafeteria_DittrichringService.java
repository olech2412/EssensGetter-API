package com.example.demo.JPA.services.meals;

import com.example.demo.JPA.entities.meals.Meal;
import com.example.demo.JPA.entities.meals.Meals_Cafeteria_Dittrichring;
import com.example.demo.JPA.entities.mensen.Cafeteria_Dittrichring;
import com.example.demo.JPA.entities.mensen.Mensa;
import com.example.demo.JPA.repository.meals.Meals_Cafeteria_DittrichringRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Log4j2
public class Meals_Cafeteria_DittrichringService extends Meals_Mensa_Service {

    @Autowired
    Meals_Cafeteria_DittrichringRepository meals_cafeteria_dittrichringRepository;


    /**
     * @return Meals Cafeteria Dittrichring
     */
    @Override
    public Iterable<Meals_Cafeteria_Dittrichring> findAll() {
        return meals_cafeteria_dittrichringRepository.findAll();
    }

    /**
     * @param servingDate
     * @return All meals by serving date greater than or equal to serving date from Cafeteria Dittrichring
     */
    @Override
    public List<Meals_Cafeteria_Dittrichring> findAllMealsByServingDateGreaterThanEqual(LocalDate servingDate) {
        return meals_cafeteria_dittrichringRepository.findAllMealsByServingDateGreaterThanEqual(servingDate);
    }

    /**
     * @param servingDate
     * @return All meals by serving date from Cafeteria Dittrichring
     */
    @Override
    public List<Meals_Cafeteria_Dittrichring> findAllMealsByServingDate(LocalDate servingDate) {
        return meals_cafeteria_dittrichringRepository.findAllMealsByServingDate(servingDate);
    }

    /**
     * @param meal
     * @param mensa
     */
    @Override
    public void save(Meal meal, Mensa mensa) {
        Meals_Cafeteria_Dittrichring meals_cafeteria_dittrichring = new Meals_Cafeteria_Dittrichring();
        meals_cafeteria_dittrichring.setId(meal.getId());
        meals_cafeteria_dittrichring.setName(meal.getName());
        meals_cafeteria_dittrichring.setCategory(meal.getCategory());
        meals_cafeteria_dittrichring.setPrice(meal.getPrice());
        meals_cafeteria_dittrichring.setServingDate(meal.getServingDate());
        meals_cafeteria_dittrichring.setDescription(meal.getDescription());
        meals_cafeteria_dittrichring.setRating(meal.getRating());
        meals_cafeteria_dittrichring.setVotes(meal.getVotes());
        meals_cafeteria_dittrichring.setStarsTotal(meal.getStarsTotal());
        meals_cafeteria_dittrichring.setResponseCode(meal.getResponseCode());

        Cafeteria_Dittrichring cafeteria_dittrichring = new Cafeteria_Dittrichring();
        cafeteria_dittrichring.setId(mensa.getId());
        cafeteria_dittrichring.setName(mensa.getName());
        cafeteria_dittrichring.setApiUrl(mensa.getApiUrl());

        meals_cafeteria_dittrichring.setCafeteria_dittrichring(cafeteria_dittrichring);

        meals_cafeteria_dittrichringRepository.save(meals_cafeteria_dittrichring);
    }

    /**
     * @param meal
     * @param mensa
     */
    @Override
    public void delete(Meal meal, Mensa mensa) {
        Meals_Cafeteria_Dittrichring meals_cafeteria_dittrichring = new Meals_Cafeteria_Dittrichring();
        meals_cafeteria_dittrichring.setId(meal.getId());
        meals_cafeteria_dittrichring.setName(meal.getName());
        meals_cafeteria_dittrichring.setCategory(meal.getCategory());
        meals_cafeteria_dittrichring.setPrice(meal.getPrice());
        meals_cafeteria_dittrichring.setServingDate(meal.getServingDate());
        meals_cafeteria_dittrichring.setDescription(meal.getDescription());
        meals_cafeteria_dittrichring.setRating(meal.getRating());
        meals_cafeteria_dittrichring.setVotes(meal.getVotes());
        meals_cafeteria_dittrichring.setStarsTotal(meal.getStarsTotal());
        meals_cafeteria_dittrichring.setResponseCode(meal.getResponseCode());

        Cafeteria_Dittrichring cafeteria_dittrichring = new Cafeteria_Dittrichring();
        cafeteria_dittrichring.setId(mensa.getId());
        cafeteria_dittrichring.setName(mensa.getName());
        cafeteria_dittrichring.setApiUrl(mensa.getApiUrl());

        meals_cafeteria_dittrichring.setCafeteria_dittrichring(cafeteria_dittrichring);

        meals_cafeteria_dittrichringRepository.delete(meals_cafeteria_dittrichring);
        log.warn("Meal deleted: " + meal.getName() + " from " + mensa.getName());
    }


}

