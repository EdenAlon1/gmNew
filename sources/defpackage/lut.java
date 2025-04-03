package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lut {
    private static lut e;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public boolean d;
    private int f;

    private lut(final Context context) {
        Executor a = ltj.a();
        this.a = a;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.f = 0;
        a.execute(new Runnable() { // from class: lun
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new lus(lut.this), intentFilter);
            }
        });
    }

    public static synchronized lut b(Context context) {
        lut lutVar;
        synchronized (lut.class) {
            if (e == null) {
                e = new lut(context);
            }
            lutVar = e;
        }
        return lutVar;
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            luq luqVar = (luq) it.next();
            if (luqVar.a.get() == null) {
                this.b.remove(luqVar);
            }
        }
    }

    public final void d(int i) {
        c();
        synchronized (this.c) {
            if (this.d && this.f == i) {
                return;
            }
            this.d = true;
            this.f = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((luq) it.next()).a();
            }
        }
    }
}
