package org.vaadin.lineawesome;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("button")
public class ButtonView extends VerticalLayout {

    public ButtonView() {
        Button ok = new Button("OK");
        ok.setIcon(LineAwesomeIcon.CHECK_SQUARE.create());
        add(ok);
        Button ok2 = new Button("OK");
        ok2.setIcon(VaadinIcon.CHECK_SQUARE.create());
        add(ok2);
        Button button = new Button("Pay");
        button.setIcon(LineAwesomeIcon.CREDIT_CARD.create());
        add(button);
    }
}
