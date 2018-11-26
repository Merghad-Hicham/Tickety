/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { EntrainementComponent } from './entrainement.component';

describe('EntrainementComponent', () => {
  let component: EntrainementComponent;
  let fixture: ComponentFixture<EntrainementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntrainementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntrainementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
