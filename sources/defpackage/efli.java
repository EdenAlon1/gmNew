package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efli implements Application.ActivityLifecycleCallbacks, efle {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public efkv f;
    private final eflf h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    private efli(efkv efkvVar, ScheduledExecutorService scheduledExecutorService, eflf eflfVar) {
        this.f = efkvVar;
        this.a = scheduledExecutorService;
        this.h = eflfVar;
    }

    public static efli c(efkv efkvVar, ScheduledExecutorService scheduledExecutorService, eflf eflfVar, Application application) {
        efli efliVar = new efli(efkvVar, scheduledExecutorService, eflfVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(efliVar);
        }
        eflfVar.c = efliVar;
        return efliVar;
    }

    public final void a() {
        synchronized (this.e) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    public final void b() {
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        this.c.set(0L);
        efkv efkvVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        eflf eflfVar = this.h;
        synchronized (eflfVar.b) {
            Iterator it = eflfVar.a.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                efld efldVar = (efld) it.next();
                HashMap hashMap = new HashMap(efldVar.c.length > 0 ? 10 : 1);
                eflc eflcVar = new eflc(efldVar.b, efldVar.c);
                synchronized (efldVar.a) {
                    eflcVar.c = efldVar.d;
                    eflcVar.d = efldVar.e;
                    efldVar.d = hashMap;
                    efldVar.e = 0;
                }
                arrayList3.add(eflcVar);
            }
        }
        emrl emrlVar = (emrl) emrm.a.createBuilder();
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            dflc dflcVar = null;
            evjo evjoVar = null;
            if (i5 >= size) {
                emrm emrmVar = (emrm) emrlVar.build();
                if (emrmVar.b.size() != 0) {
                    dflcVar = efkvVar.a.i(emrmVar);
                    dflcVar.k = efkvVar.b;
                    Iterator it2 = efkvVar.c.iterator();
                    while (it2.hasNext()) {
                        dflcVar.g((String) it2.next());
                    }
                }
                if (dflcVar != null) {
                    dflcVar.c();
                    return;
                }
                return;
            }
            eflc eflcVar2 = (eflc) arrayList3.get(i5);
            if (eflcVar2.d == 0) {
                arrayList = arrayList3;
                i2 = size;
            } else {
                evjh evjhVar = (evjh) evjo.a.createBuilder();
                long a = eflf.a(eflcVar2.a);
                evjhVar.copyOnWrite();
                evjo evjoVar2 = (evjo) evjhVar.instance;
                evjoVar2.b |= 2;
                evjoVar2.c = a;
                efla[] eflaVarArr = eflcVar2.b;
                int length = eflaVarArr.length;
                for (int i6 = i; i6 < length; i6++) {
                    long a2 = eflf.a(eflaVarArr[i6].a);
                    evjhVar.copyOnWrite();
                    evjo evjoVar3 = (evjo) evjhVar.instance;
                    eygl eyglVar = evjoVar3.d;
                    if (!eyglVar.c()) {
                        evjoVar3.d = eyfy.mutableCopy(eyglVar);
                    }
                    evjoVar3.d.g(a2);
                }
                for (Map.Entry entry : eflcVar2.c.entrySet()) {
                    evji evjiVar = (evji) evjn.a.createBuilder();
                    efkt efktVar = (efkt) entry.getKey();
                    efku efkuVar = (efku) entry.getValue();
                    if (eflcVar2.b.length > 0) {
                        String str = eflcVar2.a;
                        ArrayList arrayList4 = new ArrayList(efktVar.c.length);
                        int i7 = 0;
                        while (i7 < efktVar.c.length) {
                            evjj evjjVar = (evjj) evjk.a.createBuilder();
                            Object obj = efktVar.c[i7];
                            ArrayList arrayList5 = arrayList3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                evjjVar.copyOnWrite();
                                evjk evjkVar = (evjk) evjjVar.instance;
                                str2.getClass();
                                i4 = size;
                                evjkVar.b = 1;
                                evjkVar.c = str2;
                            } else {
                                i4 = size;
                                if (obj instanceof Integer) {
                                    Integer num = (Integer) obj;
                                    num.intValue();
                                    evjjVar.copyOnWrite();
                                    evjk evjkVar2 = (evjk) evjjVar.instance;
                                    evjkVar2.b = 2;
                                    evjkVar2.c = num;
                                } else {
                                    if (!(obj instanceof Boolean)) {
                                        throw new IllegalArgumentException("Metric " + str + " has field " + i7 + " with an unexpected value: " + String.valueOf(obj));
                                    }
                                    Boolean bool = (Boolean) obj;
                                    bool.booleanValue();
                                    evjjVar.copyOnWrite();
                                    evjk evjkVar3 = (evjk) evjjVar.instance;
                                    evjkVar3.b = 3;
                                    evjkVar3.c = bool;
                                }
                            }
                            arrayList4.add((evjk) evjjVar.build());
                            i7++;
                            arrayList3 = arrayList5;
                            size = i4;
                        }
                        arrayList2 = arrayList3;
                        i3 = size;
                        evjiVar.copyOnWrite();
                        evjn evjnVar = (evjn) evjiVar.instance;
                        eygr eygrVar = evjnVar.c;
                        if (!eygrVar.c()) {
                            evjnVar.c = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(arrayList4, evjnVar.c);
                    } else {
                        arrayList2 = arrayList3;
                        i3 = size;
                    }
                    evjm a3 = efkuVar.a();
                    evjiVar.copyOnWrite();
                    evjn evjnVar2 = (evjn) evjiVar.instance;
                    a3.getClass();
                    evjnVar2.d = a3;
                    evjnVar2.b |= 1;
                    evjhVar.copyOnWrite();
                    evjo evjoVar4 = (evjo) evjhVar.instance;
                    evjn evjnVar3 = (evjn) evjiVar.build();
                    evjnVar3.getClass();
                    eygr eygrVar2 = evjoVar4.e;
                    if (!eygrVar2.c()) {
                        evjoVar4.e = eyfy.mutableCopy(eygrVar2);
                    }
                    evjoVar4.e.add(evjnVar3);
                    arrayList3 = arrayList2;
                    size = i3;
                }
                arrayList = arrayList3;
                i2 = size;
                evjoVar = (evjo) evjhVar.build();
            }
            if (evjoVar != null) {
                emrlVar.copyOnWrite();
                emrm emrmVar2 = (emrm) emrlVar.instance;
                eygr eygrVar3 = emrmVar2.b;
                if (!eygrVar3.c()) {
                    emrmVar2.b = eyfy.mutableCopy(eygrVar3);
                }
                emrmVar2.b.add(evjoVar);
            }
            i5++;
            arrayList3 = arrayList;
            size = i2;
            i = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
