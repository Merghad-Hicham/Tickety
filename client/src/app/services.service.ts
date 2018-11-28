import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import { Event } from './model/model.Event';

@Injectable()
export class ServicesService {

  constructor(public http: Http) {

  }

    getEvent() {
    return this.http.get('http://localhost:8091/events')
      .map(resp => resp.json()) ;
}
    getMatch() {
      return this.http.get('http://localhost:8091/match')
        .map(resp => resp.json());
    }
   getEntrainement() {
    return this.http.get( 'http://localhost:8091/entrainemet')
      .map(resp => resp.json());
}

   getActivete() {
    return this.http.get('http://localhost:8091/activete')
      .map(resp => resp.json()) ;
}
   getEventDate(date: Date) {
    return this.http.get('http://localhost:8091/eventsDate/date')
      .map(resp => resp.json()) ;
}
  saveEvent(event: Event) {
    return this.http.post('http://localhost:8091/events', event)
      .map(resp => resp.json());
  }

}
