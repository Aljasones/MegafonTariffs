package ru.itpark.model;

public class TurnOnTariff extends Tariff {
    private int volumeOfMinutes;
    private int volumeOfSMS;
    private int volumeOfGB;
    private boolean umlimitedInternet;
    private String descriptionOfTariff;
    private String descriptionOfCashback;

    public TurnOnTariff(int id, String name, int priceInRubles, Period period, boolean hit, boolean chooseTariff, boolean moreAboutTariff, int volumeOfMinutes, int volumeOfSMS, int volumeOfGB, boolean umlimitedInternet, String descriptionOfTariff, String descriptionOfCashback) {
        super(id, name, priceInRubles, period, hit, chooseTariff, moreAboutTariff);
        this.volumeOfMinutes = volumeOfMinutes;
        this.volumeOfSMS = volumeOfSMS;
        this.volumeOfGB = volumeOfGB;
        this.umlimitedInternet = umlimitedInternet;
        this.descriptionOfTariff = descriptionOfTariff;
        this.descriptionOfCashback = descriptionOfCashback;
    }

    public int getVolumeOfMinutes() {
        return volumeOfMinutes;
    }

    public void setVolumeOfMinutes(int volumeOfMinutes) {
        this.volumeOfMinutes = volumeOfMinutes;
    }

    public int getVolumeOfSMS() {
        return volumeOfSMS;
    }

    public void setVolumeOfSMS(int volumeOfSMS) {
        this.volumeOfSMS = volumeOfSMS;
    }

    public int getVolumeOfGB() {
        return volumeOfGB;
    }

    public void setVolumeOfGB(int volumeOfGB) {
        this.volumeOfGB = volumeOfGB;
    }

    public boolean isUmlimitedInternet() {
        return umlimitedInternet;
    }

    public void setUmlimitedInternet(boolean umlimitedInternet) {
        this.umlimitedInternet = umlimitedInternet;
    }

    public String getDescriptionOfTariff() {
        return descriptionOfTariff;
    }

    public void setDescriptionOfTariff(String descriptionOfTariff) {
        this.descriptionOfTariff = descriptionOfTariff;
    }

    public String getDescriptionOfCashback() {
        return descriptionOfCashback;
    }

    public void setDescriptionOfCashback(String descriptionOfCashback) {
        this.descriptionOfCashback = descriptionOfCashback;
    }

    @Override
    public String toString() {
        return "TurnOnTariff{" +
                "volumeOfMinutes=" + volumeOfMinutes +
                ", volumeOfSMS=" + volumeOfSMS +
                ", volumeOfGB=" + volumeOfGB +
                ", umlimitedInternet=" + umlimitedInternet +
                ", descriptionOfTariff='" + descriptionOfTariff + '\'' +
                ", descriptionOfCashback='" + descriptionOfCashback + '\'' +
                "} " + super.toString();
    }
}
