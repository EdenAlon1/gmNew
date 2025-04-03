package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvl implements ServiceConnection {
    final /* synthetic */ BaseGmsClient a;
    private final int b;

    public dfvl(BaseGmsClient baseGmsClient, int i) {
        this.a = baseGmsClient;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            synchronized (this.a.g) {
                this.a.h = IGmsServiceBroker.Stub.asInterface(iBinder);
            }
            this.a.D(0, null, this.b);
            return;
        }
        BaseGmsClient baseGmsClient = this.a;
        synchronized (baseGmsClient.f) {
            i = baseGmsClient.k;
        }
        if (i == 3) {
            baseGmsClient.p = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = baseGmsClient.e;
        handler.sendMessage(handler.obtainMessage(i2, baseGmsClient.r.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.g) {
            this.a.h = null;
        }
        BaseGmsClient baseGmsClient = this.a;
        int i = this.b;
        Handler handler = baseGmsClient.e;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
