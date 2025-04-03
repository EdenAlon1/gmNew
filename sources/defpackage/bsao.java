package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsao implements fbba {
    public static dtux a() {
        return new dtuf(bsam.c, "conversation_suggestions", new dtue() { // from class: bsad
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bsam.a;
                valueOf.getClass();
                if (i == 11001) {
                    dtveVar.y("ALTER TABLE conversation_suggestions ADD COLUMN rcs_message_id TEXT;");
                    return;
                }
                if (i == 12000) {
                    dtveVar.y("ALTER TABLE conversation_suggestions ADD COLUMN target_rcs_message_id TEXT;");
                    dtveVar.y("ALTER TABLE conversation_suggestions ADD COLUMN read INT DEFAULT(0);");
                    dtveVar.y("ALTER TABLE conversation_suggestions ADD COLUMN received_timestamp INT DEFAULT(0);");
                } else {
                    if (i != 17000) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_conversation_suggestions_target_rcs_message_id");
                    dtveVar.y("CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
