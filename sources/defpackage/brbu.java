package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbu implements fbba {
    public static dtux a() {
        return new dtuf(brbs.d, "conversation_classifications_table", new dtue() { // from class: brbk
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = brbs.a;
                valueOf.getClass();
                switch (i) {
                    case 58670:
                        brbs.d(dtveVar, 58670);
                        break;
                    case 58690:
                        dtveVar.y("ALTER TABLE conversation_classifications_table ADD COLUMN classification_state INTEGER DEFAULT(0) NOT NULL;");
                        break;
                    case 58790:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversation_classifications_table_date");
                        dtveVar.y("CREATE INDEX index_conversation_classifications_table_date ON conversation_classifications_table(date);");
                        break;
                    case 58840:
                        dtveVar.y("ALTER TABLE conversation_classifications_table ADD COLUMN impression_count INTEGER DEFAULT(0);");
                        dtveVar.y("ALTER TABLE conversation_classifications_table ADD COLUMN generated_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 59350:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversation_classifications_table_classification_type");
                        dtveVar.y("CREATE INDEX index_conversation_classifications_table_classification_type ON conversation_classifications_table(classification_type);");
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
