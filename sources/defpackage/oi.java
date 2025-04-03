package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oi extends FrameLayout implements nd {
    final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public oi(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.nd
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.nd
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
