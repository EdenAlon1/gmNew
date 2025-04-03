package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deok {
    public static final void a(final String str, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(116328146);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            dwfj.a(ffixVar, eba.j(d, 0.0f, 0.0f, 0.0f, 12.0f, 7), false, null, null, null, null, null, hpx.d(-2063791902, new deog(str), b), b, ((i2 >> 3) & 14) | 805306416, 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deob
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    deok.a(str2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final denc dencVar, final denz denzVar, hfd hfdVar, final int i) {
        int i2;
        jpo jpoVar;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1914522969);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(dencVar) : b.F(dencVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(denzVar) : b.F(denzVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(1793604788);
            jlj jljVar = new jlj((byte[]) null);
            jljVar.f(dencVar.a);
            dltp dltpVar = dencVar.c;
            b.v(1793607667);
            if (dltpVar != null) {
                jljVar.a.add(new jli(new jlv(dltpVar.a, new jph(new jou(gft.a(b).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 14)), dltpVar.b, dltpVar.c, null, 8));
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            jlm b2 = jljVar.b();
            hfmVar.Z();
            long j = gft.a(b).s;
            if (dencVar.d) {
                b.v(1793621217);
                jpoVar = gft.d(b).k;
                hfmVar.Z();
            } else {
                b.v(1793622720);
                jpoVar = gft.d(b).l;
                hfmVar.Z();
            }
            dwjt.a(b2, eba.i(hvi.e, 0.0f, 20.0f, 1), j, 0L, 0L, null, 0L, 0, false, 0, null, null, jpoVar, b, 48, 0, 65528);
            hfdVar2 = b;
            if (denzVar.a) {
                ebv.a(ebs.k(hvi.e, 4.0f), hfdVar2);
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deof
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    denc dencVar2 = denc.this;
                    int i4 = i;
                    deok.b(dencVar2, denzVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final deoa deoaVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1519343272);
        if (i3 == 0) {
            i2 = (true != b.D(deoaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(-1034532336);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new god();
                hfmVar.ad(R);
            }
            god godVar = (god) R;
            hfmVar.Z();
            hvi z = deoaVar.h.a ? ebs.z(hvi.e, null, 3) : hvi.e;
            hfdVar2 = b;
            dwio.a(z, hpx.d(1512253460, new deoh(deoaVar), b), null, hpx.d(1930142162, new deoi(godVar), b), null, 0, gft.a(b).p, 0L, ecv.f(b), hpx.d(-973379351, new deoj(deoaVar, godVar), b), hfdVar2, 805309488, 180);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deod
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    deok.c(deoa.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dys dysVar, final deng dengVar, final depe depeVar, final dekg dekgVar, final denc dencVar, final god godVar, final ffix ffixVar, final denz denzVar, hfd hfdVar, final int i) {
        int i2;
        god godVar2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-772002568);
        if (i3 == 0) {
            i2 = (true != b2.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b2.D(dengVar) : b2.F(dengVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(depeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(dekgVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? b2.D(dencVar) : b2.F(dencVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            godVar2 = godVar;
            i2 |= true != b2.D(godVar2) ? 65536 : 131072;
        } else {
            godVar2 = godVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.F(ffixVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != ((16777216 & i) == 0 ? b2.D(denzVar) : b2.F(denzVar)) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if ((4793491 & i4) == 4793490 && b2.I()) {
            b2.s();
        } else {
            int i5 = i4 >> 3;
            int i6 = i4 & 14;
            if (dekgVar.c) {
                b2.v(314599662);
                deoz.g(dysVar, dengVar, dekgVar, godVar2, b2, ((i4 >> 6) & 7168) | (i5 & 896) | i6 | 64 | (i4 & 112));
                ((hfm) b2).Z();
            } else {
                b2.v(314708906);
                depj.b(dysVar, depeVar, b2, (i5 & 112) | i6);
                ((hfm) b2).Z();
            }
            dxq dxqVar = dencVar != null ? dencVar.b : dxu.d;
            b = ebs.b(hvi.e, 1.0f);
            int i7 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b2, 0);
            int a2 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, b);
            int i8 = ist.a;
            ffix ffixVar2 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar2);
            } else {
                b2.z();
            }
            hlc.b(b2, a, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            b2.v(1104011398);
            if (dencVar != null) {
                b(dencVar, denzVar, b2, (i4 >> 18) & 112);
            }
            hfmVar.Z();
            b2.v(1104013109);
            if (ffixVar != null) {
                String str = dekgVar.a.b().e;
                str.getClass();
                a(str, ffixVar, b2, 0);
            }
            hfmVar.Z();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deoe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    deng dengVar2 = dengVar;
                    depe depeVar2 = depeVar;
                    dekg dekgVar2 = dekgVar;
                    denc dencVar2 = dencVar;
                    god godVar3 = godVar;
                    ffix ffixVar3 = ffixVar;
                    deok.d(dysVar2, dengVar2, depeVar2, dekgVar2, dencVar2, godVar3, ffixVar3, denzVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dys dysVar, final depe depeVar, final denc dencVar, final denz denzVar, hfd hfdVar, final int i) {
        int i2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1219537027);
        if (i3 == 0) {
            i2 = (true != b2.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(depeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b2.D(dencVar) : b2.F(dencVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b2.D(denzVar) : b2.F(denzVar)) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            depj.b(dysVar, depeVar, b2, i2 & 126);
            b = dys.b(hvi.e, 1.0f, true);
            ebv.a(b, b2);
            if (dencVar != null) {
                b(dencVar, denzVar, b2, (i2 >> 6) & 112);
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: deoc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    depe depeVar2 = depeVar;
                    denc dencVar2 = dencVar;
                    deok.e(dysVar2, depeVar2, dencVar2, denzVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
