package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efnu implements erqj {
    final /* synthetic */ fago a;
    final /* synthetic */ efou b;
    final /* synthetic */ efnz c;

    public efnu(efnz efnzVar, fago fagoVar, efou efouVar) {
        this.a = fagoVar;
        this.b = efouVar;
        this.c = efnzVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d();
        this.c.f(this.a, this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to record event.", th);
        this.c.d();
    }
}
