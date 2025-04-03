package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnlr extends dtry {
    protected bnlr(dtsd dtsdVar) {
        super(dtsdVar);
    }

    @Override // defpackage.dtry
    protected final /* bridge */ /* synthetic */ dtyq a() {
        String[] strArr;
        String[] strArr2 = bnlv.a;
        Integer c = bnlv.c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = bnlv.a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("message_replies_view.message_id_message_replies");
            engrVar.h("message_replies_view._id_messages");
            engrVar.h("message_replies_view.received_timestamp_messages");
            engrVar.h("message_replies_view._id_participants");
            engrVar.h("message_replies_view.sub_id_participants");
            engrVar.h("message_replies_view.normalized_destination_participants");
            engrVar.h("message_replies_view.display_destination_participants");
            engrVar.h("message_replies_view.full_name_participants");
            engrVar.h("message_replies_view.first_name_participants");
            engrVar.h("message_replies_view._id_parts");
            engrVar.h("message_replies_view.text_parts");
            engrVar.h("message_replies_view.uri_parts");
            engrVar.h("message_replies_view.content_type_parts");
            if (c.intValue() >= 26000) {
                engrVar.h("message_replies_view.file_name_parts");
            }
            if (c.intValue() >= 26040) {
                engrVar.h("message_replies_view.duration_parts");
            }
            engrVar.h("message_replies_view.trigger_url_link_preview");
            engrVar.h("message_replies_view.expiration_time_millis_link_preview");
            engrVar.h("message_replies_view.link_title_link_preview");
            engrVar.h("message_replies_view.link_image_url_link_preview");
            if (c.intValue() >= 22020) {
                engrVar.h("message_replies_view.link_preview_failed_link_preview");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bnlu(strArr).b();
    }
}
