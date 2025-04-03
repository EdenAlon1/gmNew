package defpackage;

import j$.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnj extends ffde implements List, hnk {
    private final hnk a;
    private final int b;
    private final int c;
    private final int d;

    public hnj(hnk hnkVar, int i, int i2) {
        this.a = hnkVar;
        this.b = i;
        this.c = i2;
        hpk.c(i, i2, hnkVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ffde, java.util.List
    public final Object get(int i) {
        hpk.a(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        hpk.c(i, i2, this.d);
        int i3 = this.b;
        return new hnj(this.a, i + i3, i3 + i2);
    }
}
