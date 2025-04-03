package defpackage;

import android.graphics.Matrix;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyt {
    public float a;
    public float b;
    public float c;

    public egyt(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        this.a = fArr[2];
        this.b = fArr[5];
        this.c = fArr[0];
    }

    private static final boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof egyt)) {
            return false;
        }
        egyt egytVar = (egyt) obj;
        return a(this.a, egytVar.a) && a(this.b, egytVar.b) && a(this.c, egytVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
