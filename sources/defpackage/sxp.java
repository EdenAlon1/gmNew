package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxp {
    private final eg a;

    public sxp(eg egVar) {
        this.a = egVar;
    }

    public final String a(String str, Optional optional, Optional optional2, boolean z) {
        int i;
        if (!z && optional.isPresent() && optional2.isPresent()) {
            emxf.i(((Boolean) optional.get()).booleanValue() == ((Boolean) optional2.get()).booleanValue(), "Both block & spam statuses were set, but the updated values were inconsistent. Values were block: %s spam: %s", optional.get(), optional2.get());
        }
        if (optional.isPresent() && optional2.isPresent()) {
            i = ((Boolean) optional.get()).booleanValue() ? R.string.blocked_and_reported_toast_message : R.string.unblock_and_report_not_spam_snackbar_message;
        } else if (optional.isPresent()) {
            i = ((Boolean) optional.get()).booleanValue() ? R.string.blocked_toast_message : R.string.unblock_snackbar_message;
        } else {
            emxf.l(optional2.isPresent());
            i = ((Boolean) optional2.get()).booleanValue() ? R.string.report_spam_snackbar_message : R.string.report_not_spam_snackbar_message;
        }
        return this.a.getString(i, new Object[]{str});
    }

    public final void b(sxo sxoVar) {
        c(sxoVar, false);
    }

    public final void c(final sxo sxoVar, boolean z) {
        if (this.a.isFinishing()) {
            return;
        }
        sxk sxkVar = (sxk) sxoVar;
        String a = a(sxkVar.a, sxkVar.b, sxkVar.c, z);
        View rootView = this.a.getWindow().getDecorView().getRootView();
        eg egVar = this.a;
        int i = sxkVar.e;
        Optional optional = sxkVar.d;
        View findViewById = egVar.findViewById(i);
        if (!optional.isPresent()) {
            Snackbar r = Snackbar.r(rootView, a, 0);
            r.n(findViewById);
            r.i();
        } else {
            Snackbar r2 = Snackbar.r(rootView, a, 0);
            r2.w(R.string.snack_bar_undo, new View.OnClickListener() { // from class: sxm
                /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Runnable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((sxk) sxo.this).d.get().run();
                }
            });
            r2.n(findViewById);
            r2.i();
        }
    }
}
