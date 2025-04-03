package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnp {
    public final Activity a;
    public final FrameLayout.LayoutParams b = new FrameLayout.LayoutParams(-2, -2, 3);
    public TextView c;

    public ahnp(Activity activity) {
        this.a = activity;
    }

    public final void a() {
        efbd.c();
        TextView textView = this.c;
        if ((textView != null ? textView.getParent() : null) != null) {
            TextView textView2 = this.c;
            textView2.getClass();
            ViewParent parent = textView2.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(this.c);
        }
    }
}
