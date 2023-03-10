package org.vaadin.lineawesome;

import java.util.Locale;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.component.grid.dataview.GridListDataView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class AllIconsView extends VerticalLayout {

    public AllIconsView() {
        setHeightFull();
        Grid<LineAwesomeIcon> grid = new Grid<>(LineAwesomeIcon.class, false);
        grid.setWidth("300px");
        grid.setHeightFull();
        Column<LineAwesomeIcon> name = grid.addColumn(icon -> icon.name());
        Column<LineAwesomeIcon> iconColumn = grid.addComponentColumn(icon -> {
            Component component = icon.create();
            return component;
        });
        iconColumn.setAutoWidth(true).setFlexGrow(0);
        GridListDataView<LineAwesomeIcon> dataView = grid.setItems(LineAwesomeIcon.values());

        TextField filter = new TextField();
        filter.setWidthFull();
        filter.setValueChangeMode(ValueChangeMode.EAGER);
        filter.addValueChangeListener(e -> {
            dataView.setFilter(icon -> icon.name().contains(e.getValue().toUpperCase(Locale.ENGLISH)));
        });
        name.setHeader(filter);
        add(grid);
    }

}
