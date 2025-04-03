package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgs {
    public static final Date a = new Date(0);

    public static long a(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    public static Date b(long j) {
        return j == 0 ? a : new Date(j);
    }
}
