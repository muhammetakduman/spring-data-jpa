package com.muhammetakduman.services.impl;

import com.muhammetakduman.dto.DtoAdrdress;
import com.muhammetakduman.dto.DtoCustomer;
import com.muhammetakduman.entities.Address;
import com.muhammetakduman.entities.Customer;
import com.muhammetakduman.repository.CustomerRepository;
import com.muhammetakduman.services.ICustomerServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceimpl  implements ICustomerServices {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public DtoCustomer findCustomerById(Long id) {
        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAdrdress dtoAdrdress = new DtoAdrdress();
        Optional<Customer> optional =customerRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }else {
            Customer customer = optional.get();
            Address address = optional.get().getAddress();
            BeanUtils.copyProperties(customer,dtoCustomer);
            BeanUtils.copyProperties(address,dtoAdrdress);
            dtoCustomer.setAdrdress(dtoAdrdress);
            return dtoCustomer;

        }
    }
}
