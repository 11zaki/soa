import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MoyComponent } from './moy.component';

describe('MoyComponent', () => {
  let component: MoyComponent;
  let fixture: ComponentFixture<MoyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MoyComponent]
    });
    fixture = TestBed.createComponent(MoyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
