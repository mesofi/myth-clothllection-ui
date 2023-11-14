import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CharacterEditorDataComponent } from './character-editor-data.component';

describe('CharacterEditorDataComponent', () => {
  let component: CharacterEditorDataComponent;
  let fixture: ComponentFixture<CharacterEditorDataComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CharacterEditorDataComponent]
    });
    fixture = TestBed.createComponent(CharacterEditorDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
