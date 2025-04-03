package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blqy extends dtyq<blqw, blqy, blra, MediaSearchQuery.BindData, blqv> {
    public blqy(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new blqw(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = MediaSearchQuery.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"messages._id", "parts.message_id", "participants._id", "messages.sender_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "parts.conversation_id", "conversations._id", "parts.conversation_id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"messages", "null", "participants", "messages", "message_star", "messages", "parent_disallowed_conversations", "parts", "conversations", "parts"};
    }
}
