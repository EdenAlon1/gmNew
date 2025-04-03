package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
class adlz implements ejlr<Void, String> {
    final /* synthetic */ adme a;

    public adlz(adme admeVar) {
        this.a = admeVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        View view = this.a.c.Q;
        view.getClass();
        Snackbar.q(view, R.string.bugle_add_account_error, 0).i();
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
