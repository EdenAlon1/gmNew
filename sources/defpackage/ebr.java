package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebr implements ebq {
    public static final ebr a = new ebr();

    private ebr() {
    }

    @Override // defpackage.ebq
    public final hvi a(hvi hviVar, float f, boolean z) {
        if (f <= eobe.a) {
            edc.a("invalid weight; must be greater than zero");
        }
        return hviVar.a(new LayoutWeightElement(ffmk.d(f, Float.MAX_VALUE), z));
    }

    @Override // defpackage.ebq
    public final hvi b(hvi hviVar, hus husVar) {
        return hviVar.a(new VerticalAlignElement(husVar));
    }
}
