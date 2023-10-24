package org.vaadin.lineawesome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineAwesomeIconTest {

    @Test
    public void allSvgsExist() {
        for (LineAwesomeIcon icon : LineAwesomeIcon.values()) {
            Assertions.assertNotNull(getClass().getClassLoader()
                    .getResource("META-INF/resources/line-awesome/svg/" + icon.getSvgName() + ".svg"), "Svg "+icon.getSvgName()+" should exist");
        }

    }

    @Test
    public void hasIconAPIs() {
        var icon = LineAwesomeIcon.CALENDAR.create();
        icon.setSize("100px");
        icon.setColor("red");
        Assertions.assertEquals("red", icon.getColor());
        Assertions.assertEquals("100px", icon.getStyle().get("width"));
        Assertions.assertEquals("100px", icon.getStyle().get("height"));
    }
}
