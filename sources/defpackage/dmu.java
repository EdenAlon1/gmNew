package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmu {
    public final float[] a;
    private final List b;
    private final int c;

    public dmu(List list, float[] fArr) {
        this.b = list;
        this.a = fArr;
        if (list.size() != fArr.length) {
            dwv.c("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + ffdo.K(fArr));
        }
        this.c = fArr.length;
    }

    public final float a(Object obj) {
        int indexOf = this.b.indexOf(obj);
        ffji ffjiVar = dlj.b;
        if (indexOf >= 0) {
            float[] fArr = this.a;
            if (indexOf <= ffdo.y(fArr)) {
                return fArr[indexOf];
            }
        }
        return ((Number) ffjiVar.invoke(Integer.valueOf(indexOf))).floatValue();
    }

    public final Object b(float f) {
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                return this.b.get(i2);
            }
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                f2 = abs;
            }
            if (abs <= f2) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
    }

    public final Object c(float f, boolean z) {
        int i = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                return this.b.get(i2);
            }
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                f2 = f4;
            }
            if (f4 <= f2) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmu)) {
            return false;
        }
        dmu dmuVar = (dmu) obj;
        return ffkj.e(this.b, dmuVar.b) && Arrays.equals(this.a, dmuVar.a) && this.c == dmuVar.c;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + Arrays.hashCode(this.a)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (i < this.c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ffdx.N(this.b, i));
            sb2.append('=');
            float[] fArr = this.a;
            sb2.append((i < 0 || i > ffdo.y(fArr)) ? ((Number) dlj.b.invoke(Integer.valueOf(i))).floatValue() : fArr[i]);
            sb.append(sb2.toString());
            if (i < this.c - 1) {
                sb.append(", ");
            }
            i++;
        }
        sb.append("})");
        return sb.toString();
    }
}
