package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqzv extends dtup {
    public static final String[] a = {"contacts.cp2_id", "contacts.contact_id", "contacts.lookup_key", "contacts.phone_number", "contacts.display_name", "contacts.given_name", "contacts.family_name", "contacts.photo", "contacts.thumbnail", "contacts.birthday", "contacts.anniversary", "contacts.last_updated_timestamp", "contacts.sort_key", "contacts.phonebook_label", "contacts.phonebook_bucket", "contacts.contact_type", "contacts.type_label", "contacts.display_destination", "contacts.contact_fingerprint"};
    public static final enhk b;
    public static final bqyn c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("contacts.sort_key", 59070);
        enhdVar.k("contacts.phonebook_label", 59070);
        enhdVar.k("contacts.phonebook_bucket", 59070);
        enhdVar.k("contacts.contact_type", 59080);
        enhdVar.k("contacts.type_label", 60150);
        enhdVar.k("contacts.display_destination", 59120);
        enhdVar.k("contacts.contact_fingerprint", 60690);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("cp2_id", "index_contacts_cp2_id");
        enhdVar2.k("contact_id", "index_contacts_contact_id");
        enhdVar2.k("lookup_key", "index_contacts_lookup_key");
        enhdVar2.k("phone_number", "index_contacts_phone_number");
        enhdVar2.k("phonebook_label", "index_contacts_phonebook_label");
        enhdVar2.c();
        c = new bqyn();
        d = new int[]{58630, 60150};
        e = new int[]{59070, 59080, 59120, 60690};
    }

    public static final bqzs a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("contacts.cp2_id");
            engrVar.h("contacts.contact_id");
            engrVar.h("contacts.lookup_key");
            engrVar.h("contacts.phone_number");
            engrVar.h("contacts.display_name");
            engrVar.h("contacts.given_name");
            engrVar.h("contacts.family_name");
            engrVar.h("contacts.photo");
            engrVar.h("contacts.thumbnail");
            engrVar.h("contacts.birthday");
            engrVar.h("contacts.anniversary");
            engrVar.h("contacts.last_updated_timestamp");
            if (c2.intValue() >= 59070) {
                engrVar.h("contacts.sort_key");
            }
            if (c2.intValue() >= 59070) {
                engrVar.h("contacts.phonebook_label");
            }
            if (c2.intValue() >= 59070) {
                engrVar.h("contacts.phonebook_bucket");
            }
            if (c2.intValue() >= 59080) {
                engrVar.h("contacts.contact_type");
            }
            if (c2.intValue() >= 60150) {
                engrVar.h("contacts.type_label");
            }
            if (c2.intValue() >= 59120) {
                engrVar.h("contacts.display_destination");
            }
            if (c2.intValue() >= 60690) {
                engrVar.h("contacts.contact_fingerprint");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bqzs(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(h().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cp2_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("given_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("family_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("thumbnail TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("birthday TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("anniversary TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_updated_timestamp INTEGER NOT NULL");
        if (i >= 59070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sort_key TEXT NOT NULL");
        }
        if (i >= 59070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("phonebook_label TEXT NOT NULL");
        }
        if (i >= 59070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("phonebook_bucket INTEGER");
        }
        if (i >= 59080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_type INTEGER");
        }
        if (i >= 60150) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("type_label TEXT");
        }
        if (i >= 59120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("display_destination TEXT NOT NULL");
        }
        if (i >= 60690) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_fingerprint TEXT UNIQUE ON CONFLICT REPLACE");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "contacts"));
        for (String str : g(i)) {
            dtveVar.y(str);
        }
    }

    public static void f(dtve dtveVar, int i) {
        dtub.J(dtveVar, "contacts", d(i, "TEMP___contacts"), a, g(i));
    }

    static String[] g(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_contacts_cp2_id");
        arrayList.add("CREATE UNIQUE INDEX index_contacts_cp2_id ON contacts(cp2_id);");
        arrayList.add("DROP INDEX IF EXISTS index_contacts_contact_id");
        arrayList.add("CREATE INDEX index_contacts_contact_id ON contacts(contact_id);");
        arrayList.add("DROP INDEX IF EXISTS index_contacts_lookup_key");
        arrayList.add("CREATE INDEX index_contacts_lookup_key ON contacts(lookup_key);");
        arrayList.add("DROP INDEX IF EXISTS index_contacts_phone_number");
        arrayList.add("CREATE INDEX index_contacts_phone_number ON contacts(phone_number);");
        if (i >= 59070) {
            arrayList.add("DROP INDEX IF EXISTS contacts_sort");
            arrayList.add("CREATE INDEX contacts_sort ON contacts(phonebook_bucket, sort_key);");
        }
        if (i >= 59080) {
            arrayList.add("DROP INDEX IF EXISTS index_contacts_phonebook_label");
            arrayList.add("CREATE INDEX index_contacts_phonebook_label ON contacts(phonebook_label);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf h() {
        return b().P();
    }
}
