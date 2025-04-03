package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class css {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r16, defpackage.hvi r17, defpackage.cyq r18, java.lang.String r19, defpackage.ffjn r20, defpackage.hfd r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.css.a(java.lang.Object, hvi, cyq, java.lang.String, ffjn, hfd, int, int):void");
    }

    public static final void b(dbe dbeVar, hvi hviVar, cyq cyqVar, ffji ffjiVar, ffjn ffjnVar, hfd hfdVar, int i) {
        ffji ffjiVar2;
        int i2 = i & 6;
        hfd b = hfdVar.b(679005231);
        int i3 = i2 == 0 ? (true != b.D(dbeVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(cyqVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != b.F(ffjnVar) ? 8192 : 16384;
        }
        if (b.J((i4 & 9363) != 9362, i4 & 1)) {
            ffjiVar2 = csk.a;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            Object obj = R;
            if (R == hfc.a) {
                hss hssVar = new hss();
                hssVar.add(dbeVar.e());
                hfmVar.ad(hssVar);
                obj = hssVar;
            }
            hss hssVar2 = (hss) obj;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                long[] jArr = cpg.a;
                R2 = new cop((byte[]) null);
                hfmVar.ad(R2);
            }
            cop copVar = (cop) R2;
            if (ffkj.e(dbeVar.e(), dbeVar.f())) {
                b.v(860925177);
                if (hssVar2.a() == 1 && ffkj.e(hssVar2.get(0), dbeVar.f())) {
                    b.v(861249809);
                    hfmVar.Z();
                } else {
                    b.v(861059531);
                    int i5 = i4 & 14;
                    Object R3 = hfmVar.R();
                    if (i5 == 4 || R3 == hfc.a) {
                        R3 = new csl(dbeVar);
                        hfmVar.ad(R3);
                    }
                    ffdx.v(hssVar2, (ffji) R3);
                    copVar.d();
                    hfmVar.Z();
                }
                hfmVar.Z();
            } else {
                b.v(861255761);
                hfmVar.Z();
            }
            if (copVar.g(dbeVar.f())) {
                b.v(862059281);
                hfmVar.Z();
            } else {
                b.v(861316428);
                htg htgVar = new htg(hssVar2, 0);
                int i6 = 0;
                while (true) {
                    if (!htgVar.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (ffkj.e(htgVar.next(), dbeVar.f())) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 == -1) {
                    hssVar2.add(dbeVar.f());
                } else {
                    hssVar2.set(i6, dbeVar.f());
                }
                copVar.d();
                int a = hssVar2.a();
                for (int i7 = 0; i7 < a; i7++) {
                    Object obj2 = hssVar2.get(i7);
                    copVar.e(obj2, hpx.d(-1426421288, new csq(dbeVar, cyqVar, obj2, ffjnVar), b));
                }
                hfmVar.Z();
            }
            int i8 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i9 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-187474512);
            int a4 = hssVar2.a();
            for (int i10 = 0; i10 < a4; i10++) {
                Object obj3 = hssVar2.get(i10);
                b.u(-1081865889, obj3);
                ffjm ffjmVar2 = (ffjm) copVar.f(obj3);
                if (ffjmVar2 == null) {
                    b.v(821932266);
                } else {
                    b.v(-1081864713);
                    ffjmVar2.a(b, 0);
                }
                hfmVar.Z();
                hfmVar.Z();
            }
            hfmVar.Z();
            b.n();
        } else {
            b.s();
            ffjiVar2 = ffjiVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new csr(dbeVar, hviVar, cyqVar, ffjiVar2, ffjnVar, i);
        }
    }
}
