package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxny extends dtup {
    public static final String[] a = {"restore_workflow_scratch_duplicates.key", "restore_workflow_scratch_duplicates.backup_id", "restore_workflow_scratch_duplicates.bugle_id"};
    public static final bxnj b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("key", "index_restore_workflow_scratch_duplicates_key");
        enhdVar.k("backup_id", "index_restore_workflow_scratch_duplicates_backup_id");
        enhdVar.k("bugle_id", "index_restore_workflow_scratch_duplicates_bugle_id");
        enhdVar.c();
        b = new bxnj();
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
        sb.append("key INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("bugle_id TEXT");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_duplicates (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_key");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_key ON restore_workflow_scratch_duplicates(key);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_backup_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_backup_id ON restore_workflow_scratch_duplicates(backup_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_bugle_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_bugle_id ON restore_workflow_scratch_duplicates(bugle_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
