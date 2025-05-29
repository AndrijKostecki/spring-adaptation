package main.Controller;


import main.Service.TestService;

public class TestController {

    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public void process() {
        testService.run();
    }
}