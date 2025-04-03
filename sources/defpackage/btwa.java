package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btwa implements fbba {
    public static dtux a() {
        return new dtuf(btvy.d, "message_classifications_table", new dtue() { // from class: btvp
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btvy.a;
                valueOf.getClass();
                if (i == 58400) {
                    btvy.d(dtveVar, 58400);
                    return;
                }
                if (i == 58480) {
                    dtveVar.y("ALTER TABLE message_classifications_table ADD COLUMN classification_details BLOB;");
                } else {
                    if (i != 59350) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_message_classifications_table_classification_type");
                    dtveVar.y("CREATE INDEX index_message_classifications_table_classification_type ON message_classifications_table(classification_type);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
