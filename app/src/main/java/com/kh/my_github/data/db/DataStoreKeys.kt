package com.kh.my_github.data.db

import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey

object DataStoreKeys {
    const val DATASTORE_NAME: String = "git_data_store"
    val TOKEN: Preferences.Key<String> = stringPreferencesKey("token")
}