package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btth implements fbba {
    public static dtux a() {
        return new dtuf(bttf.d, "messages_annotations", new dtue() { // from class: btsw
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bttf.a;
                valueOf.getClass();
                if (i == 20030) {
                    bttf.f(dtveVar, 20030);
                    return;
                }
                if (i == 20040) {
                    dtveVar.y("ALTER TABLE messages_annotations ADD COLUMN message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                    dtveVar.y("CREATE INDEX index_messages_annotations_message_id ON messages_annotations(message_id);");
                } else if (i == 20070) {
                    dtveVar.y("DROP INDEX IF EXISTS index_messages_annotations_conversation_id");
                    dtveVar.y("CREATE INDEX index_messages_annotations_conversation_id ON messages_annotations(conversation_id);");
                } else {
                    if (i != 58530) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_messages_annotations_annotation_type");
                    dtveVar.y("CREATE INDEX index_messages_annotations_annotation_type ON messages_annotations(annotation_type);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
