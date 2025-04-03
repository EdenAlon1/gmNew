package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mcq {
    public final float a;
    private final float b = 3.0f;

    public mcq(float f) {
        this.a = f;
    }

    public final float a() {
        return (-3.0f) / this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcq)) {
            return false;
        }
        mcq mcqVar = (mcq) obj;
        float f = mcqVar.b;
        return Float.compare(3.0f, 3.0f) == 0 && Float.compare(mcqVar.a, this.a) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(3.0f), Float.valueOf(this.a));
    }
}
