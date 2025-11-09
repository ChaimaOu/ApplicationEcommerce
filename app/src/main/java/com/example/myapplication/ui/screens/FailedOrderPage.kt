package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

// ✅ Barre de navigation inférieure
@Composable
fun BottomNavigationBarr() {
    NavigationBar(containerColor = Color.White) {
        NavigationBarItem(
            selected = false,
            onClick = { /* TODO: navigate home */ },
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text(stringResource(id = R.string.nav_home)) }
        )
        NavigationBarItem(
            selected = true,
            onClick = { /* TODO: navigate cart */ },
            icon = { Icon(Icons.Default.ShoppingCart, contentDescription = null) },
            label = { Text(stringResource(id = R.string.nav_cart)) }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /* TODO: navigate profile */ },
            icon = { Icon(Icons.Default.Person, contentDescription = null) },
            label = { Text(stringResource(id = R.string.nav_profile)) }
        )
    }
}

// ✅ Page d'échec de commande
@Composable
fun FailedOrderPage() {
    Scaffold(
        bottomBar = { BottomNavigationBarr() } // barre en bas
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 🔴 Titre
            Text(
                text = stringResource(R.string.failed_order_title),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 🟠 Description
            Text(
                text = stringResource(R.string.failed_order_description),
                fontSize = 16.sp,
                color = Color(0xFF555555),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(30.dp))

            // 🔴 Bouton "Try Again"
            Button(
                onClick = { /* TODO: Retry logic */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB71C1C)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(stringResource(R.string.failed_order_button), color = Color.White)
            }

            Spacer(modifier = Modifier.height(12.dp))

            // ⚪ Bouton "Contact Support"
            OutlinedButton(
                onClick = { /* TODO: Contact support logic */ },
                colors = ButtonDefaults.outlinedButtonColors(containerColor = Color(0xFFF2E8E8)),
                border = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(
                    stringResource(R.string.failed_order_button_contact),
                    color = Color.Black
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFailedOrderPage() {
    FailedOrderPage()
}
