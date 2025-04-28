package com.pet.controller;

import com.pet.entity.AdoptionRequest;
import com.pet.entity.Pet;
import com.pet.repository.AdoptionRequestRepository;
import com.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adoptions")
@CrossOrigin(origins = "http://localhost:5500") // Adjust if different port
public class AdoptionRequestController {

    @Autowired
    private AdoptionRequestRepository adoptionRequestRepository;

    @Autowired
    private PetRepository petRepository;

    @PostMapping
    public AdoptionRequest createAdoptionRequest(@RequestBody AdoptionRequestDTO dto) {
        Pet pet = petRepository.findById(dto.getPetId())
                .orElseThrow(() -> new RuntimeException("Pet not found"));

        pet.setAdopted(true); // Mark pet as adopted
        petRepository.save(pet);

        AdoptionRequest adoptionRequest = new AdoptionRequest();
        adoptionRequest.setUserName(dto.getUserName());
        adoptionRequest.setContactInfo(dto.getContactInfo());
        adoptionRequest.setPet(pet);

        return adoptionRequestRepository.save(adoptionRequest);
    }
}

// Helper DTO
class AdoptionRequestDTO {
    private String userName;
    private String contactInfo;
    private Long petId;

    // getters and setters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public Long getPetId() {
        return petId;
    }
    public void setPetId(Long petId) {
        this.petId = petId;
    }
}
