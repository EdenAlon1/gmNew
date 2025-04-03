package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyk {
    public static final hvi a(hvi hviVar, final dji djiVar) {
        hviVar.getClass();
        djiVar.getClass();
        return hviVar.a(hxs.c(icf.a(hvi.e, new ffji() { // from class: dmyi
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                idd iddVar = (idd) obj;
                iddVar.getClass();
                iddVar.a(0.99f);
                return ffcu.a;
            }
        }), new ffji() { // from class: dmyj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ifo ifoVar = (ifo) obj;
                ifoVar.getClass();
                ifoVar.p();
                List g = ffdx.g(new ibw(ibw.a), new ibw(ibw.g));
                long b = ifoVar.b() & 4294967295L;
                dji djiVar2 = dji.this;
                float intBitsToFloat = Float.intBitsToFloat((int) b) - djiVar2.b();
                float c = djiVar2.c();
                float b2 = djiVar2.b() - djiVar2.c();
                float min = Math.min(ifoVar.em(48.0f), b2 + b2);
                if (min != 0.0f) {
                    float f = intBitsToFloat + c;
                    ifq.i(ifoVar, ibp.d(g, f - min, f, 8), 0L, 0L, 0.0f, null, 6, 62);
                }
                return ffcu.a;
            }
        }));
    }
}
