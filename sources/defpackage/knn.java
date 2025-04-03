package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knn implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public knn(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(knm knmVar) {
        if (knmVar.b) {
            this.b.unbindService(this);
            knmVar.b = false;
        }
        knmVar.c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        if (r8.b != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.knm r8) {
        /*
            r7 = this;
            java.lang.String r0 = "NotifManCompat"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Processing component "
            r2.<init>(r3)
            android.content.ComponentName r3 = r8.a
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.util.ArrayDeque r3 = r8.d
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " queued tasks"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L2f:
            java.util.ArrayDeque r2 = r8.d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L39
            goto Lde
        L39:
            boolean r2 = r8.b
            if (r2 == 0) goto L3e
            goto L76
        L3e:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r2.<init>(r3)
            android.content.ComponentName r3 = r8.a
            android.content.Intent r2 = r2.setComponent(r3)
            android.content.Context r3 = r7.b
            r4 = 33
            boolean r2 = r3.bindService(r2, r7, r4)
            r8.b = r2
            if (r2 == 0) goto L5b
            r2 = 0
            r8.e = r2
            goto L72
        L5b:
            android.content.ComponentName r2 = r8.a
            java.util.Objects.toString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unable to bind to listener "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r0, r2)
            android.content.Context r2 = r7.b
            r2.unbindService(r7)
        L72:
            boolean r2 = r8.b
            if (r2 == 0) goto Ldf
        L76:
            android.support.v4.app.INotificationSideChannel r2 = r8.c
            if (r2 == 0) goto Ldf
        L7a:
            java.util.ArrayDeque r2 = r8.d
            java.lang.Object r2 = r2.peek()
            knk r2 = (defpackage.knk) r2
            if (r2 != 0) goto L85
            goto Ld3
        L85:
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            if (r3 == 0) goto L94
            java.lang.String r3 = "Sending task "
            java.lang.String r3 = defpackage.a.n(r2, r3)     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            android.util.Log.d(r0, r3)     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
        L94:
            android.support.v4.app.INotificationSideChannel r3 = r8.c     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            android.app.Notification r4 = r2.d     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            java.lang.String r5 = r2.c     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            int r6 = r2.b     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            java.lang.String r2 = r2.a     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            r3.notify(r2, r6, r5, r4)     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            java.util.ArrayDeque r2 = r8.d     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            r2.remove()     // Catch: android.os.RemoteException -> La7 android.os.DeadObjectException -> Lbb
            goto L7a
        La7:
            r1 = move-exception
            android.content.ComponentName r2 = r8.a
            java.util.Objects.toString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "RemoteException communicating with "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r0, r2, r1)
            goto Ld3
        Lbb:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Ld3
            android.content.ComponentName r1 = r8.a
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Remote service has died: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
        Ld3:
            java.util.ArrayDeque r0 = r8.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lde
            r7.c(r8)
        Lde:
            return
        Ldf:
            r7.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knn.b(knm):void");
    }

    private final void c(knm knmVar) {
        if (this.a.hasMessages(3, knmVar.a)) {
            return;
        }
        int i = knmVar.e;
        int i2 = i + 1;
        knmVar.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", a.f(i3, "Scheduling retry for ", " ms"));
            }
            this.a.sendMessageDelayed(this.a.obtainMessage(3, knmVar.a), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + knmVar.d.size() + " tasks to " + knmVar.a + " after " + knmVar.e + " retries");
        knmVar.d.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                knl knlVar = (knl) message.obj;
                ComponentName componentName = knlVar.a;
                IBinder iBinder = knlVar.b;
                knm knmVar = (knm) this.d.get(componentName);
                if (knmVar != null) {
                    knmVar.c = INotificationSideChannel.Stub.asInterface(iBinder);
                    knmVar.e = 0;
                    b(knmVar);
                }
                return true;
            }
            if (i == 2) {
                knm knmVar2 = (knm) this.d.get((ComponentName) message.obj);
                if (knmVar2 != null) {
                    a(knmVar2);
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            knm knmVar3 = (knm) this.d.get((ComponentName) message.obj);
            if (knmVar3 != null) {
                b(knmVar3);
            }
            return true;
        }
        knk knkVar = (knk) message.obj;
        Context context = this.b;
        Object obj = kno.a;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (kno.a) {
            if (string != null) {
                if (!string.equals(kno.b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    kno.c = hashSet;
                    kno.b = string;
                }
            }
            set = kno.c;
        }
        if (!set.equals(this.e)) {
            this.e = set;
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName2 = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", a.i(componentName2, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet2) {
                if (!this.d.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName3);
                        Log.d("NotifManCompat", "Adding listener record for ".concat(String.valueOf(componentName3)));
                    }
                    this.d.put(componentName3, new knm(componentName3));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Object key = entry.getKey();
                        Objects.toString(key);
                        Log.d("NotifManCompat", "Removing listener record for ".concat(String.valueOf(key)));
                    }
                    a((knm) entry.getValue());
                    it.remove();
                }
            }
        }
        for (knm knmVar4 : this.d.values()) {
            knmVar4.d.add(knkVar);
            b(knmVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            Log.d("NotifManCompat", "Connected to service ".concat(String.valueOf(componentName)));
        }
        this.a.obtainMessage(1, new knl(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            Log.d("NotifManCompat", "Disconnected from service ".concat(String.valueOf(componentName)));
        }
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
