package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dauc implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ ArrayAdapter b;

    public dauc(Consumer consumer, ArrayAdapter arrayAdapter) {
        this.a = consumer;
        this.b = arrayAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ctwi ctwiVar = (ctwi) this.b.getItem(i);
        ctwiVar.getClass();
        this.a.accept(ctwiVar);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
