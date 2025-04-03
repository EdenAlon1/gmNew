package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgcq {
    public static final cskc a = cskc.g("Bugle", "MessageTrackerImpl");
    public static final entd b = entd.c("Bugle");
    public final errl c;
    public final fazb d;

    public cgcq(errl errlVar, fazb fazbVar) {
        this.c = errlVar;
        this.d = fazbVar;
    }

    public final elfl a(final List list, final byyx byyxVar) {
        return elfl.g(((cgcg) this.d.b()).k.b("markFlaggedMessagesAsNotified", new Runnable() { // from class: cgbk
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                entd entdVar = cgcg.a;
                String[] strArr = btfo.a;
                btfl btflVar = new btfl();
                btflVar.ap("markFlaggedMessagesAsNotified");
                final List list2 = list;
                final byyx byyxVar2 = byyxVar;
                apply = new Function() { // from class: cgbx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btfn btfnVar = (btfn) obj;
                        entd entdVar2 = cgcg.a;
                        btfnVar.c(list2);
                        btfnVar.d(byyxVar2);
                        return btfnVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new btfn());
                btflVar.af(new btfm((btfn) apply));
                int intValue = btfo.c().intValue();
                int intValue2 = btfo.c().intValue();
                if (intValue2 < 46030) {
                    dtub.w("flagged_message_notified", intValue2);
                }
                if (intValue >= 46030) {
                    btflVar.a.put("flagged_message_notified", (Boolean) true);
                }
                btflVar.b().e();
            }
        }));
    }

    public final void b(final MessageIdType messageIdType, final Instant instant, final byyx byyxVar) {
        elfl i;
        if (messageIdType.c()) {
            csjb e = a.e();
            e.I("Cannot track message - messageId cannot be");
            e.I(true != messageIdType.c() ? "empty" : "null");
            e.r();
            return;
        }
        final cgcg cgcgVar = (cgcg) this.d.b();
        if (messageIdType.c()) {
            ((ensz) ((ensz) cgcg.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "flagMessage", 111, "MessageFlagger.java")).q("Cannot flag message - messageId cannot be empty.");
            i = elfo.e(false);
        } else {
            emxf.b(true ^ cgcgVar.k.a.i(), "This transaction must not be nested, as the transform routine needs the results to be visible");
            i = elfl.g(cgcgVar.k.a("MessageFlagger#flagMessage", new emyl() { // from class: cgbm
                @Override // defpackage.emyl
                public final Object get() {
                    MessageIdType messageIdType2 = MessageIdType.this;
                    byyx byyxVar2 = byyxVar;
                    if (cgcg.d(messageIdType2, byyxVar2)) {
                        return false;
                    }
                    Instant instant2 = instant;
                    String[] strArr = btfo.a;
                    bteg btegVar = new bteg();
                    btegVar.c(messageIdType2);
                    btegVar.e(byyxVar2);
                    btegVar.d(instant2.toEpochMilli());
                    return Boolean.valueOf(btegVar.a().o().longValue() > 0);
                }
            })).i(new eroh() { // from class: cgbn
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((Boolean) obj).booleanValue() ? cgcg.this.a().h(new emwl() { // from class: cgce
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cgcg.a;
                            return true;
                        }
                    }, erpp.a) : elfo.e(false);
                }
            }, cgcgVar.c);
        }
        i.k(axou.a(new csvw(new Consumer() { // from class: cgcm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Boolean bool = (Boolean) obj;
                cskc cskcVar = cgcq.a;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                MessageIdType messageIdType2 = messageIdType;
                byyx byyxVar2 = byyx.this;
                csjb c = cgcq.a.c();
                c.I("Started tracking message");
                c.A("TrackingPurpose", byyxVar2);
                c.d(messageIdType2);
                c.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cgcn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjb e2 = cgcq.a.e();
                e2.I("Error when trying to start tracking");
                e2.A("TrackingPurpose", byyx.this);
                e2.d(messageIdType);
                e2.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.c);
    }

    public final void c(final MessageIdType messageIdType, final Instant instant, final byyx byyxVar, final Duration duration) {
        elfl i;
        if (messageIdType.c()) {
            csjb e = a.e();
            e.I("Cannot track message - messageId cannot be");
            e.I(true != messageIdType.c() ? "empty" : "null");
            e.r();
            return;
        }
        final cgcg cgcgVar = (cgcg) this.d.b();
        if (messageIdType.c()) {
            ((ensz) ((ensz) cgcg.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "flagMessage", 159, "MessageFlagger.java")).q("Cannot flag message - messageId cannot be empty.");
            i = elfo.e(false);
        } else {
            emxf.b(true ^ cgcgVar.k.a.i(), "This transaction must not be nested, as the transform routine needs the results to be visible");
            i = elfl.g(cgcgVar.k.a("MessageFlagger#flagMessage", new emyl() { // from class: cgbu
                @Override // defpackage.emyl
                public final Object get() {
                    MessageIdType messageIdType2 = MessageIdType.this;
                    byyx byyxVar2 = byyxVar;
                    if (cgcg.d(messageIdType2, byyxVar2)) {
                        return false;
                    }
                    Duration duration2 = duration;
                    Instant instant2 = instant;
                    String[] strArr = btfo.a;
                    bteg btegVar = new bteg();
                    btegVar.c(messageIdType2);
                    btegVar.e(byyxVar2);
                    btegVar.d(instant2.toEpochMilli());
                    btegVar.b(duration2);
                    return Boolean.valueOf(btegVar.a().o().longValue() > 0);
                }
            })).i(new eroh() { // from class: cgbv
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((Boolean) obj).booleanValue() ? cgcg.this.a().h(new emwl() { // from class: cgbr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cgcg.a;
                            return true;
                        }
                    }, erpp.a) : elfo.e(false);
                }
            }, cgcgVar.c);
        }
        i.k(axou.a(new csvw(new Consumer() { // from class: cgck
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Boolean bool = (Boolean) obj;
                cskc cskcVar = cgcq.a;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                MessageIdType messageIdType2 = messageIdType;
                byyx byyxVar2 = byyx.this;
                csjb c = cgcq.a.c();
                c.I("Started tracking message");
                c.A("TrackingPurpose", byyxVar2);
                c.d(messageIdType2);
                c.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cgcl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjb e2 = cgcq.a.e();
                e2.I("Error when trying to start tracking");
                e2.A("TrackingPurpose", byyx.this);
                e2.d(messageIdType);
                e2.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.c);
    }

    public final void d(final MessageIdType messageIdType, final byyx byyxVar) {
        elfl i;
        if (messageIdType.c()) {
            csjb e = a.e();
            e.A("reason", byyxVar);
            e.I("Cannot stop tracking message - messageId cannot be");
            e.I(true != messageIdType.c() ? "empty" : "null");
            e.r();
            return;
        }
        final cgcg cgcgVar = (cgcg) this.d.b();
        if (messageIdType.c()) {
            ((ensz) ((ensz) cgcg.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "unflagMessage", 268, "MessageFlagger.java")).q("Cannot unflag message - messageId cannot be empty.");
            i = elfo.e(false);
        } else {
            i = elfo.g(new Callable() { // from class: cgbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = cgcg.a;
                    String[] strArr = btfo.a;
                    btff btffVar = new btff();
                    btffVar.f("unflagMessage");
                    final MessageIdType messageIdType2 = MessageIdType.this;
                    final byyx byyxVar2 = byyxVar;
                    btffVar.a(new Function() { // from class: cgbt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btfn btfnVar = (btfn) obj;
                            entd entdVar2 = cgcg.a;
                            btfnVar.b(MessageIdType.this);
                            btfnVar.d(byyxVar2);
                            return btfnVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Boolean.valueOf(btffVar.d() > 0);
                }
            }, cgcgVar.b).i(new eroh() { // from class: cgbp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return elfo.e(false);
                    }
                    cgcg cgcgVar2 = cgcg.this;
                    cgcgVar2.c();
                    return cgcgVar2.a().h(new emwl() { // from class: cgbq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cgcg.a;
                            return true;
                        }
                    }, cgcgVar2.c);
                }
            }, cgcgVar.c);
        }
        i.k(axou.a(new csvw(new Consumer() { // from class: cgco
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Boolean bool = (Boolean) obj;
                cskc cskcVar = cgcq.a;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                MessageIdType messageIdType2 = messageIdType;
                byyx byyxVar2 = byyx.this;
                csjb c = cgcq.a.c();
                c.I("Stopped tracking message");
                c.A("TrackingPurpose", byyxVar2);
                c.d(messageIdType2);
                c.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cgcp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjb e2 = cgcq.a.e();
                e2.I("Error when trying to stop tracking");
                e2.A("TrackingPurpose", byyx.this);
                e2.d(messageIdType);
                e2.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.c);
    }
}
