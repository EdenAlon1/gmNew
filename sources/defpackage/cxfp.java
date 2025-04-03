package defpackage;

import android.content.DialogInterface;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfp implements DialogInterface.OnClickListener {
    final /* synthetic */ cxfr a;

    public cxfp(cxfr cxfrVar) {
        this.a = cxfrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cxfr cxfrVar = this.a;
        ejlq ejlqVar = (ejlq) cxfrVar.f.b();
        final cxfi cxfiVar = (cxfi) cxfrVar.d.b();
        final int i2 = cxfrVar.k;
        final int i3 = cxfrVar.n;
        elfl g = elfo.g(new Callable() { // from class: cxev
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cxfi.this.f.h(i2).z(i3));
            }
        }, cxfiVar.g);
        cxfiVar.c.a(g, cxfiVar.i);
        ejlqVar.i(new ejlp(g), new ejlm(Integer.valueOf(cxfrVar.n)), cxfrVar.o);
    }
}
