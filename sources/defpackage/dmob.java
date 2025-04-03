package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmob {
    public static final void a(final dyh dyhVar, final dmof dmofVar, final dmnh dmnhVar, final hho hhoVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1750383547);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmofVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmnhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hhoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= true != b.E(z2) ? 8192 : 16384;
        } else {
            z2 = z;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else if (dmnhVar.h.c) {
            b.v(1576195905);
            final doos c = dooy.c(b);
            hvi b2 = dyhVar.b(hvi.e);
            Boolean valueOf = Boolean.valueOf(z2);
            b.v(-87697169);
            boolean D = b.D(c);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dmnp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((cqw) obj).getClass();
                        doos doosVar = doos.this;
                        dooq dooqVar = doosVar.q;
                        cue n = ctt.n(new dbu(BasePaymentResult.ERROR_REQUEST_FAILED, 100, doosVar.r.f), 0.0f, 0L, 6);
                        dooq dooqVar2 = doosVar.q;
                        return new csi(n, ctt.o(cxu.c(100, 0, doosVar.r.b, 2), 0.0f, 0L, 6));
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            cqn.a(valueOf, b2, (ffji) R, null, "combined_icon_animation", null, hpx.d(-1225029479, new dmny(dyhVar, dmofVar, dmnhVar, hhoVar), b), b, ((i2 >> 12) & 14) | 1597440, 40);
            hfmVar.Z();
        } else {
            b.v(1577066726);
            int i4 = i2 & 14;
            int i5 = i2 >> 9;
            int i6 = i2 << 3;
            b(dyhVar, z2, dmofVar, dmnhVar, hhoVar, false, b, (i6 & 57344) | i4 | 196608 | (i5 & 112) | (i6 & 896) | (i6 & 7168));
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmnq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    dmof dmofVar2 = dmofVar;
                    dmnh dmnhVar2 = dmnhVar;
                    hho hhoVar2 = hhoVar;
                    dmob.a(dyhVar2, dmofVar2, dmnhVar2, hhoVar2, z, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dyh dyhVar, final boolean z, final dmof dmofVar, final dmnh dmnhVar, final hho hhoVar, final boolean z2, hfd hfdVar, final int i) {
        int i2;
        dmsk dmskVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(1172847718);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmofVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(dmnhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(hhoVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            hvi b2 = dyhVar.b(hvi.e);
            int i4 = huo.a;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, b2);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
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
            hlc.b(b, b3, iss.c);
            if (z) {
                b.v(1607002890);
                e(dmofVar, b, (i2 >> 6) & 14);
                hfmVar.Z();
            } else {
                b.v(1607057419);
                hvi hviVar = hvi.e;
                if (!z2 && (dmskVar = dmnhVar.b) != null) {
                    hviVar = dmsi.a(hviVar, hhoVar, dmskVar, dmnhVar.i);
                }
                hvi hviVar2 = hviVar;
                dmsk dmskVar2 = dmnhVar.b;
                f(dmskVar2 != null ? dmskVar2.b : true, dmnhVar.a == dmnc.f, hviVar2, dmnhVar.h.a, b, 0);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmnt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    boolean z3 = z;
                    dmof dmofVar2 = dmofVar;
                    dmnh dmnhVar2 = dmnhVar;
                    hho hhoVar2 = hhoVar;
                    dmob.b(dyhVar2, z3, dmofVar2, dmnhVar2, hhoVar2, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dmof dmofVar, boolean z, boolean z2, hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-81076941);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmofVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        int i6 = i2 & 4;
        boolean z4 = i6 == 0;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.E(z2) ? 128 : 256;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            z &= z3;
            z2 &= z4;
            if (i7 != 0) {
                hviVar = hvi.e;
            }
            g(dmofVar.b, dmofVar.c, dmofVar.f, jfw.a(hviVar, "Compose:Draft:Send"), hpx.d(-1105820683, new dmnz(z, dmofVar, z2), b), b, 24576);
        }
        final boolean z5 = z;
        final boolean z6 = z2;
        final hvi hviVar2 = hviVar;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmno
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmof dmofVar2 = dmof.this;
                    boolean z7 = z5;
                    boolean z8 = z6;
                    dmob.c(dmofVar2, z7, z8, hviVar2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dmms dmmsVar, final dmnh dmnhVar, final hho hhoVar, hfd hfdVar, final int i) {
        int i2;
        hhoVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-2081205287);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmnhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hhoVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hvi k = ebs.k(jfw.a(hvi.e, "Compose:Draft:Send"), dmkx.a(b));
            boolean i4 = (!dmmsVar.d.g.a || dmmsVar.a() || dmnhVar.f) ? dmmsVar.d.f : dmmi.i(dmnc.f, dmnhVar);
            dmof dmofVar = dmmsVar.d;
            b.v(-561217683);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new ffix() { // from class: dmnw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmms dmmsVar2 = dmms.this;
                        if (!dmmsVar2.d.g.a || dmmsVar2.a()) {
                            dmmsVar2.d.b.invoke();
                        } else {
                            dmnhVar.i.invoke(dmnc.f);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            ffix ffixVar = dmofVar.c;
            hfmVar.Z();
            g((ffix) R, ffixVar, i4, k, hpx.d(1852108503, new dmoa(dmnhVar, dmmsVar, hhoVar), b), b, 24576);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmnx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmnh dmnhVar2 = dmnhVar;
                    int i5 = i;
                    dmob.d(dmmsVar2, dmnhVar2, hhoVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dmof dmofVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        long j;
        long j2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2025191757);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != b.D(dmofVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dmoe dmoeVar = dmofVar.g;
            hvi c = eau.c(hvi.e, 1.0f, 0.0f, 2);
            if (dmofVar.e != null) {
                c = c.a(eau.c(hvi.e, 0.0f, -4.0f, 1));
            }
            hvi a = dmzy.a(c, (kah) b.e(jdr.j));
            igq a2 = dnaa.a(dmofVar.a, b);
            String str = dmofVar.d;
            b.v(818351902);
            if (str == null) {
                str = jii.a(R.string.compose_icon_send_content_description, b);
            }
            String str2 = str;
            boolean z2 = dmoeVar.b;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            if (dmofVar.f) {
                b.v(-400767371);
                if (z2) {
                    b.v(-400729148);
                    j = gft.a(b).b;
                    hfmVar.Z();
                } else {
                    b.v(-400666714);
                    long j3 = gft.a(b).a;
                    hfmVar.Z();
                    z = false;
                    j = j3;
                }
                hfmVar.Z();
            } else {
                b.v(-400591787);
                if (z2) {
                    b.v(-400555083);
                    j = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.38f, ibw.f(gft.a(b).b));
                    hfmVar.Z();
                } else {
                    b.v(-400445963);
                    f = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.38f, ibw.f(gft.a(b).q));
                    hfmVar.Z();
                    z = false;
                    j = f;
                }
                hfmVar.Z();
            }
            dwho.a(a2, str2, a, j, b, 0, 0);
            String str3 = dmofVar.e;
            if (str3 != null) {
                hvi c2 = dlsj.c(eau.b(hvi.e, 1.0f, 10.0f));
                jpo jpoVar = dooy.d(b).e;
                if (z) {
                    b.v(-1702203451);
                    j2 = gft.a(b).b;
                    hfmVar.Z();
                } else {
                    b.v(-1702141017);
                    j2 = gft.a(b).a;
                    hfmVar.Z();
                }
                dolc.a(str3, c2, j2, null, 0, 0, jpoVar, b, 0, 56);
                b = b;
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmnu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmob.e(dmof.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final boolean z, final boolean z2, hvi hviVar, final dmrq dmrqVar, hfd hfdVar, final int i) {
        int i2;
        long j;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1176073398);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(dmrqVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            igq a = dnaa.a(dmzz.ay, b);
            String k = dmmi.k(dmnc.f, z2, b);
            if (!z) {
                b.v(-2100879145);
                j = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.38f, ibw.f(gft.a(b).q));
                ((hfm) b).Z();
            } else if (z2) {
                b.v(-2100752324);
                int ordinal = dmrqVar.ordinal();
                if (ordinal == 1) {
                    b.v(-2145972875);
                    j = gft.a(b).e;
                    ((hfm) b).Z();
                } else if (ordinal != 2) {
                    b.v(-2145968082);
                    j = gft.a(b).a;
                    ((hfm) b).Z();
                } else {
                    b.v(-2145969777);
                    j = gft.a(b).j;
                    ((hfm) b).Z();
                }
                ((hfm) b).Z();
            } else {
                b.v(-2100460831);
                int ordinal2 = dmrqVar.ordinal();
                if (ordinal2 == 1) {
                    b.v(-2145963504);
                    j = gft.a(b).b;
                    ((hfm) b).Z();
                } else if (ordinal2 != 2) {
                    b.v(-2145958121);
                    j = gft.a(b).s;
                    ((hfm) b).Z();
                } else {
                    b.v(-2145960166);
                    j = gft.a(b).m;
                    ((hfm) b).Z();
                }
                ((hfm) b).Z();
            }
            long j2 = j;
            hviVar2 = hviVar;
            dwho.a(a, k, hviVar2, j2, b, i2 & 896, 0);
        }
        hio L = b.L();
        if (L != null) {
            final hvi hviVar3 = hviVar2;
            L.d = new ffjm() { // from class: dmnv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    boolean z4 = z2;
                    hvi hviVar4 = hviVar3;
                    dmob.f(z3, z4, hviVar4, dmrqVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final ffix ffixVar, final ffix ffixVar2, final boolean z, final hvi hviVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        ffix ffixVar3;
        int i2;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1959351197);
        if (i3 == 0) {
            ffixVar3 = ffixVar;
            i2 = (true != b.F(ffixVar3) ? 2 : 4) | i;
        } else {
            ffixVar3 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b.D(hviVar2) ? 1024 : 2048;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjnVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            hvi a = hxo.a(ebs.k(gex.a(hviVar2), 40.0f), eqm.a);
            b.v(-185281147);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            dhf a2 = gkw.a(false, 20.0f, 0L, 4);
            jjj jjjVar = new jjj(0);
            b.v(-185284625);
            int i4 = i2 & 112;
            Object R2 = hfmVar.R();
            if (i4 == 32 || R2 == hfc.a) {
                R2 = new ffix() { // from class: dmnr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi f = dfb.f(a, dwnVar, a2, z, jjjVar, (ffix) R2, null, ffixVar3, 424);
            int i5 = huo.a;
            int i6 = ((i2 >> 3) & 7168) | 48;
            ipn a3 = dyc.a(hum.e, false);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
            int i7 = ist.a;
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ffjnVar.a(dyi.a, b, Integer.valueOf(((i6 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmns
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar5 = ffix.this;
                    ffix ffixVar6 = ffixVar2;
                    boolean z2 = z;
                    hvi hviVar3 = hviVar;
                    dmob.g(ffixVar5, ffixVar6, z2, hviVar3, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
