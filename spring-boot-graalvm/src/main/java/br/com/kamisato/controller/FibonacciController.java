package br.com.kamisato.controller;

import br.com.kamisato.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    @Autowired
    private FibonacciService service;

    @RequestMapping(value = "/{limit}", method = RequestMethod.GET)
    public String getFibonacci(@PathVariable("limit") long limit) {

        //return service.getFibonacci(limit);
        return "";
    }
}
