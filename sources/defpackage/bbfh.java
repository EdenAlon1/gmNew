package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbfh implements bbck {
    private static final cskc a = cskc.g("Bugle", "NoConfirmationMessageSendAction");

    public abstract Action a();

    public final void b(Intent intent) {
        Action a2 = a();
        if (intent == null) {
            return;
        }
        a.q("sendMessageFromAssistantIntent.");
        String scheme = intent.getScheme();
        if (scheme != null && scheme.startsWith("mms")) {
            intent.putExtra("requires_mms", true);
        }
        a2.t.t("notification_intent", intent);
        a2.t.r("bugle_message_source", 9);
        a2.r(null);
    }

    public final void d(cniz cnizVar, Intent intent) {
        Action a2 = a();
        if (intent == null) {
            return;
        }
        cskc cskcVar = a;
        cskcVar.q("sendMessageFromNotificationIntent.");
        String action = intent.getAction();
        if (!"android.intent.action.RESPOND_VIA_MESSAGE".equals(action)) {
            csjb d = cskcVar.d();
            d.I("onHandleIntent wrong action:");
            d.I(action);
            d.r();
            return;
        }
        if (intent.getExtras() == null) {
            cskcVar.q("Called to send SMS but no extras.");
        } else {
            a2.t.t("notification_intent", intent);
            a2.r(cnizVar);
        }
    }
}
