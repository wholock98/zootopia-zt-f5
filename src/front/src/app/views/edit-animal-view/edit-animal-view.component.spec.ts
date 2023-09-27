import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditAnimalViewComponent } from './edit-animal-view.component';

describe('EditAnimalViewComponent', () => {
  let component: EditAnimalViewComponent;
  let fixture: ComponentFixture<EditAnimalViewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditAnimalViewComponent]
    });
    fixture = TestBed.createComponent(EditAnimalViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
