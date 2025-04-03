package defpackage;

import android.content.res.ColorStateList;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktw {
    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof kqn) {
            ((kqn) menuItem).b(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void b(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof kqn) {
            ((kqn) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
