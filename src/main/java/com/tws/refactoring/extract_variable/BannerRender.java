package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean doesBrowserContainIE = browser.toUpperCase().contains("IE");
        boolean doesPlatformContainMAC = platform.toUpperCase().contains("MAC");
        if (doesPlatformContainMAC &&
                doesBrowserContainIE) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
