package com.spotify.automation.desktop.runner.integrationTests.installer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/spotifyDesktop/IntegrationTests/Installer/spotify_installer.feature"},
        glue = {
                "com.esens.automationFwk.steps",
                "com.esens.automationFwk.desktop.steps",
                "com.spotify.automation.desktop.steps"
        }
)
public class SpotifyInstallerFtRunner {
}
