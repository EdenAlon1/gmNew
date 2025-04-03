package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfki extends dtyq<bfkf, bfki, bfkk, bejf, bfke> {
    public bfki(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bfkg(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bfkq.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"messages._id", "conversations.latest_message_id", "participants._id", "messages.sender_id", "participants._id", "conversation_to_participants.participant_id", "profiles_table.participant_id", "conversation_to_participants.participant_id", "parts.message_id", "messages._id", "vmt.part_id", "parts._id", "reminders.message_id", "conversations.latest_message_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "conversations._id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"messages", "null", "participants", "messages", "participants", "conversation_to_participants", "profiles_table", "conversation_to_participants", "parts", "messages", "vmt", "parts", "reminders", "conversations", "message_star", "messages", "parent_disallowed_conversations", "conversations"};
    }
}
