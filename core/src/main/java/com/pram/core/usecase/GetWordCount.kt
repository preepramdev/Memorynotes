package com.pram.core.usecase

import com.pram.core.data.Note

class GetWordCount {
    operator fun invoke(note: Note): Int = getCount(note.title) + getCount(note.content)

    private fun getCount(str: String) =
        str.split(" ", "\n")
            .filter {
                it.contains(Regex(".*[a-zA-Z].*"))
            }
            .count()
}