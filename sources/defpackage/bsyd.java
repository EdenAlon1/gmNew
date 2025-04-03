package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyd implements fbba {
    public static dtux a() {
        return new dtuf(bsyb.c, "drafts", new dtue() { // from class: bsxt
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bsyb.a;
                valueOf.getClass();
                switch (i) {
                    case 59150:
                        bsyb.d(dtveVar, 59150);
                        break;
                    case 59170:
                        dtveVar.y("ALTER TABLE drafts ADD COLUMN subject TEXT;");
                        dtveVar.y("ALTER TABLE drafts ADD COLUMN is_urgent INT DEFAULT(0) NOT NULL;");
                        break;
                    case 59420:
                        dtveVar.y("ALTER TABLE drafts ADD COLUMN attachments BLOB;");
                        break;
                    case 59540:
                        dtveVar.y("ALTER TABLE drafts ADD COLUMN replied_to_message_id TEXT;");
                        break;
                    case 59720:
                        dtveVar.y("ALTER TABLE drafts ADD COLUMN is_encrypted INT DEFAULT(0) NOT NULL;");
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
