package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwy implements fbba {
    public static dtux a() {
        return new dtuf(brww.d, "conversation_participants", new dtue() { // from class: brwk
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = brww.a;
                valueOf.getClass();
                switch (i) {
                    case 58090:
                        dtveVar.y("ALTER TABLE conversation_participants ADD COLUMN is_normalized INT DEFAULT(0);");
                        break;
                    case 58460:
                        dtveVar.y("DROP INDEX IF EXISTS index_conversation_participants_participant_id");
                        dtveVar.y("CREATE INDEX index_conversation_participants_participant_id ON conversation_participants(participant_id);");
                        break;
                    case 58570:
                        dtveVar.y("ALTER TABLE conversation_participants ADD COLUMN rcs_group_join_status INT DEFAULT(0);");
                        break;
                    case 59440:
                        dtveVar.y("ALTER TABLE conversation_participants ADD COLUMN last_modified_by_key TEXT;");
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
