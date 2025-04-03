package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyhc {
    static eygr a(Object obj, long j) {
        return (eygr) eyjj.h(obj, j);
    }

    public static final List b(Object obj, long j) {
        eygr a = a(obj, j);
        if (a.c()) {
            return a;
        }
        int size = a.size();
        eygr e = a.e(size == 0 ? 10 : size + size);
        eyjj.u(obj, j, e);
        return e;
    }
}
