package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwq implements ServiceConnection {
    final /* synthetic */ ehwr a;

    public ehwq(ehwr ehwrVar) {
        this.a = ehwrVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.d(new ehwo(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.d(new ehwp(this));
    }
}
