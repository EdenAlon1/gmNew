package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bucd implements fbba {
    public static dtux a() {
        return new dtuf(bucb.c, "message_photos_sharing", new dtue() { // from class: bubt
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bucb.a;
                valueOf.getClass();
                if (i == 58320) {
                    bucb.b(dtveVar, 58320);
                } else {
                    if (i != 58610) {
                        return;
                    }
                    if (dtub.a(bucb.a()) < 58610) {
                        throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_message_photos_sharing_message_id");
                    dtveVar.y("CREATE UNIQUE INDEX index_message_photos_sharing_message_id ON message_photos_sharing(message_id);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
