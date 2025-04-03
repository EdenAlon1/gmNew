package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnon {
    public static final float a(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final float b(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    public static final int c(hho hhoVar) {
        return ((Number) hhoVar.a()).intValue();
    }

    public static final int d(hkx hkxVar) {
        return ((Number) hkxVar.a()).intValue();
    }

    public static final int e(hho hhoVar) {
        return ((Number) hhoVar.a()).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [cyq, java.lang.Object] */
    public static final void f(final dnor dnorVar, hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        Object e;
        int i3;
        ffji ffjiVar;
        hho hhoVar;
        Object e2;
        Float f;
        dbv dbvVar;
        int i4;
        int i5;
        Object e3;
        hrw a;
        ffji k;
        hrw b;
        dnorVar.getClass();
        ffjmVar.getClass();
        hfd b2 = hfdVar.b(2057031737);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(dnorVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 384) == 0) {
            i6 |= true != b2.F(ffjmVar) ? 128 : 256;
        }
        if ((i6 & 147) == 146 && b2.I()) {
            b2.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            b2.v(1357358642);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(0, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar2 = (hho) R;
            hfmVar.Z();
            b2.v(1357360306);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar2 = new hic(0, hla.a);
                hfmVar.ad(hicVar2);
                R2 = hicVar2;
            }
            hho hhoVar3 = (hho) R2;
            hfmVar.Z();
            if (c(hhoVar2) == 0 && e(hhoVar3) == 0) {
                int i7 = i6 & 112;
                int i8 = i6 >> 6;
                b2.v(-871390353);
                b2.v(1357370027);
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    R3 = new dnof(hhoVar2, hhoVar3);
                    hfmVar.ad(R3);
                }
                ipn ipnVar = (ipn) R3;
                hfmVar.Z();
                int a2 = hey.a(b2);
                hqb ai = hfmVar.ai();
                hvi b3 = huz.b(b2, hviVar2);
                int i9 = ist.a;
                int i10 = (((((i8 & 14) | 384) | i7) << 6) & 896) | 6;
                ffix ffixVar = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar);
                } else {
                    b2.z();
                }
                hlc.b(b2, ipnVar, iss.e);
                hlc.b(b2, ai, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    hfmVar.ad(valueOf);
                    b2.h(valueOf, ffjmVar2);
                }
                hlc.b(b2, b3, iss.c);
                ffjmVar.a(b2, Integer.valueOf((i10 >> 6) & 14));
                b2.n();
                hfmVar.Z();
            } else {
                b2.v(-870143223);
                b2.v(1357403934);
                Object R4 = hfmVar.R();
                if (R4 == hfc.a) {
                    R4 = new czq(false);
                    hfmVar.ad(R4);
                }
                czq czqVar = (czq) R4;
                hfmVar.Z();
                czqVar.d(true);
                dbe b4 = dbs.b(czqVar, "transition bubble", b2, 48, 0);
                dnol dnolVar = dnol.a;
                dbv dbvVar2 = dcp.a;
                if (b4.t()) {
                    b2.v(1888611722);
                    hfmVar.Z();
                    e = b4.e();
                } else {
                    b2.v(1888357677);
                    boolean D = b2.D(b4);
                    e = hfmVar.R();
                    if (D || e == hfc.a) {
                        a = hrv.a();
                        k = a != null ? a.k() : null;
                        b = hrv.b(a);
                        try {
                            Object e4 = b4.e();
                            hrv.e(a, b, k);
                            hfmVar.ad(e4);
                            e = e4;
                        } finally {
                        }
                    }
                    hfmVar.Z();
                }
                boolean booleanValue = ((Boolean) e).booleanValue();
                b2.v(237296477);
                float f2 = true != booleanValue ? 1.0f : 0.0f;
                hfmVar.Z();
                Float valueOf2 = Float.valueOf(f2);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    dnny dnnyVar = new dnny(b4);
                    hqg hqgVar = hkg.a;
                    hgk hgkVar = new hgk(dnnyVar, null);
                    hfmVar.ad(hgkVar);
                    R5 = hgkVar;
                }
                boolean booleanValue2 = ((Boolean) ((hkx) R5).a()).booleanValue();
                b2.v(237296477);
                float f3 = true != booleanValue2 ? 1.0f : 0.0f;
                hfmVar.Z();
                Float valueOf3 = Float.valueOf(f3);
                Object R6 = hfmVar.R();
                if (R6 == hfc.a) {
                    dnnz dnnzVar = new dnnz(b4);
                    hqg hqgVar2 = hkg.a;
                    i3 = i6;
                    ffjiVar = null;
                    R6 = new hgk(dnnzVar, null);
                    hfmVar.ad(R6);
                } else {
                    i3 = i6;
                    ffjiVar = null;
                }
                ffji ffjiVar2 = ffjiVar;
                hkx f4 = dbs.f(b4, valueOf2, valueOf3, dnolVar.a(((hkx) R6).a(), b2, 0), dbvVar2, b2, 0);
                dnom dnomVar = dnom.a;
                dbv dbvVar3 = dcp.a;
                if (b4.t()) {
                    hhoVar = hhoVar3;
                    b2.v(1888611722);
                    hfmVar.Z();
                    e2 = b4.e();
                } else {
                    b2.v(1888357677);
                    boolean D2 = b2.D(b4);
                    e2 = hfmVar.R();
                    if (D2 || e2 == hfc.a) {
                        a = hrv.a();
                        k = a != null ? a.k() : ffjiVar2;
                        b = hrv.b(a);
                        hhoVar = hhoVar3;
                        try {
                            Object e5 = b4.e();
                            hrv.e(a, b, k);
                            hfmVar.ad(e5);
                            e2 = e5;
                        } finally {
                        }
                    } else {
                        hhoVar = hhoVar3;
                    }
                    hfmVar.Z();
                }
                boolean booleanValue3 = ((Boolean) e2).booleanValue();
                b2.v(-126512911);
                float f5 = (!booleanValue3 || a(f4) > 0.1f) ? 0.0f : 1.0f;
                hfmVar.Z();
                Float valueOf4 = Float.valueOf(f5);
                Object R7 = hfmVar.R();
                if (R7 == hfc.a) {
                    dnoa dnoaVar = new dnoa(b4);
                    hqg hqgVar3 = hkg.a;
                    R7 = new hgk(dnoaVar, null);
                    hfmVar.ad(R7);
                }
                boolean booleanValue4 = ((Boolean) ((hkx) R7).a()).booleanValue();
                b2.v(-126512911);
                float f6 = (!booleanValue4 || a(f4) > 0.1f) ? 0.0f : 1.0f;
                hfmVar.Z();
                Float valueOf5 = Float.valueOf(f6);
                Object R8 = hfmVar.R();
                if (R8 == hfc.a) {
                    dnob dnobVar = new dnob(b4);
                    hqg hqgVar4 = hkg.a;
                    f = valueOf4;
                    hgk hgkVar2 = new hgk(dnobVar, null);
                    hfmVar.ad(hgkVar2);
                    R8 = hgkVar2;
                } else {
                    f = valueOf4;
                }
                hkx f7 = dbs.f(b4, f, valueOf5, dnomVar.a(((hkx) R8).a(), b2, 0), dbvVar3, b2, 0);
                dnok dnokVar = dnok.a;
                dbv dbvVar4 = dcp.b;
                if (b4.t()) {
                    dbvVar = dbvVar4;
                    i4 = i3 & 112;
                    i5 = i3 >> 6;
                    b2.v(1888611722);
                    hfmVar.Z();
                    e3 = b4.e();
                } else {
                    b2.v(1888357677);
                    boolean D3 = b2.D(b4);
                    e3 = hfmVar.R();
                    if (D3 || e3 == hfc.a) {
                        a = hrv.a();
                        k = a != null ? a.k() : null;
                        b = hrv.b(a);
                        dbvVar = dbvVar4;
                        try {
                            Object e6 = b4.e();
                            hrv.e(a, b, k);
                            hfmVar.ad(e6);
                            e3 = e6;
                        } finally {
                        }
                    } else {
                        dbvVar = dbvVar4;
                    }
                    i4 = i3 & 112;
                    i5 = i3 >> 6;
                    hfmVar.Z();
                }
                int i11 = i4;
                int i12 = i5;
                boolean booleanValue5 = ((Boolean) e3).booleanValue();
                b2.v(-1542204915);
                int e7 = booleanValue5 ? e(hhoVar) : c(hhoVar2);
                hfmVar.Z();
                Integer valueOf6 = Integer.valueOf(e7);
                Object R9 = hfmVar.R();
                if (R9 == hfc.a) {
                    dnoc dnocVar = new dnoc(b4);
                    hqg hqgVar5 = hkg.a;
                    hgk hgkVar3 = new hgk(dnocVar, null);
                    hfmVar.ad(hgkVar3);
                    R9 = hgkVar3;
                }
                boolean booleanValue6 = ((Boolean) ((hkx) R9).a()).booleanValue();
                b2.v(-1542204915);
                int e8 = booleanValue6 ? e(hhoVar) : c(hhoVar2);
                hfmVar.Z();
                Integer valueOf7 = Integer.valueOf(e8);
                Object R10 = hfmVar.R();
                if (R10 == hfc.a) {
                    dnod dnodVar = new dnod(b4);
                    hqg hqgVar6 = hkg.a;
                    hgk hgkVar4 = new hgk(dnodVar, null);
                    hfmVar.ad(hgkVar4);
                    R10 = hgkVar4;
                }
                hkx f8 = dbs.f(b4, valueOf6, valueOf7, dnokVar.a(((hkx) R10).a(), b2, 0), dbvVar, b2, 0);
                b2.v(1357449875);
                boolean D4 = b2.D(f4) | b2.D(f8) | ((i3 & 14) == 4) | b2.D(f7);
                Object R11 = hfmVar.R();
                if (D4 || R11 == hfc.a) {
                    R11 = new dnoj(f4, f8, dnorVar, f7);
                    hfmVar.ad(R11);
                }
                ipn ipnVar2 = (ipn) R11;
                hfmVar.Z();
                int a3 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b5 = huz.b(b2, hviVar2);
                int i13 = ist.a;
                int i14 = ((((i12 & 14) | i11) << 6) & 896) | 6;
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, ipnVar2, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar3 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                    Integer valueOf8 = Integer.valueOf(a3);
                    hfmVar.ad(valueOf8);
                    b2.h(valueOf8, ffjmVar3);
                }
                hlc.b(b2, b5, iss.c);
                ffjmVar.a(b2, Integer.valueOf((i14 >> 6) & 14));
                b2.n();
                hfmVar.Z();
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnnx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnor dnorVar2 = dnor.this;
                    hvi hviVar3 = hviVar2;
                    int i15 = i;
                    dnon.f(dnorVar2, hviVar3, ffjmVar, (hfd) obj, hip.a(i15 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
