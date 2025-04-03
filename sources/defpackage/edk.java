package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edk implements eig {
    private final eey a;

    public edk(eey eeyVar) {
        this.a = eeyVar;
    }

    @Override // defpackage.eig
    public final int a() {
        return Math.max(0, this.a.b());
    }

    @Override // defpackage.eig
    public final int b() {
        return this.a.d().d();
    }

    @Override // defpackage.eig
    public final int c() {
        return Math.min(b() - 1, ((eei) ffdx.P(this.a.d().i())).a);
    }

    @Override // defpackage.eig
    public final int d() {
        if (this.a.d().i().isEmpty()) {
            return 0;
        }
        return ffmk.f(dvh.b(this.a.d()) / eeb.a(this.a.d()), 1);
    }

    @Override // defpackage.eig
    public final boolean e() {
        return !this.a.d().i().isEmpty();
    }
}
