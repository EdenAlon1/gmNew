package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlz {
    private final ViewConfiguration a;

    public dlz(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    public final long a(jzn jznVar, iki ikiVar) {
        float f = -(Build.VERSION.SDK_INT > 26 ? this.a.getScaledVerticalScrollFactor() : jznVar.em(64.0f));
        float f2 = -(Build.VERSION.SDK_INT > 26 ? this.a.getScaledHorizontalScrollFactor() : jznVar.em(64.0f));
        List list = ikiVar.a;
        iak iakVar = new iak(0L);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iakVar = new iak(iak.f(iakVar.a, ((iku) list.get(i)).j));
        }
        long j = iakVar.a;
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
    }
}
