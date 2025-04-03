package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqzx implements fbba {
    public static dtux a() {
        return new dtuf(bqzv.d, "contacts", new dtue() { // from class: bqzn
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqzv.a;
                valueOf.getClass();
                switch (i) {
                    case 58630:
                        bqzv.e(dtveVar, 58630);
                        break;
                    case 59070:
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN sort_key TEXT NOT NULL;");
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN phonebook_label TEXT NOT NULL;");
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN phonebook_bucket INTEGER;");
                        dtveVar.y("DROP INDEX IF EXISTS contacts_sort");
                        dtveVar.y("CREATE INDEX contacts_sort ON contacts(phonebook_bucket, sort_key);");
                        break;
                    case 59080:
                        dtveVar.y("DROP INDEX IF EXISTS index_contacts_phonebook_label");
                        dtveVar.y("CREATE INDEX index_contacts_phonebook_label ON contacts(phonebook_label);");
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN contact_type INTEGER;");
                        break;
                    case 59120:
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN display_destination TEXT NOT NULL;");
                        break;
                    case 60150:
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN type_label TEXT;");
                        break;
                    case 60690:
                        dtveVar.y("ALTER TABLE contacts ADD COLUMN contact_fingerprint TEXT UNIQUE ON CONFLICT REPLACE;");
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
