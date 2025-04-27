package com.sj.zest.android.ui.components.textView

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.sj.zest.android.theme.textstyle.MyTextStyle
import com.sj.zest.android.theme.textstyle.TypographyUtils


@Composable
fun MyTextView(
    text: String,
    textStyle: MyTextStyle = MyTextStyle.TitleMedium12,
    textAlign :TextAlign = TextAlign.Left,
    maxLines: Int = 1,
    softWrap: Boolean = false,
    textColor : Color = MaterialTheme.colorScheme.primaryContainer,
    modifier: Modifier = Modifier,
) {

    Text(
        modifier = modifier,
        text = AnnotatedString(text),
        textAlign = textAlign,
        color = textColor,
        maxLines = maxLines,
        softWrap = softWrap,
        style = TypographyUtils.getKKTextStyle(textStyle),
    )
}


@Preview
@Composable
fun DefaultPreview() {
    MyTextView(
        text = "Welcome\nKohler", textStyle = MyTextStyle.TitleMedium12
    )
}

