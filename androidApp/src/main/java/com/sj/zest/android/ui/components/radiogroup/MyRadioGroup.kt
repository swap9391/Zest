package com.sj.zest.android.ui.components.radiogroup

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sj.zest.android.ui.components.textView.MyTextView
import com.sj.zest.android.theme.ColorLightPrimaryText
import com.sj.zest.android.theme.textstyle.MyTextStyle

@Composable
fun MyRadioGroup(
    list: List<String>,
    selectedValue: String,
    textStyle: MyTextStyle = MyTextStyle.TitleMedium14,
    modifier: Modifier,
    isEnable: Boolean = true,
    onGenderSelected: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        list.forEach { gender ->
            RadioButton(
                colors = RadioButtonDefaults.colors(
                    selectedColor = MaterialTheme.colorScheme.primary,
                    unselectedColor = MaterialTheme.colorScheme.secondary,
                    disabledSelectedColor = ColorLightPrimaryText,
                    disabledUnselectedColor = ColorLightPrimaryText
                ),
                selected = gender == selectedValue,
                enabled = isEnable,
                onClick = { onGenderSelected(gender) }
            )
            MyTextView(
                text = gender,
                textStyle = textStyle
            )
        }

    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyRadioGroup(list = listOf("Male", "Female"),
        selectedValue = "Male", onGenderSelected = { }
        , modifier = Modifier)
}
