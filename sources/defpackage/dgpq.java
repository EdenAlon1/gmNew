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
import com.google.android.gms.iid.MessengerCompat;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgpq implements ServiceConnection {
    dgpr c;
    final /* synthetic */ dgpv f;
    int a = 0;
    final Messenger b = new Messenger(new dgxx(Looper.getMainLooper(), new Handler.Callback() { // from class: dgpm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", a.h(i, "Received response to request: "));
            }
            dgpq dgpqVar = dgpq.this;
            synchronized (dgpqVar) {
                dgps dgpsVar = (dgps) dgpqVar.e.get(i);
                if (dgpsVar == null) {
                    Log.w("MessengerIpcClient", a.h(i, "Received response for unknown request: "));
                    return true;
                }
                dgpqVar.e.remove(i);
                dgpqVar.e();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    dgpsVar.a(new dgpt(4, "Not supported by GmsCore"));
                    return true;
                }
                dgpsVar.b(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public dgpq(dgpv dgpvVar) {
        this.f = dgpvVar;
    }

    final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
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
        dgpt dgptVar = new dgpt(i, str);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((dgps) it.next()).a(dgptVar);
        }
        this.d.clear();
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            ((dgps) this.e.valueAt(i3)).a(dgptVar);
        }
        this.e.clear();
    }

    final void b() {
        this.f.b.execute(new Runnable() { // from class: dgpn
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    final dgpq dgpqVar = dgpq.this;
                    synchronized (dgpqVar) {
                        if (dgpqVar.a != 2) {
                            return;
                        }
                        if (dgpqVar.d.isEmpty()) {
                            dgpqVar.e();
                            return;
                        }
                        final dgps dgpsVar = (dgps) dgpqVar.d.poll();
                        dfwv.n(dgpsVar);
                        dgpqVar.e.put(dgpsVar.a, dgpsVar);
                        dgpqVar.f.b.schedule(new Runnable() { // from class: dgpo
                            @Override // java.lang.Runnable
                            public final void run() {
                                dgpq.this.d(dgpsVar.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(dgpsVar.toString()));
                        }
                        dgpv dgpvVar = dgpqVar.f;
                        Messenger messenger = dgpqVar.b;
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = dgpsVar.a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", false);
                        bundle.putString("pkg", dgpvVar.a.getPackageName());
                        bundle.putBundle(GroupManagementRequest.DATA_TAG, dgpsVar.c);
                        obtain.setData(bundle);
                        try {
                            dgpr dgprVar = dgpqVar.c;
                            dfwv.n(dgprVar);
                            Messenger messenger2 = dgprVar.a;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                MessengerCompat messengerCompat = dgprVar.b;
                                if (messengerCompat == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                messengerCompat.b(obtain);
                            }
                        } catch (RemoteException e) {
                            dgpqVar.a(2, e.getMessage());
                        }
                    }
                }
            }
        });
    }

    final synchronized void c() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void d(int i) {
        dgps dgpsVar = (dgps) this.e.get(i);
        if (dgpsVar != null) {
            Log.w("MessengerIpcClient", a.h(i, "Timing out request: "));
            this.e.remove(i);
            dgpsVar.a(new dgpt(3, "Timed out waiting for response"));
            e();
        }
    }

    final synchronized void e() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            dfyh.a().b(this.f.a, this);
        }
    }

    final synchronized boolean f(dgps dgpsVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(dgpsVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(dgpsVar);
            b();
            return true;
        }
        this.d.add(dgpsVar);
        dfwv.i(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        if (dfyh.a().c(this.f.a, intent, this, 1)) {
            this.f.b.schedule(new Runnable() { // from class: dgpp
                @Override // java.lang.Runnable
                public final void run() {
                    dgpq.this.c();
                }
            }, 30L, TimeUnit.SECONDS);
        } else {
            a(0, "Unable to bind to service");
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.c = new dgpr(iBinder);
            this.a = 2;
            b();
        } catch (RemoteException e) {
            a(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }
}
