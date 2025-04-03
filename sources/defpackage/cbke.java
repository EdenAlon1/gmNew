package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbke implements cbkd {
    public final cbkd a;

    public cbke(cbkm cbkmVar) {
        this.a = cbkmVar;
    }

    public final void a(MessagePartCoreData messagePartCoreData, cblo... cbloVarArr) {
        messagePartCoreData.getClass();
        Uri v = messagePartCoreData.v();
        v.getClass();
        ConversationIdType A = messagePartCoreData.A();
        CoreBuglePartialMessageId coreBuglePartialMessageId = new CoreBuglePartialMessageId(messagePartCoreData.B(), Long.parseLong(messagePartCoreData.aa()));
        messagePartCoreData.V();
        ((cbkm) this.a).b(A, coreBuglePartialMessageId, v, messagePartCoreData.p(), cbloVarArr);
    }

    public final boolean b(String str) {
        return ((cbkm) this.a).c.a.containsKey(Uri.parse(str));
    }
}
