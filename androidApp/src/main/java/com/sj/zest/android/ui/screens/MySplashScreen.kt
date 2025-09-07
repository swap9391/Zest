package com.sj.zest.android.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.sj.zest.android.R
import com.sj.zest.android.theme.ColorLightBlackText
import com.sj.zest.android.theme.textstyle.MyTextStyle
import com.sj.zest.android.ui.components.button.MyMainButton
import com.sj.zest.android.ui.components.imageview.MyImageView
import com.sj.zest.android.ui.components.textView.MyTextView

@Preview
@Composable
fun MySplashScreen(navController: NavHostController? = null) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {

        MyImageView(
            modifier = Modifier.fillMaxSize(),
            imageRes = R.drawable.img_splash_bg,
            contentScale = ContentScale.FillBounds
        )

        ConstraintLayout(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {

            val (btnGetStarted, textTitle, textSubTitle) = createRefs()

            MyTextView(text = "It’s time for a",
                textStyle = MyTextStyle.TitleSemiBold34,
                textColor = ColorLightBlackText,
                modifier = Modifier
                    .constrainAs(textTitle) {
                        top.linkTo(parent.top, margin = 38.dp)
                        start.linkTo(parent.start)

                    }
                    .fillMaxWidth()
            )

            MyTextView(text = "The one-stop to find amazing drink mixes for any occassion.",
                textStyle = MyTextStyle.TitleLight16,
                textColor = ColorLightBlackText,
                softWrap = true,
                maxLines = 2,
                modifier = Modifier.constrainAs(textSubTitle) {
                    top.linkTo(textTitle.bottom, margin = 71.dp)
                    start.linkTo(textTitle.start, 24.dp)
                    end.linkTo(parent.end, margin = 24.dp)
                })

            MyMainButton(buttonTitle = "Get Started",
                isIconVisible = true,
                iconId = R.drawable.ic_right_arrow,
                modifier = Modifier
                    .constrainAs(btnGetStarted) {
                        top.linkTo(textSubTitle.bottom, margin = 26.dp)
                        start.linkTo(parent.start)
                    }
                    .width(180.dp)
            )


        }

        /*Text(
            text = "Zest", // Your app name
            style = TextStyle(fontSize = 48.sp, color = Color.Black) // Customize the styling
        )*/
        // You can add a logo or other branding elements here
    }

    LaunchedEffect(key1 = true) {
        //delay(2000) // Simulate loading time (adjust as needed)
        /*navController?.navigate("main_screen") {
            // popUpTo("splash_screen") { inclusive = true } // Prevent going back to splash screen
        }*/
    }
}