package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btxi extends dtup {
    public static final String[] a = {"message_destinations._id", "message_destinations.message_send_receive_attempt_id", "message_destinations.message_destination_type", "message_destinations.message_destination_raw"};
    public static final btwu b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_send_receive_attempt_id", "index_message_destinations_message_send_receive_attempt_id");
        enhdVar.c();
        b = new btwu();
        c = new int[]{59360};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_send_receive_attempt_id TEXT NOT NULL REFERENCES message_send_receive_attempt(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_destination_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_destination_raw TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE message_destinations (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_destinations_message_send_receive_attempt_id");
        arrayList.add("CREATE INDEX index_message_destinations_message_send_receive_attempt_id ON message_destinations(message_send_receive_attempt_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
