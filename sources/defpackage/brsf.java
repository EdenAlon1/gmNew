package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brsf implements fbba {
    public static dtux a() {
        return new dtuf(brsd.d, "conversation_labels", new dtue() { // from class: brrv
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = brsd.a;
                valueOf.getClass();
                switch (i) {
                    case 51000:
                        brsd.e(dtveVar, 51000);
                        break;
                    case 53010:
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN snippet_text TEXT;");
                        break;
                    case 53020:
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                        dtveVar.y("DROP INDEX IF EXISTS unique_idx_conversation_label");
                        dtveVar.y("CREATE UNIQUE INDEX unique_idx_conversation_label ON conversation_labels(conversation_id, label);");
                        break;
                    case 55040:
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN preview_uri TEXT;");
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN preview_content_type TEXT;");
                        break;
                    case 57050:
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN message_status INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN read INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN received_timestamp INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN message_protocol INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE conversation_labels ADD COLUMN raw_telephony_status INTEGER DEFAULT(0);");
                        break;
                    case 58430:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversation_labels_label");
                        dtveVar.y("CREATE INDEX index_conversation_labels_label ON conversation_labels(label);");
                        break;
                    case 58920:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversation_labels_message_id");
                        dtveVar.y("CREATE INDEX index_conversation_labels_message_id ON conversation_labels(message_id);");
                        break;
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
