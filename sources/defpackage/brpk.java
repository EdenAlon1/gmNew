package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brpk extends dtry {
    protected brpk(dtsd dtsdVar) {
        super(dtsdVar);
    }

    @Override // defpackage.dtry
    protected final /* bridge */ /* synthetic */ dtyq a() {
        String[] strArr;
        String[] strArr2 = brps.a;
        Integer b = brps.b();
        if (b.intValue() == Integer.MAX_VALUE) {
            strArr = brps.a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("conversation_image_parts_view.conversation_id_messages");
            engrVar.h("conversation_image_parts_view.received_timestamp_messages");
            engrVar.h("conversation_image_parts_view.status_messages");
            engrVar.h("conversation_image_parts_view.uri_parts");
            engrVar.h("conversation_image_parts_view.content_type_parts");
            if (b.intValue() >= 10021) {
                engrVar.h("conversation_image_parts_view.original_uri_parts");
            }
            if (b.intValue() >= 60240) {
                engrVar.h("conversation_image_parts_view.image_display_state_parts");
            }
            engrVar.h("conversation_image_parts_view.display_destination_participants");
            engrVar.h("conversation_image_parts_view.full_name_participants");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new brpn(strArr).b();
    }
}
