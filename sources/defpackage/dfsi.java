package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfsi extends dfth implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final dfpi d;

    public dfsi(dfti dftiVar, dfpi dfpiVar) {
        super(dftiVar);
        this.b = new AtomicReference(null);
        this.c = new dgxx(Looper.getMainLooper());
        this.d = dfpiVar;
    }

    private static final int k(dfsf dfsfVar) {
        if (dfsfVar == null) {
            return -1;
        }
        return dfsfVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.dfth
    public final void c(int i, int i2, Intent intent) {
        dfsf dfsfVar = (dfsf) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int h = this.d.h(l());
                if (h == 0) {
                    b();
                    return;
                } else {
                    if (dfsfVar == null) {
                        return;
                    }
                    if (dfsfVar.b.c == 18 && h == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (dfsfVar != null) {
                a(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, dfsfVar.b.toString()), k(dfsfVar));
                return;
            }
            return;
        }
        if (dfsfVar != null) {
            a(dfsfVar.b, dfsfVar.a);
        }
    }

    @Override // defpackage.dfth
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new dfsf(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.dfth
    public final void g(Bundle bundle) {
        dfsf dfsfVar = (dfsf) this.b.get();
        if (dfsfVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", dfsfVar.a);
        bundle.putInt("failed_status", dfsfVar.b.c);
        bundle.putParcelable("failed_resolution", dfsfVar.b.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), k((dfsf) this.b.get()));
    }
}
