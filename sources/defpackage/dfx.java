package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfx {
    public long a = 0;
    public EdgeEffect b;
    public EdgeEffect c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    private final Context j;
    private final int k;

    public dfx(Context context, int i) {
        this.j = context;
        this.k = i;
    }

    private final EdgeEffect u(dqs dqsVar) {
        EdgeEffect edgeEffect;
        int i = Build.VERSION.SDK_INT;
        Context context = this.j;
        if (i >= 31) {
            try {
                edgeEffect = new EdgeEffect(context, null);
            } catch (Throwable unused) {
                edgeEffect = new EdgeEffect(context);
            }
        } else {
            edgeEffect = new dgk(context);
        }
        edgeEffect.setColor(this.k);
        long j = this.a;
        if (!kaf.e(j, 0L)) {
            long j2 = j >> 32;
            long j3 = j & 4294967295L;
            if (dqsVar == dqs.a) {
                edgeEffect.setSize((int) j2, (int) j3);
            } else {
                edgeEffect.setSize((int) j3, (int) j2);
            }
        }
        return edgeEffect;
    }

    private static final boolean v(EdgeEffect edgeEffect) {
        return (edgeEffect == null || edgeEffect.isFinished()) ? false : true;
    }

    private static final boolean w(EdgeEffect edgeEffect) {
        return (edgeEffect == null || dfv.a(edgeEffect) == 0.0f) ? false : true;
    }

    public final EdgeEffect a() {
        EdgeEffect edgeEffect = this.c;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.a);
        this.c = u;
        return u;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.a);
        this.g = u;
        return u;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.b);
        this.d = u;
        return u;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.b);
        this.h = u;
        return u;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.b);
        this.e = u;
        return u;
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.b);
        this.i = u;
        return u;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.b;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.a);
        this.b = u;
        return u;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect u = u(dqs.a);
        this.f = u;
        return u;
    }

    public final boolean i() {
        return v(this.c);
    }

    public final boolean j() {
        return w(this.g);
    }

    public final boolean k() {
        return w(this.c);
    }

    public final boolean l() {
        return v(this.d);
    }

    public final boolean m() {
        return w(this.h);
    }

    public final boolean n() {
        return w(this.d);
    }

    public final boolean o() {
        return v(this.e);
    }

    public final boolean p() {
        return w(this.i);
    }

    public final boolean q() {
        return w(this.e);
    }

    public final boolean r() {
        return v(this.b);
    }

    public final boolean s() {
        return w(this.f);
    }

    public final boolean t() {
        return w(this.b);
    }
}
