package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bifx extends dtyq {
    public bifx(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bifv(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bige.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"participants._id", "messages.sender_id", "user_references.message_id", "messages._id", "participants._id", "user_references.user_ref_id", "link_preview.message_id", "messages._id", "verified_sms_senders.sender_id", "participants.normalized_destination", "verified_sms_brands.brand_id", "verified_sms_senders.brand_id", "conversations._id", "messages.conversation_id", "message_reactions.message_id", "messages._id", "file_transfer.message_id", "messages._id", "message_star.message_id", "messages._id", "message_photos_sharing.message_id", "messages._id", "vmt.part_id", "parts._id", "message_replies.message_id", "messages._id", "profiles_table.participant_id", "participants._id", "message_captions.message_id", "messages._id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"participants", "messages", "user_references", "messages", "participants", "user_references", "link_preview", "messages", "verified_sms_senders", "participants", "verified_sms_brands", "verified_sms_senders", "conversations", "messages", "message_reactions", "messages", "file_transfer", "messages", "message_star", "messages", "message_photos_sharing", "messages", "vmt", "parts", "message_replies", "messages", "profiles_table", "participants", "message_captions", "messages"};
    }
}
