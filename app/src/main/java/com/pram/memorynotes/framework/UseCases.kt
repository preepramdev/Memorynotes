package com.pram.memorynotes.framework

import com.pram.core.usecase.AddNote
import com.pram.core.usecase.GetAllNotes
import com.pram.core.usecase.GetNote
import com.pram.core.usecase.RemoveNote

data class UseCases(
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote
)