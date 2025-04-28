package com.pet.service;

import com.pet.entity.Pet;
import java.util.List;

public interface PetService {
    List<Pet> getAllPets();
    Pet addPet(Pet pet);
    Pet getPetById(Long id);
}

