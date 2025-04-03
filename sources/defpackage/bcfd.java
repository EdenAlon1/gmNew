package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcfd implements fbba {
    public static dtux a() {
        return new dtuf(bcfa.c, "backup_metadata", new dtue() { // from class: bceu
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bcfa.a;
                valueOf.getClass();
                if (i != 0) {
                    return;
                }
                dtveVar.y("ALTER TABLE backup_metadata ADD COLUMN created_timestamp INT;");
                dtveVar.y("ALTER TABLE backup_metadata ADD COLUMN schema_version INT;");
                dtveVar.y("ALTER TABLE backup_metadata ADD COLUMN backup_id TEXT;");
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
