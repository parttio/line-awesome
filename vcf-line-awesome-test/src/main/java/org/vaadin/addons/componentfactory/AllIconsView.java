package org.vaadin.addons.componentfactory;

import org.vaadin.addons.mygroup.LineAwesomeIcon;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class AllIconsView extends VerticalLayout {

    public AllIconsView() {
        Grid<LineAwesomeIcon> grid = new Grid<>(LineAwesomeIcon.class, false);
        grid.setWidth("300px");
        grid.addColumn(icon -> icon.name());
        grid.addComponentColumn(icon -> icon.create()).setWidth("48px").setFlexGrow(0);
        grid.setItems(LineAwesomeIcon.values());
        add(grid);
    }

}
