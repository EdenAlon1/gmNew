package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daec implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Integer[] a;
    final /* synthetic */ DebugMmsConfigFragment b;

    public daec(DebugMmsConfigFragment debugMmsConfigFragment, Integer[] numArr) {
        this.a = numArr;
        this.b = debugMmsConfigFragment;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int intValue = this.a[i].intValue();
        DebugMmsConfigFragment debugMmsConfigFragment = this.b;
        debugMmsConfigFragment.c = intValue;
        debugMmsConfigFragment.a();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
