package com.teamopendata.mindcareapp.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.teamopendata.mindcareapp.model.entity.Record;

import java.util.List;

@Dao
public interface RecordDao {
    @Insert
    void insert(Record record);

    @Delete
    void delete(Record record);

    @Update
    void update(Record record);

    @Query("SELECT * FROM record_table")
    List<Record> getAll();
}
