package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class akfb extends ser {
    static {
        csjc.a = eovw.RELEASE_BUILD;
    }

    @Override // defpackage.ser, defpackage.arbh, defpackage.ekka, android.app.Application
    public void onCreate() {
        super.onCreate();
        if (ctid.g(this)) {
            cful.ao.k(true);
            aeek.a.k(true);
            ConversationMessageView.b.k(true);
        }
    }
}
