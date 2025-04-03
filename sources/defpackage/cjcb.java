package defpackage;

import android.os.Bundle;
import j$.util.Collection;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore");
    public final errl b;
    public final comc c;
    public final cixm d;
    private final ffbr e;
    private final ffbr f;
    private final errl g;

    public cjcb(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cixm cixmVar) {
        this.g = errlVar;
        this.b = errlVar2;
        comy comyVar = (comy) ffbrVar.b();
        comu c = comv.c();
        c.d(comb.INCOMING_MESSAGE_NOTIFICATION_SETTINGS);
        c.f(cjce.a);
        this.c = comyVar.a(c.a());
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.d = cixmVar;
    }

    public final elfl a(final cixf cixfVar) {
        return ((auiu) this.f.b()).a() ? ((cjad) this.e.b()).a(this.d.d(cixf.NT_INCOMING_MESSAGE)).a().h(new emwl() { // from class: cjby
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cjax cjaxVar = (cjax) obj;
                return (cjce) cjcb.this.c.m(new emwl() { // from class: cjbq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cjcc cjccVar = (cjcc) cjce.a.createBuilder();
                        cjccVar.copyOnWrite();
                        cjce cjceVar = (cjce) cjccVar.instance;
                        cjax cjaxVar2 = cjax.this;
                        cjaxVar2.getClass();
                        cjceVar.c = cjaxVar2;
                        cjceVar.b |= 1;
                        return (cjce) cjccVar.build();
                    }
                });
            }
        }, this.g).e(eygu.class, new emwl() { // from class: cjbz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = cjcb.a.j();
                j.Y(ente.a, "BugleNotifications");
                ((enrr) ((enrr) ((enrr) j).g((eygu) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "saveNotificationState", 136, "IncomingMessageSettingsStore.java")).q("Error updating data from incoming message settings store");
                return cjce.a;
            }
        }, this.b).h(new emwl() { // from class: cjca
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk h = cjcb.a.h();
                h.Y(ente.a, "BugleNotifications");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "saveNotificationState", 143, "IncomingMessageSettingsStore.java")).q("Saved current notification state");
                return null;
            }
        }, erpp.a) : this.c.j(new emwl() { // from class: cjbn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw n = engw.n(cjcb.this.d.d(cixfVar));
                cjcc cjccVar = (cjcc) cjce.a.createBuilder();
                Map map = (Map) Collection.EL.stream(n).filter(new Predicate() { // from class: cjbm
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
                        return ((Bundle) obj2).containsKey("extra_im_notification_conversation_id");
                    }
                }).map(new Function() { // from class: cjbs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Bundle bundle = (Bundle) obj2;
                        String string = bundle.getString("extra_im_notification_conversation_id");
                        long j = bundle.getLong("extra_im_notification_earliest_timestamp");
                        string.getClass();
                        cjao cjaoVar = (cjao) cjap.a.createBuilder();
                        cjaoVar.copyOnWrite();
                        cjap cjapVar = (cjap) cjaoVar.instance;
                        cjapVar.b |= 1;
                        cjapVar.c = j;
                        return new AbstractMap.SimpleEntry(string, (cjap) cjaoVar.build());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toMap(new Function() { // from class: cjbt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (String) ((AbstractMap.SimpleEntry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cjbu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (cjap) ((AbstractMap.SimpleEntry) obj2).getValue();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new BinaryOperator() { // from class: cjbv
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        return (cjap) obj2;
                    }
                }, new Supplier() { // from class: cjbw
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new HashMap();
                    }
                }));
                cjav cjavVar = (cjav) cjax.a.createBuilder();
                cjavVar.a(map);
                cjax cjaxVar = (cjax) cjavVar.build();
                cjccVar.copyOnWrite();
                cjce cjceVar = (cjce) cjccVar.instance;
                cjaxVar.getClass();
                cjceVar.c = cjaxVar;
                cjceVar.b |= 1;
                return (cjce) cjccVar.build();
            }
        }).e(eygu.class, new emwl() { // from class: cjbo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = cjcb.a.j();
                j.Y(ente.a, "BugleNotifications");
                ((enrr) ((enrr) ((enrr) j).g((eygu) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "saveNotificationState", 162, "IncomingMessageSettingsStore.java")).q("Error updating data from incoming message settings store");
                return cjce.a;
            }
        }, this.b).h(new emwl() { // from class: cjbp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
