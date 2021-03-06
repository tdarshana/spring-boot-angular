import { Component, OnInit } from '@angular/core';
import {WeatherService} from "../../service/weather.service";

@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: ['./weather.component.scss']
})
export class WeatherComponent implements OnInit {

  constructor(private weatherService: WeatherService){}

  public ngOnInit(): void {
    this.weatherService.executeWeather();
  }

}
