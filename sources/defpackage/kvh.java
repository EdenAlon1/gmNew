package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvh {
    static CharSequence a(View view) {
        CharSequence accessibilityPaneTitle;
        accessibilityPaneTitle = view.getAccessibilityPaneTitle();
        return accessibilityPaneTitle;
    }

    static <T> T b(View view, int i) {
        KeyEvent.Callback requireViewById;
        requireViewById = view.requireViewById(i);
        return (T) requireViewById;
    }

    static void c(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void d(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void e(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean f(View view) {
        boolean isAccessibilityHeading;
        isAccessibilityHeading = view.isAccessibilityHeading();
        return isAccessibilityHeading;
    }

    static boolean g(View view) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = view.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }
}
