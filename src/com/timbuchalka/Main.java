package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //Instanciando o primeiro Hamburguer da classe PAI..
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        //Adicionando valores as variaveis criadas para simularem os possiveis adicionais do hamburguer.
        hamburger.addHamburgerAdditional1("Pickles", 3.50);
        hamburger.addHamburgerAdditional2("Tomato", 2.50);
        hamburger.addHamburgerAdditional3("Cheese", 2.00);


        //Printando o total do valor do hamburguer com os adicionais criados acima, atraves do metodo criado na classe PAI.
        System.out.println("Total Burger Price is: " + hamburger.itemizeHamburger());
        System.out.println("--------------------------------------------------");


        //Instanciando o Hamburguer Saudavel...Criado na classe Healthy Burguer
        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.00);

        //Adicionando valores as variaveis criadas para simularem os possiveis adicionais do hamburguer.
        healthyBurger.addHamburgerAdditional1("Egg", 2.00);
        healthyBurger.healthyAddition1("Potatoe", 1.65);


        //Printando o total do valor do Healthy Burger com os adicionais criados acima, atraves do metodo criado na classe PAI, e sobrescrito na classe respectiva,
        // para tornar possivel printar os adicionais especificos da classe.
        System.out.println("Total Healthy Burger Price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("--------------------------------------------------");
        deluxeBurger.addHamburgerAdditional1("Bacon",15.89);
        System.out.println("Total Deluxe Burger is: " +deluxeBurger.itemizeHamburger());



    }
}
