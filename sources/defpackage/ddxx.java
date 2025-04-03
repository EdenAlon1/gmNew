package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxx {
    public static void a(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = view.getContext().getResources().getDimensionPixelSize(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void b(View view, int i) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(view.getContext().getResources().getDimensionPixelSize(i));
    }

    public static void c(View view) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginEnd(view.getContext().getResources().getDimensionPixelSize(R.dimen.media_viewer_button_margin));
    }
}
