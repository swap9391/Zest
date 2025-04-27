package com.sj.zest.android.ui.components.imageview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sj.zest.android.R

@Composable
@Preview
fun MyImageView(modifier: Modifier = Modifier, imageRes:Int= R.drawable.ic_back,contentScale: ContentScale=ContentScale.FillWidth) {
    Box(modifier) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = contentScale
        )
    }
}
