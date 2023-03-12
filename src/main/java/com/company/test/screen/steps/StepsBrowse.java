package com.company.test.screen.steps;

import io.jmix.ui.screen.*;
import com.company.test.entity.Steps;

@UiController("Steps.browse")
@UiDescriptor("steps-browse.xml")
@LookupComponent("stepsesTable")
public class StepsBrowse extends StandardLookup<Steps> {
}