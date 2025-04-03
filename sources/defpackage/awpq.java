package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpq {
    public static final cskc a = cskc.g("BugleDataModel", "IncomingIsComposingProcessor");
    public static final Duration b = Duration.ofMinutes(2);
    public final awqj c;
    public final awti d;
    public final cqoh e;
    public final ffbr f;
    public final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final errl j;
    private final atmb k;

    public awpq(awqj awqjVar, awti awtiVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar, atmb atmbVar) {
        this.c = awqjVar;
        this.d = awtiVar;
        this.e = cqohVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = errlVar;
        this.k = atmbVar;
    }

    private final elfl c(final IsComposingMessage isComposingMessage, final awxk awxkVar, elfl elflVar) {
        return elflVar.i(new eroh() { // from class: awpo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ConversationIdType conversationIdType = (ConversationIdType) obj;
                if (conversationIdType.b()) {
                    ((enrr) awpq.a.i().h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingIsComposingProcessor", "processInternal", 126, "IncomingIsComposingProcessor.java")).q("Could not find conversation.");
                    return elfo.e(null);
                }
                awxk awxkVar2 = awxkVar;
                awui awuiVar = awxkVar2.d;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                awpq awpqVar = awpq.this;
                String str = awuiVar.d;
                if (((djrv) awpqVar.f.b()).w(str)) {
                    return elfo.e(null);
                }
                IsComposingMessage isComposingMessage2 = isComposingMessage;
                ((azei) awpqVar.g.b()).d(new Consumer() { // from class: awpp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        elfl c;
                        awqc awqcVar = (awqc) obj2;
                        cskc cskcVar = awpq.a;
                        c = axol.c(awqcVar.b, ffhe.a, ffsm.a, new awqb(awqcVar, new BugleConversationId(ConversationIdType.this), null));
                        axnw.h(c);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                axnw.h(awpqVar.c.a(conversationIdType, str, isComposingMessage2.a().equals(eigd.START)));
                Instant plus = ((Instant) isComposingMessage2.c().orElse(awpqVar.e.f())).plus((Duration) isComposingMessage2.b().orElse(awpq.b));
                awsw awswVar = new awsw();
                awswVar.e(isComposingMessage2.a());
                awswVar.c(plus);
                awui awuiVar2 = awxkVar2.d;
                if (awuiVar2 == null) {
                    awuiVar2 = awui.a;
                }
                awswVar.d(awuiVar2);
                awswVar.b(conversationIdType);
                final awtk a2 = awswVar.a();
                final awti awtiVar = awpqVar.d;
                Instant f = awtiVar.e.f();
                awsx awsxVar = (awsx) a2;
                Instant instant = awsxVar.c;
                Duration between = instant.isAfter(f) ? Duration.between(f, instant) : Duration.ZERO;
                if (between.isZero()) {
                    return elfo.e(null);
                }
                elfl f2 = elfo.f(new Runnable() { // from class: awte
                    @Override // java.lang.Runnable
                    public final void run() {
                        awsx awsxVar2 = (awsx) a2;
                        boolean equals = eigd.START.equals(awsxVar2.d);
                        awti awtiVar2 = awti.this;
                        if (equals) {
                            ConversationIdType conversationIdType2 = awsxVar2.b;
                            Map map = (Map) awtiVar2.a.get(conversationIdType2);
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(awsxVar2.a, awsxVar2.c);
                            awtiVar2.a.put(conversationIdType2, map);
                            awtiVar2.c(awsxVar2.b.a());
                            return;
                        }
                        ConversationIdType conversationIdType3 = awsxVar2.b;
                        Map map2 = (Map) awtiVar2.a.get(conversationIdType3);
                        if (map2 != null) {
                            map2.remove(awsxVar2.a);
                            if (map2.isEmpty()) {
                                awtiVar2.a.remove(conversationIdType3);
                            }
                        }
                        awtiVar2.c(conversationIdType3.a());
                    }
                }, awtiVar.d);
                awtiVar.c.a(f2, new ejtz("typing_status_all_conversations"));
                if (eigd.START.equals(awsxVar.d)) {
                    elfl.g(awtiVar.b.schedule(eldl.l(new Runnable() { // from class: awtc
                        @Override // java.lang.Runnable
                        public final void run() {
                            awsw awswVar2 = new awsw();
                            awsx awsxVar2 = (awsx) a2;
                            awswVar2.d(awsxVar2.a);
                            awswVar2.c(awsxVar2.c);
                            awswVar2.e(eigd.STOP);
                            awswVar2.b(awsxVar2.b);
                            final awtk a3 = awswVar2.a();
                            final awti awtiVar2 = awti.this;
                            awtiVar2.c.a(elfo.f(new Runnable() { // from class: awsy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    awsx awsxVar3 = (awsx) a3;
                                    awti awtiVar3 = awti.this;
                                    Map map = awtiVar3.a;
                                    ConversationIdType conversationIdType2 = awsxVar3.b;
                                    Map map2 = (Map) map.get(conversationIdType2);
                                    if (map2 == null) {
                                        return;
                                    }
                                    awui awuiVar3 = awsxVar3.a;
                                    if (map2.containsKey(awuiVar3) && ((Instant) map2.get(awuiVar3)).equals(awsxVar3.c)) {
                                        map2.remove(awsxVar3.a);
                                    }
                                    if (map2.isEmpty()) {
                                        awtiVar3.a.remove(conversationIdType2);
                                    }
                                    awtiVar3.c(conversationIdType2.a());
                                }
                            }, awtiVar2.d), new ejtz("typing_status_all_conversations"));
                        }
                    }), between.toNanos(), TimeUnit.NANOSECONDS)).k(axnw.b(), erpp.a);
                }
                return f2;
            }
        }, this.j);
    }

    public final elfl a(IsComposingMessage isComposingMessage, awxk awxkVar) {
        azcr a2;
        awss awssVar = (awss) this.h.b();
        if (this.k.a()) {
            if ((awxkVar.c & 32) != 0) {
                azfw azfwVar = (azfw) this.i.b();
                azjw azjwVar = awxkVar.i;
                if (azjwVar == null) {
                    azjwVar = azjw.a;
                }
                a2 = azfwVar.a(azhf.a(azjwVar));
            } else {
                azee azeeVar = awxkVar.f;
                if (azeeVar == null) {
                    azeeVar = azee.a;
                }
                a2 = azcp.a(azeeVar);
            }
        } else if ((awxkVar.c & 16) != 0) {
            a2 = ((azfw) this.i.b()).a(azhp.a(awxkVar.h));
        } else {
            String str = awxkVar.e;
            azcr azcrVar = azcr.a;
            a2 = azcq.a(str);
        }
        return c(isComposingMessage, awxkVar, awssVar.c(a2));
    }

    public final elfl b(IsComposingMessage isComposingMessage, awxk awxkVar, ConversationIdType conversationIdType) {
        return c(isComposingMessage, awxkVar, elfo.e(conversationIdType));
    }
}
