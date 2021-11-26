package com.example.notesapp.feature_note.domain.use_case

import com.example.notesapp.feature_note.presentation.notes.NotesEvent

data class NoteUseCases(
    val getNotes:GetNotes,
    val deleteNote:DeleteNote,
    val addNote :AddNote
)
