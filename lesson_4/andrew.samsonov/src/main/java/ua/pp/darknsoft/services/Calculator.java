package ua.pp.darknsoft.services;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public double add(double val1,double val2){
        return val1 + val2;
    }
    public double div(double val1,double val2){
        return val1 / val2;
    }
    public double mul(double val1,double val2){
        return val1 * val2;
    }
    public double sub(double val1,double val2){
        return val1 - val2;
    }
}
