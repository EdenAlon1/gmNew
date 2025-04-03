package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azhc extends dtup {
    public static final String[] a = {"group_members.group_token", "group_members.destination_token"};
    public static final azgo b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("group_token", "index_group_members_group_token");
        enhdVar.c();
        b = new azgo();
        c = new int[]{60430};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_token TEXT REFERENCES groups(token) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, "CREATE TABLE group_members (");
        sb.append(", PRIMARY KEY (group_token,destination_token));");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_group_members_group_token");
        arrayList.add("CREATE INDEX index_group_members_group_token ON group_members(group_token);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
