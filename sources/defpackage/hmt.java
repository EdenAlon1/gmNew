package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmt implements hmr {
    final /* synthetic */ hmr a;
    final /* synthetic */ hjv b;

    public hmt(hmr hmrVar, hjv hjvVar) {
        this.a = hmrVar;
        this.b = hjvVar;
    }

    @Override // defpackage.hmr
    public final List a() {
        List a = this.a.a();
        hjv hjvVar = this.b;
        int i = hjvVar.s;
        return i < 0 ? a : ffdx.ad(htu.d(hjvVar, i, Integer.valueOf(hjvVar.l(i))), a);
    }
}
