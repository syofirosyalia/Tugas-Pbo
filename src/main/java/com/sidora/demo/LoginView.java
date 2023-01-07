package com.sidora.demo;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class LoginView extends VerticalLayout {

    private LoginForm loginForm;
    private VerticalLayout layoutVertical;
    private HorizontalLayout layoutHori;

    public LoginView() {


        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);

        layoutVertical = new VerticalLayout();
        layoutHori = new HorizontalLayout();
        loginForm = new LoginForm();

        loginForm.setAction("");

        add(loginForm);
    }
}









