package edu.cs50.harvard.notes;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {NoteDao.class}, version = 1)
public abstract class NotesDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
