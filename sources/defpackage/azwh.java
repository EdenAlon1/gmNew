package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azwh {
    public final ffbr a;
    private final ffbr b;

    public azwh(ffbr ffbrVar, ffbr ffbrVar2) {
        new ConcurrentHashMap();
        this.b = ffbrVar;
        this.a = ffbrVar2;
    }

    public final bcyk a(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("BugleDbOperationsCached::getExistingConversation");
        try {
            bcyk a = ((bdeo) this.b.b()).a(conversationIdType);
            f.close();
            return a;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
