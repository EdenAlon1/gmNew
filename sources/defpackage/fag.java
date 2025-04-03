package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fag {
    public final View a;
    private final ffbz b = ffca.b(3, new faf(this));

    public fag(View view) {
        this.a = view;
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.b.a();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.a, i, i2, i3, i4);
    }
}
