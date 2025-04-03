package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazj implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ dazm a;

    public dazj(dazm dazmVar) {
        this.a = dazmVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        elfo.f(new Runnable() { // from class: dazi
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                if (i2 > 0) {
                    dazj dazjVar = dazj.this;
                    axes b = axes.b(i2 - 1);
                    b.getClass();
                    dazjVar.a.c.U(b);
                }
            }
        }, this.a.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
