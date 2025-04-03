package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzh implements ecd {
    private final float a = 0.0f;
    private final float b = 0.0f;
    private final float c = 0.0f;
    private final float d = 0.0f;

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        return jznVar.eo(0.0f);
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        return jznVar.eo(0.0f);
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        return jznVar.eo(0.0f);
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        return jznVar.eo(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzh)) {
            return false;
        }
        dzh dzhVar = (dzh) obj;
        float f = dzhVar.a;
        if (jzq.b(0.0f, 0.0f)) {
            float f2 = dzhVar.b;
            if (jzq.b(0.0f, 0.0f)) {
                float f3 = dzhVar.c;
                if (jzq.b(0.0f, 0.0f)) {
                    float f4 = dzhVar.d;
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
        return "Insets(left=" + ((Object) jzq.a(0.0f)) + ", top=" + ((Object) jzq.a(0.0f)) + ", right=" + ((Object) jzq.a(0.0f)) + ", bottom=" + ((Object) jzq.a(0.0f)) + ')';
    }
}
