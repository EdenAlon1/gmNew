package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azjm extends dtup {
    public static final String[] a = {"groups.token", "groups.group_type", "groups.rcs_conference_uri", "groups.name", "groups.rcs_icon_url", "groups.rcs_group_state", "groups.tachygram_group_routing_token", "groups.rcs_group_capabilities", "groups.rcs_group_last_sync_timestamp"};
    public static final azis b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("group_type", "index_groups_group_type");
        enhdVar.c();
        b = new azis();
        c = new int[]{60430};
        d = new int[]{60460};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY REFERENCES destinations(token) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_icon_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_state INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachygram_group_routing_token BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_last_sync_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_groups_group_type");
        arrayList.add("CREATE INDEX index_groups_group_type ON groups(group_type);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void d(dtve dtveVar) {
        dtveVar.y(b("groups"));
        for (String str : c()) {
            dtveVar.y(str);
        }
    }
}
