package com.borneo.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = {"com.borneo.app"})
@ComponentScan("com.borneo.app")
@EnableAspectJAutoProxy
@Slf4j
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class,args);
        log.info(
                " " +
                        "\n" +
                        "\n" +
                        ":::'###::::'##:::::'##:'########::'######:::'#######::'##::::'##:'########:\n" +
                        "::'## ##::: ##:'##: ##: ##.....::'##... ##:'##.... ##: ###::'###: ##.....::\n" +
                        ":'##:. ##:: ##: ##: ##: ##::::::: ##:::..:: ##:::: ##: ####'####: ##:::::::\n" +
                        "'##:::. ##: ##: ##: ##: ######:::. ######:: ##:::: ##: ## ### ##: ######:::\n" +
                        " #########: ##: ##: ##: ##...:::::..... ##: ##:::: ##: ##. #: ##: ##...::::\n" +
                        " ##.... ##: ##: ##: ##: ##:::::::'##::: ##: ##:::: ##: ##:.:: ##: ##:::::::\n" +
                        " ##:::: ##:. ###. ###:: ########:. ######::. #######:: ##:::: ##: ########:\n" +
                        "..:::::..:::...::...:::........:::......::::.......:::..:::::..::........::"
        );
    }
}
