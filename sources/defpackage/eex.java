package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eex extends ffkk implements ffji {
    final /* synthetic */ eey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eex(eey eeyVar) {
        super(1);
        this.a = eeyVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        eeh eehVar;
        float f = -((Number) obj).floatValue();
        eey eeyVar = this.a;
        if ((f >= 0.0f || eeyVar.h()) && (f <= 0.0f || eeyVar.g())) {
            if (Math.abs(eeyVar.f) > 0.5f) {
                dwv.d("entered drag with non-zero pending scroll");
            }
            float f2 = eeyVar.f + f;
            eeyVar.f = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = eeyVar.f;
                int round = Math.round(f3);
                eeh l = ((eeh) eeyVar.e.a()).l(round, !eeyVar.b);
                if (l != null && (eehVar = eeyVar.c) != null) {
                    eeh l2 = eehVar.l(round, true);
                    if (l2 != null) {
                        eeyVar.c = l2;
                    } else {
                        l = null;
                    }
                }
                if (l != null) {
                    eeyVar.k(l, eeyVar.b, true);
                    elq.b(eeyVar.o);
                    eeyVar.l(f3 - eeyVar.f, l);
                } else {
                    iqn iqnVar = eeyVar.g;
                    if (iqnVar != null) {
                        iqnVar.h();
                    }
                    eeyVar.l(f3 - eeyVar.f, eeyVar.d());
                }
            }
            if (Math.abs(eeyVar.f) > 0.5f) {
                f -= eeyVar.f;
                eeyVar.f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        return Float.valueOf(-f);
    }
}
