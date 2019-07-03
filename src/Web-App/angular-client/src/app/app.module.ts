import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { User } from './model/user/user.component';
import { UserListComponent } from './model/user-list/user-list.component';
import { UserFormComponent } from './model/user-form/user-form.component';
import { UserService } from './service/user-servce.service';
import { WeatherComponent } from './model/weather/weather.component';
import {GeolocationService} from "./service/geolocation.service";

@NgModule({
  declarations: [
    AppComponent,
    User,
    UserListComponent,
    UserFormComponent,
    WeatherComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService, GeolocationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
