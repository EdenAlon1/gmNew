package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ui implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ uo a;

    public ui(uo uoVar) {
        this.a = uoVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ti tiVar;
        if (i == -1 || (tiVar = this.a.e) == null) {
            return;
        }
        tiVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
