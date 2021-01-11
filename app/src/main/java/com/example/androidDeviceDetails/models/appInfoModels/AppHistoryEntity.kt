package com.example.androidDeviceDetails.models.appInfoModels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * A data class used to enter details into [AppHistoryDao]
 *
 * @param rowId Autogenerated, can be given as 0
 * @param appId Id corresponding to an app, taken from [AppsDao]
 * @param timestamp Timestamp
 * @param eventType One of the event from [EventType]
 * @param versionName App's version name
 * @param previousVersionCode Previously recorded version code of the app
 * @param currentVersionCode Apps current version code
 * @param appSize Size of the app in MB
 * @param appTitle Name of the app
 * @param isSystemApp Whether the app is a system app or not
 */
@Entity
@ForeignKey(entity = AppsEntity::class, parentColumns = ["uid"], childColumns = ["appId"])

data class AppHistoryEntity(
    @PrimaryKey(autoGenerate = true) val rowId: Int,
    @ColumnInfo val appId: Int,
    @ColumnInfo(name = "timestamp") var timestamp: Long,
    @ColumnInfo(name = "event_type") var eventType: Int,
    @ColumnInfo(name = "version_name") var versionName: String,
    @ColumnInfo(name = "previous_version_code") var previousVersionCode: Long,
    @ColumnInfo(name = "current_version_code") var currentVersionCode: Long,
    @ColumnInfo(name = "apk_size") var appSize: Long,
    @ColumnInfo(name = "apk_title") var appTitle: String,
    @ColumnInfo(name = "is_system_app") var isSystemApp: Boolean
)


