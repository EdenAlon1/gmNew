package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmg implements cgbh {
    public static final cskc a = cskc.g("Bugle", "RcsStillSendingMessageTracker");
    public static final entd b = entd.c("Bugle");
    public final erqa c = new erqa();
    public final errl d;
    public final ffbr e;
    public final cgcq f;
    public final ffbr g;
    public final cins h;
    private final errl i;
    private final errl j;
    private final ffbr k;
    private final ffbr l;

    public cmmg(errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, cgcq cgcqVar, ffbr ffbrVar2, cins cinsVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.i = errlVar;
        this.d = errlVar2;
        this.e = ffbrVar;
        this.f = cgcqVar;
        this.g = ffbrVar2;
        this.h = cinsVar;
        this.j = errlVar3;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
    }

    public final void a(MessageIdType messageIdType, Instant instant) {
        ekzz f = eleg.f("RcsStillSendingMessageTracker::startTracking");
        try {
            this.f.b(messageIdType, instant, byyx.RCS_STILL_SENDING);
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

    @Override // defpackage.cgbh
    public final elfl b(final engw engwVar) {
        return elfo.h(new erog() { // from class: cmlx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                int i = engw.d;
                final engr engrVar = new engr();
                engr engrVar2 = new engr();
                final engw engwVar2 = engwVar;
                int size = engwVar2.size();
                int i2 = 0;
                while (true) {
                    final cmmg cmmgVar = cmmg.this;
                    if (i2 >= size) {
                        return elfo.i((Iterable) Collection.EL.stream(engrVar2.g()).map(new Function() { // from class: cmme
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                                final cmmg cmmgVar2 = cmmg.this;
                                return elfl.g(cmmgVar2.c.b(eldl.c(new erog() { // from class: cmlw
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        return ((aqgl) cmmg.this.g.b()).a(messageCoreData, eokl.SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK);
                                    }
                                }), cmmgVar2.d));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(endq.a)).i(new eroh() { // from class: cmmf
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                Stream map = Collection.EL.stream((List) obj).filter(new Predicate() { // from class: cmly
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
                                        aqgm aqgmVar = (aqgm) obj2;
                                        cskc cskcVar = cmmg.a;
                                        return aqgmVar != null && aqgmVar.b() == 3;
                                    }
                                }).map(new Function() { // from class: cmlz
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        aqgm aqgmVar = (aqgm) obj2;
                                        ensz enszVar = (ensz) cmmg.b.h();
                                        ensn ensnVar = csux.b;
                                        aqgmVar.getClass();
                                        enszVar.Y(ensnVar, aqgmVar.a());
                                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsStillSendingMessageTracker", "initiateFallbackAndComputeNotifyMessages", 224, "RcsStillSendingMessageTracker.java")).q("Auto fallback initiated");
                                        return aqgmVar.a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i3 = engw.d;
                                engw engwVar3 = (engw) map.collect(endq.a);
                                engr engrVar3 = engrVar;
                                engrVar3.j(engwVar3);
                                cmmg cmmgVar2 = cmmg.this;
                                cgcq cgcqVar = cmmgVar2.f;
                                fazb fazbVar = cgcqVar.d;
                                final engw g = engrVar3.g();
                                final byyx byyxVar = byyx.RCS_STILL_SENDING;
                                elfl e = ((cgcg) fazbVar.b()).b(g, byyxVar).h(new emwl() { // from class: cgci
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        ((ensz) ((ensz) cgcq.b.h()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageTracker", "stopTracking", 153, "MessageTracker.java")).D("Stopped tracking messages %s for tracking purpose %s", engw.this, byyxVar);
                                        return null;
                                    }
                                }, cgcqVar.c).e(Throwable.class, new emwl() { // from class: cgcj
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        ((ensz) ((ensz) ((ensz) cgcq.b.j()).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageTracker", "stopTracking", 161, "MessageTracker.java")).D("Error when trying to stop tracking %s for tracking purpose %s", engw.this, byyxVar);
                                        return null;
                                    }
                                }, cgcqVar.c);
                                final engw engwVar4 = engwVar2;
                                return e.h(new emwl() { // from class: cmma
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        cskc cskcVar = cmmg.a;
                                        Stream stream = Collection.EL.stream(engw.this);
                                        final engw engwVar5 = g;
                                        Stream filter = stream.filter(new Predicate() { // from class: cmmb
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
                                            public final boolean test(Object obj3) {
                                                cskc cskcVar2 = cmmg.a;
                                                return !engw.this.contains(((bted) obj3).l());
                                            }
                                        });
                                        int i4 = engw.d;
                                        engw engwVar6 = (engw) filter.collect(endq.a);
                                        return Collection.EL.stream(engwVar6).allMatch(new Predicate() { // from class: cmmc
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
                                            public final boolean test(Object obj3) {
                                                return ((bted) obj3).q();
                                            }
                                        }) ? enou.a : (engw) Collection.EL.stream(engwVar6).map(new Function() { // from class: cmmd
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                return ((bted) obj3).l();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(endq.a);
                                    }
                                }, cmmgVar2.d);
                            }
                        }, cmmgVar.d);
                    }
                    bted btedVar = (bted) engwVar2.get(i2);
                    MessageCoreData v = ((bdmq) cmmgVar.e.b()).v(btedVar.l());
                    if (v == null || !bdjs.s(v.k())) {
                        engrVar.h(btedVar.l());
                    } else {
                        engrVar2.h(v);
                    }
                    i2++;
                }
            }
        }, this.j).i(new eroh() { // from class: cmlv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar2 = (engw) obj;
                if (engwVar2.isEmpty()) {
                    return elfo.e(null);
                }
                cmmg cmmgVar = cmmg.this;
                cmmgVar.h.E(engwVar2);
                csjb c = cmmg.a.c();
                c.I("Refresh notification for RCS still sending");
                c.A("messageIds", engwVar2);
                c.r();
                return cmmgVar.f.a(engwVar2, byyx.RCS_STILL_SENDING);
            }
        }, this.i);
    }

    public final void c(MessageIdType messageIdType, Instant instant, Duration duration) {
        ekzz f = eleg.f("RcsStillSendingMessageTracker::startTracking");
        try {
            this.f.c(messageIdType, instant, byyx.RCS_STILL_SENDING, duration);
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

    @Override // defpackage.cgbh
    public final Duration d() {
        return !((cspt) this.k.b()).a() ? Duration.ofSeconds(((Long) this.l.b()).longValue()) : Duration.ofMillis(((Long) aqgk.c.e()).longValue());
    }
}
