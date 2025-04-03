package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwo extends pwl {
    public final ConnectivityManager e;
    private final pwn f;

    public pwo(Context context, qbc qbcVar) {
        super(context, qbcVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new pwn(this);
    }

    @Override // defpackage.pwl
    public final /* bridge */ /* synthetic */ Object b() {
        return pwp.a(this.e);
    }

    @Override // defpackage.pwl
    public final void d() {
        try {
            ppt.c().a(pwp.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.e;
            pwn pwnVar = this.f;
            pwnVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(pwnVar);
        } catch (IllegalArgumentException e) {
            ppt.c();
            Log.e(pwp.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            ppt.c();
            Log.e(pwp.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.pwl
    public final void e() {
        try {
            ppt.c().a(pwp.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.e;
            pwn pwnVar = this.f;
            pwnVar.getClass();
            connectivityManager.unregisterNetworkCallback(pwnVar);
        } catch (IllegalArgumentException e) {
            ppt.c();
            Log.e(pwp.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            ppt.c();
            Log.e(pwp.a, "Received exception while unregistering network callback", e2);
        }
    }
}
