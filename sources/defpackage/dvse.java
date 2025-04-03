package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Insets;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.gm.dialogs.MaxDimensionsLinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvse implements dvql {
    private int a;
    private final Context b;
    private final eauy c;

    public dvse(Context context, eauy eauyVar) {
        this.b = context;
        this.c = eauyVar;
    }

    public static final int c(Activity activity, boolean z, int i) {
        int i2;
        WindowInsets rootWindowInsets;
        int stableInsetBottom;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        if (z) {
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_bottom_sheet_top_margin);
            if (easb.c()) {
                currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                displayCutout = WindowInsets.Type.displayCutout();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
                stableInsetBottom = insetsIgnoringVisibility.bottom;
            } else {
                View findViewById = activity.findViewById(android.R.id.content);
                stableInsetBottom = (findViewById == null || (rootWindowInsets = findViewById.getRootWindowInsets()) == null) ? 0 : rootWindowInsets.getStableInsetBottom();
            }
            i2 = dimensionPixelOffset + stableInsetBottom;
        } else {
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_margin);
            i2 = dimensionPixelOffset2 + dimensionPixelOffset2;
        }
        return i - i2;
    }

    private static void d(boolean z, LinearLayout linearLayout, int i) {
        int i2 = 0;
        while (i2 < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i2);
            boolean z2 = i2 == linearLayout.getChildCount() + (-1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.setMarginEnd((z || z2) ? 0 : i);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = (!z || z2) ? 0 : i;
            i2++;
        }
    }

    private static void e(LinearLayout linearLayout, int i) {
        d(true, linearLayout, i);
    }

    private static void f(View view, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    private static final boolean g(evxu evxuVar) {
        int a;
        return ((evxuVar.b & 128) == 0 || (a = evxp.a(evxuVar.l)) == 0 || a != 3) ? false : true;
    }

    private static final void h(ViewGroup viewGroup, boolean z) {
        NestedScrollView nestedScrollView = (NestedScrollView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gm_dialog_scrollview, viewGroup, false);
        nestedScrollView.setScrollbarFadingEnabled(true);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        if (z) {
            View findViewById = viewGroup.findViewById(R.id.gm_dialog_image);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.gm_dialog_content);
            View findViewById2 = viewGroup.findViewById(R.id.gm_dialog_button_pane);
            findViewById2.setPadding(viewGroup2.getPaddingLeft(), 0, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
            viewGroup2.removeView(findViewById2);
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), 0);
            viewGroup.removeView(findViewById);
            viewGroup.removeView(viewGroup2);
            linearLayout.addView(findViewById);
            linearLayout.addView(viewGroup2);
            viewGroup.addView(findViewById2);
        } else {
            View findViewById3 = viewGroup.findViewById(R.id.gm_dialog_title);
            View findViewById4 = viewGroup.findViewById(R.id.gm_dialog_body);
            viewGroup.removeView(findViewById3);
            viewGroup.removeView(findViewById4);
            linearLayout.addView(findViewById3);
            linearLayout.addView(findViewById4);
        }
        nestedScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        viewGroup.addView(nestedScrollView, 0, new LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x00c0, code lost:
    
        if (r6 == 1) goto L38;
     */
    @Override // defpackage.dvql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dvqm a(final android.app.Activity r23, defpackage.evzd r24, defpackage.evzm r25, final java.lang.Runnable r26) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvse.a(android.app.Activity, evzd, evzm, java.lang.Runnable):dvqm");
    }

    public final void b(Dialog dialog, evxu evxuVar, Activity activity, View view, int i, int i2) {
        int min;
        int i3;
        int a;
        boolean g = g(evxuVar);
        MaxDimensionsLinearLayout maxDimensionsLinearLayout = (MaxDimensionsLinearLayout) view.findViewById(R.id.gm_dialog_container);
        boolean z = dialog instanceof ehbn;
        int c = c(activity, z, i2);
        maxDimensionsLinearLayout.a = c;
        maxDimensionsLinearLayout.requestLayout();
        float f = i;
        if (z) {
            min = (int) (Math.min((int) (f / r3), 640) * activity.getResources().getDisplayMetrics().density);
        } else {
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            displayMetrics.getClass();
            float f2 = f / displayMetrics.density;
            int i4 = (f2 < 600.0f ? 1 : f2 < 840.0f ? 2 : 3) - 1;
            int dimensionPixelOffset = i4 != 1 ? i4 != 2 ? activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_compact) : activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_expanded) : activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_medium);
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_margin);
            min = Math.min(dimensionPixelOffset, i - (dimensionPixelOffset2 + dimensionPixelOffset2));
        }
        if (z) {
            maxDimensionsLinearLayout.b = min;
            maxDimensionsLinearLayout.requestLayout();
        } else if (dialog.getWindow() != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = min;
            layoutParams.height = -2;
            dialog.getWindow().setAttributes(layoutParams);
        }
        int dimensionPixelOffset3 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_content_side_padding);
        int i5 = min - (dimensionPixelOffset3 + dimensionPixelOffset3);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gm_dialog_content);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.gm_dialog_button_pane);
        if (linearLayout.getChildCount() > 1 && linearLayout.getOrientation() == 0) {
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(c, 0));
            if (linearLayout.getMeasuredWidth() > i5) {
                linearLayout.setOrientation(1);
                int childCount = linearLayout.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i6 = 0; i6 < childCount; i6++) {
                    viewArr[i6] = linearLayout.getChildAt(0);
                    linearLayout.removeViewAt(0);
                }
                for (int i7 = 0; i7 < childCount; i7++) {
                    linearLayout.addView(viewArr[i7], 0);
                }
                e(linearLayout, this.a);
                f(linearLayout, 1);
            }
        }
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(c, 0));
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (!g) {
            if ((evxuVar.b & 128) == 0 || (a = evxp.a(evxuVar.l)) == 0 || a != 2) {
                i3 = 0;
            } else {
                int dimensionPixelOffset4 = this.b.getResources().getDimensionPixelOffset(R.dimen.growthkit_gm3_dialog_icon_padding);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelOffset4, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                i3 = ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin + dimensionPixelOffset4;
            }
            if (measuredHeight + i3 > c) {
                h(viewGroup, false);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.gm_dialog_button_pane);
        linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(c, 0));
        int measuredHeight2 = linearLayout2.getMeasuredHeight();
        ImageView imageView = (ImageView) view.findViewById(R.id.gm_dialog_image);
        int i8 = c - measuredHeight;
        int dimensionPixelOffset5 = imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_large_image_min_height);
        if (i8 >= dimensionPixelOffset5) {
            imageView.setMaxHeight(i8);
        } else {
            imageView.setMaxHeight(Math.max(dimensionPixelOffset5, (int) ((c - measuredHeight2) * 0.5d)));
            h(maxDimensionsLinearLayout, true);
        }
    }
}
