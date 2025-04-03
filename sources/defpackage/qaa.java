package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qaa {
    public static final int a(WorkDatabase workDatabase, String str) {
        Long a = workDatabase.y().a(str);
        int longValue = a != null ? (int) a.longValue() : 0;
        b(workDatabase, str, longValue != Integer.MAX_VALUE ? longValue + 1 : 0);
        return longValue;
    }

    public static final void b(WorkDatabase workDatabase, String str, int i) {
        workDatabase.y().b(new pxc(str, Long.valueOf(i)));
    }
}
