package defpackage;

import android.util.Property;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecag implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ExpandableDialogView a;

    public ecag(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Property property = ecau.ag;
        int[] iArr = kvo.a;
        ExpandableDialogView expandableDialogView = this.a;
        expandableDialogView.setPivotX(expandableDialogView.getLayoutDirection() == 1 ? expandableDialogView.a.left : expandableDialogView.a.right);
        this.a.setPivotY(r0.a.top);
        return true;
    }
}
