package com.example;

import io.micronaut.http.annotation.*;

@Controller("/azureContainerInstanceMavenGraalvmTest")
public class AzureContainerInstanceMavenGraalvmTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}