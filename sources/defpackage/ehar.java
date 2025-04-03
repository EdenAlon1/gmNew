package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehar implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public ehar(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehqs ehqsVar;
        lab labVar = this.a.a;
        if (labVar != null && labVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (ehqsVar = this.a.f) == null) {
                return;
            }
            ehqsVar.a(this.b);
        }
    }
}
