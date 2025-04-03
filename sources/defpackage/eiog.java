package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.setupcompat.ISetupCompatService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiog implements ServiceConnection {
    final /* synthetic */ eioj a;

    public eiog(eioj eiojVar) {
        this.a = eiojVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.b(new eioh(7));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.a.b(new eioh(6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        if (iBinder == null) {
            eioj.a.f("Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        this.a.b(new eioh(i, ISetupCompatService.Stub.asInterface(iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b(new eioh(5));
    }
}
