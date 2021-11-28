package com.sergiorosa.SalesApp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiorosa.SalesApp.dto.SellerDTO;
import com.sergiorosa.SalesApp.entities.Seller;
import com.sergiorosa.SalesApp.repositories.SellerRepository;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    @Transactional(readOnly = true)
    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();

        return result.stream().map( x -> new SellerDTO(x)).collect(Collectors.toList());

    }

}
