package ru.itpark.model;

public abstract class Tariff {

    private int id;
    private String name;
    private int priceInRubles;
    private Period period;
    private boolean hit;
    private boolean chooseTariff;
    private boolean moreAboutTariff;

    public enum Period {
        week,
        forMonths,
        for30Days,
        for14Days,
        for12Months,
        for6Months,
        noPeriod
    }

    public Tariff(int id, String name, int priceInRubles, Period period, boolean hit, boolean chooseTariff, boolean moreAboutTariff) {
        this.id = id;
        this.name = name;
        this.priceInRubles = priceInRubles;
        this.period = period;
        this.hit = hit;
        this.chooseTariff = chooseTariff;
        this.moreAboutTariff = moreAboutTariff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInRubles() {
        return priceInRubles;
    }

    public void setPriceInRubles(int priceInRubles) {
        this.priceInRubles = priceInRubles;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public boolean isChooseTariff() {
        return chooseTariff;
    }

    public void setChooseTariff(boolean chooseTariff) {
        this.chooseTariff = chooseTariff;
    }

    public boolean isMoreAboutTariff() {
        return moreAboutTariff;
    }

    public void setMoreAboutTariff(boolean moreAboutTariff) {
        this.moreAboutTariff = moreAboutTariff;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceInRubles=" + priceInRubles +
                ", period=" + period +
                ", hit=" + hit +
                ", chooseTariff=" + chooseTariff +
                ", moreAboutTariff=" + moreAboutTariff +
                '}';
    }
}

