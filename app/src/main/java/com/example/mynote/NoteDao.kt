package com.example.mynote

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface NoteDao {

    @Query("select * from note")
    fun getAllNote(): List<NoteModel>

    @Insert(onConflict = REPLACE)
    fun insertNote(note: NoteModel)

    @Delete
    fun deleteNote(note: NoteModel)

    @Query("UPDATE note SET title =:noteTitle, message =:noteMessage WHERE id =:noteId")
    fun updateNote(noteTitle:String, noteMessage:String, noteId:Long)

}