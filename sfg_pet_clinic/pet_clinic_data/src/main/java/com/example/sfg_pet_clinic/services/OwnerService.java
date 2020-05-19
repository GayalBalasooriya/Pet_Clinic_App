package com.example.sfg_pet_clinic.services;

import com.example.sfg_pet_clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
//    Owner findById(Long id);
//    Owner save(Owner owner);
//    Set<Owner> findAll();
}
