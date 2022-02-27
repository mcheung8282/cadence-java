package com.cadence.hello;

import com.uber.cadence.workflow.Workflow;

import java.time.Duration;

public class HelloWorkflowImpl implements HelloWorkflow{

    private boolean alert;

    @Override
    public String getGreeting(String name) {
        return "Hello " + name;
    }

    @Override
    public String anotherMethod(String word) {
        return (word.equals("hello") ? "hello" : "world");
    }

    @Override
    public void alertTrue() {
        this.alert = true;
    }

    @Override
    public void alertFalse() {
        this.alert = false;
    }


}
