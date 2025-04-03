package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pwi extends pwl {
    private final BroadcastReceiver e;

    public pwi(Context context, qbc qbcVar) {
        super(context, qbcVar);
        this.e = new pwh(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.pwl
    public final void d() {
        ppt.c().a(pwj.a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.pwl
    public final void e() {
        ppt.c().a(pwj.a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
