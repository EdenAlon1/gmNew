package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edsi {
    public abstract edsj a();

    public abstract List b();

    public abstract List c();

    public abstract void d(List list);

    public abstract void e(List list);

    public final edsj f() {
        d(engw.n(b()));
        e(engw.n(c()));
        List<Integer> c = c();
        if (!c.isEmpty()) {
            for (Integer num : c) {
                emxf.j(enop.c(0, 4).a(num), "Price level must not be out of range of %s to %s, but was: %s.", Double.valueOf(1.0d), Double.valueOf(5.0d), num);
            }
        }
        return a();
    }
}
