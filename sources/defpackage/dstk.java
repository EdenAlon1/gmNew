package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstk {
    public static final void a(final hho hhoVar, final eot eotVar, final List list, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar2;
        eotVar.getClass();
        list.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-597989557);
        if (i3 == 0) {
            i2 = (true != b.D(hhoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(eotVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(list) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 1024 : 2048;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.v(455942718);
            boolean F = ((i2 & 112) == 32) | b.F(list);
            boolean z = (i2 & 7168) == 2048;
            boolean z2 = (i2 & 14) == 4;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z2 | F | z) || R == hfc.a) {
                dstj dstjVar = new dstj(eotVar, list, ffixVar2, hhoVar, null);
                hfmVar.ad(dstjVar);
                R = dstjVar;
            }
            hfmVar.Z();
            hgs.f(eotVar, list, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dstf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hho hhoVar2 = hho.this;
                    eot eotVar2 = eotVar;
                    List list2 = list;
                    dstk.a(hhoVar2, eotVar2, list2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
