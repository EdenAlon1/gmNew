package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import defpackage.ehqw;
import defpackage.ehqz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Snackbar extends BaseTransientBottomBar {
    private static final int[] w = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public ehqw v;
    private final AccessibilityManager x;
    private boolean y;

    /* compiled from: PG */
    public static final class SnackbarLayout extends ehqz {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // defpackage.ehqz, android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar q(View view, int i, int i2) {
        return r(view, view.getResources().getText(i), i2);
    }

    public static Snackbar r(View view, CharSequence charSequence, int i) {
        return s(null, view, charSequence, i);
    }

    public static Snackbar s(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroup.getContext();
        }
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        int i2 = R.layout.design_layout_snackbar_include;
        if (resourceId != -1 && resourceId2 != -1) {
            i2 = R.layout.mtrl_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        snackbar.u(charSequence);
        snackbar.k = i;
        return snackbar;
    }

    private final TextView x() {
        return y().a;
    }

    private final SnackbarContentLayout y() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int a() {
        int recommendedTimeoutMillis;
        int i = this.k;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.x.getRecommendedTimeoutMillis(i, (true != this.y ? 0 : 4) | 3);
            return recommendedTimeoutMillis;
        }
        if (this.y && this.x.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final void t(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button button = y().b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.y = false;
        } else {
            this.y = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new View.OnClickListener() { // from class: ehrb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onClickListener.onClick(view);
                    Snackbar.this.f(1);
                }
            });
        }
    }

    public final void u(CharSequence charSequence) {
        x().setText(charSequence);
    }

    public final void v(int i) {
        x().setMaxLines(i);
    }

    public final void w(int i, View.OnClickListener onClickListener) {
        t(this.i.getText(i), onClickListener);
    }
}
