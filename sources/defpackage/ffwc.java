package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwc implements ffwo, ffvq {
    public Object a = ffwk.p;
    public ffrh b;
    final /* synthetic */ ffwi c;

    public ffwc(ffwi ffwiVar) {
        this.c = ffwiVar;
    }

    @Override // defpackage.ffvq
    public final void C(fghl fghlVar, int i) {
        ffrh ffrhVar = this.b;
        if (ffrhVar != null) {
            ffrhVar.C(fghlVar, i);
        }
    }

    @Override // defpackage.ffwo
    public final Object a(ffgu ffguVar) {
        ffwt ffwtVar;
        boolean z = true;
        if (this.a == ffwk.p || this.a == ffwk.l) {
            ffwi ffwiVar = this.c;
            ffwt ffwtVar2 = (ffwt) ffwiVar.d.a;
            while (true) {
                if (ffwiVar.z()) {
                    this.a = ffwk.l;
                    Throwable o = this.c.o();
                    if (o != null) {
                        throw fghn.b(o);
                    }
                    z = false;
                } else {
                    long b = ffwiVar.b.b();
                    long j = ffwk.b;
                    long j2 = b / j;
                    int i = (int) (b % j);
                    if (ffwtVar2.b != j2) {
                        ffwtVar = ffwiVar.s(j2, ffwtVar2);
                        if (ffwtVar == null) {
                            continue;
                        }
                    } else {
                        ffwtVar = ffwtVar2;
                    }
                    Object n = ffwiVar.n(ffwtVar, i, b, null);
                    if (n == ffwk.m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (n == ffwk.o) {
                        if (b < ffwiVar.h()) {
                            ffwtVar.p();
                        }
                        ffwtVar2 = ffwtVar;
                    } else {
                        if (n == ffwk.n) {
                            ffwi ffwiVar2 = this.c;
                            ffrh a = ffrj.a(ffhi.c(ffguVar));
                            try {
                                this.b = a;
                                Object n2 = ffwiVar2.n(ffwtVar, i, b, this);
                                if (n2 == ffwk.m) {
                                    ffwiVar2.w(this, ffwtVar, i);
                                } else {
                                    if (n2 == ffwk.o) {
                                        if (b < ffwiVar2.h()) {
                                            ffwtVar.p();
                                        }
                                        ffwt ffwtVar3 = (ffwt) ffwiVar2.d.a;
                                        while (true) {
                                            if (ffwiVar2.z()) {
                                                ffrh ffrhVar = this.b;
                                                ffrhVar.getClass();
                                                this.b = null;
                                                this.a = ffwk.l;
                                                Throwable o2 = this.c.o();
                                                if (o2 == null) {
                                                    ffrhVar.w(false);
                                                } else {
                                                    if (ffso.b) {
                                                        o2 = fghn.a(o2, ffrhVar);
                                                    }
                                                    ffrhVar.w(ffci.a(o2));
                                                }
                                            } else {
                                                long b2 = ffwiVar2.b.b();
                                                long j3 = ffwk.b;
                                                long j4 = b2 / j3;
                                                int i2 = (int) (b2 % j3);
                                                if (ffwtVar3.b != j4) {
                                                    ffwt s = ffwiVar2.s(j4, ffwtVar3);
                                                    if (s != null) {
                                                        ffwtVar3 = s;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                Object n3 = ffwiVar2.n(ffwtVar3, i2, b2, this);
                                                if (n3 == ffwk.m) {
                                                    ffwiVar2.w(this, ffwtVar3, i2);
                                                    break;
                                                }
                                                if (n3 == ffwk.o) {
                                                    if (b2 < ffwiVar2.h()) {
                                                        ffwtVar3.p();
                                                    }
                                                } else {
                                                    if (n3 == ffwk.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    ffwtVar3.p();
                                                    this.a = n3;
                                                    this.b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        ffwtVar.p();
                                        this.a = n2;
                                        this.b = null;
                                    }
                                    a.f(true, null);
                                }
                                Object m = a.m();
                                if (m == ffhh.a) {
                                    ffguVar.getClass();
                                }
                                return m;
                            } catch (Throwable th) {
                                a.E();
                                throw th;
                            }
                        }
                        ffwtVar.p();
                        this.a = n;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffwo
    public final Object b() {
        Object obj = this.a;
        if (obj == ffwk.p) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = ffwk.p;
        if (obj != ffwk.l) {
            return obj;
        }
        throw fghn.b(this.c.p());
    }
}
