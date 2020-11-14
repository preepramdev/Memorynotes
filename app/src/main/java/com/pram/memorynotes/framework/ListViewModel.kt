package com.pram.memorynotes.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.pram.core.data.Note
import com.pram.core.repository.NoteRepository
import com.pram.core.usecase.AddNote
import com.pram.core.usecase.GetAllNotes
import com.pram.core.usecase.GetNote
import com.pram.core.usecase.RemoveNote
import com.pram.memorynotes.framework.di.ApplicationModule
import com.pram.memorynotes.framework.di.DaggerViewModelComponent
//import com.pram.memorynotes.framework.di.DaggerViewModelComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ListViewModel(application: Application) : AndroidViewModel(application) {
    val coroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var useCases: UseCases

    init {
        DaggerViewModelComponent.builder()
            .applicationModule(ApplicationModule(getApplication()))
            .build()
            .inject(this)
    }

    val notes = MutableLiveData<List<Note>>()

    fun getNotes() {
        coroutineScope.launch {
            val noteList = useCases.getAllNotes()
            noteList.forEach { it.wordCount = useCases.getWordCount(it) }
            notes.postValue(noteList)
        }
    }
}