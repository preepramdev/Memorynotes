package com.pram.core.usecase

import com.pram.core.data.Note
import com.pram.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}