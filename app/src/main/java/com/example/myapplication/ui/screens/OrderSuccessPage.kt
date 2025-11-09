package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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

@Composable
fun OrderSuccessPage() {
    Scaffold(
        bottomBar = { BottomNavigationBar() } // 🟤 Barre de navigation inférieure
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .padding(padding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))

            // Title
            Text(
                text = stringResource(id = R.string.order_confirmation),
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Success message
            Text(
                text = stringResource(id = R.string.order_success_message),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(id = R.string.order_thank_you),
                fontSize = 16.sp,
                color = Color(0xFF555555),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Order Summary
            Text(
                text = stringResource(id = R.string.order_summary),
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))
            Divider(color = Color.LightGray, thickness = 1.dp)
            Spacer(modifier = Modifier.height(12.dp))

            // Order details
            OrderDetailItem(
                title = stringResource(id = R.string.order_number_title),
                value = stringResource(id = R.string.order_number_value)
            )
            Divider(color = Color.LightGray, thickness = 1.dp)

            OrderDetailItem(
                title = stringResource(id = R.string.order_total_title),
                value = stringResource(id = R.string.order_total_value)
            )
            Divider(color = Color.LightGray, thickness = 1.dp)

            OrderDetailItem(
                title = stringResource(id = R.string.order_address_title),
                value = stringResource(id = R.string.order_address_value)
            )

            Spacer(modifier = Modifier.height(40.dp))

            // 🟢 Button
            Button(
                onClick = { /* TODO: navigate to home */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE8DCD1)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.continue_shopping),
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Composable
fun OrderDetailItem(title: String, value: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            color = Color(0xFFB9806E),
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = value,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(containerColor = Color.White) {
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text(stringResource(id = R.string.nav_home)) }
        )
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = { Icon(Icons.Default.ShoppingCart, contentDescription = null) },
            label = { Text(stringResource(id = R.string.nav_cart)) }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.Person, contentDescription = null) },
            label = { Text(stringResource(id = R.string.nav_profile)) }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOrderSuccessPage() {
    OrderSuccessPage()
}
