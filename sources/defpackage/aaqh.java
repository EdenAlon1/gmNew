package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqh {
    public static final void a(final aaqe aaqeVar, final boolean z, final dntj dntjVar, final cxj cxjVar, hfd hfdVar, final int i) {
        hvi d;
        cxj cxjVar2 = cxjVar;
        dntjVar.getClass();
        cxjVar2.getClass();
        int i2 = i & 6;
        hfd b = hfdVar.b(-1580521517);
        int i3 = i2 == 0 ? (true != b.D(aaqeVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.D(dntjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? b.D(cxjVar2) : b.F(cxjVar2)) ? 1024 : 2048;
        }
        int i4 = i3;
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i6 = ist.a;
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
            b.v(-464475449);
            for (zsn zsnVar : aaqeVar.a) {
                dnrv.c(zsnVar.a, null, z, cxjVar2, dntjVar, hpx.d(-534894831, new aaqg(zsnVar), b), b, (57344 & (i4 << 6)) | ((i4 << 3) & 896) | 200704 | (i4 & 7168), 2);
                cxjVar2 = cxjVar;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aaqf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aaqe aaqeVar2 = aaqe.this;
                    boolean z2 = z;
                    dntj dntjVar2 = dntjVar;
                    aaqh.a(aaqeVar2, z2, dntjVar2, cxjVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
