package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzf implements hzc {
    public boolean a = true;
    public final hzi b;
    public final hzi c;
    public final hzi d;
    public final hzi e;
    public final hzi f;
    public final hzi g;
    public final hzi h;
    public final hzi i;
    public ffji j;
    public ffji k;

    public hzf() {
        hzi hziVar = hzi.a;
        this.b = hziVar;
        this.c = hziVar;
        this.d = hziVar;
        this.e = hziVar;
        this.f = hziVar;
        this.g = hziVar;
        this.h = hziVar;
        this.i = hziVar;
        this.j = hzd.a;
        this.k = hze.a;
    }

    @Override // defpackage.hzc
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.hzc
    public final void b(ffji ffjiVar) {
        this.j = ffjiVar;
    }

    @Override // defpackage.hzc
    public final void c(ffji ffjiVar) {
        this.k = ffjiVar;
    }

    @Override // defpackage.hzc
    public final boolean d() {
        return this.a;
    }
}
