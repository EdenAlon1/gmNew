package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krs {
    public final int a;
    public final List b;

    public krs(List list) {
        this.a = 0;
        this.b = list;
    }

    public final krt[] a() {
        return (krt[]) this.b.get(0);
    }

    @Deprecated
    public krs() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }
}
