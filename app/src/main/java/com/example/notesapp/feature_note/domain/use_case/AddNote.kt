package com.example.notesapp.feature_note.domain.use_case

import com.example.notesapp.feature_note.domain.model.InvalidNoteException
import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository : NoteRepository
) {

    @Throws(InvalidNoteException ::class)
    suspend operator fun invoke(note :Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("OOPS The Title of the Note Cant be Empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The Content of the Note cant Be Blank Mamen")
        }

        repository.insertNote(note)
    }
}