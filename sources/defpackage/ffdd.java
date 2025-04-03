package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffdd extends ffde implements RandomAccess {
    private final ffde a;
    private final int b;
    private final int c;

    public ffdd(ffde ffdeVar, int i, int i2) {
        this.a = ffdeVar;
        this.b = i;
        ffda.d(i, i2, ffdeVar.a());
        this.c = i2 - i;
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
