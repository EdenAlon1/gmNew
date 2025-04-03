package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dys {
    public static final dys a = new dys();

    private dys() {
    }

    public static final hvi a(hvi hviVar, hun hunVar) {
        return hviVar.a(new HorizontalAlignElement(hunVar));
    }

    public static final hvi b(hvi hviVar, float f, boolean z) {
        if (f <= eobe.a) {
            edc.a("invalid weight; must be greater than zero");
        }
        return hviVar.a(new LayoutWeightElement(ffmk.d(f, Float.MAX_VALUE), z));
    }
}
