package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcr {
    public final float a;
    public int b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public ehcr(float f, List list, int i, int i2, int i3) {
        this.a = f;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((ehcq) list.get(i)).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }

    public final ehcq a() {
        return (ehcq) this.c.get(this.d);
    }

    public final ehcq b() {
        return (ehcq) this.c.get(0);
    }

    public final ehcq c() {
        return (ehcq) this.c.get(this.e);
    }

    public final ehcq d() {
        return (ehcq) this.c.get(this.c.size() - 1);
    }
}
