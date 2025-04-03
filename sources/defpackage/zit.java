package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zit implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ engw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dys d;

    public zit(ffix ffixVar, engw engwVar, dys dysVar, boolean z) {
        this.a = ffixVar;
        this.b = engwVar;
        this.d = dysVar;
        this.c = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        if (Float.compare(80.0f, 0.0f) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        ffsk ffskVar = (ffsk) f;
        hkx a2 = hku.a(this.a, hfdVar);
        ffky ffkyVar = new ffky();
        ffky ffkyVar2 = new ffky();
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        ffkyVar.a = jznVar.em(80.0f);
        ffkyVar2.a = jznVar.em(56.0f);
        boolean D = hfdVar.D(ffskVar);
        Object f2 = hfdVar.f();
        if (D || f2 == hfc.a) {
            f2 = new frc(ffskVar, a2, ffkyVar2.a, ffkyVar.a);
            hfdVar.y(f2);
        }
        frc frcVar = (frc) f2;
        boolean F = hfdVar.F(frcVar) | hfdVar.A(ffkyVar.a) | hfdVar.A(ffkyVar2.a);
        Object f3 = hfdVar.f();
        if (F || f3 == hfc.a) {
            f3 = new frd(frcVar, ffkyVar, ffkyVar2);
            hfdVar.y(f3);
        }
        hgs.i((ffix) f3, hfdVar);
        a = ijk.a(hvi.e, new fqx(new fqu(frcVar), new fqv(frcVar)), null);
        if (this.b.isEmpty()) {
            hfdVar.v(614463269);
            zjc.e(a, hfdVar, 0);
        } else {
            hfdVar.v(614464214);
            zjc.k(this.d, a, this.b, this.c, hfdVar, 0);
        }
        hfdVar.o();
        return ffcu.a;
    }
}
