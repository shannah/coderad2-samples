package com.codename1.rad.sampler.controllers;

import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.rad.sampler.ButtonsSample;

public class ButtonsSampleViewController extends ViewController {
    /**
     * Creates a new ViewController with the given parent controller.
     *
     * @param parent
     */
    public ButtonsSampleViewController(Controller parent) {
        super(parent);
    }

    @Override
    protected void initControllerActions() {
        super.initControllerActions();
        for (String label : new String[]{"File", "Edit", "View", "Navigate", "Code", "Analyze", "Refactor", "Build", "Run", "Tools", "VCS", "Window", "Help"}) {
            ActionNode.builder()
                    .label(label)
                    .addToController(this, ButtonsSample.BUTTONS_MENU, evt -> {});

        }

    }
}
