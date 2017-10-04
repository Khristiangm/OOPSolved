package com.timbuchalka;

/**
 * Created by KH389659 on 04/10/2017.
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        //Setou dentro do Construtor direto os valores do Deluxe Burger atraves da Super que tem esses atributos la na classe PAI
        super("Deluxe Burger", "Beef", 27.64, "White");

        //O fato do Deluxe nao conter adicionais.. permite que de pra setar a batata e a coca diretamente da super e transmitir no main atraves do metodo
        //criado na classe PAI ( Hamburguer).
        super.addHamburgerAdditional1("Chips", 5.00);
        super.addHamburgerAdditional2("Coca-Cola", 10.00);
    }

    //Aqui esta tratando de forma basica as possiveis tentativas de inserir adicionais em um sanduiche que nao pode conter adicionais.
    //Realizando um override dos metodos ja criados na classe PAI e apenas escritos de outra forma aqui.
    @Override
    public void addHamburgerAdditional1(String name, double price) {
        System.out.println("Cannot Add additionals");
    }

    @Override
    public void addHamburgerAdditional2(String name, double price) {
        System.out.println("Cannot Add additionals");

    }

    @Override
    public void addHamburgerAdditional3(String name, double price) {
        System.out.println("Cannot Add additionals");

    }

    @Override
    public void addHamburgerAdditional4(String name, double price) {
        System.out.println("Cannot Add additionals");

    }
}
