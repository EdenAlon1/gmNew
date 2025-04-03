package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazh implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Spinner a;
    final /* synthetic */ dazm b;

    public dazh(dazm dazmVar, Spinner spinner) {
        this.a = spinner;
        this.b = dazmVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        final Spinner spinner = this.a;
        elfo.f(new Runnable() { // from class: dazg
            @Override // java.lang.Runnable
            public final void run() {
                if (i > 0) {
                    Spinner spinner2 = spinner;
                    dazh dazhVar = dazh.this;
                    String obj = spinner2.getSelectedItem().toString();
                    obj.getClass();
                    dazhVar.b.i.a.ad((axmi) Enum.valueOf(axmi.class, obj));
                }
            }
        }, this.b.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
