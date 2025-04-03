package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipi implements eiph {
    private final einu a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;

    public eipi(einu einuVar, Window window, AttributeSet attributeSet, int i) {
        this.a = einuVar;
        View g = einuVar.g(R.id.suc_layout_status);
        if (g == null) {
            throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
        }
        if (g instanceof StatusBarBackgroundLayout) {
            this.b = (StatusBarBackgroundLayout) g;
        } else {
            this.c = (LinearLayout) g;
        }
        View decorView = window.getDecorView();
        this.d = decorView;
        window.setStatusBarColor(0);
        TypedArray obtainStyledAttributes = einuVar.getContext().obtainStyledAttributes(attributeSet, einv.e, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, (decorView.getSystemUiVisibility() & 8192) == 8192);
        if (einuVar.e()) {
            Context context = einuVar.getContext();
            z = eios.h(context).l(context, eioq.CONFIG_LIGHT_STATUS_BAR, false);
        }
        if (z) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        a(obtainStyledAttributes.getDrawable(1));
        obtainStyledAttributes.recycle();
    }

    public final void a(Drawable drawable) {
        if (this.a.e() && !this.a.f()) {
            Context context = this.a.getContext();
            drawable = eios.h(context).f(context, eioq.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout == null) {
            this.c.setBackgroundDrawable(drawable);
            return;
        }
        statusBarBackgroundLayout.a = drawable;
        statusBarBackgroundLayout.setWillNotDraw(drawable == null);
        statusBarBackgroundLayout.setFitsSystemWindows(drawable != null);
        statusBarBackgroundLayout.invalidate();
    }
}
