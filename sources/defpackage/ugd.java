package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugd {
    public final Activity a;
    public final dsma b;
    public dsmn c;
    public EditText d;

    public ugd(Activity activity, dsma dsmaVar) {
        this.a = activity;
        this.b = dsmaVar;
    }

    public final int a() {
        return this.b.a();
    }

    public final int b() {
        return this.b.b();
    }

    public final void c(View view) {
        this.b.e(view, false);
    }

    public final boolean d() {
        return this.b.h();
    }

    public final boolean e() {
        return this.b.d() == dsmm.a;
    }

    public final boolean f(EditText editText) {
        return e() && this.d == editText;
    }

    public final void g() {
        this.d = null;
        dsmn dsmnVar = this.c;
        if (dsmnVar != null) {
            this.c = null;
            this.b.n(dsmnVar);
        }
    }
}
