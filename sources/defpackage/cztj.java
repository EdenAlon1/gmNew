package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztj implements ctuj {
    final /* synthetic */ cztk a;

    public cztj(cztk cztkVar) {
        this.a = cztkVar;
    }

    @Override // defpackage.ctuj
    public final void d() {
        this.a.n.d();
    }

    @Override // defpackage.ctuj
    public final boolean e() {
        final eg G = this.a.n.a().G();
        new AlertDialog.Builder(G).setMessage(R.string.enable_location_permissions).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: ctuh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ctid.d(G);
            }
        }).create().show();
        return false;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void c() {
    }
}
