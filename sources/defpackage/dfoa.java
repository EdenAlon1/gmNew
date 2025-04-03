package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfoa implements ServiceConnection {
    dfob c;
    final /* synthetic */ dfog f;
    int a = 0;
    final Messenger b = new Messenger(new dgxx(Looper.getMainLooper(), new Handler.Callback() { // from class: dfnz
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", a.h(i, "Received response to request: "));
            }
            dfoa dfoaVar = dfoa.this;
            synchronized (dfoaVar) {
                dfod dfodVar = (dfod) dfoaVar.e.get(i);
                if (dfodVar == null) {
                    Log.w("MessengerIpcClient", a.h(i, "Received response for unknown request: "));
                    return true;
                }
                dfoaVar.e.remove(i);
                dfoaVar.d();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    dfodVar.c(new dfoe("Not supported by GmsCore"));
                    return true;
                }
                dfodVar.a(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public dfoa(dfog dfogVar) {
        this.f = dfogVar;
    }

    final void a() {
        this.f.b.execute(new Runnable() { // from class: dfnv
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    final dfoa dfoaVar = dfoa.this;
                    synchronized (dfoaVar) {
                        if (dfoaVar.a != 2) {
                            return;
                        }
                        if (dfoaVar.d.isEmpty()) {
                            dfoaVar.d();
                            return;
                        }
                        final dfod dfodVar = (dfod) dfoaVar.d.poll();
                        dfoaVar.e.put(dfodVar.a, dfodVar);
                        dfoaVar.f.b.schedule(new Runnable() { // from class: dfnx
                            @Override // java.lang.Runnable
                            public final void run() {
                                dfoa.this.c(dfodVar.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(String.valueOf(dfodVar))));
                        }
                        dfog dfogVar = dfoaVar.f;
                        Messenger messenger = dfoaVar.b;
                        int i = dfodVar.c;
                        Message obtain = Message.obtain();
                        obtain.what = i;
                        obtain.arg1 = dfodVar.a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", dfodVar.b());
                        bundle.putString("pkg", dfogVar.a.getPackageName());
                        bundle.putBundle(GroupManagementRequest.DATA_TAG, dfodVar.d);
                        obtain.setData(bundle);
                        try {
                            dfob dfobVar = dfoaVar.c;
                            Messenger messenger2 = dfobVar.a;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                CloudMessagingMessengerCompat cloudMessagingMessengerCompat = dfobVar.b;
                                if (cloudMessagingMessengerCompat == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                cloudMessagingMessengerCompat.b(obtain);
                            }
                        } catch (RemoteException e) {
                            dfoaVar.g(e.getMessage());
                        }
                    }
                }
            }
        });
    }

    final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    final synchronized void c(int i) {
        dfod dfodVar = (dfod) this.e.get(i);
        if (dfodVar != null) {
            Log.w("MessengerIpcClient", a.h(i, "Timing out request: "));
            this.e.remove(i);
            dfodVar.c(new dfoe("Timed out waiting for response"));
            d();
        }
    }

    final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            dfyh.a().b(this.f.a, this);
        }
    }

    final synchronized boolean e(dfod dfodVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(dfodVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(dfodVar);
            a();
            return true;
        }
        this.d.add(dfodVar);
        dfwv.i(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (dfyh.a().c(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new Runnable() { // from class: dfnw
                    @Override // java.lang.Runnable
                    public final void run() {
                        dfoa.this.b();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        dfyh.a().b(this.f.a, this);
        dfoe dfoeVar = new dfoe(str, th);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((dfod) it.next()).c(dfoeVar);
        }
        this.d.clear();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((dfod) this.e.valueAt(i2)).c(dfoeVar);
        }
        this.e.clear();
    }

    final synchronized void g(String str) {
        f(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        dfog dfogVar = this.f;
        dfogVar.b.execute(new Runnable() { // from class: dfnu
            @Override // java.lang.Runnable
            public final void run() {
                dfoa dfoaVar = dfoa.this;
                IBinder iBinder2 = iBinder;
                synchronized (dfoaVar) {
                    try {
                        if (iBinder2 == null) {
                            dfoaVar.g("Null service connection");
                            return;
                        }
                        try {
                            dfoaVar.c = new dfob(iBinder2);
                            dfoaVar.a = 2;
                            dfoaVar.a();
                        } catch (RemoteException e) {
                            dfoaVar.g(e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        dfog dfogVar = this.f;
        dfogVar.b.execute(new Runnable() { // from class: dfny
            @Override // java.lang.Runnable
            public final void run() {
                dfoa.this.g("Service disconnected");
            }
        });
    }
}
