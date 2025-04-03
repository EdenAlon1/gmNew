package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbki implements fbba {
    public static dtux a() {
        return new dtuf(bbke.d, "conversation_participants_backup", new dtue() { // from class: bbjw
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bbke.a;
                valueOf.getClass();
                if (i == 0) {
                    dtveVar.y("ALTER TABLE conversation_participants_backup ADD COLUMN is_normalized INT;");
                    dtveVar.y("ALTER TABLE conversation_participants_backup ADD COLUMN rcs_group_join_status INT;");
                } else {
                    if (i != 70) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE conversation_participants_backup ADD COLUMN is_c2p_only INT;");
                    dtveVar.y("CREATE INDEX index_conversation_participants_backup_is_c2p_only ON conversation_participants_backup(is_c2p_only);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
