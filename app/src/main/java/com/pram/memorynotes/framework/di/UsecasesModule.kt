package com.pram.memorynotes.framework.di

import com.pram.core.repository.NoteRepository
import com.pram.core.usecase.*
import com.pram.memorynotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UsecasesModule {
    @Provides
    fun provideUsecases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}