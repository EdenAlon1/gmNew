package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omn implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ DropDownPreference a;

    public omn(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = ((ListPreference) this.a).h[i].toString();
            if (charSequence.equals(((ListPreference) this.a).i) || !this.a.Q(charSequence)) {
                return;
            }
            this.a.o(charSequence);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
