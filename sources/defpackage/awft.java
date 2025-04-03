package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awft implements fbba {
    public static dtux a() {
        return new dtuf(awfq.c, "file_processing", new dtue() { // from class: awfi
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = awfq.a;
                valueOf.getClass();
                if (i == 60260) {
                    awfq.d(dtveVar, 60260);
                } else {
                    if (i != 60700) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE file_processing ADD COLUMN mls_file_metadata BLOB;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
