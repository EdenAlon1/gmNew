package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffc extends ffde implements RandomAccess {
    public final List a;
    public int b;
    public int c;

    public fffc(List list) {
        this.a = list;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ffde, java.util.List
    public final Object get(int i) {
        ffda.b(i, this.c);
        return this.a.get(this.b + i);
    }
}
