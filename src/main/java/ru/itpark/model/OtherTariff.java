package ru.itpark.model;

public class OtherTariff extends Tariff {
    private int volumeOfGB;
    private boolean unlimitedInternet;
    private boolean umlimitedCallsOnMegafon;
    private boolean perSecond;
    private String description;

    public OtherTariff(int id, String name, int priceInRubles, Period period, boolean hit, boolean chooseTariff, boolean moreAboutTariff, int volumeOfGB, boolean unlimitedInternet, boolean umlimitedCallsOnMegafon, boolean perSecond, String description) {
        super(id, name, priceInRubles, period, hit, chooseTariff, moreAboutTariff);
        this.volumeOfGB = volumeOfGB;
        this.unlimitedInternet = unlimitedInternet;
        this.umlimitedCallsOnMegafon = umlimitedCallsOnMegafon;
        this.perSecond = perSecond;
        this.description = description;
    }

    public int getVolumeOfGB() {
        return volumeOfGB;
    }

    public void setVolumeOfGB(int volumeOfGB) {
        this.volumeOfGB = volumeOfGB;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUmlimitedCallsOnMegafon() {
        return umlimitedCallsOnMegafon;
    }

    public void setUmlimitedCallsOnMegafon(boolean umlimitedCallsOnMegafon) {
        this.umlimitedCallsOnMegafon = umlimitedCallsOnMegafon;
    }

    public boolean isPerSecond() {
        return perSecond;
    }

    public void setPerSecond(boolean perSecond) {
        this.perSecond = perSecond;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OtherTariff{" +
                "volumeOfGB=" + volumeOfGB +
                ", unlimitedInternet=" + unlimitedInternet +
                ", umlimitedCallsOnMegafon=" + umlimitedCallsOnMegafon +
                ", perSecond=" + perSecond +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
