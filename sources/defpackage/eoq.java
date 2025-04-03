package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoq extends ffkk implements ffji {
    final /* synthetic */ eot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoq(eot eotVar) {
        super(1);
        this.a = eotVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        eob eobVar;
        float floatValue = ((Number) obj).floatValue();
        eot eotVar = this.a;
        long a = eoe.a(eotVar);
        float f = eotVar.j + floatValue;
        long d = ffln.d(f);
        eotVar.j = f - d;
        if (Math.abs(floatValue) >= 1.0E-4f) {
            long j = a + d;
            long l = ffmk.l(j, eotVar.i, eotVar.h);
            long j2 = l - a;
            float f2 = j2;
            eotVar.k = f2;
            if (Math.abs(j2) != 0) {
                eotVar.y.b(Boolean.valueOf(f2 > 0.0f));
                eotVar.z.b(Boolean.valueOf(f2 < 0.0f));
            }
            int i = (int) j2;
            int i2 = -i;
            eob c = ((eob) eotVar.n.a()).c(i2);
            if (c != null && (eobVar = eotVar.d) != null) {
                eob c2 = eobVar.c(i2);
                if (c2 != null) {
                    eotVar.d = c2;
                } else {
                    c = null;
                }
            }
            if (c != null) {
                eotVar.s(c, eotVar.c, true);
                elq.b(eotVar.w);
                eotVar.m++;
            } else {
                eod eodVar = eotVar.e;
                eodVar.c(eodVar.a() + (eodVar.a.l() != 0 ? i / eodVar.a.l() : 0.0f));
                iqn p = eotVar.p();
                if (p != null) {
                    p.h();
                }
                eotVar.l++;
            }
            floatValue = (j != l ? Long.valueOf(j2) : Float.valueOf(floatValue)).floatValue();
        }
        return Float.valueOf(floatValue);
    }
}
