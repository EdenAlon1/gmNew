package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qer {
    public qlz d;
    private final qeo e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public qer(List list) {
        qeo qeqVar;
        if (list.isEmpty()) {
            qeqVar = new qen();
        } else {
            qeqVar = list.size() == 1 ? new qeq(list) : new qep(list);
        }
        this.e = qeqVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float b = this.e.b();
        this.g = b;
        return b;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float a = this.e.a();
        this.h = a;
        return a;
    }

    public final float b() {
        qlx d = d();
        if (d == null || d.e()) {
            return 0.0f;
        }
        return d.d.getInterpolation(c());
    }

    final float c() {
        if (this.b) {
            return 0.0f;
        }
        qlx d = d();
        if (d.e()) {
            return 0.0f;
        }
        return (this.c - d.c()) / (d.b() - d.c());
    }

    public final qlx d() {
        qlx c = this.e.c();
        qby.a();
        return c;
    }

    public Object e() {
        float c = c();
        if (this.d == null && this.e.d(c)) {
            return this.f;
        }
        qlx d = d();
        Interpolator interpolator = d.e;
        Object f = (interpolator == null || d.f == null) ? f(d, b()) : g(d, c, interpolator.getInterpolation(c), d.f.getInterpolation(c));
        this.f = f;
        return f;
    }

    public abstract Object f(qlx qlxVar, float f);

    protected Object g(qlx qlxVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(qem qemVar) {
        this.a.add(qemVar);
    }

    public void i() {
        for (int i = 0; i < this.a.size(); i++) {
            ((qem) this.a.get(i)).d();
        }
    }

    public void j(float f) {
        if (this.e.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (this.e.f(f)) {
                i();
            }
        }
    }
}
