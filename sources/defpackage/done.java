package defpackage;

import androidx.compose.ui.SensitiveNodeElement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class done {
    public static final void a(final dyh dyhVar, final eyld eyldVar, final idh idhVar, hfd hfdVar, final int i) {
        final cxj cxjVar;
        Object idlVar;
        idhVar.getClass();
        int i2 = i & 6;
        hfd b = hfdVar.b(421340811);
        int i3 = i2 == 0 ? (true != b.D(dyhVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(eyldVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.D(idhVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (eyldVar.b.size() == 0) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: donb
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dyh dyhVar2 = dyh.this;
                            eyld eyldVar2 = eyldVar;
                            int i4 = i;
                            done.a(dyhVar2, eyldVar2, idhVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(1813575883);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = cxk.a(0.0f);
                hfmVar.ad(R);
            }
            cxj cxjVar2 = (cxj) R;
            hfmVar.Z();
            b.v(1813577657);
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 896) == 256;
            Object R2 = hfmVar.R();
            if ((z || z2) || R2 == hfc.a) {
                if (eyldVar.b.size() > 1) {
                    int i4 = eyldVar.e;
                    int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? 0 : 7 : 6 : 5 : 4 : 3 : 2;
                    if (i5 == 0) {
                        i5 = 1;
                    }
                    eygl<Long> eyglVar = eyldVar.b;
                    eyglVar.getClass();
                    ArrayList arrayList = new ArrayList(ffdx.n(eyglVar, 10));
                    for (Long l : eyglVar) {
                        l.getClass();
                        arrayList.add(new ibw(iby.d(l.longValue())));
                        cxjVar2 = cxjVar2;
                    }
                    cxjVar = cxjVar2;
                    int i6 = i5 - 2;
                    idlVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? ibp.a(arrayList, 0.0f, 0.0f, 14) : ibp.d(arrayList, 0.0f, 0.0f, 14) : new ido(arrayList) : ibp.c(arrayList, 0L, 0.0f, 14) : ibp.b(arrayList, 0L, 0L, 14) : ibp.a(arrayList, 0.0f, 0.0f, 14);
                } else {
                    cxjVar = cxjVar2;
                    eygl eyglVar2 = eyldVar.b;
                    eyglVar2.getClass();
                    Object K = ffdx.K(eyglVar2);
                    K.getClass();
                    idlVar = new idl(iby.d(((Number) K).longValue()));
                }
                R2 = new hic(idlVar, hla.a);
                hfmVar.ad(R2);
            } else {
                cxjVar = cxjVar2;
            }
            hho hhoVar = (hho) R2;
            hfmVar.Z();
            hvi b2 = dyhVar.b(hvi.e);
            b.v(1813588912);
            boolean F = b.F(cxjVar);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new ffji() { // from class: donc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        idd iddVar = (idd) obj;
                        iddVar.getClass();
                        iddVar.a(((Number) cxj.this.d()).floatValue());
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            ebv.a(dee.b(icf.a(b2, (ffji) R3), (ibq) hhoVar.a(), idhVar, 0.0f, 4), b);
            dmwy.a(eyldVar, cxjVar, b, ((i3 >> 3) & 14) | 64);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dond
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    eyld eyldVar2 = eyldVar;
                    int i7 = i;
                    done.a(dyhVar2, eyldVar2, idhVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dyh dyhVar, final domw domwVar, final idh idhVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        idhVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-900980643);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(domwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(idhVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.v(-2051880346);
            ibw ibwVar = null;
            if (domwVar.g() && domwVar.d()) {
                f = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.5f, ibw.f(gft.a(b).a));
                ibwVar = new ibw(f);
            }
            ((hfm) b).Z();
            if (ibwVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: domx
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dyh dyhVar2 = dyh.this;
                            domw domwVar2 = domwVar;
                            int i4 = i;
                            done.b(dyhVar2, domwVar2, idhVar, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dyc.b(dee.a(hvr.a(dyhVar.b(hvi.e), 1.0f), ibwVar.i, idhVar), b, 0);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: domy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    domw domwVar2 = domwVar;
                    int i4 = i;
                    done.b(dyhVar2, domwVar2, idhVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final domw domwVar, final long j, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        jpo g;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(765414349);
        if (i3 == 0) {
            i2 = i | (true != b.D(domwVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi e = eba.e(hvi.e, 16.0f, 8.0f);
            b.v(-941604444);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: domz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        String a = domw.this.a();
                        if (a != null) {
                            jkr.k(jkvVar, a);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(e, false, (ffji) R);
            hvi a = jfw.a(c, "message_text");
            if (domwVar.k()) {
                a = a.a(new SensitiveNodeElement());
            }
            int i5 = i2;
            String e2 = domwVar.e();
            if (domwVar.g()) {
                b.v(875399916);
                long c2 = kal.c(48);
                b.v(-987042609);
                jpo jpoVar = gft.d(b).d;
                long i6 = jpoVar.i();
                float a2 = kak.a(c2);
                kal.e(i6);
                long d = kal.d(kak.b(i6), kak.a(i6) * a2);
                float a3 = kak.a(jpoVar.g());
                kal.e(d);
                g = jpo.y(jpoVar, 0L, c2, null, null, null, null, 0L, null, 0, 0, kal.d(kak.b(d), kak.a(d) / a3), null, null, 0, 16646141);
                hfmVar.Z();
                hfmVar.Z();
            } else {
                b.v(875483895);
                g = g(domwVar, b);
                hfmVar.Z();
            }
            jpo jpoVar2 = g;
            b.v(1095246285);
            int c3 = (domwVar.g() && domwVar.h()) ? 6 : ((jpo) b.e(grl.a)).c();
            hfmVar.Z();
            hfdVar2 = b;
            dwjt.b(e2, a, j, 0L, null, null, 0L, new jyj(c3), 0L, 0, false, 0, 0, null, jpoVar2, hfdVar2, (i5 << 3) & 896, 0, 65016);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dona
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    domw domwVar2 = domw.this;
                    int i7 = i;
                    done.c(domwVar2, j, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final List d(domt domtVar, boolean z, hfd hfdVar) {
        hfdVar.v(-943650502);
        List list = z ? domtVar.d : domtVar.a;
        ((hfm) hfdVar).Z();
        return list;
    }

    public static final huo e(domw domwVar, boolean z, hfd hfdVar) {
        huo huoVar;
        hfdVar.v(-2003307792);
        if (!domwVar.h() || domwVar.i() || z) {
            int i = huo.a;
            huoVar = hum.d;
        } else {
            int i2 = huo.a;
            huoVar = hum.f;
        }
        ((hfm) hfdVar).Z();
        return huoVar;
    }

    public static final long f(domt domtVar, boolean z, hfd hfdVar) {
        hfdVar.v(-1869566015);
        long j = z ? domtVar.e : domtVar.b;
        ((hfm) hfdVar).Z();
        return j;
    }

    public static final jpo g(domw domwVar, hfd hfdVar) {
        jpo jpoVar;
        hfdVar.v(-895050133);
        if (domwVar.s()) {
            hfdVar.v(623276359);
            jpoVar = gft.d(hfdVar).d;
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(623341707);
            jpoVar = gft.d(hfdVar).j;
            ((hfm) hfdVar).Z();
        }
        jpo b = dops.b(jpoVar, hfdVar);
        ((hfm) hfdVar).Z();
        return b;
    }

    public static final float h(dofn dofnVar, doms domsVar, boolean z, boolean z2, boolean z3, hfd hfdVar, int i) {
        int em;
        int em2;
        hfdVar.v(2025504179);
        dofr dofrVar = dofnVar != null ? dofnVar.a : null;
        int i2 = i & 4;
        int i3 = i & 2;
        boolean z4 = ((i & 16) == 0) & z3;
        boolean z5 = (i2 == 0) & z;
        doms domsVar2 = i3 == 0 ? domsVar : null;
        float f = 0.0f;
        float b = dnrx.b(0.0f, z5, z4, hfdVar, 1);
        jpi a = jpj.a(hfdVar);
        if (domsVar2 instanceof dndp) {
            hfdVar.v(-1616010917);
            jlz jlzVar = jpi.a(a, "Tap to load preview", gft.d(hfdVar).i, 0, 0, 0L, 1020).b;
            ((hfm) hfdVar).Z();
            f = jlzVar.d + 32.0f;
        } else if (domsVar2 instanceof dndi) {
            hfdVar.v(-1615775906);
            jlz jlzVar2 = jpi.a(a, "Preview not available", gft.d(hfdVar).i, 0, 0, 0L, 1020).b;
            ((hfm) hfdVar).Z();
            f = jlzVar2.d;
        } else if (domsVar2 instanceof dndn) {
            hfdVar.v(-1615545638);
            ((hfm) hfdVar).Z();
            f = 36.0f;
        } else if (domsVar2 instanceof dndl) {
            hfdVar.v(-1615466991);
            ((hfm) hfdVar).Z();
            f = b;
        } else if (dofrVar == null) {
            hfdVar.v(-1615415717);
            ((hfm) hfdVar).Z();
        } else if (dofrVar instanceof dofo) {
            hfdVar.v(-1615350276);
            ((hfm) hfdVar).Z();
            f = 180.0f;
        } else {
            if (dofrVar instanceof dofp) {
                dofp dofpVar = (dofp) dofrVar;
                dofy dofyVar = dofpVar.c;
                if (dofyVar == null) {
                    hfdVar.v(-1615199492);
                    int em3 = (int) ((jzn) hfdVar.e(jdr.e)).em(b - 40.0f);
                    if (z2) {
                        hfdVar.v(-1614997806);
                        em2 = Math.min((int) ((jzn) hfdVar.e(jdr.e)).em(162.0f), em3);
                        ((hfm) hfdVar).Z();
                    } else {
                        hfdVar.v(-1614839830);
                        em2 = (int) ((jzn) hfdVar.e(jdr.e)).em(162.0f);
                        ((hfm) hfdVar).Z();
                    }
                    f = doxg.a(Math.max(jpi.a(a, dofpVar.b, gft.d(hfdVar).k, 0, 0, jzl.k(em2, em3, 0, 12), 988).b.d, jpi.a(a, dofpVar.a, gft.d(hfdVar).n, 0, 0, jzl.k(em2, em3, 0, 12), 988).b.d)) + 40.0f;
                    ((hfm) hfdVar).Z();
                } else if (dofyVar instanceof dofu) {
                    hfdVar.v(-1613891230);
                    int em4 = (int) ((jzn) hfdVar.e(jdr.e)).em(dnrx.b(0.0f, z5, z4, hfdVar, 1) - 92.0f);
                    if (z2) {
                        hfdVar.v(-1613518548);
                        em = Math.min((int) ((jzn) hfdVar.e(jdr.e)).em(162.0f), em4);
                        ((hfm) hfdVar).Z();
                    } else {
                        hfdVar.v(-1613354620);
                        em = (int) ((jzn) hfdVar.e(jdr.e)).em(162.0f);
                        ((hfm) hfdVar).Z();
                    }
                    long k = jzl.k(em, em4, 0, 12);
                    f = doxg.a(Math.max(jpi.a(a, dofpVar.b, gft.d(hfdVar).k, 0, 0, k, 988).b.d, jpi.a(a, dofpVar.a, gft.d(hfdVar).n, 0, 0, k, 988).b.d)) + 92.0f;
                    ((hfm) hfdVar).Z();
                }
            }
            hfdVar.v(-1612543908);
            ((hfm) hfdVar).Z();
            f = 170.0f;
        }
        ((hfm) hfdVar).Z();
        return f;
    }

    public static final domt i(domw domwVar, hfd hfdVar) {
        long j;
        domt domtVar;
        long j2;
        domt domtVar2;
        long j3;
        hfdVar.v(223921369);
        hfdVar.v(-1822019192);
        if (domwVar.h() && domwVar.j()) {
            hfdVar.v(-1444246850);
            hfdVar.v(-1637642256);
            domtVar2 = new domt(ffdx.g(new ibw(dooy.a(hfdVar).b.g), new ibw(dooy.a(hfdVar).b.h)), dooy.a(hfdVar).b.i, dooy.a(hfdVar).b.i, ffdx.b(new ibw(dooy.a(hfdVar).b.j)), dooy.a(hfdVar).b.k, dooy.a(hfdVar).b.k);
            hfm hfmVar = (hfm) hfdVar;
            hfmVar.Z();
            hfmVar.Z();
        } else {
            if (domwVar.h()) {
                hfdVar.v(-1444245248);
                hfdVar.v(1737379357);
                if (dooy.g(hfdVar)) {
                    hfdVar.v(-409092675);
                    j3 = dmyl.a(dooy.e(hfdVar));
                    ((hfm) hfdVar).Z();
                } else {
                    hfdVar.v(-409039727);
                    j3 = dooy.a(hfdVar).b.c;
                    ((hfm) hfdVar).Z();
                }
                domtVar = new domt(ffdx.b(new ibw(j3)), dooy.a(hfdVar).b.d, dooy.a(hfdVar).b.d, ffdx.b(new ibw(dooy.a(hfdVar).b.j)), dooy.a(hfdVar).b.k, dooy.a(hfdVar).b.k);
                hfm hfmVar2 = (hfm) hfdVar;
                hfmVar2.Z();
                hfmVar2.Z();
            } else if (domwVar.h() || !domwVar.j()) {
                hfdVar.v(-1444241696);
                hfdVar.v(-1869514793);
                if (dooy.g(hfdVar)) {
                    hfdVar.v(-1845224571);
                    j = dooy.e(hfdVar).Q;
                    ((hfm) hfdVar).Z();
                } else {
                    hfdVar.v(-1845173545);
                    j = dooy.a(hfdVar).b.a;
                    ((hfm) hfdVar).Z();
                }
                domtVar = new domt(ffdx.b(new ibw(j)), dooy.a(hfdVar).b.b, gft.a(hfdVar).a, ffdx.b(new ibw(dooy.a(hfdVar).b.j)), dooy.a(hfdVar).b.k, dooy.a(hfdVar).b.k);
                hfm hfmVar3 = (hfm) hfdVar;
                hfmVar3.Z();
                hfmVar3.Z();
            } else {
                hfdVar.v(-1444243106);
                hfdVar.v(-1011228630);
                if (dooy.g(hfdVar)) {
                    hfdVar.v(261960882);
                    j2 = dooy.e(hfdVar).Q;
                    ((hfm) hfdVar).Z();
                } else {
                    hfdVar.v(262011908);
                    j2 = dooy.a(hfdVar).b.e;
                    ((hfm) hfdVar).Z();
                }
                domtVar = new domt(ffdx.b(new ibw(j2)), dooy.a(hfdVar).b.f, gft.a(hfdVar).a, ffdx.b(new ibw(dooy.a(hfdVar).b.j)), dooy.a(hfdVar).b.k, dooy.a(hfdVar).b.k);
                hfm hfmVar4 = (hfm) hfdVar;
                hfmVar4.Z();
                hfmVar4.Z();
            }
            domtVar2 = domtVar;
        }
        hfm hfmVar5 = (hfm) hfdVar;
        hfmVar5.Z();
        hfmVar5.Z();
        return domtVar2;
    }
}
