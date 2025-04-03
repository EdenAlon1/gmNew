package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duky implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ dukz a;
    private final int b;

    public duky(dukz dukzVar, int i) {
        this.a = dukzVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            dukz dukzVar = this.a;
            dukzVar.e = z;
            if (z) {
                if (dukzVar.ag.getChildCount() != this.a.d.length + 1) {
                    Log.e("HatsLibMultiSelectFrag", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i = 0; i < this.a.ag.getChildCount(); i++) {
                    CheckBox checkBox = (CheckBox) this.a.ag.getChildAt(i).findViewById(R.id.hats_lib_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox.getTag())) {
                        checkBox.setChecked(false);
                    }
                }
            }
        } else {
            dukz dukzVar2 = this.a;
            dukzVar2.d[this.b] = z;
            if (z) {
                ((CheckBox) dukzVar2.ag.findViewWithTag("NoneOfTheAbove")).setChecked(false);
            }
        }
        dukz dukzVar3 = this.a;
        dulb dulbVar = (dulb) dukzVar3.G();
        if (dulbVar != null) {
            dulbVar.F(dukzVar3.t(), dukzVar3);
        }
    }
}
