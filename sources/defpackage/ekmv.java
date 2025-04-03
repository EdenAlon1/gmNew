package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmv implements ljv {
    final /* synthetic */ ekmz a;
    final /* synthetic */ ComponentCallbacks2 b;
    final /* synthetic */ ekmw c;

    public ekmv(ekmw ekmwVar, ekmz ekmzVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = ekmzVar;
        this.b = componentCallbacks2;
        this.c = ekmwVar;
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        ekmw ekmwVar = this.c;
        ekmwVar.b.c(ekmwVar.a, this.a);
        this.c.a.unregisterComponentCallbacks(this.b);
        this.c.a.P().d(this);
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
