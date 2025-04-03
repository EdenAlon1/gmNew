package defpackage;

import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domg {
    public static final void a(final hvi hviVar, final String str, final long j, final float f, final List list, ffix ffixVar, final boolean z, final doml domlVar, hfd hfdVar, final int i) {
        int i2;
        long j2;
        hfd hfdVar2;
        hvi a;
        hfm hfmVar;
        ffkx ffkxVar;
        dnaw dnawVar;
        hvi c;
        hfd hfdVar3;
        hvi c2;
        final ffix ffixVar2 = ffixVar;
        boolean z2 = z;
        int i3 = i & 48;
        hfd b = hfdVar.b(-1985380311);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= true != b.C(j2) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(list) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffixVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.E(z2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(domlVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793489 & i2) == 4793488 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            ffkx ffkxVar2 = new ffkx();
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ffkx ffkxVar3 = ffkxVar2;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            int i6 = i2;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebr ebrVar = ebr.a;
            b.v(-1491381057);
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                int i8 = i6 & 112;
                Object next = it.next();
                int i9 = i7 + 1;
                if (i7 < 0) {
                    ffdx.l();
                }
                dolr dolrVar = (dolr) next;
                String str2 = dolrVar.b;
                Iterator it2 = it;
                if (str2 == null) {
                    b.v(1745626043);
                    hvi e = e(hvi.e, i7, ((fffs) list).c);
                    if (z2) {
                        e = e.a(eba.i(hvi.e, 0.0f, 8.0f, 1));
                    }
                    b.v(1718886459);
                    Object R = hfmVar2.R();
                    if (i8 == 32 || R == hfc.a) {
                        R = new ffji() { // from class: dolu
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                jkv jkvVar = (jkv) obj;
                                jkvVar.getClass();
                                String str3 = str;
                                if (str3 != null) {
                                    jkr.k(jkvVar, str3);
                                }
                                return ffcu.a;
                            }
                        };
                        hfmVar2.ad(R);
                    }
                    hfmVar2.Z();
                    c2 = jjs.c(e, false, (ffji) R);
                    String str3 = dolrVar.a;
                    kal.e(j2);
                    ffkxVar = ffkxVar3;
                    hfd hfdVar4 = b;
                    hfmVar = hfmVar2;
                    dwjt.b(str3, c2, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new jpo(0L, kal.d(kak.b(j2), kak.a(j2) * 0.85f), null, null, 0L, 0, 0L, 16777213), hfdVar4, 0, 0, 65532);
                    hfmVar.Z();
                    hfdVar3 = hfdVar4;
                } else {
                    hfd hfdVar5 = b;
                    hfmVar = hfmVar2;
                    ffkxVar = ffkxVar3;
                    hfdVar5.v(1746190119);
                    ffkxVar.a = true;
                    boolean booleanValue = ((Boolean) hfdVar5.e(dnmz.a)).booleanValue();
                    dnaw dnawVar2 = new dnaw(str2, "animated_emoji");
                    hvi e2 = e(hvi.e, i7, ((fffs) list).c);
                    if (z) {
                        dnawVar = dnawVar2;
                        e2 = e2.a(eba.i(hvi.e, 0.0f, 8.0f, 1));
                    } else {
                        dnawVar = dnawVar2;
                    }
                    hvi b3 = ebrVar.b(ebs.k(e2, f), hum.n);
                    hfdVar5.v(1718911739);
                    Object R2 = hfmVar.R();
                    if (i8 == 32 || R2 == hfc.a) {
                        R2 = new ffji() { // from class: dolv
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                jkv jkvVar = (jkv) obj;
                                jkvVar.getClass();
                                String str4 = str;
                                if (str4 != null) {
                                    jkr.k(jkvVar, str4);
                                }
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R2);
                    }
                    hfmVar.Z();
                    c = jjs.c(b3, false, (ffji) R2);
                    dnak.b(dnawVar, c, booleanValue ? new qgi() : null, hpx.d(-1798851884, new dolz(f), hfdVar5), !booleanValue, 0, hfdVar5, 3072, 96);
                    hfdVar3 = hfdVar5;
                    if (i7 != r14.c - 1) {
                        ebv.a(ebs.k(hvi.e, 2.0f), hfdVar3);
                    }
                    hfmVar.Z();
                }
                j2 = j;
                hfmVar2 = hfmVar;
                b = hfdVar3;
                ffkxVar3 = ffkxVar;
                i7 = i9;
                it = it2;
                z2 = z;
            }
            hfdVar2 = b;
            hfm hfmVar3 = hfmVar2;
            ffkx ffkxVar4 = ffkxVar3;
            hfmVar3.Z();
            dnwi dnwiVar = domlVar.o;
            hfdVar2.v(-1491326159);
            if (dnwiVar != null) {
                hfdVar2.v(-1491322980);
                if (domlVar.k) {
                    a = ebrVar.a(ebs.e(hvi.e, 1.0f), 1.0f, true);
                    ebv.a(a, hfdVar2);
                }
                hfmVar3.Z();
                hvi h = ebs.h(ebrVar.b(hvi.e, hum.o), 16.0f);
                if (domlVar.k) {
                    h = h.a(eau.b(hvi.e, -8.0f, -8.0f));
                }
                if (!domlVar.k) {
                    h = h.a(eau.c(hvi.e, -8.0f, 0.0f, 2));
                }
                if (dlsp.a(domlVar.i.d, hfdVar2)) {
                    h = h.a(dlsj.c(hvi.e));
                }
                dnwg.i(dnwiVar, h, hfdVar2, 0);
            }
            hfmVar3.Z();
            hfdVar2.n();
            ffixVar2 = ffixVar;
            hgs.g(Boolean.valueOf(ffkxVar4.a), new doma(ffkxVar4, ffixVar2, null), hfdVar2);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dolw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    String str4 = str;
                    long j3 = j;
                    float f2 = f;
                    List list2 = list;
                    ffix ffixVar4 = ffixVar2;
                    boolean z3 = z;
                    domg.a(hviVar2, str4, j3, f2, list2, ffixVar4, z3, domlVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.doml r23, defpackage.hvi r24, defpackage.idh r25, defpackage.ffjm r26, defpackage.hfd r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.domg.b(doml, hvi, idh, ffjm, hfd, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.doml r27, final defpackage.domt r28, defpackage.kak r29, final defpackage.ffjm r30, defpackage.hfd r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.domg.c(doml, domt, kak, ffjm, hfd, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.dyh r55, final defpackage.doml r56, final defpackage.kak r57, final defpackage.dnwi r58, defpackage.hfd r59, final int r60) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.domg.d(dyh, doml, kak, dnwi, hfd, int):void");
    }

    private static final hvi e(hvi hviVar, int i, int i2) {
        return i2 == 1 ? eba.j(hviVar, 16.0f, 0.0f, 16.0f, 0.0f, 10) : i == 0 ? eba.j(hviVar, 16.0f, 0.0f, 0.0f, 0.0f, 14) : i == i2 + (-1) ? eba.j(hviVar, 0.0f, 0.0f, 16.0f, 0.0f, 11) : hviVar;
    }
}
