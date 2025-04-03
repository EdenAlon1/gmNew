package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efpo implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ efpr a;
    private final int b;

    public efpo(efpr efprVar, int i) {
        this.a = efprVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        int i = 0;
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            efpr efprVar = this.a;
            efprVar.a[this.b] = z;
            if (z) {
                if (efprVar.getChildCount() != this.a.a.length + 1) {
                    Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                    CheckBox checkBox2 = (CheckBox) this.a.getChildAt(i2).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox2.getTag())) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else if ("OtherPleaseSpecify".equals(compoundButton.getTag())) {
            this.a.a[this.b] = z;
            if (z) {
                while (true) {
                    if (i >= this.a.getChildCount()) {
                        break;
                    }
                    EditText editText = (EditText) this.a.getChildAt(i).findViewById(R.id.survey_other_option);
                    if (editText != null) {
                        editText.requestFocus();
                        break;
                    }
                    i++;
                }
            }
        } else {
            efpr efprVar2 = this.a;
            efprVar2.a[this.b] = z;
            if (z && (checkBox = (CheckBox) efprVar2.findViewWithTag("NoneOfTheAbove")) != null) {
                checkBox.setChecked(false);
            }
        }
        efpr efprVar3 = this.a;
        efprVar3.c.a(new efpp(efprVar3.b, efprVar3.a));
    }
}
