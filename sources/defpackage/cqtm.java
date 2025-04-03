package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqtm implements fbba {
    public static dtux a() {
        return new dtuf(cqtj.d, "file_transfer", new dtue() { // from class: cqtb
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = cqtj.a;
                valueOf.getClass();
                switch (i) {
                    case 52060:
                        cqtj.f(dtveVar, 52060);
                        break;
                    case 55030:
                        dtveVar.y("ALTER TABLE file_transfer ADD COLUMN file_information BLOB;");
                        dtveVar.y("ALTER TABLE file_transfer ADD COLUMN transfer_handle TEXT;");
                        break;
                    case 56040:
                        dtveVar.y("ALTER TABLE file_transfer ADD COLUMN opaque_data BLOB;");
                        break;
                    case 58450:
                        dtveVar.y("DROP INDEX IF EXISTS index_file_transfer_transfer_id");
                        dtveVar.y("CREATE INDEX index_file_transfer_transfer_id ON file_transfer(transfer_id);");
                        break;
                    case 59910:
                        dtveVar.y("ALTER TABLE file_transfer ADD COLUMN thumbnail_information BLOB;");
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
