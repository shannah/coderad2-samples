package com.codename1.rad.sampler.controllers;

import com.codename1.components.SpanLabel;
import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.sampler.DefineSlotSample;

public class DefineSlotSample2ViewController extends ViewController {
    /**
     * Creates a new ViewController with the given parent controller.
     *
     * @param parent
     */
    public DefineSlotSample2ViewController(Controller parent) {
        super(parent);
    }

    @Override
    protected void onStartController() {
        super.onStartController();
        fillSlot(DefineSlotSample.topLeftSlot, evt -> {
            evt.consume();
            evt.getSlot().setContent(new SpanLabel("This content was replaced in DefineSlotSample2ViewController"));
        });
    }
}
