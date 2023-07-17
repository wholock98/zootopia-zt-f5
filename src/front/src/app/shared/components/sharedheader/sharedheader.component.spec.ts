import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SharedheaderComponent } from './sharedheader.component';

describe('SharedheaderComponent', () => {
  let component: SharedheaderComponent;
  let fixture: ComponentFixture<SharedheaderComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SharedheaderComponent]
    });
    fixture = TestBed.createComponent(SharedheaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
