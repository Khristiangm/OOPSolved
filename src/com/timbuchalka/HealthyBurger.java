package com.timbuchalka;

/**
 * Created by KH389659 on 04/10/2017.
 */
//Este tipo de hamburguer precisava ter 2 adicionais especificos por se tratar de um sanduiche natural
public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }
    //Metodos criados para realizar a verificação dos adicionais especificos da classe
    public void healthyAddition1(String name, double price) {

        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void healthyAddition2(String name, double price) {

        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

    }
    //Aqui ele esta chamando o metodo criado na classe PAI para realizar a verificação dos adicionais especificos deste estilo de sanduiche
    @Override
    public double itemizeHamburger() {
        //Esta primeira linha esta verificando se os outros adicionais citados no metodo da classe pai tambem estao presentes neste hamburguer
        //e tambem os extras especificos desta classe,esta reutilizando o metodo da classe pai atraves do @Override.
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null){

            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " For An Extra " + this.healthyExtra1Price);

        }
        if (this.healthyExtra2Name != null){

            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " For An Extra" + this.healthyExtra2Price);

        }
        return hamburgerPrice;
}}