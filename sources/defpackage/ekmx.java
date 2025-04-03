package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmx implements ljv {
    final /* synthetic */ eg a;
    final /* synthetic */ ekmz b;
    final /* synthetic */ ComponentCallbacks2 c;
    final /* synthetic */ ekmy d;

    public ekmx(ekmy ekmyVar, eg egVar, ekmz ekmzVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = egVar;
        this.b = ekmzVar;
        this.c = componentCallbacks2;
        this.d = ekmyVar;
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.d.b.c(this.a, this.b);
        this.a.unregisterComponentCallbacks(this.c);
        this.d.a.P().d(this);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
