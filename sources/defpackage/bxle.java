package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxle extends dtup {
    public static final String[] a = {"restore_workflow_executions._id", "restore_workflow_executions.session_id", "restore_workflow_executions.feature", "restore_workflow_executions.status", "restore_workflow_executions.start_time", "restore_workflow_executions.finish_time", "restore_workflow_executions.backup_database_metadata", "restore_workflow_executions.initial_messages_version", "restore_workflow_executions.status_timestamp", "restore_workflow_executions.last_attachment_request_timestamp", "restore_workflow_executions.config"};
    public static final enhk b;
    public static final bxkd c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("restore_workflow_executions.initial_messages_version", 60110);
        enhdVar.k("restore_workflow_executions.status_timestamp", 60220);
        enhdVar.k("restore_workflow_executions.last_attachment_request_timestamp", 60330);
        enhdVar.k("restore_workflow_executions.config", 60730);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("session_id", "index_restore_workflow_executions_session_id");
        enhdVar2.c();
        c = new bxkd();
        d = new int[]{60040, 60110, 60220, 60330, 60730};
    }

    public static final bxkz a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("restore_workflow_executions._id");
            engrVar.h("restore_workflow_executions.session_id");
            engrVar.h("restore_workflow_executions.feature");
            engrVar.h("restore_workflow_executions.status");
            engrVar.h("restore_workflow_executions.start_time");
            engrVar.h("restore_workflow_executions.finish_time");
            engrVar.h("restore_workflow_executions.backup_database_metadata");
            if (c2.intValue() >= 60110) {
                engrVar.h("restore_workflow_executions.initial_messages_version");
            }
            if (c2.intValue() >= 60220) {
                engrVar.h("restore_workflow_executions.status_timestamp");
            }
            if (c2.intValue() >= 60330) {
                engrVar.h("restore_workflow_executions.last_attachment_request_timestamp");
            }
            if (c2.intValue() >= 60730) {
                engrVar.h("restore_workflow_executions.config");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bxkz(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("session_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_time INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("finish_time INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_database_metadata BLOB");
        if (i >= 60110) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("initial_messages_version INTEGER");
        }
        if (i >= 60220) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("status_timestamp INTEGER");
        }
        if (i >= 60330) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_attachment_request_timestamp INTEGER");
        }
        if (i >= 60730) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("config BLOB");
        }
        sb.insert(0, "CREATE TABLE restore_workflow_executions (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_executions_session_id");
        arrayList.add("CREATE UNIQUE INDEX index_restore_workflow_executions_session_id ON restore_workflow_executions(session_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
