package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgf {
    public static final void a(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1745554874);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, ebs.k(eba.j(hvi.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), 0L, b, 384, 8);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmfw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmgf.a(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1536941380);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, eba.j(hvi.e, z ? 8.0f : 24.0f, 0.0f, 24.0f, 0.0f, 10), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, i2 & 14, 0, 65532);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dmgf.b(str2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final cxj cxjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-618680254);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            cyl cylVar = dooy.c(b).n;
            ffcu ffcuVar = ffcu.a;
            b.v(2097207105);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !b.F(cxjVar))) {
                z = false;
            }
            boolean F = b.F(cylVar) | z;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new dmge(cxjVar, cylVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(ffcuVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmgf.c(cxj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(dmgh dmghVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final dmgh dmghVar2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1654640025);
        if (i3 == 0) {
            i2 = (true != b.D(dmghVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            dmghVar2 = dmghVar;
            hviVar2 = hviVar;
        } else {
            dmghVar2 = dmghVar;
            hviVar2 = hviVar;
            e(dmghVar2, hviVar2, dmghVar.e, hpx.d(41789123, new dmgd(dmghVar), b), b, (i2 & 14) | 24576 | (i2 & 112));
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmga
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmgh dmghVar3 = dmgh.this;
                    int i4 = i;
                    dmgf.d(dmghVar3, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dmgh dmghVar, final hvi hviVar, final ffix ffixVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffjm ffjmVar2;
        char c;
        hvi c2;
        hfd hfdVar2;
        hfd b = hfdVar.b(-614757749);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmghVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            ffjmVar2 = ffjmVar;
            i2 |= true != b.F(ffjmVar2) ? 8192 : 16384;
        } else {
            ffjmVar2 = ffjmVar;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            eqd eqdVar = gft.c(b).e;
            b.v(696162440);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hhy(0);
                hfmVar.ad(R);
            }
            final hjz hjzVar = (hjz) R;
            hfmVar.Z();
            b.v(696164040);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new hhy(0);
                hfmVar.ad(R2);
            }
            final hjz hjzVar2 = (hjz) R2;
            hfmVar.Z();
            b.v(696167210);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new ffji() { // from class: dmfx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        kaf kafVar = (kaf) obj;
                        hjz.this.i((int) (kafVar.a >> 32));
                        hjzVar2.i((int) (kafVar.a & 4294967295L));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hvi a = iqd.a(hviVar, (ffji) R3);
            int c3 = hjzVar.c();
            int c4 = hjzVar2.c();
            b.v(267150010);
            b.v(-241338672);
            b.v(546404375);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                c = 0;
                hic hicVar = new hic(cxk.a(3.1415927f), hla.a);
                hfmVar.ad(hicVar);
                R4 = hicVar;
            } else {
                c = 0;
            }
            hho hhoVar = (hho) R4;
            hfmVar.Z();
            b.v(546406243);
            if (dmghVar.d) {
                c(g(hhoVar), b, 8);
            }
            hfmVar.Z();
            ibw[] ibwVarArr = new ibw[2];
            ibwVarArr[c] = new ibw(dmyh.a(dooy.a(b).t, b));
            ibwVarArr[1] = new ibw(dmyh.a(dooy.a(b).u, b));
            ibq b2 = ibp.b(ffdx.g(ibwVarArr), f(((Number) g(hhoVar).d()).floatValue(), c3, c4), f(((Number) g(hhoVar).d()).floatValue() + 3.1415927f, c3, c4), 8);
            hfmVar.Z();
            hfmVar.Z();
            hvi e = ebs.e(dee.b(a, b2, eqdVar, 0.0f, 4), 40.0f);
            b.v(696174205);
            Object R5 = hfmVar.R();
            if (R5 == hfc.a) {
                R5 = new ffji() { // from class: dmfy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.q(jkvVar, 0);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            c2 = jjs.c(e, false, (ffji) R5);
            long j = ibw.g;
            b.v(-834675555);
            b.v(472917925);
            long j2 = dooy.a(b).A;
            hfmVar.Z();
            hfmVar.Z();
            hfdVar2 = b;
            gpa.e(ffixVar, c2, false, eqdVar, j, j2, 0.0f, null, null, ffjmVar2, hfdVar2, 964);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmfz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmgh dmghVar2 = dmgh.this;
                    hvi hviVar2 = hviVar;
                    ffix ffixVar2 = ffixVar;
                    dmgf.e(dmghVar2, hviVar2, ffixVar2, ffjmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final long f(float f, int i, int i2) {
        double d = f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = i;
        return (Float.floatToRawIntBits((r6 * sin) + (i2 / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits((cos * (i / 4)) + (f2 / 2.0f)) << 32);
    }

    private static final cxj g(hho hhoVar) {
        return (cxj) hhoVar.a();
    }
}
