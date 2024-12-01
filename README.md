
# Weather App - Real-Time Weather Information

This application fetches real-time weather data for various locations using a weather API, providing users with current weather details like temperature, humidity, wind speed, and more.






## Features

- Fetches weather details based on user input.
- Displays temperature, humidity, wind speed, weather condition, etc.
- Interactive and user-friendly interface.
- Responsive design.


## API Details

This app uses the [Open Weather API](https://openweathermap.org/current) to fetch real-time weather data. The API provides the following details for a given location:

 - Weather conditions
 - Temperature
 - Humidity
 - Wind speed

How to get an API key:

    1. Sign up for a free account on OpenWeatherMap.
    2. Once registered, generate an API key in your account settings.
    3. Replace <YOUR_API_KEY> in the code to enable API access.







## Tech Stack

    Java 17
    Mysql command line client
    Spring Boot
    Spring boot starter thymeleaf
    Spring boot starter web
    Spring boot devtools
    Spring boot starter test
    Httpclient
    Gson
    Spring boot starter
    lombok


## Screenshots

This is page of the Weather App where users can enter the name of any city to fetch its real-time weather details. After entering the city name in the input field and clicking on the 'Get Weather' button, the app fetches and displays the weather data.

![](https://github.com/user-attachments/assets/ac1e5888-ad7c-4f01-a11c-f8e26c1a094e)

Suppose, I entered the city name as "Ahmedabad" and it shows all the details regarding the weather in Ahmedabad.

![](https://github.com/user-attachments/assets/50de7b9f-8e48-48ec-b3bc-20e4b621dc54)



## Run Locally

Navigate to the folder you want to clone the project 

    cd your-folder-name

Clone the repository

    git clone https://github.com/RupaliJain2004/Weather_App.git

Open Spring Tool Suite

   - right-click on the project 
   - click on Run As
   - select Spring Boot App

