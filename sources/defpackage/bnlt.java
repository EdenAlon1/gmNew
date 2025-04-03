package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnlt extends dtyq {
    public bnlt(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bnls(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bnlv.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"messages._id", "message_replies.replied_to_message_id", "participants._id", "messages.sender_id", "parts.message_id", "messages._id", "link_preview.message_id", "messages._id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"messages", "message_replies", "participants", "messages", "parts", "messages", "link_preview", "messages"};
    }
}
