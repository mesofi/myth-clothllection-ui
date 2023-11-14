import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NgbDropdownModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { CharacterEditorComponent } from './character-editor/character-editor.component';
import { CharacterEditorDataComponent } from './character-editor/character-editor-data/character-editor-data.component';
import { CharacterEditorLinkComponent } from './character-editor/character-editor-link/character-editor-link.component';

@NgModule({
  declarations: [
    AppComponent,
    CharacterEditorComponent,
    CharacterEditorDataComponent,
    CharacterEditorLinkComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    NgbDropdownModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
