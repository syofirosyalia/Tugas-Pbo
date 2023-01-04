package com.sidora.demo;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;


@Route("Login")
public class LoginView extends Composite<LoginOverlay> {

    public LoginView() {
        LoginOverlay LoginOverlay = getContent();
        LoginOverlay.setTitle("SIDORA APP");
        LoginOverlay.setDescription("Sistem Informasi Donor Darah");
        LoginOverlay.setOpened(true);

        LoginOverlay.addLoginListener(event -> {
            if ("user".equals(event.getUsername())) {
                UI.getCurrent().navigate("user");
            } else if ("admin".equals(event.getUsername())) {
                UI.getCurrent().navigate(AdminView.class);
            } else {
                Notification.show("Wrong credentials");
            }
        });

    }
}









