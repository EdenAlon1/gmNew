package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azoi extends dtup {
    public static final String[] a = {"my_identities.token", "my_identities.canonical_token", "my_identities.provisioning_id", "my_identities.is_verified", "my_identities.address_type", "my_identities.phone_number", "my_identities.display_name"};
    public static final enhk b;
    public static final azno c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("my_identities.canonical_token", 60530);
        enhdVar.k("my_identities.provisioning_id", 59990);
        enhdVar.k("my_identities.is_verified", 60320);
        enhdVar.k("my_identities.address_type", 59980);
        enhdVar.k("my_identities.display_name", 60120);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("canonical_token", "index_my_identities_canonical_token");
        enhdVar2.c();
        c = new azno();
        d = new int[]{59450, 59980, 59990, 60120, 60320, 60530};
    }

    public static final azod a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("my_identities.token");
            if (c2.intValue() >= 60530) {
                engrVar.h("my_identities.canonical_token");
            }
            if (c2.intValue() >= 59990) {
                engrVar.h("my_identities.provisioning_id");
            }
            if (c2.intValue() >= 60320) {
                engrVar.h("my_identities.is_verified");
            }
            if (c2.intValue() >= 59980) {
                engrVar.h("my_identities.address_type");
            }
            engrVar.h("my_identities.phone_number");
            if (c2.intValue() >= 60120) {
                engrVar.h("my_identities.display_name");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new azod(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY NOT NULL");
        if (i >= 60530) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("canonical_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (i >= 59990) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("provisioning_id TEXT");
        }
        if (i >= 60320) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_verified INT DEFAULT(0) NOT NULL");
        }
        if (i >= 59980) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("address_type INT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (i >= 60120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("display_name TEXT");
        }
        sb.insert(0, "CREATE TABLE my_identities (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 60530) {
            arrayList.add("DROP INDEX IF EXISTS index_my_identities_canonical_token");
            arrayList.add("CREATE INDEX index_my_identities_canonical_token ON my_identities(canonical_token);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
