package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvfj implements fbba {
    public static dtux a() {
        return new dtuf(bvfh.c, "p2p_conversation_suggestion_event", new dtue() { // from class: bvfa
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bvfh.a;
                valueOf.getClass();
                switch (i) {
                    case 37000:
                        bvfh.e(dtveVar, 37000);
                        break;
                    case 42030:
                        dtveVar.y("ALTER TABLE p2p_conversation_suggestion_event ADD COLUMN model_output_label TEXT;");
                        break;
                    case 51030:
                        dtveVar.y("ALTER TABLE p2p_conversation_suggestion_event ADD COLUMN message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        break;
                    case 58940:
                        dtveVar.y("DROP INDEX IF EXISTS index_p2p_conversation_suggestion_event_message_id");
                        dtveVar.y("CREATE INDEX index_p2p_conversation_suggestion_event_message_id ON p2p_conversation_suggestion_event(message_id);");
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
