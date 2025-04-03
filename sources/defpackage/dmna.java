package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmna {
    public static final void a(final dmnb dmnbVar, ibw ibwVar, ibw ibwVar2, final boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        dmnbVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1089545809);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmnbVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(ibwVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.D(ibwVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                ibwVar = null;
            }
            if (i6 != 0) {
                ibwVar2 = null;
            }
            dnct.a(Integer.valueOf(R.id.compose_header_growthkit_view), hpx.d(1578440336, new dmmy(ibwVar, dmnbVar, ibwVar2, z), b), b, 48);
        }
        final ibw ibwVar3 = ibwVar;
        final ibw ibwVar4 = ibwVar2;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmmu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmnb dmnbVar2 = dmnb.this;
                    ibw ibwVar5 = ibwVar3;
                    ibw ibwVar6 = ibwVar4;
                    dmna.a(dmnbVar2, ibwVar5, ibwVar6, z, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(ffix ffixVar, final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-133568541);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            hvi hviVar = hvi.e;
            if (z) {
                hviVar = eba.j(hvi.e, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            }
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, hviVar, false, null, null, hpx.d(-1098929663, new dmmz(str), b), b, (i2 & 14) | 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmmv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    String str2 = str;
                    int i4 = i;
                    dmna.b(ffixVar3, str2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ibw ibwVar, ffix ffixVar, ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        final ffix ffixVar2;
        final ffjm ffjmVar2 = ffjmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1883948669);
        if (i3 == 0) {
            i2 = (true != b.D(ibwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi u = ebs.u(d, 48.0f, 0.0f, 2);
            b.v(-950925241);
            long j = ibwVar == null ? gft.a(b).c : ibwVar.i;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            eql d2 = eqm.d(24.0f, 24.0f, 0.0f, 0.0f, 12);
            if (ffixVar != null) {
                b.v(586307029);
                gpa.e(ffixVar, u, false, d2, j, 0L, 0.0f, null, null, ffjmVar2, b, 996);
                b = b;
                ffixVar2 = ffixVar;
                hfmVar.Z();
                ffjmVar2 = ffjmVar;
            } else {
                ffixVar2 = ffixVar;
                b.v(586463021);
                gpa.c(u, d2, j, 0L, 0.0f, 0.0f, null, ffjmVar, b, 120);
                ffjmVar2 = ffjmVar;
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmmw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ibw ibwVar2 = ibw.this;
                    ffix ffixVar3 = ffixVar2;
                    int i4 = i;
                    dmna.c(ibwVar2, ffixVar3, ffjmVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final ebq ebqVar, final String str, final ibw ibwVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1960382197);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(ibwVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            a = ebqVar.a(eba.j(hvi.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, true);
            hvi a2 = jfw.a(a, "Compose:Draft:Header:Text");
            jpo jpoVar = gft.d(b).n;
            b.v(-1052432112);
            long j = ibwVar == null ? gft.a(b).a : ibwVar.i;
            ((hfm) b).Z();
            hfdVar2 = b;
            dwjt.b(str, a2, j, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jpoVar, hfdVar2, (i2 >> 3) & 14, 3120, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmmt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    String str2 = str;
                    int i4 = i;
                    dmna.d(ebqVar2, str2, ibwVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
