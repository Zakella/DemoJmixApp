package com.company.test.screen.myonboarding;

import com.company.test.entity.UserStep;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.test.entity.User;

@UiController("MyOnboardingScreen")
@UiDescriptor("my-onboarding-screen.xml")
public class MyOnboardingScreen extends Screen {
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private CollectionContainer<UserStep> userStepsDc;
    @Autowired
    private CollectionLoader<UserStep> userStepsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {

        User user = (User) currentAuthentication.getUser();
        userStepsDl.setParameter("user", user);
        userStepsDl.load();



    }
}