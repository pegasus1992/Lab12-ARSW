/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controllers;

import edu.eci.arsw.samples.model.Producto;
import edu.eci.arsw.services.ServicesFacade;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ServicesFacade services;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String check() {
        return "REST API OK";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addProduct(@RequestBody Producto p) {
        services.addNewProduct(p);
        Logger.getLogger(ProductsController.class.getName()).log(Level.INFO, null, "POST request processed" + p);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Producto> allProducts() {
        return services.getAllProducts();
    }

    @ExceptionHandler(Exception.class)
    public void handleMyException(Exception exception) {
        Logger.getLogger(ProductsController.class.getName()).log(Level.SEVERE, null, exception);
    }

}
