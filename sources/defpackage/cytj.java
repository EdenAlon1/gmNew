package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytj {
    public static final void a(final dmzz dmzzVar, final String str, final ffix ffixVar, final cytl cytlVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        long j;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1312829854);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 128 : 256;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(cytlVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            boolean z = cytlVar.a;
            b.v(1373523996);
            hvi a2 = hxo.a(ebs.k(hvi.e, z ? 56.0f : 48.0f), eqm.a);
            if (z) {
                b.v(1373877148);
                j = gft.a(b).c;
                ((hfm) b).Z();
            } else {
                b.v(1373954431);
                j = gft.a(b).D;
                ((hfm) b).Z();
            }
            a = dee.a(a2, j, idb.a);
            dwhl.b(ffixVar2, a.a(jfw.a(hvi.e, str)), false, null, null, hpx.d(470090780, new cyti(dmzzVar, str, z), b), b, ((i2 >> 6) & 14) | 1572864, 60);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cytg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    String str2 = str;
                    ffix ffixVar3 = ffixVar;
                    cytj.a(dmzzVar2, str2, ffixVar3, cytlVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final cytm cytmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1787884150);
        if (i3 == 0) {
            i2 = (true != b.D(cytmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dxn dxnVar = new dxn(24.0f, true, dxr.a);
            hvi j = eba.j(hvi.e, 0.0f, true != cytmVar.b.a ? 8.0f : 16.0f, 0.0f, 16.0f, 5);
            int i4 = huo.a;
            ipn a = ebm.a(dxnVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
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
            b.v(860686088);
            enqv it = cytmVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                dlsr dlsrVar = (dlsr) it.next();
                dmzz dmzzVar = dlsrVar.b;
                dmzzVar.getClass();
                a(dmzzVar, dlsrVar.a, dlsrVar.k, cytmVar.b, b, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyth
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    cytj.b(cytm.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
