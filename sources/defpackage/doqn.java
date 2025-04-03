package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqn {
    public static final void a(hvi hviVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1814479188);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            ffixVar2 = ffixVar;
        } else {
            hviVar2 = hviVar;
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, hviVar2, false, null, null, doqf.a, b, ((i2 >> 3) & 14) | 1572864 | ((i2 << 3) & 112), 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i4 = i;
                    doqn.a(hviVar3, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmzz dmzzVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-879152371);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwho.a(dnaa.a(dmzzVar, b), null, ebs.h(eba.j(hvi.e, 0.0f, 0.0f, 10.0f, 0.0f, 11), 18.0f), gft.a(b).s, b, 384, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    doqn.b(dmzz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2042151454);
        if (i3 == 0) {
            i2 = (true != b.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            gpa.c(ebs.u(hvi.e, 36.0f, 0.0f, 2), gft.c(b).c, gft.a(b).I, 0L, 0.0f, 0.0f, null, hpx.d(-1123463235, new doqm(ffjnVar), b), b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    doqn.c(ffjn.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final ebq ebqVar, final String str, final List list, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-403573901);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(list) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi a = ebqVar.a(hvi.e, 1.0f, false);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i5 = ist.a;
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
            hvi hviVar = hvi.e;
            if (z) {
                hviVar = eba.j(hviVar, 0.0f, 0.0f, 36.0f, 0.0f, 11);
            }
            hfdVar2 = b;
            dlur.e(new dluu(str, list, 4), eba.i(hviVar, 0.0f, 8.0f, 1), gft.a(b).s, gft.d(b).l, null, 0L, null, false, null, hfdVar2, 0, 496);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    String str2 = str;
                    List list2 = list;
                    doqn.d(ebqVar2, str2, list2, z, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final doqo doqoVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        doqoVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(395308051);
        if (i3 == 0) {
            i2 = (true != b.D(doqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
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
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            c(hpx.d(-602027282, new doql(doqoVar), b), b, 6);
            ffix ffixVar2 = doqoVar.d;
            b.v(-266029683);
            if (ffixVar2 != null) {
                a(dyiVar.a(hvi.e, hum.f), ffixVar2, b, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doqj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doqo doqoVar2 = doqo.this;
                    int i6 = i;
                    doqn.e(doqoVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
