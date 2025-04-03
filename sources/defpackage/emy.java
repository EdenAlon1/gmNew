package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emy implements eig {
    private final eot a;
    private final int b;

    public emy(eot eotVar, int i) {
        this.a = eotVar;
        this.b = i;
    }

    @Override // defpackage.eig
    public final int a() {
        return Math.max(0, this.a.f - this.b);
    }

    @Override // defpackage.eig
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.eig
    public final int c() {
        return Math.min(b() - 1, ((emu) ffdx.P(this.a.x().a)).a + this.b);
    }

    @Override // defpackage.eig
    public final int d() {
        if (this.a.x().a.size() == 0) {
            return 0;
        }
        return ffmk.f(enp.a(this.a.x()) / (this.a.x().b + this.a.x().c), 1);
    }

    @Override // defpackage.eig
    public final boolean e() {
        return !this.a.x().a.isEmpty();
    }
}
