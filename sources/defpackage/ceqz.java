package defpackage;

import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqz extends ceut {
    public final cqoh a;
    public final cera b;
    private final errl c;
    private final errl d;
    private final badw e;

    public ceqz(cqoh cqohVar, errl errlVar, errl errlVar2, cera ceraVar, badw badwVar) {
        this.a = cqohVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.b = ceraVar;
        this.e = badwVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ExpireWapPushSiMessageHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final badw badwVar = this.e;
        badwVar.getClass();
        return elfo.g(new Callable() { // from class: ceqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(badw.this.a());
            }
        }, this.c).h(new emwl() { // from class: ceqy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    return ceyt.i();
                }
                ceqz ceqzVar = ceqz.this;
                long longValue = l.longValue() - ceqzVar.a.f().toEpochMilli();
                long j = longValue >= 0 ? longValue : 0L;
                cetp cetpVar = new cetp();
                cetpVar.c = Duration.ofMillis(j);
                return ceyt.j(engw.r(ceyr.h("expire_wap_push_si_message", cetw.a, cetpVar.a())));
            }
        }, this.d);
    }
}
