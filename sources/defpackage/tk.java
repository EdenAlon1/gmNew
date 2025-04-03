package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tk extends wc {
    final /* synthetic */ tn a;

    public tk(tn tnVar) {
        this.a = tnVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        tn tnVar = this.a;
        int computeVerticalScrollRange = tnVar.l.computeVerticalScrollRange();
        int i3 = tnVar.k;
        tnVar.m = computeVerticalScrollRange - i3 > 0 && i3 >= tnVar.a;
        int computeHorizontalScrollRange = tnVar.l.computeHorizontalScrollRange();
        int i4 = tnVar.j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= tnVar.a;
        tnVar.n = z;
        if (tnVar.m) {
            float f = i3;
            tnVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            tnVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (tnVar.o != 0) {
                tnVar.f(0);
                return;
            }
            return;
        }
        if (tnVar.n) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i4;
            tnVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
            tnVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = tnVar.o;
        if (i5 == 0 || i5 == 1) {
            tnVar.f(1);
        }
    }
}
