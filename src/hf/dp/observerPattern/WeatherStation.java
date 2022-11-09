package hf.dp.observerPattern;

public class WeatherStation {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 그냥 weatherData의 registerObserver을 여기서 불러도 되고! Observers들에서 불러도 됨. add 코드는 그냥 1번 방법을 선택했음. Observer에는
        // 그런 기능을 만들지 않았음.

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
