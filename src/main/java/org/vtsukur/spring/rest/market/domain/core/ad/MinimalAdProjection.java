package org.vtsukur.spring.rest.market.domain.core.ad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.math.BigInteger;

@Projection(name = "minimal", types = Ad.class)
public interface MinimalAdProjection {

    Ad.Type getType();

    BigInteger getAmount();

    Ad.Currency getCurrency();

    BigDecimal getRate();

    @Value("#{target.user.phoneNumber}")
    String getPhoneNumber();

}
