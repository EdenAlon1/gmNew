package defpackage;

import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmxr {
    public static final void a(final hvi hviVar, final String str, final long j, final float f, final List list, ffix ffixVar, final boolean z, final dmxv dmxvVar, hfd hfdVar, final int i) {
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
        hfd b = hfdVar.b(1551476054);
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
            i2 |= true != b.D(dmxvVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
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
            b.v(135677320);
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                int i8 = i6 & 112;
                Object next = it.next();
                int i9 = i7 + 1;
                if (i7 < 0) {
                    ffdx.l();
                }
                dmxf dmxfVar = (dmxf) next;
                String str2 = dmxfVar.b;
                Iterator it2 = it;
                if (str2 == null) {
                    b.v(-1374084718);
                    hvi e = e(hvi.e, i7, ((fffs) list).c);
                    if (z2) {
                        e = e.a(eba.i(hvi.e, 0.0f, 8.0f, 1));
                    }
                    b.v(1618250628);
                    Object R = hfmVar2.R();
                    if (i8 == 32 || R == hfc.a) {
                        R = new ffji() { // from class: dmxj
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
                    String str3 = dmxfVar.a;
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
                    hfdVar5.v(-1373520642);
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
                    hfdVar5.v(1618275908);
                    Object R2 = hfmVar.R();
                    if (i8 == 32 || R2 == hfc.a) {
                        R2 = new ffji() { // from class: dmxk
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
                    dnak.b(dnawVar, c, booleanValue ? new qgi() : null, hpx.d(-979277173, new dmxm(f), hfdVar5), !booleanValue, 0, hfdVar5, 3072, 96);
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
            dnwi dnwiVar = dmxvVar.k;
            hfdVar2.v(135732218);
            if (dnwiVar != null) {
                hfdVar2.v(135735397);
                if (dmxvVar.h) {
                    a = ebrVar.a(ebs.e(hvi.e, 1.0f), 1.0f, true);
                    ebv.a(a, hfdVar2);
                }
                hfmVar3.Z();
                hvi h = ebs.h(ebrVar.b(hvi.e, hum.o), 16.0f);
                if (dmxvVar.h) {
                    h = h.a(eau.b(hvi.e, -8.0f, -8.0f));
                }
                if (!dmxvVar.h) {
                    h = h.a(eau.c(hvi.e, -8.0f, 0.0f, 2));
                }
                if (dlsp.a(dmxvVar.m.d, hfdVar2)) {
                    h = h.a(dlsj.c(hvi.e));
                }
                dnwg.i(dnwiVar, h, hfdVar2, 0);
            }
            hfmVar3.Z();
            hfdVar2.n();
            ffixVar2 = ffixVar;
            hgs.g(Boolean.valueOf(ffkxVar4.a), new dmxn(ffkxVar4, ffixVar2, null), hfdVar2);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmxl
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
                    dmxr.a(hviVar2, str4, j3, f2, list2, ffixVar4, z3, dmxvVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.dmxv r25, defpackage.hvi r26, final defpackage.idh r27, defpackage.hfd r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmxr.b(dmxv, hvi, idh, hfd, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dmxv r17, final defpackage.domt r18, defpackage.kak r19, defpackage.hfd r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmxr.c(dmxv, domt, kak, hfd, int, int):void");
    }

    public static final void d(final dyh dyhVar, final dmxv dmxvVar, final kak kakVar, final dnwi dnwiVar, hfd hfdVar, final int i) {
        int i2;
        jpo g;
        int i3;
        jpg b;
        jpi jpiVar;
        hus husVar;
        jpo g2;
        jlm jlmVar;
        jpo jpoVar;
        long k;
        Object b2;
        int i4 = i & 6;
        hfd b3 = hfdVar.b(2106708056);
        if (i4 == 0) {
            i2 = (true != b3.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b3.D(dmxvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b3.D(kakVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b3.D(dnwiVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b3.I()) {
            b3.s();
        } else {
            boolean booleanValue = ((Boolean) dooy.b(b3).d.invoke()).booleanValue();
            boolean booleanValue2 = ((Boolean) dooy.b(b3).h.invoke()).booleanValue();
            jpi a = jpj.a(b3);
            if (kakVar != null) {
                b3.v(-1160547297);
                g = jpo.y(done.g(dmxvVar, b3), 0L, kakVar.b, null, null, null, null, 0L, null, 0, 0, kal.b(kak.a(kakVar.b) + 16.0f), null, null, 0, 16646141);
                ((hfm) b3).Z();
            } else {
                b3.v(-1160404821);
                g = done.g(dmxvVar, b3);
                ((hfm) b3).Z();
            }
            jpo jpoVar2 = g;
            int i5 = 0;
            float b4 = dnrx.b(0.0f, dmxvVar.m.a, false, b3, 5) - 16.0f;
            jzn jznVar = (jzn) b3.e(jdr.e);
            float f = b4 - 8.0f;
            if (dmxvVar.m.c) {
                b3.v(-1160004518);
                jpo g3 = done.g(dmxvVar, b3);
                String str = dmxvVar.d;
                b3.v(655317402);
                boolean D = b3.D(str) | b3.D(g3) | b3.D(jznVar) | b3.A(f);
                hfm hfmVar = (hfm) b3;
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    if (booleanValue) {
                        String str2 = dmxvVar.d;
                        jlmVar = new jlm(ffpc.F(str2, '\n', str2));
                    } else {
                        jlmVar = new jlm(dmxvVar.d);
                    }
                    if (booleanValue2) {
                        jpoVar = jpoVar2;
                        i5 = 0;
                        k = jzl.k(0, (int) Math.ceil(jznVar.em(f)), 0, 13);
                    } else {
                        jpoVar = jpoVar2;
                        k = jzl.k(0, (int) jznVar.em(f), 0, 13);
                    }
                    i3 = i5;
                    b2 = jpi.b(a, jlmVar, jpoVar, 0, false, 0, k, null, null, null, 1980);
                    hfmVar.ad(b2);
                } else {
                    b2 = R;
                    i3 = 0;
                }
                b = (jpg) b2;
                hfmVar.Z();
                hfmVar.Z();
                jpiVar = a;
            } else {
                i3 = 0;
                b3.v(-1159359067);
                b = jpi.b(a, new jlm(dmxvVar.d), jpoVar2, 0, false, 0, jzl.k(0, (int) ((jzn) b3.e(jdr.e)).em(f), 0, 13), null, null, null, 1980);
                jpiVar = a;
                ((hfm) b3).Z();
            }
            b3.v(655346704);
            jlz jlzVar = b.b;
            if (jlzVar.f != 1 || Float.compare(jlzVar.d(i3) + 16.0f + 6.0f + 6.0f, f) >= 0) {
                b3.v(655355919);
                int compare = Float.compare(jznVar.ef(done.g(dmxvVar, b3).i()), 32.0f);
                ((hfm) b3).Z();
                if (compare > 0) {
                    int i6 = huo.a;
                    husVar = hum.o;
                } else {
                    int i7 = huo.a;
                    husVar = hum.n;
                }
            } else {
                int i8 = huo.a;
                husVar = hum.n;
            }
            hus husVar2 = husVar;
            hfm hfmVar2 = (hfm) b3;
            hfmVar2.Z();
            String str3 = dmxvVar.d;
            String a2 = dnvs.a(dnwiVar.d);
            domv domvVar = dmxvVar.m;
            hvi hviVar = hvi.e;
            if (dlsp.a(domvVar.d, b3)) {
                hviVar = dlsj.c(hvi.e);
            }
            String str4 = dmxvVar.g;
            hvi a3 = jfw.a(hviVar, "message_text");
            long f2 = done.f(done.i(dmxvVar, b3), dmxvVar.e, b3);
            if (kakVar != null) {
                b3.v(-1158141449);
                g2 = jpo.y(done.g(dmxvVar, b3), 0L, kakVar.b, null, null, null, null, 0L, null, 0, 0, kal.b(kak.a(kakVar.b) + 16.0f), null, null, 0, 16646141);
                hfmVar2.Z();
            } else {
                b3.v(-1157991161);
                g2 = done.g(dmxvVar, b3);
                hfmVar2.Z();
            }
            dofn dofnVar = dmxvVar.j;
            domv domvVar2 = dmxvVar.m;
            domv domvVar3 = dmxvVar.m;
            dolo.e(str3, str4, a2, f, a3, f2, g2, jpiVar, b, (done.h(dofnVar, null, domvVar2.a, domvVar2.b, false, b3, 18) - 16.0f) - 8.0f, 0.0f, husVar2, null, domvVar3.c, domvVar3.e, hpx.d(1742772853, new dmxp(dnwiVar, dyhVar, dmxvVar), b3), b3, 1073741824, 12582912, 22528);
            b3 = b3;
        }
        hio L = b3.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmxg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    dmxv dmxvVar2 = dmxvVar;
                    kak kakVar2 = kakVar;
                    dmxr.d(dyhVar2, dmxvVar2, kakVar2, dnwiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final hvi e(hvi hviVar, int i, int i2) {
        return i2 == 1 ? eba.j(hviVar, 16.0f, 0.0f, 16.0f, 0.0f, 10) : i == 0 ? eba.j(hviVar, 16.0f, 0.0f, 0.0f, 0.0f, 14) : i == i2 + (-1) ? eba.j(hviVar, 0.0f, 0.0f, 16.0f, 0.0f, 11) : hviVar;
    }
}
