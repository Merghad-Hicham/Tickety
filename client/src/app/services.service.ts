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
    return this.http.get('http://localhost:8091/events/{2}')
      .map(resp => resp.json()) ;
}
  saveEvent(event: Event) {
    return this.http.post('http://localhost:8091/events', event)
      .map(resp => resp.json());
  }

}
