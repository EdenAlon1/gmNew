package defpackage;

import androidx.compose.foundation.ScrollingLayoutElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dix {
    public static final dji a(int i, hfd hfdVar, int i2, int i3) {
        if (1 == i3) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        int i4 = (i2 & 14) ^ 6;
        hrh hrhVar = dji.a;
        boolean z = (i4 > 4 && hfdVar.B(i)) || (i2 & 6) == 4;
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            f = new diw(i);
            hfdVar.y(f);
        }
        return (dji) hqr.c(objArr, hrhVar, (ffix) f, hfdVar, 0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ hvi c(hvi hviVar, dji djiVar, boolean z, boolean z2, boolean z3) {
        hvi a;
        a = djk.a(hviVar, djiVar, z3 ? dqs.a : dqs.b, z2, z, null, djiVar.d, true, null, null);
        return a.a(new ScrollingLayoutElement(djiVar, z, z3));
    }
}
