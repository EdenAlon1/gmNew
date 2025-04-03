package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efnx implements erqj {
    final /* synthetic */ fags a;
    final /* synthetic */ efou b;
    final /* synthetic */ efnz c;

    public efnx(efnz efnzVar, fags fagsVar, efou efouVar) {
        this.a = fagsVar;
        this.b = efouVar;
        this.c = efnzVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fagu faguVar;
        fcsv fcsvVar = (fcsv) obj;
        this.c.d();
        try {
            faguVar = (fagu) eyfy.parseFrom(fagu.a, fcsvVar.toByteString(), eyfc.a());
        } catch (eygu e) {
            Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey trigger response to scone.", e);
            faguVar = null;
        }
        this.c.h(this.a, faguVar, this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        this.c.i(2);
        this.c.d();
    }
}
