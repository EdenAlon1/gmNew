package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btob extends dtup {
    public static final String[] a = {"link_preview_participants_table._id", "link_preview_participants_table.participant_id", "link_preview_participants_table.manual_link_preview_count"};
    public static final enhk b = new enhd().c();
    public static final btnm c;
    public static final int[] d;

    static {
        new enhd().c();
        c = new btnm();
        d = new int[]{26010};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("manual_link_preview_count INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE link_preview_participants_table (");
        sb.append(", FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE);");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
