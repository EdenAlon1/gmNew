package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efnw implements erqj {
    final /* synthetic */ fags a;
    final /* synthetic */ efou b;
    final /* synthetic */ efnz c;

    public efnw(efnz efnzVar, fags fagsVar, efou efouVar) {
        this.a = fagsVar;
        this.b = efouVar;
        this.c = efnzVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d();
        this.c.h(this.a, (fagu) obj, this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        this.c.i(2);
        this.c.d();
    }
}
