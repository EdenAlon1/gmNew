package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctaa implements csza {
    private final cszl a;
    private final csyy b;

    public ctaa(cszl cszlVar, csyy csyyVar) {
        this.a = cszlVar;
        this.b = csyyVar;
    }

    @Override // defpackage.csza
    public final double a() {
        return ((Double) cszt.h.e()).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        return this.a.b(this.b.e(new emwl() { // from class: csyr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csyf csyfVar = ((csym) obj).c;
                if (csyfVar == null) {
                    csyfVar = csyf.a;
                }
                return Long.valueOf(csyfVar.c);
            }
        }));
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        return (String) cszt.g.e();
    }
}
