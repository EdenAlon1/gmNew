package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdk {
    public final Queue a;
    public final Queue b;
    public final int c;
    private final boolean d;

    public mdk(boolean z, int i) {
        this.c = i;
        this.d = z;
        this.a = new ArrayDeque(i);
        this.b = new ArrayDeque(i);
    }

    private final Iterator h() {
        return enfc.b(this.a, this.b).iterator();
    }

    private final void i(lqg lqgVar, int i, int i2) {
        lti.c(this.a.isEmpty());
        lti.c(this.b.isEmpty());
        for (int i3 = 0; i3 < this.c; i3++) {
            this.a.add(lqgVar.d(ltz.c(i, i2, this.d), i, i2));
        }
    }

    public final int a() {
        return !g() ? this.c : this.a.size();
    }

    public final lqh b() {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        lqh lqhVar = (lqh) this.a.remove();
        this.b.add(lqhVar);
        return lqhVar;
    }

    public final void c() {
        Iterator h = h();
        while (h.hasNext()) {
            ((lqh) h.next()).a();
        }
        this.a.clear();
        this.b.clear();
    }

    public final void d(lqg lqgVar, int i, int i2) {
        if (!g()) {
            i(lqgVar, i, i2);
            return;
        }
        lqh lqhVar = (lqh) h().next();
        if (lqhVar.d == i && lqhVar.e == i2) {
            return;
        }
        c();
        i(lqgVar, i, i2);
    }

    public final void e() {
        this.a.addAll(this.b);
        this.b.clear();
    }

    public final void f() {
        lti.c(!this.b.isEmpty());
        this.a.add((lqh) this.b.remove());
    }

    public final boolean g() {
        return h().hasNext();
    }
}
