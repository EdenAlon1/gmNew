package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpyd extends dtyq<bpyb, bpyd, bpyf, UrlSearchQuery.BindData, bpya> {
    public bpyd(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bpyb(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = UrlSearchQuery.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"messages._id", "messages_annotations.message_id", "participants._id", "messages.sender_id", "link_preview.message_id", "messages_annotations.message_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "messages.conversation_id", "conversations._id", "messages.conversation_id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"messages", "null", "participants", "messages", "link_preview", "null", "message_star", "messages", "parent_disallowed_conversations", "messages", "conversations", "messages"};
    }
}
