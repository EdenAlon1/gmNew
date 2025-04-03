package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcgh extends dtup {
    public static final String[] a = {"my_identities_backup.token", "my_identities_backup.address_type", "my_identities_backup.phone_number", "my_identities_backup.display_name"};
    public static final bcfq b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bcfq();
        c = new int[]{110};
    }

    public static dtve a() {
        return dtub.e("backup");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT");
        sb.insert(0, "CREATE TABLE my_identities_backup (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
