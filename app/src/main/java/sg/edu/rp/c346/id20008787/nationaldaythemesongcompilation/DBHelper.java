package sg.edu.rp.c346.id20008787.nationaldaythemesongcompilation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteDatabase {

    private static final String DATABASE_NAME = "song.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NOTE = "title";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NOTE_CONTENT = "title";


    public void onCreate(SQLiteDatabase db) {
        String createNoteTableSQL = "CREATE TABLE " + TABLE_NOTE + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_NOTE_CONTENT + "TEXT ) ";
        db.execSQL(createNoteTableSQL);
    }



