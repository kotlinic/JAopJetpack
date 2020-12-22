package com.zlx.library_db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.zlx.library_db.entity.SearchHistoryEntity;

import java.util.List;

/**
 * Created by andy on 2020/9/23 10:32
 * 
 * Description:
 */
@Dao
public interface SearchHistoryDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insertPerson(SearchHistoryEntity entity);


    @Query("select * from SearchHistoryEntity")
    public List<SearchHistoryEntity> selectHis();


    @Query("delete from SearchHistoryEntity where id= :id")
    void deleteById(long id);

    @Query("delete from SearchHistoryEntity")
    void deleteAll();
}
