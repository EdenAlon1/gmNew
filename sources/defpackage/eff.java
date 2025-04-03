package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eff implements efh {
    private final float a = 120.0f;

    public eff() {
        if (Float.compare(120.0f, 0.0f) > 0) {
            return;
        }
        dwv.c("Provided min size should be larger than zero.");
    }

    @Override // defpackage.efh
    public final List a(jzn jznVar, int i, int i2) {
        return efo.a(i, Math.max((i + i2) / (jznVar.eo(120.0f) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eff)) {
            return false;
        }
        float f = ((eff) obj).a;
        return jzq.b(120.0f, 120.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(120.0f);
    }
}
