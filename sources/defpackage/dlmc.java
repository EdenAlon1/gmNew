package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmc {
    private final List a;
    private final dlld b;

    public dlmc() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dlma a(List list) {
        dllt dlltVar;
        dllv dllvVar;
        dlma dlmaVar = new dlma();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                dlls dllsVar = (dlls) ((ListenableFuture) it.next()).get();
                dlld dlldVar = this.b;
                if (dlldVar != null) {
                    try {
                        dllv dllvVar2 = dllsVar.c;
                        if (dllvVar2 != null && (dlltVar = dllsVar.b) != null) {
                            int i = dllvVar2.a(dlltVar.c).b;
                            dlll dlllVar = dlldVar.b;
                            if (i == 5) {
                                String str = dllsVar.b.b;
                                Bundle a = ((dllj) dlllVar).a();
                                a.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                ((dllj) dlllVar).b.call("mark_fix_completed", null, a);
                            } else {
                                dllsVar.c.a(dllsVar.b.c);
                                String str2 = dllsVar.b.b;
                                Bundle a2 = ((dllj) dlllVar).a();
                                a2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                ((dllj) dlllVar).b.call("mark_fix_attempted", null, a2);
                            }
                        }
                        Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                    } catch (RemoteException unused) {
                        dllv dllvVar3 = dlldVar.c;
                        dllg dllgVar = dlldVar.a;
                        deyj deyjVar = (deyj) deyk.a.createBuilder();
                        dexf dexfVar = dllsVar.b.c;
                        deyjVar.copyOnWrite();
                        ((deyk) deyjVar.instance).b = dexfVar.a();
                        String str3 = dllsVar.b.b;
                        deyjVar.copyOnWrite();
                        deyk deykVar = (deyk) deyjVar.instance;
                        str3.getClass();
                        deykVar.d = str3;
                        dllgVar.e(dllvVar3.b, (deyk) deyjVar.build(), dllvVar3.a);
                    }
                }
                dlmaVar.a |= dllsVar.b();
                dlmaVar.b |= dllsVar.a();
                if (dllsVar.a() && (dllvVar = dllsVar.c) != null) {
                    Context context = dllvVar.b;
                    synchronized (dlmh.class) {
                        Thread thread = dlmh.a;
                        if (thread != null) {
                            thread.interrupt();
                        }
                        if (dlmh.b != null) {
                            Log.d("AppDoctorRestartUtil", "A restart app timeout thread already started.");
                            dlmh.b.getClass();
                        } else {
                            final Context applicationContext = context.getApplicationContext();
                            Thread thread2 = new Thread(new Runnable() { // from class: dlmg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        Thread.sleep(Math.max(0L, 600000L));
                                    } catch (InterruptedException e) {
                                        Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e);
                                        Thread.currentThread().interrupt();
                                    }
                                    dlmh.a(applicationContext);
                                    dlmh.b();
                                }
                            });
                            thread2.start();
                            dlmh.a = thread2;
                            dlmh.b = thread2;
                        }
                    }
                } else if (dllsVar.b()) {
                    synchronized (dlmh.class) {
                        Thread thread3 = dlmh.a;
                        if (thread3 == null || !thread3.isAlive()) {
                            Thread thread4 = new Thread(new Runnable() { // from class: dlmf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        Thread.sleep(Math.max(0L, 600000L));
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                        synchronized (dlmh.class) {
                                            Thread thread5 = dlmh.b;
                                            if (thread5 != null && thread5.isAlive()) {
                                                Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                                                return;
                                            }
                                        }
                                    }
                                    dlmh.b();
                                }
                            });
                            thread4.start();
                            dlmh.a = thread4;
                        } else {
                            Log.d("AppDoctorRestartUtil", "A restart process timeout thread already started.");
                            dlmh.a.getClass();
                        }
                    }
                } else {
                    continue;
                }
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
            }
        }
        return dlmaVar;
    }

    public final dlmb b(final dllv dllvVar) {
        ListenableFuture a;
        dlma dlmaVar;
        ListenableFuture a2;
        boolean z;
        final dlma dlmaVar2 = new dlma();
        try {
            engw<dllt> n = engw.n(this.a);
            final ArrayList arrayList = new ArrayList(n.size());
            try {
                Iterator<E> it = n.iterator();
                while (it.hasNext()) {
                    if (((dllt) it.next()).a(dllvVar)) {
                        final dlly dllyVar = new dlly(dllvVar.b);
                        boolean z2 = false;
                        boolean z3 = false;
                        for (final dllt dlltVar : n) {
                            dllu dlluVar = new dllu(dllvVar);
                            dlluVar.g = dlltVar;
                            dllv a3 = dlluVar.a();
                            if (dlltVar.a(a3)) {
                                dllu dlluVar2 = new dllu(a3);
                                dlluVar2.b(new dllq(dlltVar.e.a, 3));
                                final dllv a4 = dlluVar2.a();
                                dlltVar.c(a4, dlltVar.e, dllyVar);
                                a2 = dlltVar.f ? dlln.a(new Callable() { // from class: dllr
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        dllt dlltVar2 = dllt.this;
                                        return dlltVar2.b(a4, dllyVar, dlltVar2.e);
                                    }
                                }) : erqt.i(dlltVar.b(a4, dllyVar, dlltVar.e));
                                z = true;
                            } else {
                                a2 = erqt.i(dlls.a);
                                z = false;
                            }
                            z3 |= z;
                            z2 |= !a2.isDone();
                            arrayList.add(a2);
                        }
                        if (z2) {
                            dlma dlmaVar3 = new dlma();
                            try {
                                a = dlln.a(Executors.callable(new Runnable() { // from class: dllz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        dlmc dlmcVar = dlmc.this;
                                        dlma dlmaVar4 = dlmaVar2;
                                        List list = arrayList;
                                        dllv dllvVar2 = dllvVar;
                                        try {
                                            dlma a5 = dlmcVar.a(list);
                                            dlmaVar4.a |= a5.a;
                                            dlmaVar4.b = a5.b | dlmaVar4.b;
                                            if (dlmaVar4.b()) {
                                                dlmaVar4.a(dllvVar2.b);
                                            }
                                        } catch (Throwable th) {
                                            if (dlmaVar4.b()) {
                                                dlmaVar4.a(dllvVar2.b);
                                            }
                                            throw th;
                                        }
                                    }
                                }));
                                dlmaVar = dlmaVar3;
                            } catch (Throwable th) {
                                th = th;
                                dlmaVar2 = dlmaVar3;
                                if (dlmaVar2.b()) {
                                    dlmaVar2.a(dllvVar.b);
                                }
                                throw th;
                            }
                        } else {
                            a = erqt.i(null);
                            dlmaVar = a(arrayList);
                        }
                        dlmb dlmbVar = new dlmb(z3, a);
                        if (dlmaVar.b()) {
                            dlmaVar.a(dllvVar.b);
                        }
                        return dlmbVar;
                    }
                }
                dlmb dlmbVar2 = new dlmb(false, erqt.i(null));
                if (dlmaVar2.b()) {
                    dlmaVar2.a(dllvVar.b);
                }
                return dlmbVar2;
            } catch (RuntimeException e) {
                dllo.a(e, dllvVar, "AppDoctorFixerFramework");
                dlmb dlmbVar3 = new dlmb(false, erqt.h(e));
                if (dlmaVar2.b()) {
                    dlmaVar2.a(dllvVar.b);
                }
                return dlmbVar3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(dllt dlltVar) {
        emxf.m(!this.a.contains(dlltVar), "The same fixer cannot be added twice");
        this.a.add(dlltVar);
    }

    public dlmc(dlld dlldVar) {
        this.a = new ArrayList();
        this.b = dlldVar;
    }
}
