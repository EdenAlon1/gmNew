package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctai implements csza {
    private final cszl a;
    private final csyy b;

    public ctai(cszl cszlVar, csyy csyyVar) {
        this.a = cszlVar;
        this.b = csyyVar;
    }

    @Override // defpackage.csza
    public final double a() {
        return ((Double) cszt.u.e()).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        return this.a.b(this.b.e(new emwl() { // from class: csyx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csyl csylVar = ((csym) obj).e;
                if (csylVar == null) {
                    csylVar = csyl.a;
                }
                return Long.valueOf(csylVar.c);
            }
        }));
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        return (String) cszt.t.e();
    }
}
