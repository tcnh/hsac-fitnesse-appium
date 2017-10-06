package nl.hsac.fitnesse.fixture.util.mobile.scroll;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import nl.hsac.fitnesse.fixture.util.mobile.IosHelper;

/**
 * Helper to deal with scrolling for iOS.
 */
public class IosScrollHelper extends ScrollHelper<IOSElement, IOSDriver<IOSElement>> {

    public IosScrollHelper(IosHelper helper) {
        super(helper);
        setWaitAfterMoveDuration(null);
    }

    @Override
    protected IOSElement findTopScrollable() {
        return helper.findByXPath("(.//UIAScrollView)[1]");
    }

    @Override
    protected IOSElement findScrollRefElement() {
        return helper.findByXPath("(.//UIAScrollView//UIAStaticText)[1]");
    }
}
