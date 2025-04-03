package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwr {
    private static final Map o = new HashMap();
    public final Context a;
    public final ehvt b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final ehwn i;
    public ServiceConnection m;
    public IInterface n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient k = new IBinder.DeathRecipient() { // from class: ehwi
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ehwr ehwrVar = ehwr.this;
            ehwrVar.b.d("reportBinderDeath", new Object[0]);
            ehwm ehwmVar = (ehwm) ehwrVar.j.get();
            if (ehwmVar != null) {
                ehwrVar.b.d("calling onBinderDied", new Object[0]);
                ehwmVar.a();
            } else {
                ehwrVar.b.d("%s : Binder has died.", ehwrVar.c);
                Iterator it = ehwrVar.d.iterator();
                while (it.hasNext()) {
                    ((ehwh) it.next()).b(ehwrVar.a());
                }
                ehwrVar.d.clear();
            }
            synchronized (ehwrVar.f) {
                ehwrVar.c();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public ehwr(Context context, ehvt ehvtVar, String str, Intent intent, ehwn ehwnVar) {
        this.a = context;
        this.b = ehvtVar;
        this.c = str;
        this.h = intent;
        this.i = ehwnVar;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void b(ehwh ehwhVar, dhri dhriVar) {
        d(new ehwk(this, ehwhVar.d, dhriVar, ehwhVar));
    }

    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((dhri) it.next()).c(a());
        }
        this.e.clear();
    }

    public final void d(ehwh ehwhVar) {
        Handler handler;
        Map map = o;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.c);
        }
        handler.post(ehwhVar);
    }

    public final void e(dhri dhriVar) {
        synchronized (this.f) {
            this.e.remove(dhriVar);
        }
        d(new ehwl(this));
    }
}
