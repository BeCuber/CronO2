package com.becuber.crono2.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "settings")

class DataStoreManager(private val context: Context) {
    // Llave para el valor isFirstTime
    private val IS_FIRST_TIME_KEY =
        androidx.datastore.preferences.core.booleanPreferencesKey("is_first_time")

    // Obtener el valor isFirstTime (Flow)
    val isFirstTime: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[IS_FIRST_TIME_KEY] ?: true // Valor predeterminado: true
        }

    // Actualizar el valor de isFirstTime fun suspend porq es una corrutina
    suspend fun setFirstTime(isFirstTime: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_FIRST_TIME_KEY] = isFirstTime
        }
    }
}