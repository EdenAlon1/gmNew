package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dek {
    public static final long a(long j, float f) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final hvi b(hvi hviVar, der derVar, idh idhVar) {
        return d(hviVar, derVar.a, derVar.b, idhVar);
    }

    public static final hvi c(hvi hviVar, float f, long j, idh idhVar) {
        return d(hviVar, f, new idl(j), idhVar);
    }

    public static final hvi d(hvi hviVar, float f, ibq ibqVar, idh idhVar) {
        return hviVar.a(new BorderModifierNodeElement(f, ibqVar, idhVar));
    }
}
