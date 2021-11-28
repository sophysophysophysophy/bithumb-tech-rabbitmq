package net.sophy.api.rabbitmq.domain;

public enum Factor {
    MAX , MIN ;

    @Override
    public String toString() {
        String value = "";
        switch (this) {
            case MIN : value = String.valueOf(11);
                break;
            case MAX:
                value = String.valueOf(99);
                break;
        }
        return value;
    }
}
