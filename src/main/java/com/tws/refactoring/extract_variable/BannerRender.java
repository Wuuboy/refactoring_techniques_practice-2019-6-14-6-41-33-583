package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean doesPaltformContainMAC = platform.toUpperCase().contains("MAC");
        final boolean doesPaltformContainIE = platform.toUpperCase().contains("IE");
        if (doesPaltformContainMAC && doesPaltformContainIE) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
