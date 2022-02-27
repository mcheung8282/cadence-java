package com.cadence.hello;

import com.uber.cadence.workflow.SignalMethod;
import com.uber.cadence.workflow.WorkflowMethod;

public interface HelloWorkflow {

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 300)
    String getGreeting(String name);

    @WorkflowMethod
    String anotherMethod(String word);

    @SignalMethod
    void alertTrue();

    @SignalMethod
    void alertFalse();
}
