package com.pram.memorynotes.framework.di

import com.pram.memorynotes.framework.ListViewModel
import com.pram.memorynotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UsecasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}