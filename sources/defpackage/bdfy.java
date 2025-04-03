package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bdfy {
    public static bdfy c(ConversationIdType conversationIdType) {
        bczh bczhVar = new bczh();
        bczhVar.b(conversationIdType);
        bczhVar.c(false);
        return bczhVar.a();
    }

    public static bdfy d(ConversationIdType conversationIdType) {
        bczh bczhVar = new bczh();
        bczhVar.b(conversationIdType);
        bczhVar.c(true);
        return bczhVar.a();
    }

    public abstract ConversationIdType a();

    public abstract boolean b();
}
