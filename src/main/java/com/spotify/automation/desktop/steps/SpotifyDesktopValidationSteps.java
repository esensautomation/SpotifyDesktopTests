package com.spotify.automation.desktop.steps;

import cucumber.api.java.en.Then;
import org.sikuli.script.*;

public class SpotifyDesktopValidationSteps {

    /**
     * Sample step
     */
    @Then("^sample Spotify Desktop then step$")
    public void sampleSpotifyDesktopThenStep(){

    }

    @Then("I should have Spotify installed")
    public void iShouldHaveSpotifyInstalled() throws FindFailed {
        openWindowsStartMenu();

    }

    private void openWindowsStartMenu() throws FindFailed {
        Screen s0 = new Screen();
        Region r0 = new Region(s0);
        Pattern windowsStartMenuSearchIcon = new Pattern("src/test/resources/imageLibrary/windows/1920.1080/windows/startMenu/searchIcon.png");
        r0.type(Key.WIN);
        r0.wait(windowsStartMenuSearchIcon, 10);
    }
}
