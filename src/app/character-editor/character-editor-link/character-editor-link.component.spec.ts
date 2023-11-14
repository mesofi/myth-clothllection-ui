import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CharacterEditorLinkComponent } from './character-editor-link.component';

describe('CharacterEditorLinkComponent', () => {
  let component: CharacterEditorLinkComponent;
  let fixture: ComponentFixture<CharacterEditorLinkComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CharacterEditorLinkComponent]
    });
    fixture = TestBed.createComponent(CharacterEditorLinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
