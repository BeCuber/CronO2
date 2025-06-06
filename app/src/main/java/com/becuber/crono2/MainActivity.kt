package com.becuber.crono2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.becuber.crono2.ui.navigation.NavigationWrapper
import com.becuber.crono2.ui.theme.CronO2Theme
import com.becuber.crono2.ui.viewmodels.DatastoreViewModel


/** TODO:
 * - Test de instrumentación para los composables (urge, son muy útiles)
 * - Calculos de % de error en tests calculadora
 * - avisos half y low ¿debajo de text?
 * - ¿Días?
 * - Refactorización (métodos getBoolean) asiasi
 * - Hacer seguimiento del flujo de todos los datos  que tienen entrada de usuario
 * - Poder modificar valores por defecto
 * - los rangos de valores ¿podrían ser clases delegadas?
 * - implementar Hilt? DatastoreViewModel: AndroidViewModelFactory(application) deprecated
 *
 *
 * - Preferences DataStore -> Primera vez
 *
 *
 *
 * -
 * - Aguja interactuable
 * - SQLite ¿Hace falta sistema de herencia?
 *
 * Recuerda:
 * //30 11
 * linea siguiente añadida o quitada
 *
 * */



class MainActivity : ComponentActivity() {
    // https://www.youtube.com/watch?v=p9VR8KbmzEE&ab_channel=AndroidDevelopers
    private val viewModel: DatastoreViewModel by viewModels {
        ViewModelProvider.AndroidViewModelFactory(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)


        setContent {
            //Tema principal
            CronO2Theme(dynamicColor = false) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationWrapper(viewModel = viewModel)
                }
            }

        }
    }
}