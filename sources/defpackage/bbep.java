package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbep implements bbcb {
    private final bbeo a;

    public bbep(bbeo bbeoVar) {
        this.a = bbeoVar;
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        ConversationIdType conversationIdType = (ConversationIdType) obj2;
        if (conversationIdType == null) {
            this.a.a(bbcdVar, obj);
        } else {
            this.a.b(bbcdVar, obj, conversationIdType);
        }
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        csix.c("Unreachable");
        this.a.a(bbcdVar, obj);
    }
}
