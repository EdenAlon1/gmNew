package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfsh implements Runnable {
    final /* synthetic */ dfsi a;
    private final dfsf b;

    public dfsh(dfsi dfsiVar, dfsf dfsfVar) {
        this.a = dfsiVar;
        this.b = dfsfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a) {
            ConnectionResult connectionResult = this.b.b;
            if (connectionResult.a()) {
                dfsi dfsiVar = this.a;
                PendingIntent pendingIntent = connectionResult.d;
                Activity l = dfsiVar.l();
                dfwv.n(pendingIntent);
                dfsiVar.f.startActivityForResult(GoogleApiActivity.a(l, pendingIntent, this.b.a, false), 1);
                return;
            }
            dfsi dfsiVar2 = this.a;
            if (dfsiVar2.d.j(dfsiVar2.l(), connectionResult.c, null) != null) {
                dfsi dfsiVar3 = this.a;
                int i = connectionResult.c;
                dfpi dfpiVar = dfsiVar3.d;
                Activity l2 = dfsiVar3.l();
                Dialog f = dfpiVar.f(l2, i, new dfvx(dfpiVar.j(l2, i, "d"), dfsiVar3.f), dfsiVar3);
                if (f != null) {
                    dfpiVar.b(l2, f, "GooglePlayServicesErrorDialog", dfsiVar3);
                    return;
                }
                return;
            }
            if (connectionResult.c != 18) {
                this.a.a(connectionResult, this.b.a);
                return;
            }
            dfsi dfsiVar4 = this.a;
            Activity l3 = dfsiVar4.l();
            ProgressBar progressBar = new ProgressBar(l3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(l3);
            builder.setView(progressBar);
            builder.setMessage(dfvt.c(l3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            dfsiVar4.d.b(l3, create, "GooglePlayServicesUpdatingDialog", dfsiVar4);
            Context applicationContext = this.a.l().getApplicationContext();
            dfsg dfsgVar = new dfsg(this, create);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            dftg dftgVar = new dftg(dfsgVar);
            koa.g(applicationContext, dftgVar, intentFilter);
            dftgVar.a = applicationContext;
            if (dfqf.h(applicationContext)) {
                return;
            }
            dfsgVar.a();
            dftgVar.a();
        }
    }
}
