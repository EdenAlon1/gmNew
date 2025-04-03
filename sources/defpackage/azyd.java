package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyd {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String[] e;
    public static final String[] f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String[] k;
    public static final cskc l;
    private static final cfva v;
    public final ffbr m;
    public final ffbr n;
    public final Map o;
    public final ffbr p;
    public final ffbr q;
    public final axkm r;
    public final azzp s;
    public final Map t;
    public final dttz u;

    static {
        String[] strArr = PartsTable.a;
        String str = "CREATE TRIGGER parts_TRIGGER AFTER INSERT ON parts FOR EACH ROW  BEGIN UPDATE parts SET timestamp= (SELECT received_timestamp FROM messages WHERE " + MessagesTable.c.a.toString() + "=NEW.message_id) WHERE " + PartsTable.d.a.toString() + "=NEW._id; END";
        a = str;
        String str2 = "CREATE TRIGGER parts_BLOB_TRIGGER AFTER UPDATE OF blob_id ON parts FOR EACH ROW  BEGIN UPDATE parts SET blob_upload_timestamp=1000*strftime('%s','now') WHERE " + PartsTable.d.a.toString() + "=NEW._id; END";
        b = str2;
        String str3 = "CREATE TRIGGER parts_COMPRESSED_BLOB_TRIGGER AFTER UPDATE OF compressed_blob_id ON parts FOR EACH ROW  BEGIN UPDATE parts SET compressed_blob_upload_timestamp=1000*strftime('%s','now') WHERE " + PartsTable.d.a.toString() + "=NEW._id; END";
        c = str3;
        String str4 = "CREATE TRIGGER messages_TRIGGER AFTER UPDATE OF received_timestamp ON messages FOR EACH ROW BEGIN UPDATE parts SET timestamp = NEW.received_timestamp WHERE " + PartsTable.d.b.toString() + " = NEW._id; END;";
        d = str4;
        e = new String[]{str, str4, str2, str3, bece.b(2), bece.b(1), bece.b(3), bece.b(4), bece.c(2), bece.c(3), bece.c(4), bece.a(2), bece.a(1), bece.a(3), bece.a(4), "CREATE TRIGGER participants_IS_NOT_EMPTY_TRIGER AFTER UPDATE ON participants WHEN NOT( OLD.is_valid_phone_number_data ) AND NEW.send_destination IS NOT NULL AND NEW.display_destination IS NOT NULL AND NEW.normalized_destination IS NOT NULL AND length(NEW.send_destination ) > 0  AND length(NEW.display_destination ) > 0  AND length(NEW.normalized_destination) > 0  BEGIN UPDATE participants  SET is_valid_phone_number_data = 1  WHERE rowid=NEW.rowid; END;"};
        f = new String[]{str, str4, str2, str3, bece.b(2), bece.b(1), bece.b(3), bece.c(2), bece.c(3), bece.a(2), bece.a(1), bece.a(3), "CREATE TRIGGER participants_IS_NOT_EMPTY_TRIGER AFTER UPDATE ON participants WHEN NOT( OLD.is_valid_phone_number_data ) AND NEW.send_destination IS NOT NULL AND NEW.display_destination IS NOT NULL AND NEW.normalized_destination IS NOT NULL AND length(NEW.send_destination ) > 0  AND length(NEW.display_destination ) > 0  AND length(NEW.normalized_destination) > 0  BEGIN UPDATE participants  SET is_valid_phone_number_data = 1  WHERE rowid=NEW.rowid; END;"};
        String[] strArr2 = btqq.a;
        g = "index_link_preview_message_id ON link_preview(message_id)";
        h = "CREATE INDEX IF NOT EXISTS ".concat(String.valueOf("index_link_preview_message_id ON link_preview(message_id)"));
        i = "CREATE INDEX ".concat(String.valueOf("index_link_preview_message_id ON link_preview(message_id)"));
        String[] strArr3 = byea.a;
        j = "CREATE INDEX index_stickers_sticker_set_id ON stickers(sticker_set_id)";
        String[] strArr4 = brps.a;
        String[] strArr5 = bkfh.a;
        String str5 = azwi.b;
        String[] strArr6 = boqc.a;
        String[] strArr7 = byrv.a;
        String[] strArr8 = bnlv.a;
        k = new String[]{"CREATE VIEW conversation_image_parts_view AS SELECT messages.conversation_id AS conversation_id_messages,messages.received_timestamp AS received_timestamp_messages,messages.message_status AS status_messages,parts.uri AS uri_parts,parts.content_type AS content_type_parts,parts.original_uri AS original_uri_parts,parts.image_display_state AS image_display_state_parts,participants.display_destination AS display_destination_participants,participants.full_name AS full_name_participants FROM messages LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN participants ON (participants._id=messages.sender_id) WHERE ((parts.content_type like 'image/%' OR parts.content_type = 'application/vnd.gsma.rcspushlocation+xml') AND parts.source <> 19) ORDER BY received_timestamp ASC, parts._id ASC;", "CREATE VIEW draft_parts_view AS SELECT messages._id AS _id_messages,messages.conversation_id AS conversation_id_messages,messages.sender_id AS sender_participant_id_messages,messages.sender_send_destination AS sender_send_destination_messages,messages.msisdn_receiving_rcs_message AS msisdn_receiving_rcs_message_messages,messages.receiving_network_country AS receiving_network_country_messages,messages.sent_timestamp AS sent_timestamp_messages,messages.queue_insert_timestamp AS queue_insert_timestamp_messages,messages.received_timestamp AS received_timestamp_messages,messages.message_protocol AS protocol_messages,messages.message_status AS status_messages,messages.message_report_status AS message_report_status_messages,messages.seen AS notified_messages,messages.read AS read_messages,messages.sms_message_uri AS sms_message_uri_messages,messages.sms_priority AS sms_priority_messages,messages.sms_message_size AS sms_message_size_messages,messages.mms_subject AS mms_subject_messages,messages.mms_transaction_id AS mms_transaction_id_messages,messages.mms_content_location AS mms_content_location_messages,messages.mms_expiry AS mms_expiry_messages,messages.rcs_expiry AS rcs_expiry_messages,messages.mms_retrieve_text AS mms_retrieve_text_messages,messages.raw_status AS raw_telephony_status_messages,messages.self_id AS self_id_messages,messages.my_identity_foreign_key AS my_identity_messages,messages.retry_start_timestamp AS retry_start_timestamp_messages,messages.cloud_sync_id AS cloud_sync_id_messages,messages.rcs_message_id_with_text_type AS rcs_message_id_messages,messages.etouffee_status AS rcs_encryption_status_messages,messages.verification_status AS verification_status_messages,messages.rcs_ui_status AS rcs_ui_status_messages,messages.is_hidden AS is_hidden_messages,messages.rcs_remote_instance AS rcs_remote_instance_messages,messages.rcs_file_transfer_session_id AS rcs_file_transfer_session_id_messages,messages.sms_error_code AS sms_error_code_messages,messages.sms_error_desc_map_name AS sms_error_desc_map_name_messages,messages.correlation_id AS correlation_id_messages,messages.cms_id AS cms_id_messages,messages.cms_last_mod_seq AS cms_last_mod_seq_messages,messages.web_id AS web_id_messages,messages.usage_stats_logging_id AS usage_stats_logging_id_messages,messages.send_counter AS send_counter_messages,messages.original_rcs_message_id AS original_rcs_message_id_messages,messages.custom_delivery_receipt_mime_type AS custom_delivery_receipt_mime_type_messages,messages.custom_delivery_receipt_content AS custom_delivery_receipt_content_messages,messages.report_attempt_acounter AS report_attempt_counter_messages,messages.custom_headers AS custom_headers_messages,messages.cms_correlation_id AS cms_correlation_id_messages,messages.group_private_participant AS group_private_participant_messages,messages.original_message_id AS original_message_id_messages,messages.awaiting_reverse_sync AS awaiting_reverse_sync_messages,messages.old_sms_message_uri AS old_sms_message_uri_messages,messages.draft_id AS draft_id_messages,messages.result_code AS result_code_messages,messages.cms_life_cycle AS cms_life_cycle_messages,messages.mute_priority AS mute_priority_messages,messages.fallback_reason AS fallback_reason_messages,messages.auto_retry_counter AS auto_retry_counter_messages,messages.can_revoke_before_delivered_with_rcs AS can_revoke_before_delivered_with_rcs_messages,messages.trace_id AS trace_id_messages,messages.outgoing_delivery_report_status AS outgoing_delivery_report_status_messages,messages.outgoing_read_report_status AS outgoing_read_report_status_messages,messages.xms_transport AS xms_transport_messages,messages.message_original_protocol AS original_protocol_messages,messages.satellite_datagram_id AS satellite_datagram_id_messages,messages.encryption_protocol AS encryption_protocol_messages,messages.message_persistence_id AS message_persistence_id_messages,parts._id AS _id_parts,parts.message_id AS message_id_parts,parts.text AS text_parts,parts.uri AS uri_parts,parts.content_type AS content_type_parts,parts.original_uri AS original_uri_parts,parts.storage_uri AS storage_uri_parts,parts.width AS width_parts,parts.height AS height_parts,parts.timestamp AS timestamp_parts,parts.output_uri AS processing_output_uri_parts,parts.target_size AS target_size_parts,parts.processing_status AS processing_status_parts,parts.cms_attachment_processing_status AS cms_attachment_processing_status_parts,parts.conversation_id AS conversation_id_parts,parts.sticker_set_id AS sticker_set_id_parts,parts.sticker_id AS sticker_id_parts,parts.media_modified_timestamp AS media_modified_timestamp_parts,parts.longitude AS longitude_parts,parts.latitude AS latitude_parts,parts.preview_content_uri AS preview_content_uri_parts,parts.preview_content_type AS preview_content_type_parts,parts.fallback_uri AS fallback_uri_parts,parts.source AS source_parts,parts.bundle_index AS bundle_index_parts,parts.blob_id AS blob_id_parts,parts.blob_gaia_email AS blob_gaia_email_parts,parts.cms_full_size_blob_id AS cms_full_size_blob_id_parts,parts.cms_media_encryption_key AS cms_media_encryption_key_parts,parts.cms_compressed_media_encryption_key AS cms_compressed_media_encryption_key_parts,parts.blob_upload_permanent_failure AS blob_upload_permanent_failure_parts,parts.blob_upload_timestamp AS blob_upload_timestamp_parts,parts.expressive_sticker_name AS expressive_sticker_name_parts,parts.file_name AS file_name_parts,parts.duration AS duration_parts,parts.compressed_blob_id AS compressed_blob_id_parts,parts.cms_compressed_blob_id AS cms_compressed_blob_id_parts,parts.compressed_blob_upload_permanent_failure AS compressed_blob_upload_permanent_failure_parts,parts.compressed_blob_upload_timestamp AS compressed_blob_upload_timestamp_parts,parts.media_encryption_key AS media_encryption_key_parts,parts.compressed_media_encryption_key AS compressed_media_encryption_key_parts,parts.missing_entry_in_telephony AS missing_entry_in_telephony_parts,parts.awaiting_reverse_sync AS awaiting_reverse_sync_parts,parts.file_size_bytes AS file_size_bytes_parts,parts.local_cache_path AS local_cache_path_parts,parts.media_send_type AS media_send_type_parts,parts.voice_metadata AS voice_metadata_parts,parts.validation_status AS validation_status_parts,parts.processing_id AS processing_id_parts,parts.rich_card_media_download_failure_reason AS rich_card_media_download_failure_reason_parts,parts.image_display_state AS image_display_state_parts,parts.preserve_size AS preserve_size_parts FROM messages JOIN parts ON (parts.message_id=messages._id) WHERE message_status = 3;", str5, "CREATE VIEW reports_concat_view AS SELECT read_reports._id AS _id_read_reports,read_reports.message_id AS message_id_read_reports,group_concat(quote(read_reports.participant_id), '|') AS participant_id_read_reports,group_concat(quote(read_reports.receive_time), '|') AS receive_time_read_reports,group_concat(quote(read_reports.read_time), '|') AS read_time_read_reports,group_concat(quote(read_reports.ftd_time), '|') AS ftd_time_read_reports,group_concat(quote(read_reports.rowid), '|') AS read_reports__ROWID_read_reports FROM read_reports GROUP BY message_id;", "CREATE VIEW user_refs_concat_view AS SELECT user_references.message_id AS message_id_user_references,group_concat(quote(user_references.user_ref_id), '|') AS participant_id_user_references,group_concat(quote(user_references.user_ref_datetime), '|') AS user_ref_datetime_user_references,group_concat(quote(user_references.rowid), '|') AS user_references__ROWID_user_references,group_concat(quote((coalesce(participants.first_name,participants.full_name,participants.display_destination))), '|') AS user_ref_display_name,group_concat(quote((ifnull(participants.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri,group_concat(quote((ifnull(participants.full_name,\"\"))), '|') AS user_ref_full_name,group_concat(quote((ifnull(participants.lookup_key,\"\"))), '|') AS user_ref_lookup_key,group_concat(quote(participants.normalized_destination), '|') AS normalized_destination_participants,group_concat(quote(participants.color_palette_index), '|') AS color_palette_index_participants,group_concat(quote(participants.color_type), '|') AS color_type_participants,group_concat(quote(participants.extended_color), '|') AS extended_color_participants,group_concat(quote(participants.rowid), '|') AS participants__ROWID_participants FROM user_references LEFT JOIN participants ON (participants._id=user_references.user_ref_id) GROUP BY user_references.message_id;", "CREATE VIEW message_replies_view AS SELECT message_replies.message_id AS message_id_message_replies,messages._id AS _id_messages,messages.received_timestamp AS received_timestamp_messages,participants._id AS _id_participants,participants.sub_id AS sub_id_participants,participants.normalized_destination AS normalized_destination_participants,participants.display_destination AS display_destination_participants,participants.full_name AS full_name_participants,participants.first_name AS first_name_participants,group_concat(quote(parts._id), '|') AS _id_parts,group_concat(quote(parts.text), '|') AS text_parts,group_concat(quote(parts.uri), '|') AS uri_parts,group_concat(quote(parts.content_type), '|') AS content_type_parts,group_concat(quote(parts.file_name), '|') AS file_name_parts,group_concat(quote(parts.duration), '|') AS duration_parts,group_concat(quote(parts.rowid), '|') AS parts__ROWID_parts,link_preview.trigger_url AS trigger_url_link_preview,link_preview.expiration_time_millis AS expiration_time_millis_link_preview,link_preview.link_title AS link_title_link_preview,link_preview.link_image_url AS link_image_url_link_preview,link_preview.link_preview_failed AS link_preview_failed_link_preview FROM message_replies LEFT JOIN messages ON (messages._id=message_replies.replied_to_message_id) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id) WHERE (message_replies.replied_to_message_id NOTNULL AND (messages._id NOTNULL AND participants._id NOTNULL AND parts._id NOTNULL) AND (messages.message_status IN (100, 1, 2, 11) AND messages.is_hidden = 0)) OR (message_replies.replied_to_message_id ISNULL AND message_replies.replied_to_message_id_null_reason = 0) GROUP BY message_replies.message_id;"};
        l = cskc.g("BugleDataModel", "DatabaseHelperUtils");
        v = cfvl.i(cfvl.b, "useTriggersForParticipantsAuditLog", true);
    }

    public azyd(ffbr ffbrVar, ffbr ffbrVar2, Map map, ffbr ffbrVar3, ffbr ffbrVar4, axkm axkmVar, azzp azzpVar, Map map2, dttz dttzVar) {
        this.m = ffbrVar;
        this.n = ffbrVar2;
        this.o = map;
        this.p = ffbrVar3;
        this.q = ffbrVar4;
        this.r = axkmVar;
        this.s = azzpVar;
        this.t = map2;
        this.u = dttzVar;
    }

    public static int a(int i2) {
        return i2 + 1;
    }

    public static int b(dttz dttzVar) {
        return a(((dtqy) dttzVar).c);
    }

    public static String c(String str) {
        Iterator it = emye.b('.').g(str).iterator();
        it.next();
        return (String) it.next();
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", j(), "type='trigger'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    if (!string.startsWith("android_") && !string.startsWith("sqlite_")) {
                        try {
                            sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + string);
                        } catch (SQLException e2) {
                            csjb a2 = l.a();
                            a2.I("unable to drop trigger.");
                            a2.A("triggerName", string);
                            a2.s(e2);
                        }
                    }
                } finally {
                    query.close();
                }
            }
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", j(), "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    k(sQLiteDatabase, query.getString(0));
                } finally {
                    query.close();
                }
            }
        }
    }

    public static void f(dtve dtveVar) {
        if (((dtqy) dtveVar.l()).b.equals("$primary")) {
            String[] strArr = k;
            int length = strArr.length;
            for (int i2 = 0; i2 < 6; i2++) {
                dtveVar.y(strArr[i2]);
            }
        }
    }

    public static void g(dtve dtveVar) {
        if (((dtqy) dtveVar.l()).b.equals("$primary") && ((Boolean) v.e()).booleanValue()) {
            String str = (String) DesugarArrays.stream(brww.a).map(new Function() { // from class: azxl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return "NEW.".concat(String.valueOf(azyd.c((String) obj)));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", "));
            String str2 = (String) DesugarArrays.stream(brww.a).map(new Function() { // from class: azxm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return "OLD.".concat(String.valueOf(azyd.c((String) obj)));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", "));
            p(brww.a, brux.a);
            dtveVar.y(n(str, "conversation_participants_insert_audit_log", "conversation_participants_audit_log", "conversation_participants"));
            dtveVar.y(o(str, "conversation_participants_update_audit_log", "conversation_participants_audit_log", "conversation_participants"));
            dtveVar.y(m(str2, "conversation_participants_delete_audit_log", "conversation_participants_audit_log", "conversation_participants"));
            String str3 = (String) DesugarArrays.stream(bsdr.a).map(new Function() { // from class: azxj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return "NEW.".concat(String.valueOf(azyd.c((String) obj)));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", "));
            String str4 = (String) DesugarArrays.stream(bsdr.a).map(new Function() { // from class: azxk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return "OLD.".concat(String.valueOf(azyd.c((String) obj)));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", "));
            p(bsdr.a, bsbx.a);
            dtveVar.y(n(str3, "conversation_to_participants_insert_audit_log", "conversation_to_participants_audit_log", "conversation_to_participants"));
            dtveVar.y(o(str3, "conversation_to_participants_update_audit_log", "conversation_to_participants_audit_log", "conversation_to_participants"));
            dtveVar.y(m(str4, "conversation_to_participants_delete_audit_log", "conversation_to_participants_audit_log", "conversation_to_participants"));
            final engw t = engw.t("_id", "operation_datetime", "operation_type");
            final List list = (List) DesugarArrays.stream(ParticipantsTable.a).map(new Function() { // from class: azxr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return azyd.c((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: azxv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str5 = (String) obj;
                    String str6 = azyd.a;
                    return str5.equals("_id") ? "participant_id" : str5;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).sorted().map(new Function() { // from class: azxw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str5 = (String) obj;
                    String str6 = azyd.a;
                    return str5.equals("participant_id") ? "_id" : str5;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new azxx()));
            List list2 = (List) DesugarArrays.stream(bvoy.a).map(new Function() { // from class: azxy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return azyd.c((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: azxz
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str5 = azyd.a;
                    return !engw.this.contains((String) obj);
                }
            }).filter(new Predicate() { // from class: azya
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str5 = (String) obj;
                    String str6 = azyd.a;
                    return list.contains(str5) || str5.equals("participant_id");
                }
            }).sorted().collect(Collectors.toUnmodifiableList());
            String str5 = (String) Collection.EL.stream(list).map(new Function() { // from class: azyb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str6 = azyd.a;
                    return "NEW.".concat(String.valueOf((String) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", "));
            String str6 = (String) Collection.EL.stream(list).map(new Function() { // from class: azyc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str7 = azyd.a;
                    return "OLD.".concat(String.valueOf((String) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", "));
            String d2 = ParticipantsTable.c.i.d();
            emyw.e(d2);
            String d3 = ParticipantsTable.c.h.d();
            emyw.e(d3);
            String d4 = ParticipantsTable.c.y.d();
            emyw.e(d4);
            String d5 = ParticipantsTable.c.f.d();
            emyw.e(d5);
            String d6 = ParticipantsTable.c.g.d();
            emyw.e(d6);
            String d7 = ParticipantsTable.c.m.d();
            emyw.e(d7);
            String d8 = ParticipantsTable.c.q.d();
            emyw.e(d8);
            String d9 = ParticipantsTable.c.d.d();
            emyw.e(d9);
            String d10 = ParticipantsTable.c.e.d();
            emyw.e(d10);
            String str7 = (String) DesugarArrays.stream(new String[]{d2, d3, d4, d5, d6, d7, d8, d9, d10}).map(new Function() { // from class: azxi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str8 = (String) obj;
                    String str9 = azyd.a;
                    return "OLD." + str8 + " <> NEW." + str8;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(" OR "));
            p(ParticipantsTable.a, bvoy.a);
            dtveVar.y("CREATE TRIGGER participants_insert_audit_log AFTER INSERT ON participants FOR EACH ROW  WHEN NEW.sub_id = -2 BEGIN INSERT INTO participants_audit_log (operation_datetime, operation_type, " + azxh.a(list2) + ") VALUES (CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 1, " + str5 + "); END");
            dtveVar.y("CREATE TRIGGER participants_update_audit_log AFTER UPDATE ON participants  FOR EACH ROW  WHEN (OLD.sub_id = -2 OR NEW.sub_id = -2) AND ( " + str7 + " ) BEGIN INSERT INTO participants_audit_log (operation_datetime, operation_type, " + azxh.a(list2) + ") VALUES (CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 2, " + str5 + "); END");
            String a2 = azxh.a(list2);
            StringBuilder sb = new StringBuilder("CREATE TRIGGER participants_delete_audit_log AFTER DELETE ON participants  FOR EACH ROW  WHEN OLD.sub_id = -2 BEGIN INSERT INTO participants_audit_log (operation_datetime, operation_type, ");
            sb.append(a2);
            sb.append(") VALUES (CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 3, ");
            sb.append(str6);
            sb.append("); END");
            dtveVar.y(sb.toString());
        }
    }

    public static boolean h(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma foreign_keys", null);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    if (rawQuery.getInt(0) == 1) {
                        rawQuery.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }

    public static boolean i(dtve dtveVar) {
        return h(dtveVar.j());
    }

    public static String[] j() {
        return new String[]{"name"};
    }

    static void k(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
        } catch (SQLException e2) {
            csjb a2 = l.a();
            a2.I("unable to drop view.");
            a2.A("viewName", str);
            a2.s(e2);
        }
    }

    public static void l(Cursor cursor) {
        if (cursor != null) {
            cursor.getCount();
        }
    }

    private static String m(String str, String str2, String str3, String str4) {
        return "CREATE TRIGGER " + str2 + " AFTER DELETE ON " + str4 + "  FOR EACH ROW BEGIN INSERT INTO " + str3 + " VALUES (NULL, CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 3, " + str + "); END";
    }

    private static String n(String str, String str2, String str3, String str4) {
        return "CREATE TRIGGER " + str2 + " AFTER INSERT ON " + str4 + " FOR EACH ROW BEGIN INSERT INTO " + str3 + " VALUES (NULL, CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 1, " + str + "); END";
    }

    private static String o(String str, String str2, String str3, String str4) {
        return "CREATE TRIGGER " + str2 + " AFTER UPDATE ON " + str4 + "  FOR EACH ROW BEGIN INSERT INTO " + str3 + " VALUES (NULL, CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 2, " + str + "); END";
    }

    private static void p(String[] strArr, String[] strArr2) {
        if (strArr.length + 3 != strArr2.length) {
            throw new IllegalStateException("Ensure that the audit table has the same columns as the original table columns in the same order (plus some metadata in the first 3 columns).");
        }
        for (int i2 = 1; i2 < strArr.length; i2++) {
            String c2 = c(strArr[i2]);
            String c3 = c(strArr2[i2 + 3]);
            if (!c3.equals(c2)) {
                throw new IllegalStateException(a.m(c3, c2, "The original and audit tables must be kept in the same order and with the same names. Different column names: ", " != "));
            }
        }
    }
}
