package com.ms.runningtrackerapp.repositories

import com.ms.runningtrackerapp.db.Run
import com.ms.runningtrackerapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}