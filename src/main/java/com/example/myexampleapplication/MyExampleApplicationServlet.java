package com.example.myexampleapplication;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
    asyncSupported=false,
    urlPatterns={"/*","/VAADIN/*"},
    initParams={
        @WebInitParam(name="ui", value="com.example.myexampleapplication.MyExampleApplicationUI")
    })
public class MyExampleApplicationServlet extends com.vaadin.server.VaadinServlet { }
