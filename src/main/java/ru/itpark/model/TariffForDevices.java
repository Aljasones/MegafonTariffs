package ru.itpark.model;

public class TariffForDevices extends Tariff {
    private boolean unlimitedInternet;
    private String description;

    public TariffForDevices(int id, String name, int priceInRubles, Period period, boolean hit, boolean chooseTariff, boolean moreAboutTariff, boolean unlimitedInternet, String description) {
        super(id, name, priceInRubles, period, hit, chooseTariff, moreAboutTariff);
        this.unlimitedInternet = unlimitedInternet;
        this.description = description;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TariffForDevices{" +
                "unlimitedInternet=" + unlimitedInternet +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
