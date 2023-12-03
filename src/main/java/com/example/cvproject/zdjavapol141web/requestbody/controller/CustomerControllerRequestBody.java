package com.example.cvproject.zdjavapol141web.requestbody.controller;

import com.example.cvproject.zdjavapol141web.requestbody.dto.CustomerDto;
import com.example.cvproject.zdjavapol141web.requestbody.dto.SupplierDto;
import com.example.cvproject.zdjavapol141web.requestbody.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CustomerControllerRequestBody {

    private final CustomerService customerService;

    @PostMapping("/addCustomer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addCustomer(@RequestBody CustomerDto customerDto,
                            /*param nie jest wówczas wymagany, jezeli dodamy false, w innym wypadku
                            powinniśmy dodać parametr po znaku zapytania ? np.?testParam=it works*/
                            @RequestParam(value = "testParam", required = false) String testParam,
                            @PathVariable(value = "id", required = false) Integer id) {
        log.info("test param {} id {}", testParam, id );
        customerService.addCustomer(customerDto);
    }
    @PostMapping("/addSupplier")
    public void addSupplier(@RequestBody @Valid SupplierDto supplier){
     log.info("A new supplier was added {}",supplier);
    }
}
