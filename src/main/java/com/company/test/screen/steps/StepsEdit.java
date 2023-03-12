package com.company.test.screen.steps;

import io.jmix.ui.screen.*;
import com.company.test.entity.Steps;

@UiController("Steps.edit")
@UiDescriptor("steps-edit.xml")
@EditedEntityContainer("stepsDc")
public class StepsEdit extends StandardEditor<Steps> {
}