package com.imgeek.design_of_pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryPatternTest {
    @Test
    public void demoShow() {
        Creator creator = new ConcreCreator();
        ConcreteProduct concreteProduct = creator.createProduct(ConcreteProduct.class);
        concreteProduct.method();
    }
}