package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bifz extends dtyx {
    public bifz(String[] strArr) {
        super("messages LEFT JOIN parts ON (parts.message_id=messages._id AND %PARTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN read_reports ON (read_reports.message_id=messages._id AND %REPORTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN user_references ON (user_references.message_id=messages._id) LEFT JOIN participants AS user_ref_participant ON (user_ref_participant._id=user_references.user_ref_id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id) LEFT JOIN verified_sms_senders ON (verified_sms_senders.sender_id=participants.normalized_destination) LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id) LEFT JOIN message_reactions ON (message_reactions.message_id=messages._id) LEFT JOIN file_transfer ON (file_transfer.message_id=messages._id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN message_photos_sharing ON (message_photos_sharing.message_id=messages._id) LEFT JOIN vmt ON (vmt.part_id=parts._id) LEFT JOIN message_replies ON (message_replies.message_id=messages._id) LEFT JOIN messages AS replied_to_message ON (replied_to_message._ID = message_replies.replied_to_message_id AND replied_to_message.message_status IN (100, 1, 2, 11) AND replied_to_message.is_hidden = 0) LEFT JOIN participants AS replied_to_participant ON (replied_to_participant._ID = replied_to_message.sender_id) LEFT JOIN parts AS replied_to_message_part ON (replied_to_message_part.message_id = replied_to_message._ID) LEFT JOIN link_preview AS replied_to_message_link_preview ON (replied_to_message_link_preview.message_id = replied_to_message._ID) LEFT JOIN profiles_table ON (profiles_table.participant_id=participants._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", "messages.received_timestamp DESC, messages._id DESC", null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bifx b() {
        l();
        return new bifx(this.a.a());
    }

    public final void c(bigd bigdVar) {
        k(new biga(bigdVar));
    }
}
