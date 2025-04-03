package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eof implements ekn, drd {
    final /* synthetic */ eot a;
    private final /* synthetic */ drd b;

    public eof(drd drdVar, eot eotVar) {
        this.a = eotVar;
        this.b = drdVar;
    }

    @Override // defpackage.drd
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.ekn
    public final int b() {
        return this.a.f;
    }

    @Override // defpackage.ekn
    public final int c() {
        throw null;
    }

    @Override // defpackage.ekn
    public final int d() {
        return ((emu) ffdx.P(this.a.x().a)).a;
    }

    @Override // defpackage.ekn
    public final void e(int i, int i2) {
        throw null;
    }

    @Override // defpackage.ekn
    public final int f(int i) {
        int j = (i - this.a.j()) * this.a.l();
        eot eotVar = this.a;
        long a = eoe.a(this.a) + ffln.b((j - (eotVar.c() * eotVar.l())) + 0.0f);
        eot eotVar2 = this.a;
        return (int) (ffmk.l(a, eotVar2.i, eotVar2.h) - eoe.a(this.a));
    }
}
