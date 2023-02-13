package com.example.permissionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.permissionapp.ui.theme.PermissionAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PermissionAppTheme {
                val viewModel = viewModel<MainViewModel>()
                val dialogQueue = viewModel.visiblePermissionDialogQueue

                //// View ////
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    Button(onClick = { /*TODO*/ }) {
                        Text(
                            text = "Request For Single Permission", 
                            textAlign = TextAlign.Center
                        )
                    }
                    
                    Spacer(modifier = Modifier
                        .height(10.dp)
                    )

                    Button(onClick = { /*TODO*/ }) {
                        Text(
                            text = "Request For Multi Permission",
                            textAlign = TextAlign.Center
                        )
                    }



                }


            }
        }
    }
}
