package org.ayushcontinue;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//when there are two classes or two bean like in this case the desktop and the laptop then the spring gets confused
//we can fix this by giving more prority so for that we can use the @primary annotation
@Primary

public class Laptop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling in laptop.....");
    }
}
