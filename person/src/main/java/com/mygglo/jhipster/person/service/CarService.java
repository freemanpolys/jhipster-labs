package com.mygglo.jhipster.person.service;

import com.mygglo.jhipster.person.service.dto.CarDTO;
import java.util.List;

/**
 * Service Interface for managing Car.
 */
public interface CarService {

    /**
     * Save a car.
     *
     * @param carDTO the entity to save
     * @return the persisted entity
     */
    CarDTO save(CarDTO carDTO);

    /**
     *  Get all the cars.
     *
     *  @return the list of entities
     */
    List<CarDTO> findAll();

    /**
     *  Get the "id" car.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    CarDTO findOne(Long id);

    /**
     *  Delete the "id" car.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
