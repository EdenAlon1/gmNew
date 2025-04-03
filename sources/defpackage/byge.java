package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byge extends dtup {
    public static final String[] a = {"trigger_flags._id", "trigger_flags.enabled"};
    public static final byfu b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new byfu();
        c = new int[]{58220};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("enabled INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE trigger_flags (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
