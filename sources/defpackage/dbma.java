package defpackage;

import android.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbma implements ejxk {
    final /* synthetic */ dbmb a;

    public dbma(dbmb dbmbVar) {
        this.a = dbmbVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "Failed to get registration state");
        AlertDialog alertDialog = this.a.g;
        if (alertDialog != null) {
            alertDialog.setMessage("Status: Failed");
        }
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        AlertDialog alertDialog = this.a.g;
        if (alertDialog != null) {
            alertDialog.setMessage("Status: ".concat(str));
        }
    }
}
