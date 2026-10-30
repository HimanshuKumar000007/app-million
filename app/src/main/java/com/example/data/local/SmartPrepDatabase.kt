package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        UserProfileEntity::class,
        ChapterEntity::class,
        QuestionEntity::class,
        MockTestEntity::class,
        StudyPlanTaskEntity::class
    ],
    version = 7,
    exportSchema = false
)
abstract class SmartPrepDatabase : RoomDatabase() {
    abstract fun smartPrepDao(): SmartPrepDao

    companion object {
        @Volatile
        private var INSTANCE: SmartPrepDatabase? = null

        fun getInstance(context: Context): SmartPrepDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SmartPrepDatabase::class.java,
                    "iiser_smartprep.db"
                )
                    .fallbackToDestructiveMigration(true)
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
