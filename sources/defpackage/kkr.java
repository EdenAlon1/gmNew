package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkr implements kud {
    final /* synthetic */ CoordinatorLayout a;

    public kkr(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        CoordinatorLayout coordinatorLayout = this.a;
        if (!Objects.equals(coordinatorLayout.f, kxhVar)) {
            coordinatorLayout.f = kxhVar;
            boolean z = kxhVar.d() > 0;
            coordinatorLayout.g = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!kxhVar.t()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    int[] iArr = kvo.a;
                    if (childAt.getFitsSystemWindows() && ((kkw) childAt.getLayoutParams()).a != null && kxhVar.t()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return kxhVar;
    }
}
