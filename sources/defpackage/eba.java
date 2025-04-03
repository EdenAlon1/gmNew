package defpackage;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eba {
    public static final float a(ebe ebeVar, kah kahVar) {
        return kahVar == kah.a ? ebeVar.c(kahVar) : ebeVar.b(kahVar);
    }

    public static final float b(ebe ebeVar, kah kahVar) {
        return kahVar == kah.a ? ebeVar.b(kahVar) : ebeVar.c(kahVar);
    }

    public static final hvi c(hvi hviVar, ebe ebeVar) {
        return hviVar.a(new PaddingValuesElement(ebeVar));
    }

    public static final hvi d(hvi hviVar, float f) {
        return hviVar.a(new PaddingElement(f, f, f, f));
    }

    public static final hvi e(hvi hviVar, float f, float f2) {
        return hviVar.a(new PaddingElement(f, f2, f, f2));
    }

    public static final hvi f(hvi hviVar, float f, float f2, float f3, float f4) {
        return hviVar.a(new PaddingElement(f, f2, f3, f4));
    }

    public static /* synthetic */ ebe g(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new ebf(f, f2, f, f2);
    }

    public static /* synthetic */ ebe h(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new ebf(f, f2, f3, f4);
    }

    public static /* synthetic */ hvi i(hvi hviVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return e(hviVar, f, f2);
    }

    public static /* synthetic */ hvi j(hvi hviVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return f(hviVar, f, f2, f3, f4);
    }
}
