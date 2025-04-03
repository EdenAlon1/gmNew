package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abes {
    public static final void a(final dmfn dmfnVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-436027790);
        if (i3 == 0) {
            i2 = (true != b.D(dmfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dmff.d(hviVar, null, 0L, 0L, dmfnVar, hpx.d(214191, new aber(dmfnVar), b), b, ((i2 >> 3) & 14) | 196608 | ((i2 << 12) & 57344), 14);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abep
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmfn dmfnVar2 = dmfn.this;
                    int i4 = i;
                    abes.a(dmfnVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmfn dmfnVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(526519009);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            boolean z = dmfnVar instanceof abjb;
            hve hveVar = hvi.e;
            if (z) {
                b.v(-1425424695);
                abje.a((abjb) dmfnVar, hveVar, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dmfnVar instanceof abjf) {
                b.v(-1425421943);
                abji.a((abjf) dmfnVar, hveVar, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dmfnVar instanceof abfq) {
                b.v(-1425419422);
                abfs.a((abfq) dmfnVar, hveVar, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dmfnVar instanceof zcm) {
                b.v(-1425417227);
                zdl.g((zcm) dmfnVar, b, 0);
                ((hfm) b).Z();
            } else if ((dmfnVar instanceof dmfm) || (dmfnVar instanceof dmfh)) {
                b.v(-1425414182);
                dmff.a(dmfnVar, hveVar, b, i3 & 126, 0);
                ((hfm) b).Z();
            } else {
                if (dmfnVar instanceof ajby) {
                    b.v(-1425411923);
                    throw null;
                }
                int i4 = i3 & 112;
                if (dmfnVar instanceof abge) {
                    b.v(-1425408220);
                    abgg.a((abge) dmfnVar, hveVar, b, i4);
                    ((hfm) b).Z();
                } else if (dmfnVar instanceof abhz) {
                    b.v(-1425405460);
                    abiy.l((abhz) dmfnVar, hveVar, b, i4);
                    ((hfm) b).Z();
                } else {
                    b.v(-1425403550);
                    a(dmfnVar, hveVar, b, i3 & 126);
                    ((hfm) b).Z();
                }
            }
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abeq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmfn dmfnVar2 = dmfn.this;
                    int i5 = i;
                    abes.b(dmfnVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
