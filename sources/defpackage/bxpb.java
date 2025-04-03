package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxpb extends dtup {
    public static final String[] a = {"restore_workflow_scratch_suffix.which_database", "restore_workflow_scratch_suffix.participant_id", "restore_workflow_scratch_suffix.destination_suffix"};
    public static final bxom b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("participant_id", "index_restore_workflow_scratch_suffix_participant_id");
        enhdVar.k("destination_suffix", "index_restore_workflow_scratch_suffix_destination_suffix");
        enhdVar.c();
        b = new bxom();
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
        sb.append("participant_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_suffix TEXT");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_suffix (");
        sb.append(", UNIQUE(which_database,participant_id) ON CONFLICT IGNORE);");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_suffix_participant_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_suffix_participant_id ON restore_workflow_scratch_suffix(participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_suffix_destination_suffix");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_suffix_destination_suffix ON restore_workflow_scratch_suffix(destination_suffix);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
