package com.example.mycity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose.MyCityTheme
import com.example.mycity.model.Details
import com.example.mycity.ui.theme.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCityTheme {

            }
        }
    }
}
@Composable
fun MyApp(){

    val viewModel: AppViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = { AppBar(title = R.string.app_name, isNavigateBack = false) }
    ) { innerPadding ->
        if(uiState.display == 1) {
            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                items(uiState.cartegoryList, key = { category -> category }) {
                    Category_card(title = it)
                }
            }
        }else if(uiState.display == 2) {
            Shop_list(
                shopList = uiState.placeList,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
@Composable
fun Shop_list(
    shopList: List<Details>,
    modifier: Modifier = Modifier,
){
    LazyColumn(modifier = modifier) {
        items(shopList, key = ({details -> details.id})){
            Shop_card(details = it)
        }
    }
}

@Composable
fun Category_card(
    modifier: Modifier = Modifier,
    title: Int
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clip(MaterialTheme.shapes.medium),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ) {
        Text(text = stringResource(title),
            style = MaterialTheme.typography.displayLarge,
            fontFamily = MaterialTheme.typography.displayMedium.fontFamily,
            modifier = Modifier.padding(8.dp)
        )
    }
}
@Composable
fun Shop_card(
    modifier: Modifier = Modifier,
    details: Details
){
    Row(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(92.dp)
            .background(MaterialTheme.colorScheme.secondaryContainer, MaterialTheme.shapes.medium)
        ){
            Image(
                painter = painterResource(id = details.logoResourceId),
                contentDescription = stringResource(id = details.titleResourceId),
                modifier = Modifier
                    .padding(12.dp)
                    .size(72.dp)
                    .clip(MaterialTheme.shapes.small)
                    .height(72.dp)
                    .align(Alignment.CenterVertically)
            )
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(
                text = stringResource(id =details.titleResourceId),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = stringResource(id = details.descriptionResourceId),
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    title: Int = R.string.app_name,
    isNavigateBack: Boolean = false,
) {
    CenterAlignedTopAppBar(

        title = {
            Text(text = stringResource(id = title),
                style = MaterialTheme.typography.displayLarge
                )
                },
        navigationIcon = {
            if (isNavigateBack) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    MyCityTheme {
        MyApp()
    }
}



