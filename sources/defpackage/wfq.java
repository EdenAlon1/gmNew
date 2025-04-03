package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfq {
    public final wfk a;
    public final cvpy b;
    public final ffbr c;
    public ViewTreeObserver.OnGlobalLayoutListener d;
    public View e;
    public View f;

    public wfq(wfk wfkVar, cvpy cvpyVar, ffbr ffbrVar) {
        this.a = wfkVar;
        this.b = cvpyVar;
        this.c = ffbrVar;
    }

    public final void a() {
        View view = this.f;
        if (view == null || this.d == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.d;
        onGlobalLayoutListener.getClass();
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        this.d = null;
    }

    public final void b(TextView textView, int i) {
        Drawable drawable = textView.getContext().getDrawable(i);
        int d = ehdr.d(this.a.z(), R.attr.colorOnSurfaceVariant, "StarBadgeMenuFragmentPeer");
        if (drawable != null) {
            drawable.setTint(d);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void c() {
        Window window;
        WindowInsets rootWindowInsets;
        Dialog dialog = this.a.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        wfk wfkVar = this.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        Resources B = wfkVar.B();
        View view = this.f;
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        int dimensionPixelSize = B.getDimensionPixelSize(R.dimen.star_badge_menu_width);
        int dimensionPixelSize2 = B.getDimensionPixelSize(R.dimen.star_badge_menu_edge_gap);
        Point b = ddzd.b(this.a.z());
        int dimensionPixelSize3 = (iArr[0] + (B.getDimensionPixelSize(R.dimen.badge_width) / 2)) - (dimensionPixelSize / 2);
        if (dimensionPixelSize3 >= dimensionPixelSize2) {
            dimensionPixelSize2 = dimensionPixelSize3 + dimensionPixelSize < b.x - dimensionPixelSize2 ? dimensionPixelSize3 : (b.x - dimensionPixelSize2) - dimensionPixelSize;
        }
        attributes.x = dimensionPixelSize2;
        View view2 = this.f;
        attributes.y = (((view2 == null || (rootWindowInsets = view2.getRootWindowInsets()) == null) ? iArr[1] : iArr[1] - rootWindowInsets.getSystemWindowInsetTop()) - B.getDimensionPixelSize(R.dimen.star_badge_menu_clearance)) - B.getDimensionPixelSize(R.dimen.star_badge_menu_height);
        attributes.width = B.getDimensionPixelSize(R.dimen.star_badge_menu_width);
        window.setAttributes(attributes);
    }
}
