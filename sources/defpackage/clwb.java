package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwb implements clvl, clwf, clwg {
    public final clvk f;
    public final aqvh g;
    private final errl i;
    private final ConcurrentHashMap j = new ConcurrentHashMap();
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker");
    public static final cfup b = cfvl.b("enable_prewarm_on_typing", true);
    public static final cfup c = cfvl.b("enable_prewarm_on_send_button_pressed", false);
    private static final cfup h = cfvl.a("prewarm_on_typing_max_frequency_ms", 65000);
    static final cfup d = cfvl.a("send_button_prewarm_tickle_priority", 5);
    static final cfup e = cfvl.a("typing_prewarm_tickle_priority", 10);

    public clwb(clvk clvkVar, errl errlVar, aqvh aqvhVar) {
        this.f = clvkVar;
        this.i = errlVar;
        this.g = aqvhVar;
    }

    public static int g(long j) {
        return j == 10 ? 2 : 1;
    }

    static final boolean h(aoku aokuVar) {
        if (aokuVar.e().isEmpty()) {
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "isValidPreWarmDestination", 270, "PhoneChannelAwaker.java")).q("Not prewarming invalid chat endpoint");
            return false;
        }
        if (!aokuVar.B()) {
            return true;
        }
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "isValidPreWarmDestination", 275, "PhoneChannelAwaker.java")).q("Not prewarming bot conversation");
        return false;
    }

    private final elfl i(bcqs bcqsVar) {
        final SelfIdentityId selfIdentityId = bcqsVar.n;
        return selfIdentityId == null ? elfo.e(Optional.empty()) : elfo.h(new erog() { // from class: clwa
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return clwb.this.g.d(selfIdentityId);
            }
        }, this.i);
    }

    @Override // defpackage.clvl
    public final void a(final bcqs bcqsVar, MessageCoreData messageCoreData) {
        if (((Boolean) c.e()).booleanValue()) {
            if (!messageCoreData.cX()) {
                ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSending", 149, "PhoneChannelAwaker.java")).q("Not prewarming - not an RCS message");
            } else if (messageCoreData.cY()) {
                ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSending", 159, "PhoneChannelAwaker.java")).q("Not prewarming - RCS file transfer");
            } else {
                axnw.h(i(bcqsVar).h(new emwl() { // from class: clvu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final clwb clwbVar = clwb.this;
                        final bcqs bcqsVar2 = bcqsVar;
                        ((Optional) obj).ifPresentOrElse(new Consumer() { // from class: clvw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                bcqs bcqsVar3 = bcqsVar2;
                                aqux aquxVar = (aqux) obj2;
                                if (bcqsVar3.p()) {
                                    ((enrr) ((enrr) clwb.a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSendingFireAndForget", 181, "PhoneChannelAwaker.java")).q("Not prewarming bot conversation");
                                    return;
                                }
                                String m = bcqsVar3.m();
                                if (m == null) {
                                    ((enrr) ((enrr) clwb.a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSendingFireAndForget", 189, "PhoneChannelAwaker.java")).q("No prewarming, other participant is null");
                                } else {
                                    clwb.this.e(aquxVar, m);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Runnable() { // from class: clvx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((enrr) ((enrr) clwb.a.j()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSending", 170, "PhoneChannelAwaker.java")).q("Self identity is not found for conversation while pre-warming on message sending.");
                            }
                        });
                        return null;
                    }
                }, this.i));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [aoku, java.lang.Object] */
    @Override // defpackage.clvl
    public final void b(bcqs bcqsVar, cowy cowyVar) {
        if (((Boolean) b.e()).booleanValue() && cowyVar.equals(cowy.ACTIVE)) {
            tys tysVar = bcqsVar.d;
            typ typVar = (typ) tysVar;
            final String str = null;
            if (!typVar.k.isEmpty() && tysVar.z()) {
                String p = typVar.k.get().p(true);
                if (emxe.c(p)) {
                    ((enrr) ((enrr) a.j()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "getConversationComparableDestination", 227, "PhoneChannelAwaker.java")).q("1:1 RCS conversation does not have valid comparable destination");
                } else {
                    str = p;
                }
            }
            if (str == null) {
                return;
            }
            axnw.h(i(bcqsVar).h(new emwl() { // from class: clvv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    final clwb clwbVar = clwb.this;
                    final String str2 = str;
                    ((Optional) obj).ifPresentOrElse(new Consumer() { // from class: clvy
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            clwb.this.f((aqux) obj2, str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Runnable() { // from class: clvz
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((enrr) ((enrr) clwb.a.j()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onTyping", 108, "PhoneChannelAwaker.java")).q("Self identity is not found for conversation while pre-warning on typing.");
                        }
                    });
                    return null;
                }
            }, this.i));
        }
    }

    @Override // defpackage.clwf
    public final void c(aqux aquxVar, aoku aokuVar) {
        if (((Boolean) c.e()).booleanValue() && h(aokuVar)) {
            e(aquxVar, aokuVar.o());
        }
    }

    @Override // defpackage.clwg
    public final void d(aqux aquxVar, aoku aokuVar) {
        if (((Boolean) b.e()).booleanValue() && h(aokuVar)) {
            f(aquxVar, aokuVar.o());
        }
    }

    public final void e(aqux aquxVar, String str) {
        this.f.a(aquxVar).a(str, g(((Long) d.e()).longValue()));
    }

    public final void f(final aqux aquxVar, final String str) {
        this.j.putIfAbsent(str, emys.b(new emyl() { // from class: clvt
            @Override // defpackage.emyl
            public final Object get() {
                clwb.this.f.a(aquxVar).a(str, clwb.g(((Long) clwb.e.e()).longValue()));
                return null;
            }
        }, Duration.ofMillis(((Long) h.e()).longValue())));
        ((emyl) this.j.get(str)).get();
    }
}
