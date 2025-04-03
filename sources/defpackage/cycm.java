package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycm {
    public final ffbr a;
    public final errm b;

    public cycm(ffbr ffbrVar, errm errmVar) {
        this.a = ffbrVar;
        this.b = errmVar;
    }

    final int a(ConversationIdType conversationIdType) {
        efbd.b();
        ekzz f = eleg.f("AddContactBannerDatabaseOperations#getConversationOpenCount");
        try {
            bseh r = ((bczy) this.a.b()).r(conversationIdType);
            int o = r != null ? r.o() : 0;
            f.close();
            return o;
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
