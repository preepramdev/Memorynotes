package com.pram.core.usecase

import com.pram.core.data.Note
import com.pram.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}