package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkk extends dtyq {
    public agkk(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new agki(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = agkp.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"messages._id", "participants._id", "messages.sender_id", "participants._id", "conversation_to_participants.participant_id", "profiles_table.participant_id", "conversation_to_participants.participant_id", "parts.message_id", "messages._id", "reminders.message_id", "messages._id", "conversation_pin.conversation_id", "conversations._id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"messages", "participants", "messages", "participants", "conversation_to_participants", "profiles_table", "conversation_to_participants", "parts", "messages", "reminders", "messages", "conversation_pin", "conversations"};
    }
}
