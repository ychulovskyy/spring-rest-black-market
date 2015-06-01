package org.vtsukur.spring.rest.market.domain.offer;

import lombok.Getter;
import lombok.Setter;
import org.vtsukur.spring.rest.market.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @author volodymyr.tsukur
 */
@Entity
@Getter
@Setter
public class Offer extends BaseEntity {

    @Lob
    private LocalDateTime published;

    private Type type;

    private BigInteger amount;

    private Currency currency;

    private BigDecimal rate;

    private Status status;

    public enum Type {

        BUY,

        SELL

    }

    public enum Currency {

        USD,

        EUR,

        UAH

    }

    public enum Status {

        NEW,

        PUBLISHED,

        OUTDATED

    }

}
