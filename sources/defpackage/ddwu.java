package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwu {
    public final elbx a;

    public ddwu(elbx elbxVar) {
        this.a = elbxVar;
    }

    public static final void b(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ddwr(view, runnable));
    }

    public final void a(View view, Runnable runnable, String str) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ddwt(this, view, runnable, str));
    }
}
