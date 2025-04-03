package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjvg extends dtyq {
    public bjvg(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bjvf(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bjvk.a;
        HashMap hashMap = new HashMap();
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
        return new String[0];
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[0];
    }
}
