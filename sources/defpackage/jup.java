package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jup {
    public static final long a(long j, long j2) {
        int b;
        int d = jpm.d(j);
        int c = jpm.c(j);
        if ((jpm.d(j2) < jpm.c(j)) && (jpm.d(j) < jpm.c(j2))) {
            if (jpm.g(j2, j)) {
                d = jpm.d(j2);
                c = d;
            } else {
                if (jpm.g(j, j2)) {
                    b = jpm.b(j2);
                } else {
                    int d2 = jpm.d(j2);
                    if (d >= jpm.c(j2) || d2 > d) {
                        c = jpm.d(j2);
                    } else {
                        d = jpm.d(j2);
                        b = jpm.b(j2);
                    }
                }
                c -= b;
            }
        } else if (c > jpm.d(j2)) {
            d -= jpm.b(j2);
            b = jpm.b(j2);
            c -= b;
        }
        return jpn.a(d, c);
    }
}
