package com.ouaadoud.calculatrice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "CalculatriceOuaadoud")
public class Calculatrice {

    @WebMethod
    public int add (int a, int b) {
        return a + b;
    }
    @WebMethod
    public double minus (double a, double b) {
        return a - b;
    }
    @WebMethod
    public double multiply (double a, double b) {
        return a * b;
    }
    @WebMethod
    public String divide (double a, double b) {
        try {
            double result = a / b;
            if (Double.isInfinite(result)) {
                return "Erreur: Division par Zéro!";
            }
            return Double.toString(result);
        } catch (ArithmeticException e) {
            return "Erreur: Division par Zéro!";
        }
    }
    @WebMethod
    public double power (double a, double b) {
        return Math.pow(a, b);
    }
    @WebMethod
    public double sine (double a) {
        return Math.sin(a);
    }
    @WebMethod
    public double coSine (double a) {
        return Math.cos(a);
    }
}
