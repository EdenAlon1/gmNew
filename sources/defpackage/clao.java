package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clao implements tun {
    private static final entd a = entd.c("BugleGroupManagement");
    private final clas b;

    public clao(clas clasVar) {
        this.b = clasVar;
    }

    @Override // defpackage.tun
    public final void a(bcqs bcqsVar) {
        if (!bcqsVar.d.A()) {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupOnConversationOpenedHandler", "onConversationOpened", 48, "RecoverDisabledRcsGroupOnConversationOpenedHandler.java")).q("Recover disabled RCS group disabled because this conversation is not a RCS group conversation.");
            return;
        }
        clas clasVar = this.b;
        ConversationIdType conversationIdType = bcqsVar.e;
        typ typVar = (typ) bcqsVar.d;
        ((ckzy) clasVar).a(conversationIdType, typVar.g, typVar.t);
    }
}
