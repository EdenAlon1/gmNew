package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazf implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ csfz a;
    final /* synthetic */ dazm b;

    public dazf(dazm dazmVar, csfz csfzVar) {
        this.a = csfzVar;
        this.b = dazmVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        final csfz csfzVar = this.a;
        elfo.f(new Runnable() { // from class: daze
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                if (i2 > 0) {
                    csfz csfzVar2 = csfzVar;
                    dazf dazfVar = dazf.this;
                    axeu b = axeu.b(i2 - 1);
                    b.getClass();
                    if (csfzVar2.equals(csfz.MULTI_DEVICE)) {
                        dazfVar.b.c.af(b);
                    } else if (csfzVar2.equals(csfz.BACKUP_AND_RESTORE)) {
                        dazfVar.b.c.S(b);
                    }
                }
            }
        }, this.b.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
