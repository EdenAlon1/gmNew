package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebd implements ebe {
    private final float a = 0.0f;
    private final float b = 0.0f;
    private final float c = 0.0f;
    private final float d = 0.0f;

    @Override // defpackage.ebe
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.ebe
    public final float b(kah kahVar) {
        return 0.0f;
    }

    @Override // defpackage.ebe
    public final float c(kah kahVar) {
        return 0.0f;
    }

    @Override // defpackage.ebe
    public final float d() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebd)) {
            return false;
        }
        ebd ebdVar = (ebd) obj;
        float f = ebdVar.a;
        if (jzq.b(0.0f, 0.0f)) {
            float f2 = ebdVar.b;
            if (jzq.b(0.0f, 0.0f)) {
                float f3 = ebdVar.c;
                if (jzq.b(0.0f, 0.0f)) {
                    float f4 = ebdVar.d;
                    if (jzq.b(0.0f, 0.0f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PaddingValues.Absolute(left=" + ((Object) jzq.a(0.0f)) + ", top=" + ((Object) jzq.a(0.0f)) + ", right=" + ((Object) jzq.a(0.0f)) + ", bottom=" + ((Object) jzq.a(0.0f)) + ')';
    }
}
