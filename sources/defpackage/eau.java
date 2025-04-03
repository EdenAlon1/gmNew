package defpackage;

import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.OffsetPxElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eau {
    public static final hvi a(hvi hviVar, ffji ffjiVar) {
        return hviVar.a(new OffsetPxElement(ffjiVar, true));
    }

    public static final hvi b(hvi hviVar, float f, float f2) {
        return hviVar.a(new OffsetElement(f, f2));
    }

    public static /* synthetic */ hvi c(hvi hviVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return b(hviVar, f, f2);
    }
}
