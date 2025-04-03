package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bulf implements fbba {
    public static dtux a() {
        return new dtuf(buld.c, "message_spam", new dtue() { // from class: bukr
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = buld.a;
                valueOf.getClass();
                switch (i) {
                    case 30000:
                        buld.e(dtveVar, 30000);
                        break;
                    case 45040:
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN score REAL DEFAULT(0.0);");
                        break;
                    case 58030:
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN outcome INT DEFAULT(1);");
                        break;
                    case 58100:
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN ares_initiated_by TEXT DEFAULT('');");
                        break;
                    case 58350:
                        dtveVar.y("DROP INDEX IF EXISTS index_message_spam_message_id");
                        dtveVar.y("CREATE INDEX index_message_spam_message_id ON message_spam(message_id);");
                        break;
                    case 59190:
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN classification_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 59200:
                        dtveVar.y("DROP INDEX IF EXISTS index_message_spam_classification_timestamp");
                        dtveVar.y("CREATE INDEX index_message_spam_classification_timestamp ON message_spam(classification_timestamp);");
                        break;
                    case 59460:
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_message_spam_conversation_id ON message_spam(conversation_id);");
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN trigger INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN action_type INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN action_contributors INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN error_code INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE message_spam ADD COLUMN reclassification_index INT DEFAULT(0);");
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
