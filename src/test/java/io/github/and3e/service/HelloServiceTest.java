package io.github.and3e.service;

import org.junit.Assert;
import org.junit.Test;

public class HelloServiceTest {
    private HelloService SUT = new HelloService();

    @Test
    public void testPrepareGreetingNullReturnsGreetingWithFallbackValue() {
        //Given + When
        String result = SUT.prepareGreeting(null);

        //Then
        Assert.assertEquals("Hello " + HelloService.FALLBACK_NAME + "!", result);
    }

    @Test
    public void testPrepareGreetingNameReturnsGreetingWithName() {
        //Given
        String name = "test";

        //When
        String result = SUT.prepareGreeting(name);

        //Then
        Assert.assertEquals("Hello " + name + "!", result);
    }
}
