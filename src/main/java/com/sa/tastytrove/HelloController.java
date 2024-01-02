package com.sa.tastytrove;

import com.sa.tastytrove.entity.Ingredient;
import com.sa.tastytrove.entity.Recipe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField id;
    @FXML
    public TextField name;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSubmit(){
        System.out.println("Submit");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TastyTrove");

        Recipe kartoffelSalat = new Recipe();
        kartoffelSalat.setName("Kartoffelsalat");
        kartoffelSalat.setCreator("Anna");
        kartoffelSalat.setDescription("Doing Kartoffelsalat!");

        Ingredient kartoffel = new Ingredient();
        kartoffel.setName("Kartoffel");

        Ingredient zwiebel = new Ingredient();
        zwiebel.setName("Zwiebel");

        kartoffelSalat.setIngredient(kartoffel);
        kartoffelSalat.setIngredient(zwiebel);

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();



        em.persist(kartoffelSalat);


        em.getTransaction().commit();
        em.close();
    }
}