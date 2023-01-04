package com.sidora.demo;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    private LoginForm loginForm;

    private VerticalLayout verticalLayout;

    private HorizontalLayout horizontalLayout;

    public MainView(){
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        loginForm = new LoginForm();
        loginForm.setAction("login");
        add(loginForm);

    }

}
