package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qmj implements ServiceConnection {
    final /* synthetic */ qmk a;
    private final allh b;

    public qmj(qmk qmkVar, allh allhVar) {
        this.a = qmkVar;
        this.b = allhVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qmm.a("Install Referrer service connected.");
        qmk qmkVar = this.a;
        qmkVar.b = IGetInstallReferrerService.Stub.asInterface(iBinder);
        qmkVar.a = 2;
        this.b.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qmm.b("Install Referrer service disconnected.");
        qmk qmkVar = this.a;
        qmkVar.b = null;
        qmkVar.a = 0;
    }
}
