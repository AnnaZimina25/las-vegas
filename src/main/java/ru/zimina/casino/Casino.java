package ru.zimina.casino;

public class Casino {

    @GameMarker
    public static int playPoker() {
        int result = getRandomValue();
        System.out.println(String.format("Результат игры \"Покер\" = %d", result));
        return result;

    }

    @GameMarker
    public static int playRoulette() {
        int result = getRandomValue();
        System.out.println(String.format("Результат игры \"Рулетка\" = %d", result));
        return result;

    }


    public static int playSlotMachine() {
        int result = getRandomValue();
        System.out.println(String.format("Результат игры \"Игоровой автомат\" = %d", result));
        return result;

    }

    @GameMarker
    public static int playBlackjack() {
        int result = getRandomValue();
        System.out.println(String.format("Результат игры \"Блекджек\" = %d", result));
        return result;

    }

    @GameMarker
    public static int playWheelOfFortune() {
        int result = getRandomValue();
        System.out.println(String.format("Результат игры \"Колесо фортуны\" = %d", result));
        return result;

    }

    public static int playBaccarat() {
        int result = getRandomValue();
        System.out.println(String.format("Результат игры \"Баккара\" = %d", result));
        return result;

    }

    private static int getRandomValue() {
        int maxValue = 10_000;
        int result = (int)(Math.random() * maxValue * (Math.random() > 0.5 ? 1 : -1));
        return result;
    }
}
