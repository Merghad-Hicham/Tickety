import { Component, OnInit } from '@angular/core';
import { Event } from '../model/model.Event';
import {ServicesService} from '../services.service';
@Component({
  selector: 'app-new-event',
  templateUrl: './new-event.component.html',
  styleUrls: ['./new-event.component.css']
})
export class NewEventComponent implements OnInit {
  event: Event = new Event();

   constructor(public eventServices: ServicesService) {
   }

  ngOnInit() {
  }
  saveEvent() {
     this.eventServices.saveEvent (this.event)
       .subscribe( data => {
          console.log(data);
       }, err => {
          console.log(err);
        }
      );
  }


}
