package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itf {
    private final float a = 10.0f;
    private final float b = 40.0f;
    private final float c = 10.0f;
    private final float d = 40.0f;
    private final boolean e = true;

    public static final long a(jzn jznVar) {
        return ixs.b(jznVar.eo(10.0f), jznVar.eo(40.0f), jznVar.eo(10.0f), jznVar.eo(40.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itf)) {
            return false;
        }
        itf itfVar = (itf) obj;
        float f = itfVar.a;
        if (!jzq.b(10.0f, 10.0f)) {
            return false;
        }
        float f2 = itfVar.b;
        if (!jzq.b(40.0f, 40.0f)) {
            return false;
        }
        float f3 = itfVar.c;
        if (!jzq.b(10.0f, 10.0f)) {
            return false;
        }
        float f4 = itfVar.d;
        if (!jzq.b(40.0f, 40.0f)) {
            return false;
        }
        boolean z = itfVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(10.0f) * 31) + Float.floatToIntBits(40.0f)) * 31) + Float.floatToIntBits(10.0f)) * 31) + Float.floatToIntBits(40.0f)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) jzq.a(10.0f)) + ", top=" + ((Object) jzq.a(40.0f)) + ", end=" + ((Object) jzq.a(10.0f)) + ", bottom=" + ((Object) jzq.a(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
