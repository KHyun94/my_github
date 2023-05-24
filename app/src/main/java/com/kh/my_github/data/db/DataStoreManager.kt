package com.kh.my_github.data.db

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

/**
 * 공통적인 DataStore 관련 처리
 *
 * @property context
 */
class DataStoreManager @Inject constructor(
    @ApplicationContext private val context: Context) {

    private val Context.dataStore:
            DataStore<Preferences> by preferencesDataStore(DataStoreKeys.DATASTORE_NAME)

    suspend fun <String> storeValue(key: Preferences.Key<String>, value: String) {
        context.dataStore.edit { it[key] = value }
    }

    suspend fun readValue(key: Preferences.Key<String>) = context.dataStore.data
        .catch { e ->
            if (e is IOException) {
                emit(emptyPreferences())
            } else {
                throw e
            }
        }.map { prefs ->
            prefs[key] ?: ""
        }.first()
}
