package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.IExampleStoreV2;
import com.google.android.gms.learning.internal.IInAppExampleStoreProxy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dgty extends Service implements dgua {
    private final IExampleStoreV2 a = new dgtw(this);
    private final Object b = new Object();
    private IInAppExampleStoreProxy c;

    private final IInAppExampleStoreProxy a() {
        IInAppExampleStoreProxy iInAppExampleStoreProxy;
        synchronized (this.b) {
            iInAppExampleStoreProxy = this.c;
        }
        return iInAppExampleStoreProxy;
    }

    public abstract void b(String str, byte[] bArr, byte[] bArr2, dgtx dgtxVar, ewdr ewdrVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IInAppExampleStoreProxy iInAppExampleStoreProxy;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            if (Log.isLoggable("brella.InAppExStProxy", 3)) {
                Log.d("brella.InAppExStProxy", "Received connection using V1 protocol");
            }
            return new dgva("Received connection with unexpected action ".concat(String.valueOf(intent.getAction())));
        }
        if (Log.isLoggable("brella.InAppExStProxy", 3)) {
            Log.d("brella.InAppExStProxy", "Received connection using V2 protocol");
        }
        synchronized (this.b) {
            iInAppExampleStoreProxy = this.c;
            if (iInAppExampleStoreProxy == null) {
                try {
                    iInAppExampleStoreProxy = (IInAppExampleStoreProxy) dgvf.a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", new dgve() { // from class: dgtv
                        @Override // defpackage.dgve
                        public final IInterface a(IBinder iBinder) {
                            return IInAppExampleStoreProxy.Stub.asInterface(iBinder);
                        }
                    });
                    try {
                        iInAppExampleStoreProxy.init(ObjectWrapper.wrap(this), this.a);
                        this.c = iInAppExampleStoreProxy;
                    } catch (RemoteException e) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", e);
                        }
                        return new dgva("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (dgvd e2) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", e2);
                    }
                    return new dgva("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            return iInAppExampleStoreProxy.onBind(intent);
        } catch (RemoteException e3) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", e3);
            }
            return new dgva("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IInAppExampleStoreProxy a = a();
        if (a != null) {
            try {
                a.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        IInAppExampleStoreProxy a = a();
        if (a != null) {
            try {
                a.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        IInAppExampleStoreProxy a = a();
        if (a != null) {
            try {
                a.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", e);
                }
            }
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        IInAppExampleStoreProxy a = a();
        if (a != null) {
            try {
                return a.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
