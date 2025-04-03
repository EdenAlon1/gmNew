package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctad implements csza {
    private final cszl a;
    private final csyy b;

    public ctad(cszl cszlVar, csyy csyyVar) {
        cszlVar.getClass();
        csyyVar.getClass();
        this.a = cszlVar;
        this.b = csyyVar;
    }

    @Override // defpackage.csza
    public final double a() {
        Object e = cszt.y.e();
        e.getClass();
        return ((Number) e).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        elfl e = this.b.e(new emwl() { // from class: csyt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csyj csyjVar = ((csym) obj).f;
                if (csyjVar == null) {
                    csyjVar = csyj.a;
                }
                eyja eyjaVar = csyjVar.c;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                return eykj.d(eyjaVar);
            }
        });
        Object e2 = cszt.z.e();
        e2.getClass();
        final Duration ofDays = Duration.ofDays(((Number) e2).longValue());
        final cszl cszlVar = this.a;
        return e.h(new emwl() { // from class: cszk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(cszl.this.c.f().minus(ofDays).isBefore((Instant) obj));
            }
        }, cszlVar.g);
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.HAPPINESS_TRACKING_MODE_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        Object e = cszt.x.e();
        e.getClass();
        return (String) e;
    }
}
