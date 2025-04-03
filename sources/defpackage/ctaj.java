package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctaj implements csza {
    private final cszl a;
    private final csyy b;

    public ctaj(cszl cszlVar, csyy csyyVar) {
        this.a = cszlVar;
        this.b = csyyVar;
    }

    @Override // defpackage.csza
    public final double a() {
        return ((Double) cszt.j.e()).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        return this.a.b(this.b.e(new emwl() { // from class: csyv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csyh csyhVar = ((csym) obj).d;
                if (csyhVar == null) {
                    csyhVar = csyh.a;
                }
                return Long.valueOf(csyhVar.c);
            }
        }));
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        return (String) cszt.i.e();
    }
}
