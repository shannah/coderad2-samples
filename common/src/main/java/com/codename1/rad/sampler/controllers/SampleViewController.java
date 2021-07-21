package com.codename1.rad.sampler.controllers;

import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.rad.sampler.CustomViewControllerSample;
import com.codename1.rad.schemas.Person;
import com.codename1.ui.Dialog;

public class SampleViewController extends ViewController {
    /**
     * Creates a new ViewController with the given parent controller.
     *
     * @param parent
     */
    public SampleViewController(Controller parent) {
        super(parent);
    }


    @Override
    protected void initControllerActions() {
        super.initControllerActions();
        ActionNode.builder()
                .label("Submit")
                .addToController(this, CustomViewControllerSample.SAMPLE_ACTION, evt -> {
                    evt.consume();
                    Dialog.show("Received in "+getClass().getName(), "Name is "+evt.getEntity().getText(Person.name), "OK", null);
                });
    }
}
