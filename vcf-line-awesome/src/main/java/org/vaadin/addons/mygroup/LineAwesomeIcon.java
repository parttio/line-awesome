package org.vaadin.addons.mygroup;

import java.util.Locale;

import com.vaadin.flow.component.html.Image;

public class LineAwesomeIcon extends Image {

    public enum Icon {

        CHECK_SQUARE("check-square"),
        COMMENT(),
        COMMENT_ALT(),
        ;

        private String id;

        private Icon() {
            this.id = name().toLowerCase(Locale.ENGLISH).replace("_", "-");
        }

        private Icon(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

    }

    public static final Icon CHECK_SQUARE = Icon.CHECK_SQUARE;

    public LineAwesomeIcon(Icon icon) {
        setSrc("line-awesome/svg/" + icon.getId() + ".svg");
        setHeight("1em");
    }
}
