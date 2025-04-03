package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqw {
    public static void a(View view) {
        int paddingEnd;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        boolean s = eios.h(context).s(eioq.CONFIG_LAYOUT_MARGIN_START);
        boolean s2 = eios.h(context).s(eioq.CONFIG_LAYOUT_MARGIN_END);
        if (eiqx.c(view)) {
            if (!s) {
                if (!s2) {
                    return;
                } else {
                    s2 = true;
                }
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudMarginStart, R.attr.sudMarginEnd});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            int a = s ? ((int) eios.h(context).a(context, eioq.CONFIG_LAYOUT_MARGIN_START)) - dimensionPixelSize : view.getPaddingStart();
            if (s2) {
                paddingEnd = ((int) eios.h(context).a(context, eioq.CONFIG_LAYOUT_MARGIN_END)) - dimensionPixelSize2;
                if (view.getId() == R.id.sud_layout_content) {
                    paddingEnd = ((int) eios.h(context).a(context, eioq.CONFIG_LAYOUT_MARGIN_START)) - dimensionPixelSize2;
                }
            } else {
                paddingEnd = view.getPaddingEnd();
                if (view.getId() == R.id.sud_layout_content) {
                    paddingEnd = view.getPaddingStart();
                }
            }
            if (a == view.getPaddingStart() && paddingEnd == view.getPaddingEnd()) {
                return;
            }
            if (view.getId() != R.id.sud_layout_content) {
                view.setPadding(a, view.getPaddingTop(), paddingEnd, view.getPaddingBottom());
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams.setMargins(a, marginLayoutParams.topMargin, paddingEnd, marginLayoutParams.bottomMargin);
        }
    }
}
