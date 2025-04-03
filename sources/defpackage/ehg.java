package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehg extends ffkk implements ffji {
    final /* synthetic */ ehh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehg(ehh ehhVar) {
        super(1);
        this.a = ehhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        egm egmVar;
        float f = -((Number) obj).floatValue();
        ehh ehhVar = this.a;
        if ((f >= 0.0f || ehhVar.h()) && (f <= 0.0f || ehhVar.g())) {
            if (Math.abs(ehhVar.f) > 0.5f) {
                dwv.d("entered drag with non-zero pending scroll");
            }
            float f2 = ehhVar.f + f;
            ehhVar.f = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = ehhVar.f;
                int b = ffln.b(f3);
                egm l = ((egm) ehhVar.e.a()).l(b, !ehhVar.b);
                if (l != null && (egmVar = ehhVar.c) != null) {
                    egm l2 = egmVar.l(b, true);
                    if (l2 != null) {
                        ehhVar.c = l2;
                    } else {
                        l = null;
                    }
                }
                if (l != null) {
                    ehhVar.f(l, ehhVar.b, true);
                    elq.b(ehhVar.n);
                    ehhVar.j(f3 - ehhVar.f, l);
                } else {
                    iqn iqnVar = ehhVar.g;
                    if (iqnVar != null) {
                        iqnVar.h();
                    }
                    ehhVar.j(f3 - ehhVar.f, ehhVar.d());
                }
            }
            if (Math.abs(ehhVar.f) > 0.5f) {
                f -= ehhVar.f;
                ehhVar.f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        return Float.valueOf(-f);
    }
}
