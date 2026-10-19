package org.ayushcontinue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//here we have made use of the stereotype annotation the @configuration annotation declares that this class is a configu
//ation file.
@Configuration

//@ComponentScan is another annotation which make sure that spring scans for the component classes which is important for
//bean creation and the "org.ayushcontinues" make sure it scans through this folder for the @component throught out the files
@ComponentScan("org.ayushcontinue")
public class AppConfig{

}


