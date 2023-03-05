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
}
