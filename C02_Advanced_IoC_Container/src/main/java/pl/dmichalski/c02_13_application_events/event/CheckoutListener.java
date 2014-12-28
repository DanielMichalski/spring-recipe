package pl.dmichalski.c02_13_application_events.event;

import org.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * Author: Daniel
 */
public class CheckoutListener implements ApplicationListener<CheckoutEvent> {

    @Override
    public void onApplicationEvent(CheckoutEvent event) {
        double amount = event.getAmount();
        Date time = event.getTime();

        System.out.println("Event CheckoutEvent [" + amount + ", " + time + "]");
    }

}