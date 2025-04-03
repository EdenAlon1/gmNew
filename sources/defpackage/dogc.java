package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogc {
    public static final void a(final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-43139658);
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
            hve hveVar = hvi.e;
            hfdVar2 = b;
            dwjt.b(str, z ? ebs.y(hvi.e) : ebs.d(hvi.e, 1.0f), gft.a(b).s, 0L, null, null, 0L, null, 0L, 2, false, true != z ? 1 : 4, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 48, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dofz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dogc.a(str2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        str2.getClass();
        hfd b = hfdVar.b(-2119024079);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(str2) ? 16 : 32;
        }
        int i4 = i2 & 4;
        boolean z2 = i4 == 0;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.E(z) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i5 = i3 >> 3;
            z &= z2;
            hve hveVar = hvi.e;
            hvi u = z ? ebs.u(hvi.e, 40.0f, 0.0f, 2) : ebs.e(hvi.e, 40.0f);
            dxj dxjVar = dxu.e;
            int i6 = huo.a;
            ipn a = dyo.a(dxjVar, hum.j, b, 6);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, u);
            int i7 = ist.a;
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
            int i8 = i5 & 112;
            hlc.b(b, b2, iss.c);
            b.v(-997502879);
            if (str != null) {
                c(str, z, b, (i3 & 14) | i8);
            }
            hfmVar.Z();
            a(str2, z, b, i5 & 126);
            b.n();
        }
        final boolean z3 = z;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dogb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    String str4 = str2;
                    dogc.b(str3, str4, z3, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-849233072);
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
            hve hveVar = hvi.e;
            hfdVar2 = b;
            dwjt.b(str, z ? hvi.e : ebs.d(hvi.e, 1.0f), gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).n, hfdVar2, i2 & 14, 3120, 55288);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doga
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dogc.c(str2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
