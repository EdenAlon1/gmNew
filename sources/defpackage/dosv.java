package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosv {
    public static final void a(final dorc dorcVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        ffcu ffcuVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(943301237);
        if (i3 == 0) {
            i2 = (true != b.D(dorcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(570187590);
            if (dorcVar == null) {
                ffcuVar = null;
            } else {
                dorb.c(dorcVar, null, 0L, 0L, 0L, ffjmVar, b, (i4 << 12) & 458752);
                ffcuVar = ffcu.a;
            }
            ((hfm) b).Z();
            if (ffcuVar == null) {
                ffjmVar.a(b, Integer.valueOf((i4 >> 3) & 14));
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dosm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dorc dorcVar2 = dorc.this;
                    int i5 = i;
                    dosv.a(dorcVar2, ffjmVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dosl doslVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hziVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1083361201);
        if (i3 == 0) {
            i2 = (true != b.D(doslVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hziVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (doslVar instanceof dosk) {
            b.v(-943809344);
            e((dosk) doslVar, b, 0);
            ((hfm) b).Z();
        } else if (doslVar instanceof dosi) {
            b.v(-943807151);
            c((dosi) doslVar, hziVar, b, i2 & 112);
            ((hfm) b).Z();
        } else {
            if (!(doslVar instanceof dosf)) {
                b.v(-943810888);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(806828505);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doss
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dosl doslVar2 = dosl.this;
                    int i4 = i;
                    dosv.b(doslVar2, hziVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dosi dosiVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        jpo jpoVar;
        hfd hfdVar2;
        String str;
        int i3 = i & 6;
        hfd b = hfdVar.b(738665632);
        if (i3 == 0) {
            i2 = (true != b.D(dosiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hziVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            long j = gft.a(b).q;
            b.v(-173926896);
            boolean C = b.C(j);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (C || R == hfc.a) {
                R = new hic(new idl(j), hla.a);
                hfmVar.ad(R);
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            String str2 = dosiVar.a;
            b.v(-173923990);
            boolean D = b.D(str2);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                hic hicVar = new hic(dosiVar.a, hla.a);
                hfmVar.ad(hicVar);
                R2 = hicVar;
            }
            final hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            final hyr hyrVar = (hyr) b.e(jdr.f);
            if (dosiVar.c) {
                b.v(-1096513332);
                jpoVar = gft.d(b).k;
                hfmVar.Z();
            } else {
                b.v(-1096458741);
                jpoVar = dooy.d(b).f;
                hfmVar.Z();
            }
            jpo jpoVar2 = jpoVar;
            hvi a = jfw.a(hzk.a(hvi.e, hziVar), "search_box_text_field_test_tag");
            idl idlVar = (idl) hhoVar.a();
            euw euwVar = new euw(0, null, 0, 3, 118);
            b.v(-173904708);
            boolean z = (i2 & 14) == 4;
            boolean F = b.F(hyrVar) | z;
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new ffji() { // from class: dosn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((euu) obj).getClass();
                        dosi.this.e.invoke();
                        hyrVar.a(false);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            euv euvVar = new euv(null, null, (ffji) R3, null, 47);
            jpo y = jpo.y(jpoVar2, gft.a(b).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            String f = f(hhoVar2);
            b.v(-173899269);
            boolean D2 = z | b.D(hhoVar2);
            Object R4 = hfmVar.R();
            if (D2 || R4 == hfc.a) {
                R4 = new ffji() { // from class: doso
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        String str3 = (String) obj;
                        str3.getClass();
                        hhoVar2.b(str3);
                        dosi.this.d.invoke(str3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            eri.d(f, (ffji) R4, a, false, y, euwVar, euvVar, true, 0, 0, null, null, null, idlVar, null, b, 102236160, 0, 48664);
            if (f(hhoVar2).length() != 0 || ((str = dosiVar.b) != null && str.length() <= 0)) {
                hfdVar2 = b;
            } else {
                String str3 = dosiVar.b;
                b.v(-173890834);
                if (str3 == null) {
                    str3 = jii.a(R.string.top_app_bar_default_hint_text, b);
                }
                hfmVar.Z();
                dwjt.b(str3, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jpoVar2, b, 0, 3120, 55290);
                hfdVar2 = b;
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dosp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dosi dosiVar2 = dosi.this;
                    int i4 = i;
                    dosv.c(dosiVar2, hziVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1434485277);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).l, hfdVar2, i2 & 14, 3120, 55290);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dosr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dosv.d(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dosk doskVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-850010560);
        if (i3 == 0) {
            i2 = (true != b.D(doskVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            boolean z = doskVar.d;
            b.v(-1911301939);
            boolean E = b.E(z);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (E || R == hfc.a) {
                R = cxk.a(0.0f);
                hfmVar.ad(R);
            }
            cxj cxjVar = (cxj) R;
            hfmVar.Z();
            a(doskVar.e, hpx.d(-1404530718, new dost(doskVar, cxjVar, doskVar.c), b), b, 48);
            cyl cylVar = dooy.c(b).m;
            Boolean valueOf = Boolean.valueOf(doskVar.d);
            b.v(-1911265477);
            boolean F = b.F(cxjVar) | ((i2 & 14) == 4) | b.F(cylVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new dosu(doskVar, cxjVar, cylVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R2, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dosq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dosv.e(dosk.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final String f(hho hhoVar) {
        return (String) hhoVar.a();
    }
}
