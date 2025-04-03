package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekt {
    public static final float a(int i, int i2, boolean z) {
        float b = b(i, i2);
        return z ? b + 100.0f : b;
    }

    public static final float b(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final hvi c(hvi hviVar, ffix ffixVar, eks eksVar, dqs dqsVar, boolean z, boolean z2) {
        return hviVar.a(new LazyLayoutSemanticsModifier(ffixVar, eksVar, dqsVar, z, z2));
    }
}
