package com.example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LocalDateTime servletTimeInit = LocalDateTime.now();
        servletContextEvent.getServletContext().setAttribute("servletTimeInit", servletTimeInit);
    }
}
