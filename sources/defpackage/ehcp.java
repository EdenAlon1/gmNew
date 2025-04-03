package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcp {
    private final float a;
    private final int b;
    private ehcq d;
    private ehcq e;
    private final List c = new ArrayList();
    private int f = -1;
    private int g = -1;
    private float h = 0.0f;
    private int i = -1;

    public ehcp(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final ehcp a(float f, float f2, float f3) {
        h(f, f2, f3, false, true);
        return this;
    }

    public final ehcr b() {
        if (this.d == null) {
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.c.size(); i++) {
            ehcq ehcqVar = (ehcq) this.c.get(i);
            float f = this.d.b;
            float f2 = this.a;
            arrayList.add(new ehcq((f - (this.f * f2)) + (i * f2), ehcqVar.b, ehcqVar.c, ehcqVar.d, ehcqVar.e, ehcqVar.f, ehcqVar.g, ehcqVar.h));
        }
        return new ehcr(this.a, arrayList, this.f, this.g, this.b);
    }

    public final void c(float f, float f2, float f3, boolean z) {
        h(f, f2, f3, z, false);
    }

    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
        if (f3 <= 0.0f) {
            return;
        }
        if (z2) {
            if (z) {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
            int i = this.i;
            if (i != -1 && i != 0) {
                throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
            }
            this.i = this.c.size();
        }
        ehcq ehcqVar = new ehcq(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
        if (z) {
            if (this.d == null) {
                this.d = ehcqVar;
                this.f = this.c.size();
            }
            if (this.g != -1 && this.c.size() - this.g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f3 != this.d.d) {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
            this.e = ehcqVar;
            this.g = this.c.size();
        } else {
            if (this.d == null && ehcqVar.d < this.h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.e != null && ehcqVar.d > this.h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.h = ehcqVar.d;
        this.c.add(ehcqVar);
    }

    public final void e(float f, float f2, float f3, int i) {
        f(f, f2, f3, i, false);
    }

    public final void f(float f, float f2, float f3, int i, boolean z) {
        if (i <= 0 || f3 <= 0.0f) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            c((i2 * f3) + f, f2, f3, z);
        }
    }

    public final void g(float f, float f2, float f3, boolean z, boolean z2, float f4) {
        d(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
    }

    public final void h(float f, float f2, float f3, boolean z, boolean z2) {
        float f4;
        float f5;
        float f6;
        boolean z3;
        boolean z4;
        float f7;
        ehcp ehcpVar;
        float abs;
        float f8 = f3 / 2.0f;
        float f9 = f + f8;
        float f10 = this.b;
        if (f9 > f10) {
            abs = Math.abs(f9 - Math.max(f9 - f3, f10));
        } else {
            float f11 = f - f8;
            if (f11 >= 0.0f) {
                f4 = f;
                f5 = f2;
                f6 = f3;
                z3 = z;
                z4 = z2;
                f7 = 0.0f;
                ehcpVar = this;
                ehcpVar.g(f4, f5, f6, z3, z4, f7);
            }
            abs = Math.abs(f11 - Math.min(f11 + f3, 0.0f));
        }
        ehcpVar = this;
        f4 = f;
        f5 = f2;
        f6 = f3;
        z3 = z;
        z4 = z2;
        f7 = abs;
        ehcpVar.g(f4, f5, f6, z3, z4, f7);
    }
}
