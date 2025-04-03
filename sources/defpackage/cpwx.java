package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwx implements cpvq {
    private static final cskc a = cskc.g("Bugle", "WorkQueueReverseTelephonySyncScheduler");
    private final cevh b;
    private final ffbr c;
    private final cqoh d;
    private final ffbr e;

    public cpwx(cevh cevhVar, final comy comyVar, cqoh cqohVar, ffbr ffbrVar) {
        this.b = cevhVar;
        this.c = new ffbr() { // from class: cpww
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                comu c = comv.c();
                c.d(comb.REVERSE_TELEPHONY_SYNC_STATE);
                c.f(cpvu.a);
                return comy.this.a(c.a());
            }
        };
        this.d = cqohVar;
        this.e = ffbrVar;
    }

    @Override // defpackage.cpvq
    public final void a() {
        a.p("Scheduling reverse sync immediately");
        this.b.a(ceyr.g("ReverseTelephonySync", cpwe.a));
    }

    @Override // defpackage.cpvq
    public final void b(Duration duration) {
        csjb c = a.c();
        c.I("Scheduling reverse sync with delay");
        c.A("initialDelay", duration);
        c.r();
        cpwd cpwdVar = (cpwd) cpwe.a.createBuilder();
        eyja d = eykm.d(this.d.f().toEpochMilli());
        cpwdVar.copyOnWrite();
        cpwe cpweVar = (cpwe) cpwdVar.instance;
        d.getClass();
        cpweVar.c = d;
        cpweVar.b |= 1;
        eyev d2 = eyki.d(duration.toMillis());
        cpwdVar.copyOnWrite();
        cpwe cpweVar2 = (cpwe) cpwdVar.instance;
        d2.getClass();
        cpweVar2.d = d2;
        cpweVar2.b |= 2;
        this.b.a(ceyr.g("ReverseTelephonySync", cpwdVar.build()));
    }

    @Override // defpackage.cpvq
    public final boolean c() {
        return ((cpvw) this.e.b()).a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [comc, java.lang.Object] */
    @Override // defpackage.cpvq
    public final boolean d() {
        try {
            cpvt cpvtVar = ((cpvu) this.c.b().l()).c;
            if (cpvtVar == null) {
                cpvtVar = cpvt.a;
            }
            return cpvtVar.b;
        } catch (eygu e) {
            a.s("Incorrect protobuf in settings store", e);
            return false;
        }
    }
}
