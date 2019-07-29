package com.spotify.automation.desktop.steps;

import com.esens.automationFwk.desktop.steps.DesktopScenarioContext;

public class SpotifyDesktopScenarioContext extends DesktopScenarioContext {

    private static SpotifyDesktopScenarioContext instance = new SpotifyDesktopScenarioContext();

    protected SpotifyDesktopScenarioContext(){
        super();
    }

    public static SpotifyDesktopScenarioContext getInstance(){
        return instance;
    }
}
