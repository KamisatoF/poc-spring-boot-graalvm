package br.com.kamisato.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    public String getFibonacci(long limite) {
        long num1 = 0;
        long num2 = 1;
        StringBuilder sb = new StringBuilder();
        for (long i = 1; i <= limite; i++) {
            sb.append(num1 + " ");
            long soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }
        return sb.toString();
    }
}
