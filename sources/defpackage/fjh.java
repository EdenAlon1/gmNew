package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjh {
    public final float a = 6.0f;
    public final float b = 12.0f;
    public final float c = 8.0f;
    public final float d = 8.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjh)) {
            return false;
        }
        fjh fjhVar = (fjh) obj;
        float f = fjhVar.a;
        if (!jzq.b(6.0f, 6.0f)) {
            return false;
        }
        float f2 = fjhVar.b;
        if (!jzq.b(12.0f, 12.0f)) {
            return false;
        }
        float f3 = fjhVar.c;
        if (!jzq.b(8.0f, 8.0f)) {
            return false;
        }
        float f4 = fjhVar.d;
        return jzq.b(8.0f, 8.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(6.0f) * 31) + Float.floatToIntBits(12.0f)) * 31) + Float.floatToIntBits(8.0f)) * 31) + Float.floatToIntBits(8.0f);
    }
}
