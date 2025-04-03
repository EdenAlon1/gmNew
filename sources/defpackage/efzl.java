package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzl extends vt {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public efzl(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        int gp = recyclerView.gp(view);
        rect.set(0, 0, 0, 0);
        if (this.d) {
            if (gp == 0) {
                return;
            } else {
                gp--;
            }
        }
        float f = this.b;
        int round = Math.round((((-1.0f) + f) * this.a) / f);
        int round2 = Math.round(((gp % r7) * this.a) / f);
        int i = round - round2;
        if (this.c == 1) {
            int[] iArr = kvo.a;
            if (recyclerView.getLayoutDirection() == 1) {
                rect.right = round2;
                rect.left = i;
            } else {
                rect.left = round2;
                rect.right = i;
            }
            if (gp >= this.b) {
                rect.top = this.a;
                return;
            }
            return;
        }
        int[] iArr2 = kvo.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        rect.top = round2;
        rect.bottom = i;
        if (gp >= this.b) {
            if (layoutDirection == 1) {
                rect.right = this.a;
            } else {
                rect.left = this.a;
            }
        }
    }
}
