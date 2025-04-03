package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvg {
    public static int a(View view) {
        int importantForAutofill;
        importantForAutofill = view.getImportantForAutofill();
        return importantForAutofill;
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static void c(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
