package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuch {
    public static final cuci a(boolean z, ConversationIdType conversationIdType, String str, cukx cukxVar, boolean z2, boolean z3, eoko eokoVar, cugj cugjVar, erfe erfeVar, int i, int i2, int i3) {
        cukxVar.getClass();
        eokoVar.getClass();
        if (i3 != 0) {
            return new cuci(z, conversationIdType, str, cukxVar, z2, z3, eokoVar, cugjVar, erfeVar, i, i2, i3, false, null, null);
        }
        throw null;
    }

    public static /* synthetic */ cuci b(boolean z, ConversationIdType conversationIdType, String str, cukx cukxVar, boolean z2, boolean z3, eoko eokoVar, cugj cugjVar, erfe erfeVar, int i, int i2) {
        cukx cukxVar2 = (i2 & 8) != 0 ? cukx.b : cukxVar;
        int i3 = i2 & 2;
        String str2 = (i2 & 4) != 0 ? null : str;
        if (i3 != 0) {
            conversationIdType = null;
        }
        return a(z, conversationIdType, str2, cukxVar2, (!((i2 & 16) == 0)) | z2, (!((i2 & 32) == 0)) | z3, eokoVar, (i2 & 128) != 0 ? null : cugjVar, erfeVar, 3, i, 2);
    }
}
