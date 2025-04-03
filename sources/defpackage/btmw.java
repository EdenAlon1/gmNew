package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmw implements fbba {
    public static dtux a() {
        return new dtuf(btmu.d, "lighter_conversations_table", new dtue() { // from class: btml
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btmu.a;
                valueOf.getClass();
                switch (i) {
                    case 58660:
                        btmu.e(dtveVar, 58660);
                        break;
                    case 58700:
                        dtveVar.y("ALTER TABLE lighter_conversations_table ADD COLUMN read INTEGER DEFAULT(1);");
                        break;
                    case 58760:
                        dtveVar.y("DROP INDEX IF EXISTS index_lighter_conversation_read_0");
                        dtveVar.y("CREATE INDEX index_lighter_conversation_read_0 ON lighter_conversations_table(read) WHERE read == 0;");
                        break;
                    case 58810:
                        dtveVar.y("ALTER TABLE lighter_conversations_table ADD COLUMN is_last_message_outgoing INTEGER;");
                        break;
                    case 58930:
                        dtveVar.y("DROP INDEX IF EXISTS index_lighter_conversations_table_conversation_id");
                        dtveVar.y("CREATE INDEX index_lighter_conversations_table_conversation_id ON lighter_conversations_table(conversation_id);");
                        break;
                    case 59030:
                        dtveVar.y("ALTER TABLE lighter_conversations_table ADD COLUMN conversation_status INTEGER;");
                        break;
                    case 59040:
                        dtveVar.y("ALTER TABLE lighter_conversations_table ADD COLUMN last_action_timestamp INT DEFAULT(0);");
                        break;
                    case 59100:
                        dtveVar.y("ALTER TABLE lighter_conversations_table ADD COLUMN sync_timestamp_ms INT DEFAULT(0);");
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
