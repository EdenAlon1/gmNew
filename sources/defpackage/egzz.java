package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egzz {
    public int a;
    public int b;
    private final View c;
    private int d;

    public egzz(View view) {
        this.c = view;
    }

    final void a() {
        View view = this.c;
        int top = this.b - (view.getTop() - this.a);
        int[] iArr = kvo.a;
        view.offsetTopAndBottom(top);
        View view2 = this.c;
        view2.offsetLeftAndRight(-(view2.getLeft() - this.d));
    }

    final void b() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }
}
