# Line Awesome icons for Vaadin

An integration of the https://icons8.com/line-awesome icon set for Vaadin 23 and 24.

## Usage

```
Button button = new Button("Pay");
button.setIcon(LineAwesomeIcon.CREDIT_CARD.create());
```

## Cutting new release

Before cutting a release, make sure the build passes properly locally and in GitHub Actions based verification build.

To tag a release and increment versions, go the line-awesome subdirectory and issue:

    mvn release:prepare release:clean

Answer questions, defaults most often fine. Note that release:perform is not needed as there is a GitHub Action is set up build and to push release to Maven Central automatically.

Directory will automatically pick up new releases within about half an hour, but if browser or Vaadin version support change, be sure to adjust the metadata in Vaadin Directory UI.
