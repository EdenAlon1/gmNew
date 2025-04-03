package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cisc extends ceuj {
    public final ffbr a;
    private final csxu b;
    private final errl c;
    private final ffbr d;

    public cisc(ffbr ffbrVar, csxu csxuVar, errl errlVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = csxuVar;
        this.c = errlVar;
        this.d = ffbrVar2;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ceti cetiVar = (ceti) l;
        cetiVar.c = eogt.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
        l.d(20);
        cetiVar.d = Duration.ofMillis(this.b.c("bugle_refresh_notification_backoff_duration_in_millis", 100L));
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RefreshIncomingMessageNotificationsHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cisg.a.getParserForType();
    }

    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, final engw engwVar) {
        if (((ctud) this.d.b()).l()) {
            return elfo.h(new erog() { // from class: ciry
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    cins cinsVar = (cins) cisc.this.a.b();
                    engw engwVar2 = engwVar;
                    Collection.EL.stream(engwVar2).allMatch(new Predicate() { // from class: cisb
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((cisg) obj).d;
                        }
                    });
                    Collection.EL.stream(engwVar2).allMatch(new Predicate() { // from class: cisa
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int a = cisf.a(((cisg) obj).c);
                            return a != 0 && a == 2;
                        }
                    });
                    Collection.EL.stream(engwVar2).noneMatch(new Predicate() { // from class: cirx
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int a = cisf.a(((cisg) obj).c);
                            return a != 0 && a == 3;
                        }
                    });
                    return cinsVar.N();
                }
            }, this.c).h(new emwl() { // from class: cirz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ceyt.i();
                }
            }, erpp.a);
        }
        D.r("Cannot process pending work item, required phone permission is missing");
        return elfo.e(ceyt.k());
    }
}
