package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehma {
    protected ehmb j;
    protected final List k = new ArrayList();

    protected ehma(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new ehlx());
        }
    }

    protected static final float f(int i, int i2, int i3) {
        return kqp.a((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b(pbt pbtVar);

    public abstract void c();

    public abstract void d();

    public abstract void e();
}
