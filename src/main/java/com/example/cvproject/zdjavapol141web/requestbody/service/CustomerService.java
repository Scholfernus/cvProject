package com.example.cvproject.zdjavapol141web.requestbody.service;

import com.example.cvproject.zdjavapol141web.requestbody.dto.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CustomerService {
    public void addCustomer(CustomerDto customerDto) {
    log.info("Customer was added {} ", customerDto);
    }
}
