package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmlu implements cgbh, bdoa {
    static final cfup a = cfvl.l(cfvl.b, "rcs_not_delivered_tracker_timeout_seconds", TimeUnit.MINUTES.toSeconds(60));
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsNotDeliveredMessageTracker");
    public final cqoh c;
    public final cgcq d;
    public final cins e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final errl i;
    public final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final attl r;

    public cmlu(cqoh cqohVar, cgcq cgcqVar, cins cinsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, attl attlVar) {
        this.c = cqohVar;
        this.d = cgcqVar;
        this.e = cinsVar;
        this.k = ffbrVar;
        this.f = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.n = ffbrVar7;
        this.i = errlVar;
        this.j = ffbrVar8;
        this.o = ffbrVar9;
        this.p = ffbrVar10;
        this.q = ffbrVar11;
        this.r = attlVar;
    }

    public static boolean g(int i) {
        return i == 3;
    }

    @Override // defpackage.bdoa
    public final void a(MessageCoreData messageCoreData) {
        bseh r;
        emxf.l(!efbd.g());
        ekzz c = c();
        try {
            if (messageCoreData.cX() && (r = ((bczy) this.k.b()).r(messageCoreData.z())) != null && r.k() == 0 && !r.am() && ((ckds) this.l.b()).E(r.C())) {
                if (this.r.a()) {
                    this.d.c(messageCoreData.B(), this.c.f(), byyx.RCS_NOT_DELIVERED, ((bczy) this.k.b()).ad(messageCoreData.z()) ? Duration.ofSeconds(((Long) this.q.b()).longValue()) : Duration.ZERO);
                } else {
                    this.d.b(messageCoreData.B(), this.c.f(), byyx.RCS_NOT_DELIVERED);
                }
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cgbh
    public final elfl b(final engw engwVar) {
        return elfo.h(new erog() { // from class: cmls
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                int i = engw.d;
                engr engrVar = new engr();
                engr engrVar2 = new engr();
                engr engrVar3 = new engr();
                engw engwVar2 = engwVar;
                int size = engwVar2.size();
                int i2 = 0;
                while (true) {
                    final cmlu cmluVar = cmlu.this;
                    if (i2 >= size) {
                        cmluVar.f(engrVar3.g());
                        engw g = engrVar2.g();
                        final engw g2 = engrVar.g();
                        return elfo.a(((aqgl) cmluVar.h.b()).c(g, eokl.DELIVERY_MESSAGE_TIMEOUT)).i(new eroh() { // from class: cmlt
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                List list = (List) obj;
                                final enip enipVar = (enip) Collection.EL.stream(list).filter(new Predicate() { // from class: cmln
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
                                    public final boolean test(Object obj2) {
                                        enru enruVar = cmlu.b;
                                        return !cmlu.g(((aqgm) obj2).b());
                                    }
                                }).map(new Function() { // from class: cmlo
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((aqgm) obj2).a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.b);
                                Stream filter = Collection.EL.stream(g2).filter(new Predicate() { // from class: cmlp
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
                                    public final boolean test(Object obj2) {
                                        enru enruVar = cmlu.b;
                                        return enip.this.contains(((bted) obj2).l());
                                    }
                                });
                                int i3 = engw.d;
                                engw engwVar3 = (engw) filter.collect(endq.a);
                                engw engwVar4 = (engw) Collection.EL.stream(list).filter(new Predicate() { // from class: cmlq
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
                                    public final boolean test(Object obj2) {
                                        enru enruVar = cmlu.b;
                                        return cmlu.g(((aqgm) obj2).b());
                                    }
                                }).map(new Function() { // from class: cmlo
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((aqgm) obj2).a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.a);
                                cmlu cmluVar2 = cmlu.this;
                                cmluVar2.f(engwVar4);
                                if (!engwVar3.isEmpty()) {
                                    if (((Boolean) ((cfup) clei.b.get()).e()).booleanValue()) {
                                        ((clej) ((Optional) cmluVar2.g.b()).get()).b();
                                    } else {
                                        elfo.e(null);
                                    }
                                }
                                cmluVar2.e.D(engwVar3);
                                ((enrr) ((enrr) cmlu.b.h()).h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsNotDeliveredMessageTracker", "startAutoFallbackAndNotify", 243, "RcsNotDeliveredMessageTracker.java")).r("Refreshing notification for %d not yet delivered RCS", engwVar3.size());
                                if (engwVar3.isEmpty()) {
                                    return elfo.e(null);
                                }
                                return cmluVar2.d.a((engw) Collection.EL.stream(engwVar3).map(new Function() { // from class: cmlr
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((bted) obj2).l();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.a), byyx.RCS_NOT_DELIVERED);
                            }
                        }, cmluVar.i);
                    }
                    bted btedVar = (bted) engwVar2.get(i2);
                    MessageIdType l = btedVar.l();
                    MessageCoreData v = ((bdmq) cmluVar.f.b()).v(l);
                    if (v == null || !v.cX() || v.cF() || bdjs.o(v.k()) || v.r() < cmluVar.c.f().toEpochMilli() - Duration.ofDays(((Long) cmluVar.j.b()).longValue()).toMillis()) {
                        engrVar3.h(l);
                    } else {
                        engrVar.h(btedVar);
                        engrVar2.h(v);
                    }
                    i2++;
                }
            }
        }, this.i);
    }

    @Override // defpackage.bdoa, defpackage.bdnx
    public final ekzz c() {
        return eleg.f("RcsNotDeliveredMessageTracker");
    }

    @Override // defpackage.cgbh
    public final Duration d() {
        return ((aqgl) this.h.b()).d() ? !((cspt) this.o.b()).a() ? Duration.ofSeconds(((Long) this.p.b()).longValue()) : Duration.ofSeconds(((Long) this.n.b()).longValue()) : Duration.ofSeconds(((Long) a.e()).longValue());
    }

    public final void e(MessageIdType messageIdType) {
        ekzz f = eleg.f("RcsNotDeliveredMessageTracker::stopTracking");
        try {
            this.d.d(messageIdType, byyx.RCS_NOT_DELIVERED);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(engw engwVar) {
        ekzz f = eleg.f("RcsNotDeliveredMessageTracker::stopTracking");
        try {
            ((cgcg) this.m.b()).b(engwVar, byyx.RCS_NOT_DELIVERED);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
