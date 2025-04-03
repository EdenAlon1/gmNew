package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omi {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public omi(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void b() {
        if (this.f) {
            return;
        }
        int i = this.a;
        int f = kps.f(-1, i, 4.5f);
        int f2 = kps.f(-1, i, 3.0f);
        if (f != -1 && f2 != -1) {
            this.h = kps.h(-1, f);
            this.g = kps.h(-1, f2);
            this.f = true;
            return;
        }
        int f3 = kps.f(-16777216, this.a, 4.5f);
        int f4 = kps.f(-16777216, this.a, 3.0f);
        if (f3 == -1 || f4 == -1) {
            this.h = f != -1 ? kps.h(-1, f) : kps.h(-16777216, f3);
            this.g = f2 != -1 ? kps.h(-1, f2) : kps.h(-16777216, f4);
            this.f = true;
        } else {
            this.h = kps.h(-16777216, f3);
            this.g = kps.h(-16777216, f4);
            this.f = true;
        }
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        kps.i(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omi omiVar = (omi) obj;
            if (this.b == omiVar.b && this.a == omiVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(a()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        b();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        b();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
