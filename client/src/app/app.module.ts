import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { EventsComponent } from './events/events.component';
import { AboutComponent } from './about/about.component';
import { NavbarComponent } from './navbar/navbar.component';
import {ServicesService} from './services.service';
import { NewEventComponent } from './new-event/new-event.component';
import { MatchsComponent } from './matchs/matchs.component';
import { EntrainementComponent } from './entrainement/entrainement.component';
import { NewEntrainementComponent } from './new-entrainement/new-entrainement.component';
import { NewMatchsComponent } from './new-matchs/new-matchs.component';
import { Event } from './model/model.Event';

const appRoutes: Routes = [
{path: 'about', component: AboutComponent},
{path: 'match', component: MatchsComponent},
{path: 'entrainemet', component: EntrainementComponent},
{path: 'events', component: EventsComponent},
{path: 'newEvents', component: NewEventComponent},
{path: 'newMatch', component: NewMatchsComponent},
{path: 'newEntrainement', component: NewEntrainementComponent},
{path: '', redirectTo: '/about', pathMatch : 'full'}
];

@NgModule({
  declarations: [
    AppComponent,
    EventsComponent,
    NavbarComponent,
    AboutComponent,
    NavbarComponent,
    NewEventComponent,
    MatchsComponent,
    EntrainementComponent,
    NewEntrainementComponent,
    NewMatchsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [ServicesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
