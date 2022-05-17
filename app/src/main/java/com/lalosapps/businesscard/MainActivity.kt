package com.lalosapps.businesscard

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lalosapps.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    BusinessCardTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                ProfileInfo()
                ContactInfo()
            }

        }
    }
}

@Composable
fun ProfileInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = stringResource(R.string.android_logo),
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
        )
        Text(
            text = stringResource(R.string.profile_name),
            fontSize = 36.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.profile_title),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.secondary

        )
    }
}

@Composable
fun ContactInfo() {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = stringResource(R.string.phone),
                tint = MaterialTheme.colors.secondary
            )
            Spacer(Modifier.width(16.dp))
            Text(text = stringResource(R.string.phone_contact), fontSize = 14.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = stringResource(R.string.share),
                tint = MaterialTheme.colors.secondary
            )
            Spacer(Modifier.width(16.dp))
            Text(text = stringResource(R.string.share_contact), fontSize = 14.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = stringResource(R.string.email),
                tint = MaterialTheme.colors.secondary
            )
            Spacer(Modifier.width(16.dp))
            Text(text = stringResource(R.string.email_contact), fontSize = 14.sp)
        }
    }
}

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun MyAppPreview() {
    MyApp()
}