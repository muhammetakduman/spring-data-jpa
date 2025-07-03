package com.muhammetakduman.services.impl;

import com.muhammetakduman.dto.DtoAddress;
import com.muhammetakduman.dto.DtoCustomer;
import com.muhammetakduman.entities.Address;
import com.muhammetakduman.entities.Customer;
import com.muhammetakduman.repository.AddressRepository;
import com.muhammetakduman.services.IAddressServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceimpl implements IAddressServices {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id){
        DtoAddress dtoAddress = new DtoAddress();
        DtoCustomer dtoCustomer = new DtoCustomer();
        Optional<Address> optional = addressRepository.findById(id);



        if (optional.isEmpty()){
            return null;
        } else {
            Address address = optional.get();
            BeanUtils.copyProperties(address, dtoAddress);
            dtoCustomer.setId(address.getCustomer().getId());
            dtoCustomer.setName(address.getCustomer().getName());
            dtoAddress.setCustomer(dtoCustomer);
            return dtoAddress;

        }
    }
}
