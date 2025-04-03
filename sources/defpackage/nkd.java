package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nkd extends lya implements njw {
    private njw e;
    private long f;

    @Override // defpackage.njw
    public final int a() {
        njw njwVar = this.e;
        lti.f(njwVar);
        return njwVar.a();
    }

    @Override // defpackage.njw
    public final int b(long j) {
        njw njwVar = this.e;
        lti.f(njwVar);
        return njwVar.b(j - this.f);
    }

    @Override // defpackage.njw
    public final long c(int i) {
        njw njwVar = this.e;
        lti.f(njwVar);
        return njwVar.c(i) + this.f;
    }

    @Override // defpackage.njw
    public final List e(long j) {
        njw njwVar = this.e;
        lti.f(njwVar);
        return njwVar.e(j - this.f);
    }

    @Override // defpackage.lya, defpackage.lxs
    public final void eO() {
        super.eO();
        this.e = null;
    }

    public final void i(long j, njw njwVar, long j2) {
        this.b = j;
        this.e = njwVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
