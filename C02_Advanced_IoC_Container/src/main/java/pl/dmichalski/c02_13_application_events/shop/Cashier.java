package pl.dmichalski.c02_13_application_events.shop;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import pl.dmichalski.c02_13_application_events.event.CheckoutEvent;

import java.util.Date;

/**
 * Author: Daniel
 */
public class Cashier implements BeanNameAware, ApplicationEventPublisherAware {

    private String name;

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void checkout(ShoppingCart shoppingCart) {
        double total = 0;
        for (Product product : shoppingCart.getItems()) {
            total += product.getPrice();
        }

        CheckoutEvent checkoutEvent = new CheckoutEvent(this, total, new Date());
        applicationEventPublisher.publishEvent(checkoutEvent);
    }
}
