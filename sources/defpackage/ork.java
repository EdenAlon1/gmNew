package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ork extends orl {
    public final RecyclerView a;

    public ork(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.orl
    public final int a() {
        Rect rect = new Rect();
        this.a.getGlobalVisibleRect(rect);
        return rect.height();
    }

    @Override // defpackage.orl
    public final void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.orl
    public final void c(Runnable runnable) {
        int[] iArr = kvo.a;
        this.a.postOnAnimation(runnable);
    }
}
