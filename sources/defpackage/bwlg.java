package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwlg extends dtup {
    public static final String[] a = {"pipeline_work.work_id", "pipeline_work.pipeline_type", "pipeline_work.sequencing_key", "pipeline_work.insertion_timestamp", "pipeline_work.execution_attempt_count", "pipeline_work.execution_state", "pipeline_work.client_supplied_id", "pipeline_work.payload"};
    public static final bwkj b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bwkj();
        c = new int[]{60510};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("work_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pipeline_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sequencing_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("insertion_timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("execution_attempt_count INTEGER DEFAULT(0) NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("execution_state INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("client_supplied_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("payload BLOB");
        sb.insert(0, "CREATE TABLE pipeline_work (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
