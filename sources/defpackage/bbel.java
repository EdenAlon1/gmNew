package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbel {
    private static final cskc a = cskc.g("BugleDataModel", "DeleteMessageUtil");
    private final ffbr b;
    private final coxk c;

    public bbel(ffbr ffbrVar, coxk coxkVar) {
        this.b = ffbrVar;
        this.c = coxkVar;
    }

    public final void a(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            return;
        }
        ffbr ffbrVar = this.b;
        MessageIdType B = messageCoreData.B();
        if (((cgpv) ffbrVar.b()).a(B) > 0) {
            csjb c = a.c();
            c.I("Deleted local message.");
            c.d(B);
            c.r();
        } else {
            csjb e = a.e();
            e.I("Could not delete local message.");
            e.d(B);
            e.r();
        }
        Uri u = messageCoreData.u();
        if (u == null) {
            csjb c2 = a.c();
            c2.I("Local message has no telephony uri.");
            c2.d(B);
            c2.r();
            return;
        }
        if (this.c.a(u, "Bugle.Telephony.Delete.MmsWap.Latency") > 0) {
            csjb c3 = a.c();
            c3.I("Deleted message. uri:");
            c3.I(u);
            c3.r();
            return;
        }
        csjb e2 = a.e();
        e2.I("Could not delete message from telephony.");
        e2.d(B);
        e2.A("messageUri", u);
        e2.r();
    }
}
