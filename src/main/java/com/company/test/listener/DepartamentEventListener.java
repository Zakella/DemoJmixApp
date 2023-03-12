package com.company.test.listener;

import com.company.test.entity.Departament;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DepartamentEventListener {

    @EventListener
    public void onDepartamentChangedBeforeCommit(EntityChangedEvent<Departament> event) {
      int a = 1;
    }
}