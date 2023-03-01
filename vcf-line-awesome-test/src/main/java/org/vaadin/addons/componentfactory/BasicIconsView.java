package org.vaadin.addons.componentfactory;

import org.vaadin.addons.mygroup.LineAwesomeIcon;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class BasicIconsView extends HorizontalLayout {

    private Button sayHello;

    public BasicIconsView() {
        sayHello = new Button("Say hello");
        sayHello.setIcon(new LineAwesomeIcon(LineAwesomeIcon.Icon.COMMENT));
        sayHello.addClickListener(e -> {
            Notification.show("Hello");
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, sayHello);

        add(sayHello);
    }

}
