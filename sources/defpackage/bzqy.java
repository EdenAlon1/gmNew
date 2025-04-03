package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqy implements bczr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/E2eeConversationCreationListener");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;

    public bzqy(ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.d = ffskVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.bczr
    public final void a(ConversationIdType conversationIdType, amer amerVar) {
        if (amerVar != amer.b) {
            return;
        }
        axol.k(this.d, null, new bzqx(this, conversationIdType, null), 3);
    }
}
