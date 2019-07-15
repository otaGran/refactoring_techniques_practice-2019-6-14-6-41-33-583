package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_platform_contains_Mac_and_browser_contains_IE(){
        //when
        BannerRender bannerRender = new BannerRender();

        //given
        String banner = bannerRender.renderBanner("MAC","IE");
        //then
        assertEquals("IE on Mac?",banner);

    }

    @Test
    public void should_return_banner_when_either_platform_contains_Mac_or_browser_contains_IE(){
        //when
        BannerRender bannerRender = new BannerRender();

        //given
        String banner = bannerRender.renderBanner("MAC","Chrome");

        //then
        assertEquals("banner",banner);

    }

}