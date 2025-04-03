package com.google.android.apps.messaging.suggestions.notifications.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.suggestions.notifications.receiver.NotificationSmartActionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.amet;
import defpackage.axnw;
import defpackage.ayfg;
import defpackage.bcyl;
import defpackage.bdgq;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.cwjx;
import defpackage.cwku;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfo;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.ffbr;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NotificationSmartActionReceiver extends cwku {
    private static final cskc i = cskc.g("Bugle", "NotificationSmartActionReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("NotificationSmartActionReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.NotificationSmartActionReceiver.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        cskc cskcVar = i;
        csjb c = cskcVar.c();
        c.I("processBroadcast.");
        c.A("intent", intent);
        c.r();
        if ("com.google.android.apps.messaging.accept_suggestion".equals(intent.getAction())) {
            ConversationIdType b = bdgq.b(intent.getStringExtra("conversation_id"));
            ConversationId a = ((amet) this.e.b()).a(intent);
            if (a == null) {
                a = InvalidConversationId.a;
            }
            final String stringExtra = intent.getStringExtra("suggestion_id");
            csjb c2 = cskcVar.c();
            c2.I("accepting suggestion");
            c2.A("conversationId", b);
            c2.A("suggestionId", stringExtra);
            c2.r();
            if (b.b() || stringExtra == null) {
                return;
            }
            elfo.g(new Callable() { // from class: cwkv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Optional f = ((ctqh) NotificationSmartActionReceiver.this.f.b()).f(stringExtra);
                    if (f.isEmpty()) {
                        throw new IllegalStateException("Suggestion to be logged does not exist");
                    }
                    return (SuggestionData) f.get();
                }
            }, (Executor) this.g.b()).i(new eroh() { // from class: cwkw
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    NotificationSmartActionReceiver notificationSmartActionReceiver = NotificationSmartActionReceiver.this;
                    SuggestionData suggestionData = (SuggestionData) obj;
                    ((ctqh) notificationSmartActionReceiver.f.b()).p(suggestionData, fbrd.CLICKED);
                    return ((ctjh) notificationSmartActionReceiver.d.b()).o(suggestionData, eoqz.P2P_SUGGESTION_CLICK, fbqp.NOTIFICATION_VIEW);
                }
            }, (Executor) this.h.b()).k(axnw.b(), erpp.a);
            ((cwjx) this.b.b()).f(b, stringExtra);
            ((ayfg) this.c.b()).C(context, a, new bcyl(intent.getExtras()));
        }
    }
}
