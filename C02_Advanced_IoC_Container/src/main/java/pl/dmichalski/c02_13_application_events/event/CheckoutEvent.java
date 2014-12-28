package pl.dmichalski.c02_13_application_events.event;

import org.springframework.context.ApplicationEvent;

import java.util.Date;

/**
 * Author: Daniel
 */
public class CheckoutEvent extends ApplicationEvent {

    private double amount;

    private Date time;

    public CheckoutEvent(Object source, double amount, Date time) {
        super(source);
        this.amount = amount;
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTime() {
        return time;
    }
}
