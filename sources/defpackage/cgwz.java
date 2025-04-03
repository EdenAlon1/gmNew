package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgwz implements ServiceConnection {
    private final cgxa a;

    public cgwz(cgxa cgxaVar) {
        this.a = cgxaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.c = (cgww) iBinder;
        cgxa.a.m("DittoForegroundService is connected");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.c = null;
        cgxa.a.m("DittoForegroundService is disconnected");
    }
}
