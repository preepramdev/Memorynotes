package com.pram.memorynotes.framework.di

import com.pram.core.repository.NoteRepository
import com.pram.core.usecase.AddNote
import com.pram.core.usecase.GetAllNotes
import com.pram.core.usecase.GetNote
import com.pram.core.usecase.RemoveNote
import com.pram.memorynotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class Usecases {
    @Provides
    fun provideUsecases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository)
    )
}