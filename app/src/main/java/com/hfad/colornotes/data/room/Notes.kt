package com.hfad.colornotes.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "note_table")
data class Notes(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "note")
    val note: String?,
    @ColumnInfo(name = "note_title")
    val noteTitle: String?
) : Serializable
