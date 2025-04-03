package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProvider;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sch implements ServiceConnection {
    public SettableFuture b;
    final /* synthetic */ sci d;
    public final Object a = new Object();
    protected sco c = new sco();

    public sch(sci sciVar) {
        this.d = sciVar;
        c();
    }

    public final void a(IAICoreService iAICoreService) {
        synchronized (this.a) {
            this.b.set(new sat(iAICoreService, this.c));
        }
    }

    public final void b(sao saoVar) {
        synchronized (this.a) {
            this.b.setException(saoVar);
        }
        this.d.i();
    }

    final void c() {
        synchronized (this.a) {
            this.b = SettableFuture.create();
            this.c = new sco();
        }
    }

    public final boolean d(Intent intent) {
        sci sciVar = this.d;
        return sciVar.d.bindService(intent, this, true == sciVar.f ? 65 : 1);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        b(new sao(4, 603, "AiCore service binding died.", null));
        this.d.i();
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        b(new sao(4, 605, "AiCore service returns null on binding.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!emxb.a(componentName, sci.b)) {
            if (emxb.a(componentName, sci.c)) {
                a(IAICoreService.Stub.asInterface(iBinder));
                return;
            } else {
                b(new sao(4, 0, "AiCore service is not connected. Unknown component ".concat(String.valueOf(String.valueOf(componentName))), null));
                return;
            }
        }
        try {
            IAiCoreServiceProvider.Stub.asInterface(iBinder).get(new scg(this));
        } catch (RemoteException | RuntimeException e) {
            b(new sao(4, 6, "AiCore service is not connected.", e));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a) {
            this.c.c();
            this.b.setException(new sao(4, 602, "AiCore service disconnected.", null));
            c();
        }
    }
}
