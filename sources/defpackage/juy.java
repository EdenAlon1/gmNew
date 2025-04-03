package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class juy {
    public final View a;
    public final kur b;
    private final ffbz c = ffca.b(3, new jux(this));

    public juy(View view) {
        this.a = view;
        this.b = new kur(view);
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.c.a();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.a, i, i2, i3, i4);
    }
}
