import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  private apiKey: string = 'b1b15e88fa797225412429c1c50c122a1';
  private URL: string = 'https://samples.openweathermap.org/data/2.5/forecast?id=524901&appid=';

  private getWeather() {
    fetch(this.URL + this.apiKey)
      .then(res => res.json())
      .then(json => {
        console.log(json);
      })
      .catch(e => {
        console.log(`There has been a problem with your fetch operation for resource "${this.URL + this.apiKey}": ` + e.message);
      })
      .finally(() => {
        console.log(`fetch attempt for "${this.URL + this.apiKey}" finished.`);
      });
  }

  executeWeather() {
    this.getWeather();
  }

}



