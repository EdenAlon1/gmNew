package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjw implements cpey, cgbh {
    public static final cskc a = cskc.g("Bugle", "StuckInSendingMessageTracker");
    public final cins b;
    public final cgcq c;
    public final ffbr d;
    public final cpez e;
    public final bbbn f;
    public final ffbr g;
    private final errl h;

    public cwjw(errl errlVar, cins cinsVar, cgcq cgcqVar, ffbr ffbrVar, cpez cpezVar, bbbn bbbnVar, ffbr ffbrVar2) {
        this.h = errlVar;
        this.b = cinsVar;
        this.c = cgcqVar;
        this.d = ffbrVar;
        this.e = cpezVar;
        this.f = bbbnVar;
        this.g = ffbrVar2;
    }

    @Override // defpackage.cpey
    public final elfl a(final MessageIdType messageIdType) {
        final byyx byyxVar = byyx.NOTIFY_STUCK_IN_SENDING;
        if (!messageIdType.c()) {
            cgcg cgcgVar = (cgcg) this.c.d.b();
            if (!messageIdType.c()) {
                return elfo.g(new Callable() { // from class: cgbw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(cgcg.d(MessageIdType.this, byyxVar));
                    }
                }, cgcgVar.b);
            }
            ((ensz) ((ensz) cgcg.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "isMessageFlaggedForReason", 330, "MessageFlagger.java")).q("Cannot query for flagged message - messageId cannot be empty.");
            return elfo.e(false);
        }
        csjb e = cgcq.a.e();
        e.I("Cannot check if tracking message - messageId cannot be");
        e.I(true != messageIdType.c() ? "empty" : "null");
        e.A("TrackingPurpose", byyxVar);
        e.r();
        return elfo.e(false);
    }

    @Override // defpackage.cgbh
    public final elfl b(final engw engwVar) {
        return elfo.g(new Callable() { // from class: cwjt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                engw engwVar2 = engwVar;
                int size = engwVar2.size();
                for (int i = 0; i < size; i++) {
                    cwjw cwjwVar = cwjw.this;
                    bted btedVar = (bted) engwVar2.get(i);
                    MessageIdType l = btedVar.l();
                    MessageCoreData v = ((bdmq) cwjwVar.d.b()).v(l);
                    if (v == null || !bdjs.s(v.k())) {
                        cwjwVar.e(l);
                    } else {
                        arrayList.add(btedVar);
                    }
                }
                return engw.n(arrayList);
            }
        }, this.h).i(new eroh() { // from class: cwju
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar2 = (engw) obj;
                cwjw cwjwVar = cwjw.this;
                if (((ashd) cwjwVar.g.b()).a()) {
                    int size = engwVar2.size();
                    for (int i = 0; i < size; i++) {
                        final MessageCoreData v = ((bdmq) cwjwVar.d.b()).v(((bted) engwVar2.get(i)).l());
                        if (v != null) {
                            bbbn bbbnVar = cwjwVar.f;
                            cpez cpezVar = cwjwVar.e;
                            MessageIdType B = v.B();
                            epkd epkdVar = (epkd) cpezVar.c.get(B);
                            cpezVar.b.remove(B);
                            cpezVar.c.remove(B);
                            Optional ofNullable = Optional.ofNullable(epkdVar);
                            altk altkVar = (altk) bbbnVar.a.b();
                            if (altkVar.am()) {
                                int d = altl.d(v.d());
                                final eoop eoopVar = (eoop) eopq.a.createBuilder();
                                long t = v.t();
                                eoopVar.copyOnWrite();
                                eopq eopqVar = (eopq) eoopVar.instance;
                                eopqVar.b |= 128;
                                eopqVar.n = t;
                                eoopVar.copyOnWrite();
                                eopq eopqVar2 = (eopq) eoopVar.instance;
                                eopqVar2.g = d - 1;
                                eopqVar2.b |= 1;
                                eoopVar.copyOnWrite();
                                eopq eopqVar3 = (eopq) eoopVar.instance;
                                eopqVar3.h = 24;
                                eopqVar3.b |= 2;
                                eooi j = ((MessageData) v).k.j();
                                eoopVar.copyOnWrite();
                                eopq eopqVar4 = (eopq) eoopVar.instance;
                                eopqVar4.m = j.J;
                                eopqVar4.b |= 64;
                                ofNullable.ifPresent(new Consumer() { // from class: bbbm
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        epkd epkdVar2 = (epkd) obj2;
                                        int a2 = MessageCoreData.this.a();
                                        epkdVar2.copyOnWrite();
                                        epke epkeVar = (epke) epkdVar2.instance;
                                        epke epkeVar2 = epke.a;
                                        epkeVar.b |= 1;
                                        epkeVar.e = a2;
                                        eoop eoopVar2 = eoopVar;
                                        eoopVar2.copyOnWrite();
                                        eopq eopqVar5 = (eopq) eoopVar2.instance;
                                        epke epkeVar3 = (epke) epkdVar2.build();
                                        eopq eopqVar6 = eopq.a;
                                        epkeVar3.getClass();
                                        eopqVar5.ar = epkeVar3;
                                        eopqVar5.d |= 64;
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                eolu eoluVar = (eolu) eolv.a.createBuilder();
                                eolt eoltVar = eolt.BUGLE_MESSAGE;
                                eoluVar.copyOnWrite();
                                eolv eolvVar = (eolv) eoluVar.instance;
                                eolvVar.j = eoltVar.dk;
                                eolvVar.b |= 1;
                                eoluVar.copyOnWrite();
                                eolv eolvVar2 = (eolv) eoluVar.instance;
                                eopq eopqVar5 = (eopq) eoopVar.build();
                                eopqVar5.getClass();
                                eolvVar2.l = eopqVar5;
                                eolvVar2.b |= 4;
                                ((akyb) bbbnVar.b.b()).a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                            } else {
                                altkVar.r();
                            }
                        }
                    }
                } else if (engwVar2 == null) {
                    int i2 = engw.d;
                    engwVar2 = enou.a;
                }
                cwjwVar.b.F(engwVar2);
                csjb a2 = cwjw.a.a();
                a2.I("Refreshed stuck messages notification for expired messages.");
                a2.r();
                Stream map = Collection.EL.stream(engwVar2).map(new Function() { // from class: cwjv
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
                });
                int i3 = engw.d;
                return cwjwVar.c.a((List) map.collect(endq.a), byyx.NOTIFY_STUCK_IN_SENDING);
            }
        }, this.h);
    }

    @Override // defpackage.cpey
    public final void c(MessageIdType messageIdType, Instant instant) {
        this.c.b(messageIdType, instant, byyx.NOTIFY_STUCK_IN_SENDING);
    }

    @Override // defpackage.cgbh
    public final Duration d() {
        return Duration.ofSeconds(((Integer) cnnd.c.e()).intValue());
    }

    @Override // defpackage.cpey
    public final void e(MessageIdType messageIdType) {
        this.c.d(messageIdType, byyx.NOTIFY_STUCK_IN_SENDING);
    }
}
