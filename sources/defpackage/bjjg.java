package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjg extends dtyq {
    public bjjg(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bjje(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bjjn.a;
        HashMap hashMap = new HashMap();
        hashMap.put("reports_concat_view._id_read_reports", "read_reports._id");
        hashMap.put("reports_concat_view.message_id_read_reports", "read_reports.message_id");
        hashMap.put("reports_concat_view.participant_id_read_reports", "read_reports.participant_id");
        hashMap.put("reports_concat_view.receive_time_read_reports", "read_reports.receive_time");
        hashMap.put("reports_concat_view.read_time_read_reports", "read_reports.read_time");
        hashMap.put("reports_concat_view.ftd_time_read_reports", "read_reports.ftd_time");
        hashMap.put("reports_concat_view.read_reports__ROWID_read_reports", "read_reports.read_reports__ROWID");
        hashMap.put("user_refs_concat_view.message_id_user_references", "user_references.message_id");
        hashMap.put("user_refs_concat_view.participant_id_user_references", "user_references.participant_id");
        hashMap.put("user_refs_concat_view.user_ref_datetime_user_references", "user_references.user_ref_datetime");
        hashMap.put("user_refs_concat_view.user_references__ROWID_user_references", "user_references.user_references__ROWID");
        hashMap.put("user_refs_concat_view.normalized_destination_participants", "participants.normalized_destination");
        hashMap.put("user_refs_concat_view.color_palette_index_participants", "participants.color_palette_index");
        hashMap.put("user_refs_concat_view.color_type_participants", "participants.color_type");
        hashMap.put("user_refs_concat_view.extended_color_participants", "participants.extended_color");
        hashMap.put("user_refs_concat_view.participants__ROWID_participants", "participants.participants__ROWID");
        hashMap.put("message_replies_view.message_id_message_replies", "message_replies.message_id");
        hashMap.put("message_replies_view._id_messages", "messages._id");
        hashMap.put("message_replies_view.received_timestamp_messages", "messages.received_timestamp");
        hashMap.put("message_replies_view._id_participants", "participants._id");
        hashMap.put("message_replies_view.sub_id_participants", "participants.sub_id");
        hashMap.put("message_replies_view.normalized_destination_participants", "participants.normalized_destination");
        hashMap.put("message_replies_view.display_destination_participants", "participants.display_destination");
        hashMap.put("message_replies_view.full_name_participants", "participants.full_name");
        hashMap.put("message_replies_view.first_name_participants", "participants.first_name");
        hashMap.put("message_replies_view._id_parts", "parts._id");
        hashMap.put("message_replies_view.text_parts", "parts.text");
        hashMap.put("message_replies_view.uri_parts", "parts.uri");
        hashMap.put("message_replies_view.content_type_parts", "parts.content_type");
        hashMap.put("message_replies_view.file_name_parts", "parts.file_name");
        hashMap.put("message_replies_view.duration_parts", "parts.duration");
        hashMap.put("message_replies_view.parts__ROWID_parts", "parts.parts__ROWID");
        hashMap.put("message_replies_view.trigger_url_link_preview", "link_preview.trigger_url");
        hashMap.put("message_replies_view.expiration_time_millis_link_preview", "link_preview.expiration_time_millis");
        hashMap.put("message_replies_view.link_title_link_preview", "link_preview.link_title");
        hashMap.put("message_replies_view.link_image_url_link_preview", "link_preview.link_image_url");
        hashMap.put("message_replies_view.link_preview_failed_link_preview", "link_preview.link_preview_failed");
        return hashMap;
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"participants._id", "messages.sender_id", "link_preview.message_id", "messages._id", "verified_sms_senders.sender_id", "participants.normalized_destination", "verified_sms_brands.brand_id", "verified_sms_senders.brand_id", "conversations._id", "messages.conversation_id", "message_reactions.message_id", "messages._id", "file_transfer.message_id", "messages._id", "message_star.message_id", "messages._id", "message_photos_sharing.message_id", "messages._id", "vmt.part_id", "parts._id", "profiles_table.participant_id", "participants._id", "message_captions.message_id", "messages._id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"participants", "messages", "link_preview", "messages", "verified_sms_senders", "participants", "verified_sms_brands", "verified_sms_senders", "conversations", "messages", "message_reactions", "messages", "file_transfer", "messages", "message_star", "messages", "message_photos_sharing", "messages", "vmt", "parts", "profiles_table", "participants", "message_captions", "messages"};
    }
}
