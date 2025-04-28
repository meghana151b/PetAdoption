package com.pet.service;

import com.pet.entity.AdoptionRequest;

public interface AdoptionRequestService {
    AdoptionRequest createAdoptionRequest(String userName, String contactInfo, Long petId);
}
