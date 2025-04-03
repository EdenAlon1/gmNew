package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsqp extends dtup {
    public static final String[] a = {"data_upgrade_workers._id", "data_upgrade_workers.last_update_version"};
    public static final bspz b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bspz();
        c = new int[]{58240};
    }

    public static bspr a(byys byysVar) {
        bsqk bsqkVar = new bsqk(a);
        bsqkVar.z("data_upgrade_workers.queryOnId");
        bsqkVar.q();
        bsqo bsqoVar = new bsqo();
        bsqoVar.b(byysVar);
        bsqkVar.k(new bsqn(bsqoVar));
        return (bspr) dtub.c(bsqkVar.b());
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_update_version INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE data_upgrade_workers (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
