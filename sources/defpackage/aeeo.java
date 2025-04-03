package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeeo implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ aeep c;
    final /* synthetic */ View d;

    public aeeo(View view, View view2, aeep aeepVar, View view3) {
        this.a = view;
        this.b = view2;
        this.c = aeepVar;
        this.d = view3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Snackbar q = Snackbar.q(this.a, R.string.syncing_conversations, -2);
        q.n(this.b);
        q.i();
        ((aeix) this.c.b.b()).o(q);
        this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
