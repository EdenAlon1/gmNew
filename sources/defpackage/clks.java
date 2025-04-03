package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clks extends cljl {
    @Override // defpackage.cljl
    public final void b(clnu clnuVar, awuy awuyVar) {
        clqc clqcVar = clnuVar.d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        awuz awuzVar2 = awuz.a;
        a.getClass();
        awuzVar.c = a;
        awuzVar.b |= 1;
    }

    @Override // defpackage.cljl
    public final void c(clnu clnuVar, awuy awuyVar) {
        clns clnsVar = clnuVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clns clnsVar2 = clnuVar.e;
        if (clnsVar2 == null) {
            clnsVar2 = clns.a;
        }
        clqv clqvVar = clnsVar2.d;
        if (clqvVar == null) {
            clqvVar = clqv.a;
        }
        awui a = cllk.a(clnsVar, clqvVar);
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        awuz awuzVar2 = awuz.a;
        a.getClass();
        awuzVar.d = a;
        awuzVar.b |= 2;
    }

    @Override // defpackage.cljl
    public final void d(clnu clnuVar, awuy awuyVar) {
        if ((clnuVar.b & 1) != 0) {
            eydq eydqVar = clnuVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            awuyVar.copyOnWrite();
            awuz awuzVar = (awuz) awuyVar.instance;
            awuz awuzVar2 = awuz.a;
            eyeeVar.getClass();
            awuzVar.b |= 4;
            awuzVar.e = eyeeVar;
        }
    }

    @Override // defpackage.cljl
    public final void e(awuy awuyVar) {
        eqyl eqylVar = eqyl.RCS_SMAPI;
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        awuz awuzVar2 = awuz.a;
        awuzVar.f = eqylVar.h;
        awuzVar.b |= 8;
    }
}
