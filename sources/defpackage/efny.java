package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efny implements erqj {
    final /* synthetic */ efnz a;
    final /* synthetic */ efmw b;

    public efny(efnz efnzVar, efmw efmwVar) {
        this.b = efmwVar;
        this.a = efnzVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        efmu efmuVar = efmu.a;
        fcsx fcsxVar = ((fcsn) obj).b;
        if (fcsxVar == null) {
            fcsxVar = fcsx.a;
        }
        efmuVar.b = fcsxVar.b;
        this.a.d();
        this.a.k(this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to get survey startup config.", th);
        efmu.a.b = false;
        this.a.d();
        this.a.k(this.b);
    }
}
