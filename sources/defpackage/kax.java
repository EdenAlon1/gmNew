package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kax extends kwi {
    final /* synthetic */ kbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kax(kbs kbsVar) {
        super(1);
        this.a = kbsVar;
    }

    @Override // defpackage.kwi
    public final kxh b(kxh kxhVar, List list) {
        return this.a.k(kxhVar);
    }

    @Override // defpackage.kwi
    public final kwh e(kwh kwhVar) {
        iwi y = this.a.v.y();
        if (y.t()) {
            long c = kab.c(iod.a(y));
            int a = kaa.a(c);
            if (a < 0) {
                a = 0;
            }
            int b = kaa.b(c);
            if (b < 0) {
                b = 0;
            }
            long g = iod.f(y).g();
            long j = g >> 32;
            long j2 = g & 4294967295L;
            long j3 = y.c;
            long c2 = kab.c(y.i((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
            int a2 = ((int) j) - kaa.a(c2);
            if (a2 < 0) {
                a2 = 0;
            }
            int b2 = ((int) j2) - kaa.b(c2);
            int i = b2 >= 0 ? b2 : 0;
            if (a != 0 || b != 0 || a2 != 0 || i != 0) {
                return new kwh(kbs.m(kwhVar.a, a, b, a2, i), kbs.m(kwhVar.b, a, b, a2, i));
            }
        }
        return kwhVar;
    }
}
