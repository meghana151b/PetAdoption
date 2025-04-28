package com.pet.service.impl;

import com.pet.entity.AdoptionRequest;
import com.pet.entity.Pet;
import com.pet.repository.AdoptionRequestRepository;
import com.pet.repository.PetRepository;
import com.pet.service.AdoptionRequestService;
import com.pet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptionRequestServiceImpl implements AdoptionRequestService {

    @Autowired
    private AdoptionRequestRepository adoptionRequestRepository;

    @Autowired
    private PetService petService;

    @Autowired
    private PetRepository petRepository;

    @Override
    public AdoptionRequest createAdoptionRequest(String userName, String contactInfo, Long petId) {
        Pet pet = petService.getPetById(petId);

        pet.setAdopted(true);
        petRepository.save(pet);

        AdoptionRequest adoptionRequest = new AdoptionRequest();
        adoptionRequest.setUserName(userName);
        adoptionRequest.setContactInfo(contactInfo);
        adoptionRequest.setPet(pet);

        return adoptionRequestRepository.save(adoptionRequest);
    }
}
