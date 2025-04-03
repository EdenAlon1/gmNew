package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class puq implements Runnable {
    final /* synthetic */ puu a;

    public puq(puu puuVar) {
        this.a = puuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        puu puuVar;
        put putVar;
        List<psb> d;
        synchronized (this.a.g) {
            puu puuVar2 = this.a;
            puuVar2.h = (Intent) puuVar2.g.get(0);
        }
        puu puuVar3 = this.a;
        Intent intent = puuVar3.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = puuVar3.h.getIntExtra("KEY_START_ID", 0);
            ppt.c().a(puu.a, "Processing command " + this.a.h + ", " + intExtra);
            PowerManager.WakeLock a = qar.a(this.a.b, action + " (" + intExtra + ")");
            try {
                ppt.c().a(puu.a, a.o(a, action, "Acquiring operation wake lock (", ") "));
                a.acquire();
                puu puuVar4 = this.a;
                puk pukVar = puuVar4.f;
                Intent intent2 = puuVar4.h;
                String action2 = intent2.getAction();
                boolean z = false;
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    ppt c = ppt.c();
                    String str = puk.a;
                    Objects.toString(intent2);
                    c.a(str, "Handling constraints changed ".concat(String.valueOf(intent2)));
                    String str2 = pum.a;
                    Context context = pukVar.b;
                    pvn pvnVar = new pvn(puuVar4.e.l);
                    List<pyj> d2 = puuVar4.e.e.D().d();
                    int i = ConstraintProxy.a;
                    Iterator it = d2.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        poj pojVar = ((pyj) it.next()).l;
                        z2 |= pojVar.e;
                        z3 |= pojVar.c;
                        z4 |= pojVar.f;
                        z5 |= pojVar.j != 1;
                        if (z2 && z3 && z4 && z5) {
                            break;
                        }
                    }
                    int i2 = ConstraintProxyUpdateReceiver.b;
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(d2.size());
                    long currentTimeMillis = System.currentTimeMillis();
                    for (pyj pyjVar : d2) {
                        if (currentTimeMillis >= pyjVar.a() && (!pyjVar.d() || pvnVar.b(pyjVar))) {
                            arrayList.add(pyjVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        pyj pyjVar2 = (pyj) arrayList.get(i3);
                        String str3 = pyjVar2.c;
                        Intent c2 = puk.c(context, pzh.a(pyjVar2));
                        ppt.c().a(pum.a, a.a(str3, "Creating a delay_met command for workSpec with id (", ")"));
                        puuVar4.j.d.execute(new pur(puuVar4, c2, intExtra));
                    }
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    ppt.c().a(puk.a, "Handling reschedule " + intent2 + ", " + intExtra);
                    puuVar4.e.p();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                            pxs e = puk.e(intent2);
                            ppt c3 = ppt.c();
                            String str4 = puk.a;
                            Objects.toString(e);
                            c3.a(str4, "Handling schedule work for ".concat(e.toString()));
                            WorkDatabase workDatabase = puuVar4.e.e;
                            workDatabase.n();
                            try {
                                pyj b = workDatabase.D().b(e.a);
                                if (b == null) {
                                    ppt.c();
                                    Log.w(puk.a, a.i(e, "Skipping scheduling ", " because it's no longer in the DB"));
                                } else if (b.d.a()) {
                                    ppt.c();
                                    Log.w(puk.a, a.i(e, "Skipping scheduling ", "because it is finished."));
                                } else {
                                    long a2 = b.a();
                                    if (b.d()) {
                                        ppt.c().a(puk.a, "Opportunistically setting an alarm for " + e + "at " + a2);
                                        puj.b(pukVar.b, workDatabase, e, a2);
                                        puuVar4.j.d.execute(new pur(puuVar4, puk.b(pukVar.b), intExtra));
                                    } else {
                                        ppt.c().a(puk.a, "Setting up Alarms for " + e + "at " + a2);
                                        puj.b(pukVar.b, workDatabase, e, a2);
                                    }
                                    workDatabase.q();
                                }
                            } finally {
                                workDatabase.o();
                            }
                        } else if ("ACTION_DELAY_MET".equals(action2)) {
                            synchronized (pukVar.d) {
                                pxs e2 = puk.e(intent2);
                                ppt.c().a(puk.a, a.n(e2, "Handing delay met for "));
                                if (pukVar.c.containsKey(e2)) {
                                    ppt.c().a(puk.a, a.i(e2, "WorkSpec ", " is is already being handled for ACTION_DELAY_MET"));
                                } else {
                                    pup pupVar = new pup(pukVar.b, intExtra, puuVar4, pukVar.e.b(e2));
                                    pukVar.c.put(e2, pupVar);
                                    String str5 = pupVar.d.a;
                                    pupVar.j = qar.a(pupVar.b, str5 + " (" + pupVar.c + ")");
                                    ppt.c().a(pup.a, "Acquiring wakelock " + pupVar.j + "for WorkSpec " + str5);
                                    pupVar.j.acquire();
                                    pyj b2 = pupVar.e.e.e.D().b(str5);
                                    if (b2 == null) {
                                        pupVar.h.execute(new pun(pupVar));
                                    } else {
                                        boolean d3 = b2.d();
                                        pupVar.k = d3;
                                        if (d3) {
                                            pupVar.n = pvq.a(pupVar.f, b2, pupVar.m, pupVar);
                                        } else {
                                            ppt.c().a(pup.a, "No constraints for ".concat(str5));
                                            pupVar.h.execute(new puo(pupVar));
                                        }
                                    }
                                }
                            }
                        } else if ("ACTION_STOP_WORK".equals(action2)) {
                            Bundle extras2 = intent2.getExtras();
                            String string = extras2.getString("KEY_WORKSPEC_ID");
                            if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                d = new ArrayList(1);
                                psb a3 = pukVar.e.a(new pxs(string, i4));
                                if (a3 != null) {
                                    d.add(a3);
                                }
                            } else {
                                d = pukVar.e.d(string);
                            }
                            for (psb psbVar : d) {
                                ppt.c().a(puk.a, "Handing stopWork work for ".concat(String.valueOf(string)));
                                pta.a(puuVar4.k, psbVar);
                                Context context2 = pukVar.b;
                                WorkDatabase workDatabase2 = puuVar4.e.e;
                                pxs pxsVar = psbVar.a;
                                String str6 = puj.a;
                                pxm A = workDatabase2.A();
                                pxk a4 = pxl.a(A, pxsVar);
                                if (a4 != null) {
                                    puj.a(context2, pxsVar, a4.c);
                                    ppt.c().a(puj.a, "Removing SystemIdInfo for workSpecId (" + pxsVar + ")");
                                    ((pxq) A).a.m();
                                    oyf d4 = ((pxq) A).b.d();
                                    d4.g(1, pxsVar.a);
                                    d4.e(2, (long) pxsVar.b);
                                    try {
                                        ((pxq) A).a.n();
                                        try {
                                            d4.a();
                                            ((pxq) A).a.q();
                                        } finally {
                                        }
                                    } finally {
                                        ((pxq) A).b.f(d4);
                                    }
                                }
                                boolean z6 = z;
                                puuVar4.a(psbVar.a, z6);
                                z = z6;
                            }
                        } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                            pxs e3 = puk.e(intent2);
                            boolean z7 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                            ppt.c().a(puk.a, "Handling onExecutionCompleted " + intent2 + ", " + intExtra);
                            pukVar.a(e3, z7);
                        } else {
                            ppt.c();
                            String str7 = puk.a;
                            Objects.toString(intent2);
                            Log.w(str7, "Ignoring intent ".concat(String.valueOf(intent2)));
                        }
                    }
                    ppt.c();
                    Log.e(puk.a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                }
                ppt.c().a(puu.a, a.o(a, action, "Releasing operation wake lock (", ") "));
                a.release();
                puuVar = this.a;
                putVar = new put(puuVar);
            } catch (Throwable th) {
                try {
                    ppt.c();
                    Log.e(puu.a, "Unexpected error in onHandleIntent", th);
                    ppt.c().a(puu.a, a.o(a, action, "Releasing operation wake lock (", ") "));
                    a.release();
                    puuVar = this.a;
                    putVar = new put(puuVar);
                } catch (Throwable th2) {
                    ppt.c().a(puu.a, a.o(a, action, "Releasing operation wake lock (", ") "));
                    a.release();
                    puu puuVar5 = this.a;
                    puuVar5.j.d.execute(new put(puuVar5));
                    throw th2;
                }
            }
            puuVar.j.d.execute(putVar);
        }
    }
}
