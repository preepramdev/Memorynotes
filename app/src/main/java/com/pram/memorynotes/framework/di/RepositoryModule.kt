package com.pram.memorynotes.framework.di

import android.app.Application
import com.pram.memorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideRepository(app: Application) = RoomNoteDataSource(app)
}