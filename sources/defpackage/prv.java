package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prv implements pwt {
    public static final String a = ppt.d("Processor");
    public final Context c;
    public final WorkDatabase d;
    private final pod k;
    private final qbc l;
    public final Map f = new HashMap();
    public final Map e = new HashMap();
    public final Set h = new HashSet();
    public final List i = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object j = new Object();
    public final Map g = new HashMap();

    public prv(Context context, pod podVar, qbc qbcVar, WorkDatabase workDatabase) {
        this.c = context;
        this.k = podVar;
        this.l = qbcVar;
        this.d = workDatabase;
    }

    public static boolean e(String str, pua puaVar, int i) {
        if (puaVar == null) {
            ppt.c().a(a, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
            return false;
        }
        puaVar.j.t(new pti(i));
        ppt.c().a(a, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
        return true;
    }

    private final void h(final pxs pxsVar) {
        this.l.d.execute(new Runnable() { // from class: prs
            @Override // java.lang.Runnable
            public final void run() {
                prv prvVar = prv.this;
                Object obj = prvVar.j;
                pxs pxsVar2 = pxsVar;
                synchronized (obj) {
                    Iterator it = prvVar.i.iterator();
                    while (it.hasNext()) {
                        ((prh) it.next()).a(pxsVar2, false);
                    }
                }
            }
        });
    }

    public final pua a(String str) {
        pua puaVar = (pua) this.e.remove(str);
        boolean z = puaVar != null;
        if (!z) {
            puaVar = (pua) this.f.remove(str);
        }
        this.g.remove(str);
        if (z) {
            synchronized (this.j) {
                if (this.e.isEmpty()) {
                    Context context = this.c;
                    int i = pww.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.c.startService(intent);
                    } catch (Throwable th) {
                        ppt.c();
                        Log.e(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
        }
        return puaVar;
    }

    public final pua b(String str) {
        pua puaVar = (pua) this.e.get(str);
        return puaVar == null ? (pua) this.f.get(str) : puaVar;
    }

    public final void c(prh prhVar) {
        synchronized (this.j) {
            this.i.add(prhVar);
        }
    }

    public final void d(prh prhVar) {
        synchronized (this.j) {
            this.i.remove(prhVar);
        }
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.j) {
            z = b(str) != null;
        }
        return z;
    }

    public final boolean g(psb psbVar, pre preVar) {
        Throwable th;
        final ArrayList arrayList = new ArrayList();
        pxs pxsVar = psbVar.a;
        final String str = pxsVar.a;
        pyj pyjVar = (pyj) this.d.f(new Callable() { // from class: prt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                prv prvVar = prv.this;
                pzj E = prvVar.d.E();
                String str2 = str;
                arrayList.addAll(E.a(str2));
                return prvVar.d.D().b(str2);
            }
        });
        if (pyjVar == null) {
            ppt.c();
            String str2 = a;
            Objects.toString(pxsVar);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(pxsVar.toString()));
            h(pxsVar);
            return false;
        }
        synchronized (this.j) {
            try {
                try {
                    try {
                        if (f(str)) {
                            Set set = (Set) this.g.get(str);
                            if (((psb) set.iterator().next()).a.b == pxsVar.b) {
                                set.add(psbVar);
                                ppt.c().a(a, a.i(pxsVar, "Work ", " is already enqueued for processing"));
                            } else {
                                h(pxsVar);
                            }
                        } else {
                            if (pyjVar.v == pxsVar.b) {
                                ptp ptpVar = new ptp(this.c, this.k, this.l, this, this.d, pyjVar, arrayList);
                                if (preVar != null) {
                                    ptpVar.g = preVar;
                                }
                                final pua puaVar = new pua(ptpVar);
                                final ListenableFuture b = ppl.b(puaVar.i.b.plus(new ffuf(null)), new ptw(puaVar, null));
                                b.b(new Runnable() { // from class: pru
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z;
                                        ListenableFuture listenableFuture = b;
                                        pua puaVar2 = puaVar;
                                        try {
                                            z = ((Boolean) listenableFuture.get()).booleanValue();
                                        } catch (InterruptedException | ExecutionException unused) {
                                            z = true;
                                        }
                                        prv prvVar = prv.this;
                                        synchronized (prvVar.j) {
                                            pxs a2 = puaVar2.a();
                                            String str3 = a2.a;
                                            if (prvVar.b(str3) == puaVar2) {
                                                prvVar.a(str3);
                                            }
                                            ppt.c().a(prv.a, prvVar.getClass().getSimpleName() + " " + str3 + " executed; reschedule = " + z);
                                            Iterator it = prvVar.i.iterator();
                                            while (it.hasNext()) {
                                                ((prh) it.next()).a(a2, z);
                                            }
                                        }
                                    }
                                }, this.l.d);
                                this.f.put(str, puaVar);
                                HashSet hashSet = new HashSet();
                                hashSet.add(psbVar);
                                this.g.put(str, hashSet);
                                ppt.c().a(a, getClass().getSimpleName() + ": processing " + pxsVar);
                                return true;
                            }
                            h(pxsVar);
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
