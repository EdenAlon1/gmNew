package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmg implements ffjn {
    final /* synthetic */ dmnh a;
    final /* synthetic */ dmnc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dmpg e;
    final /* synthetic */ float f;

    public dmmg(dmnh dmnhVar, dmnc dmncVar, boolean z, boolean z2, dmpg dmpgVar, float f) {
        this.a = dmnhVar;
        this.b = dmncVar;
        this.c = z;
        this.d = z2;
        this.e = dmpgVar;
        this.f = f;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        igq n;
        hfd hfdVar;
        dyh dyhVar = (dyh) obj;
        hfd hfdVar2 = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dyhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar2.D(dyhVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar2.I()) {
            hfdVar2.s();
        } else {
            if (this.a.h.c) {
                hfdVar2.v(-783697190);
                final doos c = dooy.c(hfdVar2);
                Boolean valueOf = Boolean.valueOf(this.b == this.a.a);
                hfdVar2.v(-1549297261);
                boolean D = hfdVar2.D(c);
                Object f = hfdVar2.f();
                if (D || f == hfc.a) {
                    f = new ffji() { // from class: dmme
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj4) {
                            ((cqw) obj4).getClass();
                            doos doosVar = doos.this;
                            dooq dooqVar = doosVar.q;
                            cue l = ctt.l(cxu.c(100, 0, doosVar.r.d, 2), 2);
                            dooq dooqVar2 = doosVar.q;
                            return new csi(l, ctt.m(cxu.c(100, 0, doosVar.r.d, 2), 2));
                        }
                    };
                    hfdVar2.y(f);
                }
                hfdVar2.o();
                hfdVar = hfdVar2;
                cqn.a(valueOf, null, (ffji) f, null, null, null, hpx.d(-1273611961, new dmmf(this.c, this.b), hfdVar2), hfdVar, 1572864, 58);
                hfdVar.o();
            } else {
                hfdVar2.v(-782607788);
                if (this.c) {
                    hfdVar2.v(-782538472);
                    dmnc dmncVar = this.b;
                    n = dmmi.l(dmncVar, dmncVar == this.a.a, hfdVar2);
                    hfdVar2.o();
                } else {
                    hfdVar2.v(-782441566);
                    dmnc dmncVar2 = this.b;
                    n = dmmi.n(dmncVar2, dmncVar2 == this.a.a, hfdVar2);
                    hfdVar2.o();
                }
                long j = ((ibw) hfdVar2.e(fzc.a)).i;
                dmnc dmncVar3 = this.b;
                dmmi.c(n, dmmi.k(dmncVar3, dmncVar3 == this.a.a, hfdVar2), null, j, hfdVar2, 0, 4);
                hfdVar = hfdVar2;
                hfdVar.o();
            }
            if (this.d) {
                dyc.b(dee.a(eba.d(dek.b(dyhVar.a(ebs.k(hvi.e, 8.0f), new hut(0.9f, -0.9f)), des.a(1.2f, dmmi.m(this.e, this.f, hfdVar)), eqm.a), 1.0f), gft.a(hfdVar).a, eqm.a), hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
