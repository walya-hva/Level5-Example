package nl.hva.fdmci.mad.level4_example1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminderTable")
data class Reminder(

    @ColumnInfo(name = "reminder")
    var reminderText: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)