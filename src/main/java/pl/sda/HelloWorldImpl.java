package pl.sda;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void print(String msg) {
        System.out.println("Hello World!");
    }
}
