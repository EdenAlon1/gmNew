package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxc extends egkl {
    private final Map m = new HashMap();
    private final Map n = new HashMap();
    public float a = 0.0f;
    public int b = 0;
    public int c = 0;
    public int d = -1;
    public int e = 0;
    public int f = -1;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public final float a(String str) {
        Float f = (Float) this.m.get(str);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final int b(int i) {
        Integer num = (Integer) this.n.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void c() {
        this.f = -1;
        this.g = -1;
    }

    public final void d(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public final void e(String str, float f) {
        this.m.put(str, Float.valueOf(f));
    }

    public final void f(int i, int i2) {
        this.n.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
