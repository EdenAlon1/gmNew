package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtu extends BroadcastReceiver {
    final /* synthetic */ vvn a;

    public vtu(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ekzm b = this.a.aT.b("ConversationFragmentPeer#conversationSelfIdChangeReceiver#onReceive");
        try {
            ConversationIdType b2 = bdgq.b(intent.getStringExtra("conversation_id"));
            SelfIdentityId c = aqvf.c(intent.getStringExtra("conversation_self_id"));
            if (this.a.cA.g() && c != null && ((bcqs) this.a.cA.a()).e.equals(b2)) {
                this.a.cM.d();
                int b3 = ((bcqs) this.a.cA.a()).b(c);
                ensk h = vvn.a.h();
                h.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.p, b2);
                enrrVar.Y(csux.t, Integer.valueOf(b3));
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$1", "onReceive", 1589, "ConversationFragmentPeer.java")).t("ConversationFragment: selfIdChange.onReceive selfId: %s", c);
                ((bcvr) this.a.cM.a()).T(c, b3);
            }
            this.a.S(new Consumer() { // from class: vte
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((uav) obj).e().H().T();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vtf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ComposeMessageView) obj).H().T();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
