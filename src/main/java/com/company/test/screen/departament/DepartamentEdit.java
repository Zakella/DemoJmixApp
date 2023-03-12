package com.company.test.screen.departament;

import io.jmix.ui.screen.*;
import com.company.test.entity.Departament;

@UiController("Departament.edit")
@UiDescriptor("departament-edit.xml")
@EditedEntityContainer("departamentDc")
public class DepartamentEdit extends StandardEditor<Departament> {
}