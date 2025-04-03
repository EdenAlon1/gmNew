package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcev implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "backup_metadata";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        String[] strArr = bcfa.a;
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("created_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("schema_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_id TEXT");
        sb.insert(0, "CREATE TABLE backup_metadata (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
