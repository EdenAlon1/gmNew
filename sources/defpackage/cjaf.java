package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cjaf {
    public static final /* synthetic */ int a = 0;

    static {
        entd entdVar = cjal.a;
    }

    public static elfl a(final Context context, final cniz cnizVar, final Bundle bundle, final Intent intent, final ffbr ffbrVar) {
        return elfo.f(new Runnable() { // from class: cjae
            @Override // java.lang.Runnable
            public final void run() {
                int i = cjaf.a;
                Intent intent2 = new Intent(context, (Class<?>) NoConfirmationMessageSendAction.class);
                intent2.setAction("android.intent.action.RESPOND_VIA_MESSAGE");
                intent2.putExtras(bundle);
                intent2.setClipData(intent.getClipData());
                ((bbfh) ffbrVar.b()).d(cnizVar, intent2);
            }
        }, erpp.a);
    }

    public static void b(ciwj ciwjVar, ciwd ciwdVar) {
        cisw ciswVar = (cisw) ciwdVar;
        if (ciswVar.b.isEmpty()) {
            ((ensz) ((ensz) cjal.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule", "cancelNotification", 178, "IncomingMessageCallbacksModule.java")).q("Missing tag on notification action callback, which should not happen");
        } else {
            ciwjVar.b(ciswVar.a, (String) ciswVar.b.get());
        }
    }
}
