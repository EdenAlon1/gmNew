package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqv {
    public final byzp a;
    private final Context b;

    public cnqv(byzp byzpVar, Context context) {
        byzpVar.getClass();
        context.getClass();
        this.a = byzpVar;
        this.b = context;
    }

    public final MessageCoreData a(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, eyja eyjaVar, cnqt cnqtVar) {
        cnqtVar.getClass();
        return this.a.p(str, selfIdentityId, conversationIdType, cnqtVar.f, cnqu.a(eyjaVar), this.b.getString(cnqtVar.g));
    }
}
