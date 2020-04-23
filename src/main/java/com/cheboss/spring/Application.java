package com.cheboss.spring;

import com.cheboss.spring.controllerr.UserController;
import com.cheboss.spring.exception.ResourceNotFoundException;
import com.cheboss.spring.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

@SpringBootApplication
public class Application {

    public static User u1 = new User("yassiine", "chiboub", "yassine@gmial.com");
    public static User u2 = new User("fatiima-eezzahra", "chiboubb", "yassine@gmial.com");
    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        LOGGER.info("Example Info level log message");
        LOGGER.debug("Example Debug level log message");
        LOGGER.error("Example Error level log message");


        // get the UserController Bean
       UserController service = ctx.getBean(UserController.class);
        // Set User properties

  /*      service.createUser(u1);
        service.createUser(u2);
*/
        try {
            service.deleteUser(101L);

        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ResponseEntity<User> k = service.getUsersById(7L);
            LOGGER.info(
                    "\n User with the id =>  " + Objects.requireNonNull(k.getBody()).getId() +
                            " is called " + k.getBody().getFirstName() + " " + k.getBody().getLastName());

        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
        LOGGER.info("\n object 1 -> " + u1);
        LOGGER.info("\n object 2 -> " + u2);


    }
}
