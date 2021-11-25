package com.example.notesapp.feature_note.data.data_source

import androidx.room.Database
import com.example.notesapp.feature_note.domain.model.Note

@Database(
    entities =[Note::class],
    version = 1
)
abstract class Notedatabase {
    abstract  val noteDao : NoteDao

}