package ru.itpark;

import ru.itpark.model.OtherTariff;
import ru.itpark.model.Tariff;
import ru.itpark.model.TariffForDevices;
import ru.itpark.model.TurnOnTariff;

public class Main {
    public static void main(String[] args) {
        Tariff[] tariffs = new Tariff[9];

        tariffs[0] = new TurnOnTariff(
                1,
                "Включайся! Смотри",
                650,
                Tariff.Period.for30Days,
                false,
                true,
                true,
                1_200,
                300,
                0,
                true,
                "Кино и сериалы в Мегафон ТВ",
                "Кэшбек до 30%"
        );
        tariffs[1] = new TurnOnTariff(
                2,
                "Включайся! Общайся",
                350,
                Tariff.Period.for30Days,
                true,
                true,
                true,
                600,
                0,
                0,
                true,
                "Всегда оставайтесь на связи",
                "Кэшбек до 30%"
        );
        tariffs[2] = new TurnOnTariff(
                3,
                "Включайся! Развлекайся",
                300,
                Tariff.Period.for30Days,
                false,
                true,
                true,
                100,
                0,
                10,
                false,
                "Безлимитный интерне на популярные сервисы",
                "Кэшбек до 30%"
        );

        tariffs[3] = new TariffForDevices(
                4,
                "Твой безлимит на 6 месяцев",
                3_100,
                Tariff.Period.for6Months,
                false,
                true,
                true,
                true,
                "Трафик без ограничений для использования дома и в поездках по России"
        );
        tariffs[4] = new TariffForDevices(
                5,
                "Твой безлимит на 12 месяцев",
                5_100,
                Tariff.Period.for12Months,
                false,
                true,
                true,
                true,
                "Трафик без ограничений для использования дома и в поездках по России"
        );
        tariffs[5] = new TariffForDevices(
                6,
                "МегаФон — Онлайн",
                0,
                Tariff.Period.forMonths,
                false,
                true,
                true,
                false,
                "Базовый тариф для подключения интернет-опций и использования на устройствах; Оплата трафика по факту использования"
        );

        tariffs[6] = new OtherTariff(
                7,
                "Hello",
                750,
                Tariff.Period.for14Days,
                false,
                false,
                true,
                30,
                false,
                true,
                false,
                "Тариф для иностранных туристов; Безлимитные звонки внутри сети"
        );
        tariffs[7] = new OtherTariff(
                8,
                "Посекундный",
                0,
                Tariff.Period.noPeriod,
                false,
                false,
                true,
                0,
                false,
                false,
                true,
                "Тариф без абонентской платы"
        );
        tariffs[8] = new OtherTariff(
                9,
                "Умные вещи",
                20,
                Tariff.Period.week,
                false,
                true,
                true,
                0,
                true,
                false,
                false,
                "Звонки и SMS на номера России"
        );


        for (Tariff tariff : tariffs) {
            System.out.println(tariff);
            
        }


    }
}
