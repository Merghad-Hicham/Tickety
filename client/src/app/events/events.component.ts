import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map' ;
import {ServicesService} from '../services.service';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent implements OnInit {

  pageEvent: any;
  dateCle: Date;
  constructor( public eventServices: ServicesService) { }

  ngOnInit() {
    this.doSherch();
   }
  doSherch () {
    this.eventServices.getEvent ()
      .subscribe(data => {
          this.pageEvent = data;
        }, err => {
          console.log(err);
        }
      );
  }

  chercher() {

  }
}
