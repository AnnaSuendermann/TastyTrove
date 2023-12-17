package com.sa.tastytrove;

import com.sa.tastytrove.entity.Ingredient;
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
        Ingredient cheese = new Ingredient();
        cheese.setId(Long.parseLong(id.getText()));
        cheese.setName(name.getText());
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cheese);
        em.getTransaction().commit();
        em.close();
    }
}