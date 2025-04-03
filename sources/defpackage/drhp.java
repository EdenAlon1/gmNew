package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhp {
    public static final void a(final long j, final long j2, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1302484457);
        if (i3 == 0) {
            i2 = i | (true != b.C(j) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            float f = 0.01f;
            if (j > 0 && j2 >= 0) {
                f = ffmk.e(j2 / j, 0.01f, 1.0f);
            }
            final hkx c = cxo.c(f, cxu.b(0.0f, 50.0f, null, 5), null, b, 3120, 20);
            long j3 = gft.a(b).a;
            long j4 = gft.a(b).c;
            hvi k = ebs.k(hvi.e, 48.0f);
            b.v(-2102894931);
            boolean D = b.D(c);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffix() { // from class: drhj
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Float.valueOf(((Number) hkx.this.a()).floatValue());
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwij.b((ffix) R, k, j3, 0.0f, j4, 0, 0.0f, b, 48, 104);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drhk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j5 = j;
                    drhp.a(j5, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.drht r18, final defpackage.ffix r19, final defpackage.ffix r20, float r21, defpackage.hfd r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drhp.b(drht, ffix, ffix, float, hfd, int, int):void");
    }

    public static final void c(final int i, hfd hfdVar, final int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(645458458);
        if (i4 == 0) {
            i3 = (true != b.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String string = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
            string.getClass();
            hfdVar2 = b;
            dwjt.b(string, ebs.x(hvi.e, 0.0f, 280.0f, 1), gft.a(b).o, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).h, hfdVar2, 48, 0, 65016);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drhi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i2;
                    drhp.c(i, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final drhs drhsVar, final ffix ffixVar, final ffix ffixVar2, hfd hfdVar, final int i) {
        int i2;
        float f;
        hvi d;
        hvi d2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1692713952);
        if (i3 == 0) {
            i2 = (true != b.D(drhsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            fgdj fgdjVar = drhsVar.a;
            b.v(1977400894);
            hkx a = fgdjVar == null ? null : hkf.a(fgdjVar, b);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(1977399878);
            if (a == null) {
                b.v(1977401552);
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    hic hicVar = new hic(false, hla.a);
                    hfmVar.ad(hicVar);
                    R = hicVar;
                }
                a = (hho) R;
                hfmVar.Z();
            }
            hfmVar.Z();
            fgdj fgdjVar2 = drhsVar.c;
            b.v(1977404478);
            hkx a2 = fgdjVar2 == null ? null : hkf.a(fgdjVar2, b);
            hfmVar.Z();
            b.v(1977403649);
            if (a2 == null) {
                b.v(1977405137);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = new hia(0L);
                    hfmVar.ad(R2);
                }
                a2 = (hkb) R2;
                hfmVar.Z();
            }
            hfmVar.Z();
            fgdj fgdjVar3 = drhsVar.d;
            b.v(1977408414);
            hkx a3 = fgdjVar3 == null ? null : hkf.a(fgdjVar3, b);
            hfmVar.Z();
            b.v(1977407430);
            if (a3 == null) {
                b.v(1977409073);
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    R3 = new hia(0L);
                    hfmVar.ad(R3);
                }
                a3 = (hkb) R3;
                hfmVar.Z();
            }
            hfmVar.Z();
            b.v(1977410449);
            if (i(a)) {
                f = 16.0f;
            } else {
                f = 16.0f;
                a(((Number) a2.a()).longValue(), ((Number) a3.a()).longValue(), b, 0);
                d2 = ebs.d(ebs.e(hvi.e, 16.0f), 1.0f);
                ebv.a(d2, b);
            }
            hfmVar.Z();
            c(true != i(a) ? R.string.magic_compose_feature_downloading_error_message : R.string.magic_compose_storage_error_message, b, 0);
            b.v(1977424006);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                hic hicVar2 = new hic(drhsVar.b, hla.a);
                hfmVar.ad(hicVar2);
                R4 = hicVar2;
            }
            hho hhoVar = (hho) R4;
            hfmVar.Z();
            b.v(1977426048);
            if (i(a) && h(hhoVar) != null) {
                d = ebs.d(ebs.e(hvi.e, f), 1.0f);
                ebv.a(d, b);
                ffix h = h(hhoVar);
                h.getClass();
                g(h, b, 0);
            }
            hfmVar.Z();
            b(drhsVar, ffixVar, ffixVar2, true != i(a) ? f : 8.0f, b, i2 & 1022, 0);
            fgdj fgdjVar4 = drhsVar.e;
            b.v(1977438622);
            hkx a4 = fgdjVar4 == null ? null : hkf.a(fgdjVar4, b);
            hfmVar.Z();
            if (a4 == null) {
                b.v(1977439280);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    hic hicVar3 = new hic(false, hla.a);
                    hfmVar.ad(hicVar3);
                    R5 = hicVar3;
                }
                a4 = (hho) R5;
                hfmVar.Z();
            }
            if (((Boolean) a4.a()).booleanValue()) {
                drhsVar.f.invoke();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drhm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    drhs drhsVar2 = drhs.this;
                    ffix ffixVar3 = ffixVar;
                    int i4 = i;
                    drhp.d(drhsVar2, ffixVar3, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(drht drhtVar, ffix ffixVar, ffix ffixVar2, hfd hfdVar, final int i) {
        int i2;
        final drht drhtVar2;
        final ffix ffixVar3;
        final ffix ffixVar4;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1375903669);
        if (i3 == 0) {
            i2 = (true != b.D(drhtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            drhtVar2 = drhtVar;
            ffixVar3 = ffixVar;
            ffixVar4 = ffixVar2;
        } else {
            c(drhtVar.a(), b, 0);
            drhtVar2 = drhtVar;
            ffixVar3 = ffixVar;
            ffixVar4 = ffixVar2;
            b(drhtVar2, ffixVar3, ffixVar4, 0.0f, b, i2 & 1022, 8);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drhf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    drht drhtVar3 = drht.this;
                    ffix ffixVar5 = ffixVar3;
                    int i4 = i;
                    drhp.e(drhtVar3, ffixVar5, ffixVar4, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final drht drhtVar, final ffix ffixVar, final ffix ffixVar2, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi c2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2101894925);
        if (i3 == 0) {
            i2 = (true != b.D(drhtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            hun hunVar = hum.k;
            dxj dxjVar = dxu.e;
            c = ebs.c(hviVar, 1.0f);
            c2 = dix.c(c, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            ipn a = dyo.a(dxjVar, hunVar, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c2);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            if (drhtVar instanceof drhs) {
                b.v(1509702167);
                d((drhs) drhtVar, ffixVar, ffixVar2, b, i2 & 1008);
                hfmVar.Z();
            } else {
                b.v(1509780287);
                e(drhtVar, ffixVar, ffixVar2, b, i2 & 1022);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drhl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    drht drhtVar2 = drht.this;
                    ffix ffixVar4 = ffixVar;
                    ffix ffixVar5 = ffixVar2;
                    drhp.f(drhtVar2, ffixVar4, ffixVar5, hviVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2001805018);
        if (i3 == 0) {
            i2 = (true != b.B(R.string.magic_compose_storage_settings_link) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ebe ebeVar = dwfd.a;
            ffixVar2 = ffixVar;
            dwfj.e(ffixVar2, null, false, null, dwfd.f(gft.a(b).a, b, 13), new ebf(10.0f, 12.0f, 10.0f, 12.0f), hpx.d(-737714103, new drho(), b), b, ((i2 >> 3) & 14) | 817889280, 366);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: drhg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    drhp.g(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final ffix h(hho hhoVar) {
        return (ffix) hhoVar.a();
    }

    private static final boolean i(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }
}
