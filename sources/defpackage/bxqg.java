package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqg extends dtup {
    public static final String[] a = {"restore_workflow_scratch_timestamps.which_database", "restore_workflow_scratch_timestamps.message_id", "restore_workflow_scratch_timestamps.timestamp_in_seconds", "restore_workflow_scratch_timestamps.timestamp_mod_1000"};
    public static final bxpq b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_restore_workflow_scratch_timestamps_message_id");
        enhdVar.k("timestamp_in_seconds", "index_restore_workflow_scratch_timestamps_timestamp_in_seconds");
        enhdVar.c();
        b = new bxpq();
        c = new int[]{60420};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("which_database INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp_in_seconds INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp_mod_1000 INTEGER");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_timestamps (");
        sb.append(", UNIQUE(which_database,message_id) ON CONFLICT IGNORE);");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_timestamps_message_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_timestamps_message_id ON restore_workflow_scratch_timestamps(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_timestamps_timestamp_in_seconds");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_timestamps_timestamp_in_seconds ON restore_workflow_scratch_timestamps(timestamp_in_seconds);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
