package quickfix.fix42;

import quickfix.FieldNotFound;
import quickfix.Group;


public class QuoteCancel extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "Z";

    public QuoteCancel() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public QuoteCancel(quickfix.field.QuoteID quoteID,
        quickfix.field.QuoteCancelType quoteCancelType) {
        this();
        setField(quoteID);
        setField(quoteCancelType);
    }

    public void set(quickfix.field.QuoteReqID value) {
        setField(value);
    }

    public quickfix.field.QuoteReqID get(quickfix.field.QuoteReqID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
        quickfix.field.QuoteReqID value = new quickfix.field.QuoteReqID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteReqID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteReqID() {
        return isSetField(131);
    }

    public void set(quickfix.field.QuoteID value) {
        setField(value);
    }

    public quickfix.field.QuoteID get(quickfix.field.QuoteID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteID getQuoteID() throws FieldNotFound {
        quickfix.field.QuoteID value = new quickfix.field.QuoteID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteID() {
        return isSetField(117);
    }

    public void set(quickfix.field.QuoteCancelType value) {
        setField(value);
    }

    public quickfix.field.QuoteCancelType get(
        quickfix.field.QuoteCancelType value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteCancelType getQuoteCancelType()
        throws FieldNotFound {
        quickfix.field.QuoteCancelType value = new quickfix.field.QuoteCancelType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteCancelType field) {
        return isSetField(field);
    }

    public boolean isSetQuoteCancelType() {
        return isSetField(298);
    }

    public void set(quickfix.field.QuoteResponseLevel value) {
        setField(value);
    }

    public quickfix.field.QuoteResponseLevel get(
        quickfix.field.QuoteResponseLevel value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteResponseLevel getQuoteResponseLevel()
        throws FieldNotFound {
        quickfix.field.QuoteResponseLevel value = new quickfix.field.QuoteResponseLevel();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteResponseLevel field) {
        return isSetField(field);
    }

    public boolean isSetQuoteResponseLevel() {
        return isSetField(301);
    }

    public void set(quickfix.field.TradingSessionID value) {
        setField(value);
    }

    public quickfix.field.TradingSessionID get(
        quickfix.field.TradingSessionID value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.TradingSessionID getTradingSessionID()
        throws FieldNotFound {
        quickfix.field.TradingSessionID value = new quickfix.field.TradingSessionID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.TradingSessionID field) {
        return isSetField(field);
    }

    public boolean isSetTradingSessionID() {
        return isSetField(336);
    }

    public void set(quickfix.field.NoQuoteEntries value) {
        setField(value);
    }

    public quickfix.field.NoQuoteEntries get(
        quickfix.field.NoQuoteEntries value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoQuoteEntries getNoQuoteEntries()
        throws FieldNotFound {
        quickfix.field.NoQuoteEntries value = new quickfix.field.NoQuoteEntries();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoQuoteEntries field) {
        return isSetField(field);
    }

    public boolean isSetNoQuoteEntries() {
        return isSetField(295);
    }

    public static class NoQuoteEntries extends Group {
        static final long serialVersionUID = 20050617;

        public NoQuoteEntries() {
            super(295, 55,
                new int[] {
                    55, 65, 48, 22, 167, 200, 205, 201, 202, 206, 231, 223, 207,
                    106, 348, 349, 107, 350, 351, 311, 0
                });
        }

        public void set(quickfix.field.Symbol value) {
            setField(value);
        }

        public quickfix.field.Symbol get(quickfix.field.Symbol value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Symbol getSymbol() throws FieldNotFound {
            quickfix.field.Symbol value = new quickfix.field.Symbol();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Symbol field) {
            return isSetField(field);
        }

        public boolean isSetSymbol() {
            return isSetField(55);
        }

        public void set(quickfix.field.SymbolSfx value) {
            setField(value);
        }

        public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SymbolSfx getSymbolSfx()
            throws FieldNotFound {
            quickfix.field.SymbolSfx value = new quickfix.field.SymbolSfx();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SymbolSfx field) {
            return isSetField(field);
        }

        public boolean isSetSymbolSfx() {
            return isSetField(65);
        }

        public void set(quickfix.field.SecurityID value) {
            setField(value);
        }

        public quickfix.field.SecurityID get(quickfix.field.SecurityID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityID getSecurityID()
            throws FieldNotFound {
            quickfix.field.SecurityID value = new quickfix.field.SecurityID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityID field) {
            return isSetField(field);
        }

        public boolean isSetSecurityID() {
            return isSetField(48);
        }

        public void set(quickfix.field.IDSource value) {
            setField(value);
        }

        public quickfix.field.IDSource get(quickfix.field.IDSource value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.IDSource getIDSource() throws FieldNotFound {
            quickfix.field.IDSource value = new quickfix.field.IDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.IDSource field) {
            return isSetField(field);
        }

        public boolean isSetIDSource() {
            return isSetField(22);
        }

        public void set(quickfix.field.SecurityType value) {
            setField(value);
        }

        public quickfix.field.SecurityType get(
            quickfix.field.SecurityType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityType getSecurityType()
            throws FieldNotFound {
            quickfix.field.SecurityType value = new quickfix.field.SecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityType field) {
            return isSetField(field);
        }

        public boolean isSetSecurityType() {
            return isSetField(167);
        }

        public void set(quickfix.field.MaturityMonthYear value) {
            setField(value);
        }

        public quickfix.field.MaturityMonthYear get(
            quickfix.field.MaturityMonthYear value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityMonthYear getMaturityMonthYear()
            throws FieldNotFound {
            quickfix.field.MaturityMonthYear value = new quickfix.field.MaturityMonthYear();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityMonthYear field) {
            return isSetField(field);
        }

        public boolean isSetMaturityMonthYear() {
            return isSetField(200);
        }

        public void set(quickfix.field.MaturityDay value) {
            setField(value);
        }

        public quickfix.field.MaturityDay get(quickfix.field.MaturityDay value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityDay getMaturityDay()
            throws FieldNotFound {
            quickfix.field.MaturityDay value = new quickfix.field.MaturityDay();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityDay field) {
            return isSetField(field);
        }

        public boolean isSetMaturityDay() {
            return isSetField(205);
        }

        public void set(quickfix.field.PutOrCall value) {
            setField(value);
        }

        public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PutOrCall getPutOrCall()
            throws FieldNotFound {
            quickfix.field.PutOrCall value = new quickfix.field.PutOrCall();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PutOrCall field) {
            return isSetField(field);
        }

        public boolean isSetPutOrCall() {
            return isSetField(201);
        }

        public void set(quickfix.field.StrikePrice value) {
            setField(value);
        }

        public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StrikePrice getStrikePrice()
            throws FieldNotFound {
            quickfix.field.StrikePrice value = new quickfix.field.StrikePrice();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StrikePrice field) {
            return isSetField(field);
        }

        public boolean isSetStrikePrice() {
            return isSetField(202);
        }

        public void set(quickfix.field.OptAttribute value) {
            setField(value);
        }

        public quickfix.field.OptAttribute get(
            quickfix.field.OptAttribute value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OptAttribute getOptAttribute()
            throws FieldNotFound {
            quickfix.field.OptAttribute value = new quickfix.field.OptAttribute();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OptAttribute field) {
            return isSetField(field);
        }

        public boolean isSetOptAttribute() {
            return isSetField(206);
        }

        public void set(quickfix.field.ContractMultiplier value) {
            setField(value);
        }

        public quickfix.field.ContractMultiplier get(
            quickfix.field.ContractMultiplier value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContractMultiplier getContractMultiplier()
            throws FieldNotFound {
            quickfix.field.ContractMultiplier value = new quickfix.field.ContractMultiplier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContractMultiplier field) {
            return isSetField(field);
        }

        public boolean isSetContractMultiplier() {
            return isSetField(231);
        }

        public void set(quickfix.field.CouponRate value) {
            setField(value);
        }

        public quickfix.field.CouponRate get(quickfix.field.CouponRate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CouponRate getCouponRate()
            throws FieldNotFound {
            quickfix.field.CouponRate value = new quickfix.field.CouponRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CouponRate field) {
            return isSetField(field);
        }

        public boolean isSetCouponRate() {
            return isSetField(223);
        }

        public void set(quickfix.field.SecurityExchange value) {
            setField(value);
        }

        public quickfix.field.SecurityExchange get(
            quickfix.field.SecurityExchange value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityExchange getSecurityExchange()
            throws FieldNotFound {
            quickfix.field.SecurityExchange value = new quickfix.field.SecurityExchange();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityExchange field) {
            return isSetField(field);
        }

        public boolean isSetSecurityExchange() {
            return isSetField(207);
        }

        public void set(quickfix.field.Issuer value) {
            setField(value);
        }

        public quickfix.field.Issuer get(quickfix.field.Issuer value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Issuer getIssuer() throws FieldNotFound {
            quickfix.field.Issuer value = new quickfix.field.Issuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Issuer field) {
            return isSetField(field);
        }

        public boolean isSetIssuer() {
            return isSetField(106);
        }

        public void set(quickfix.field.EncodedIssuerLen value) {
            setField(value);
        }

        public quickfix.field.EncodedIssuerLen get(
            quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedIssuerLen getEncodedIssuerLen()
            throws FieldNotFound {
            quickfix.field.EncodedIssuerLen value = new quickfix.field.EncodedIssuerLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedIssuerLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedIssuerLen() {
            return isSetField(348);
        }

        public void set(quickfix.field.EncodedIssuer value) {
            setField(value);
        }

        public quickfix.field.EncodedIssuer get(
            quickfix.field.EncodedIssuer value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedIssuer getEncodedIssuer()
            throws FieldNotFound {
            quickfix.field.EncodedIssuer value = new quickfix.field.EncodedIssuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedIssuer field) {
            return isSetField(field);
        }

        public boolean isSetEncodedIssuer() {
            return isSetField(349);
        }

        public void set(quickfix.field.SecurityDesc value) {
            setField(value);
        }

        public quickfix.field.SecurityDesc get(
            quickfix.field.SecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityDesc getSecurityDesc()
            throws FieldNotFound {
            quickfix.field.SecurityDesc value = new quickfix.field.SecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetSecurityDesc() {
            return isSetField(107);
        }

        public void set(quickfix.field.EncodedSecurityDescLen value) {
            setField(value);
        }

        public quickfix.field.EncodedSecurityDescLen get(
            quickfix.field.EncodedSecurityDescLen value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen()
            throws FieldNotFound {
            quickfix.field.EncodedSecurityDescLen value = new quickfix.field.EncodedSecurityDescLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedSecurityDescLen() {
            return isSetField(350);
        }

        public void set(quickfix.field.EncodedSecurityDesc value) {
            setField(value);
        }

        public quickfix.field.EncodedSecurityDesc get(
            quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc()
            throws FieldNotFound {
            quickfix.field.EncodedSecurityDesc value = new quickfix.field.EncodedSecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetEncodedSecurityDesc() {
            return isSetField(351);
        }

        public void set(quickfix.field.UnderlyingSymbol value) {
            setField(value);
        }

        public quickfix.field.UnderlyingSymbol get(
            quickfix.field.UnderlyingSymbol value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.UnderlyingSymbol getUnderlyingSymbol()
            throws FieldNotFound {
            quickfix.field.UnderlyingSymbol value = new quickfix.field.UnderlyingSymbol();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.UnderlyingSymbol field) {
            return isSetField(field);
        }

        public boolean isSetUnderlyingSymbol() {
            return isSetField(311);
        }
    }
}
