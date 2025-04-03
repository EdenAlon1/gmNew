package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyk {
    public static int a(Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static int b(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static void c(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
