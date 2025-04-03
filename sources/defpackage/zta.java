package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zta {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dnoq r21, final defpackage.eqd r22, defpackage.eykv r23, defpackage.dnor r24, java.lang.Object r25, defpackage.hfd r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zta.a(dnoq, eqd, eykv, dnor, java.lang.Object, hfd, int, int):void");
    }

    public static final void b(final doms domsVar, eqd eqdVar, hfd hfdVar, final int i) {
        int i2;
        final eqd eqdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2094734603);
        if (i3 == 0) {
            i2 = (true != b.F(domsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(eqdVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            eqdVar2 = eqdVar;
        } else if (domsVar instanceof dndq) {
            b.v(1741976061);
            eqdVar2 = eqdVar;
            dndg.e((dndq) domsVar, null, eqd.d(eqdVar2, new eqh(0.0f), new eqh(0.0f), null, null, 12), b, 0);
            ((hfm) b).Z();
        } else {
            eqdVar2 = eqdVar;
            if (domsVar instanceof aanx) {
                b.v(1741981147);
                aanv.a((aanx) domsVar, null, b, 0);
                ((hfm) b).Z();
            } else {
                b.v(-1833115579);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zsv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doms domsVar2 = doms.this;
                    int i4 = i;
                    zta.b(domsVar2, eqdVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final aaan aaanVar, final eqd eqdVar, final eykv eykvVar, final dnor dnorVar, final Object obj, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1066737490);
        if (i3 == 0) {
            i2 = (true != b.D(aaanVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(eqdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(eykvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(dnorVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(obj) ? 8192 : 16384;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            dnoq dnoqVar = aaanVar.b;
            if (dnoqVar != null) {
                b.v(725872273);
                dnon.f(dnorVar, null, hpx.d(-1661764345, new zsy(dnoqVar, eqdVar, eykvVar, dnorVar, obj, aaanVar), b), b, ((i4 >> 9) & 14) | 384);
                ((hfm) b).Z();
            } else {
                b.v(726074920);
                dmft.a(aaanVar.a, null, eqdVar, b, (i4 << 3) & 896);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zsx
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    aaan aaanVar2 = aaan.this;
                    eqd eqdVar2 = eqdVar;
                    eykv eykvVar2 = eykvVar;
                    dnor dnorVar2 = dnorVar;
                    zta.c(aaanVar2, eqdVar2, eykvVar2, dnorVar2, obj, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
