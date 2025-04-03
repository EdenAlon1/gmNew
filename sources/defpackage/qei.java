package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qei implements qem, qdu {
    public final qer a;
    public qiv b;
    private final qdb c;

    public qei(qdb qdbVar, qje qjeVar, qiu qiuVar) {
        this.c = qdbVar;
        qer a = qiuVar.a.a();
        this.a = a;
        qjeVar.k(a);
        a.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.qem
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.qdu
    public final String g() {
        throw null;
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
    }
}
