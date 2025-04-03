package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ahy implements bdj {
    static final ahy a = new ahy();

    @Override // defpackage.bdj
    public void a(bhh bhhVar, bdi bdiVar) {
        bdk bdkVar = (bdk) bfy.c(bhhVar, bhh.q, null);
        bdp bdpVar = bfn.b;
        bdn bdnVar = bdk.a;
        int i = new bdi().b().f;
        if (bdkVar != null) {
            bdiVar.c(bdkVar.h);
            bdpVar = bdkVar.e;
            i = bdkVar.f;
        }
        bdiVar.k(bdpVar);
        afm afmVar = new afm(bhhVar);
        bdiVar.b = afmVar.a(i);
        bdiVar.d(new akj(afmVar.b(new ahx())));
        bdiVar.f(afmVar.c());
    }
}
