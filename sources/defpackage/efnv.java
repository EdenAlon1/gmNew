package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efnv implements erqj {
    final /* synthetic */ fago a;
    final /* synthetic */ efou b;
    final /* synthetic */ efnz c;

    public efnv(efnz efnzVar, fago fagoVar, efou efouVar) {
        this.a = fagoVar;
        this.b = efouVar;
        this.c = efnzVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fcsr fcsrVar = (fcsr) obj;
        this.c.d();
        try {
        } catch (eygu e) {
            Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey record event response to scone.", e);
        }
        this.c.f(this.a, this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to record event.", th);
        this.c.d();
    }
}
