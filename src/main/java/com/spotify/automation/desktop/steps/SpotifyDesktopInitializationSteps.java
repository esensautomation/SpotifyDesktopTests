package com.spotify.automation.desktop.steps;

import com.esens.automationFwk.utils.OSValidator;
import com.spotify.automation.desktop.enumerations.SpotifyInstallerType;
import cucumber.api.java.en.Given;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SpotifyDesktopInitializationSteps {

    /**
     * Sample step
     */
    @Given("^sample Spotify Desktop given step$")
    public void sampleSpotifyDesktopGivenStep(){

    }

    @Given("I launch the {string} spotify installer")
    public void iLaunchTheSpotifyInstaller(String installerType) throws IOException, InterruptedException {
        SpotifyInstallerType spotifyInstallerType = SpotifyInstallerType.valueOf(installerType);
        File installerFile = null;
        if(OSValidator.isWindows()){
            switch (spotifyInstallerType){
                case latest:
                    installerFile = new File("src/test/resources/bin/spotifyInstaller/latest/SpotifySetup.exe");
                    break;
                case stable:
                    installerFile = new File("src/test/resources/bin/spotifyInstaller/stable/SpotifySetup.exe");
                    break;
            }
            Process process = new ProcessBuilder(installerFile.getAbsolutePath()).start();
            process.waitFor();
        }
        if(OSValidator.isMac()){
            Desktop.getDesktop().open(new File(""));
        }
    }
}
