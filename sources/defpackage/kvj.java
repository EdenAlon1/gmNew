package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvj {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static kxp b(View view) {
        WindowInsetsController windowInsetsController;
        windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new kxp(windowInsetsController);
        }
        return null;
    }

    static CharSequence c(View view) {
        CharSequence stateDescription;
        stateDescription = view.getStateDescription();
        return stateDescription;
    }

    static void d(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
