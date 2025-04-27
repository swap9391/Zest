package com.sj.zest.android.ui.components.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.kohler.theme.WhiteColor
import com.compose.kohler.theme.WhiteDisableColor
import com.sj.zest.android.R
import com.sj.zest.android.ui.components.textView.MyTextView
import com.sj.zest.android.theme.textstyle.MyTextStyle


/**
 * Using KKTextView component you can set text to the textview. It accepts 4 parameters as below.
 *
 * @param text The value of the text to be displayed in textview component
 * @param fontType The fontType is having 3 possible values Light, Medium and Regular. Default is Regular
 * @param textStyle The textStyle is having multiple possible values. e.g XLargeTitle, LargeTitle, Title1, Title2 etc. Default is KKTextStyle.Title1
 * @param textColor The color to be set to the text from KKColor format. Default is KKKColor.PureWhite
 * @param contentDescription This parameter is used for automation test to identify textview component by contentDescriptor. Default value of content descriptor is text you set to KKTextView
 */
@Composable
fun MyMainButton(
    buttonTitle: String,
    isEnable: Boolean = true,
    contentDescription: String = buttonTitle,
    modifier: Modifier = Modifier,
    isUpperCase: Boolean = true,
    isIconVisible: Boolean = false,
    iconId: Int = R.drawable.ic_right_arrow,
    onClick: () -> Unit = {},
) {

    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,//if (isPressed) PrimaryBlueTextColor.copy(alpha = 0.7F) else PrimaryBlueTextColor,
        contentColor = WhiteColor,
        disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.8F),
        disabledContentColor = WhiteDisableColor
    )


    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .semantics { this.contentDescription = contentDescription }
    ) {


        Button(modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
            enabled = isEnable,
            colors = buttonColors,
            shape = RoundedCornerShape(25.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 4.dp,
                pressedElevation = 8.dp

            ),
            contentPadding = ButtonDefaults.ContentPadding,
            onClick = { onClick.invoke() }, content = @Composable {
                MyTextView(text = if(isUpperCase){ buttonTitle.toUpperCase(Locale.current)}else{buttonTitle}
                    , textStyle = MyTextStyle.TitleSemiBold14
                    , textColor = WhiteColor
                )
                if (isIconVisible)
                Icon(
                    modifier = Modifier.padding(start = 8.dp),
                    painter = painterResource(id = iconId),
                    contentDescription = buttonTitle,
                    tint = Color.Unspecified
                )
            }
        )
    }
}


@Preview
@Composable
fun DefaultPreview() {
    MyMainButton(buttonTitle = "Submit", isUpperCase = false)
}

