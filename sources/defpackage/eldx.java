package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldx extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public eldx(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static ListenableFuture a(final ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final elat c = ekyf.c();
        final ListenableFuture j2 = erqt.j(listenableFuture);
        final ListenableFuture p = erqt.p(j2, j, timeUnit, scheduledExecutorService);
        return ernq.g(p, TimeoutException.class, new eroh() { // from class: eldv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                TimeoutException timeoutException = (TimeoutException) obj;
                int i = eldx.a;
                ListenableFuture listenableFuture2 = ListenableFuture.this;
                if (!listenableFuture2.isDone()) {
                    elat elatVar = c;
                    if (elatVar != null) {
                        timeoutException.setStackTrace(eldx.l(elatVar, null));
                        eldx.i(elatVar, timeoutException);
                        eldx.g(elatVar, timeoutException);
                    }
                    erqt.t(j2, listenableFuture2);
                }
                return p;
            }
        }, erpp.a);
    }

    public static RuntimeException b(Throwable th) {
        elat c = ekyf.c();
        eldx eldxVar = new eldx(th, l(c, null));
        i(c, eldxVar);
        g(c, eldxVar);
        return eldxVar;
    }

    public static RuntimeException c() {
        return new eldx(null, l(ekyf.c(), null));
    }

    public static String d(String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void e(Collection collection, StackTraceElement[] stackTraceElementArr) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).addSuppressed(new eldw(stackTraceElementArr));
        }
    }

    public static void f(enhk enhkVar) {
        emxc i;
        boolean z = ekyf.a;
        HashMap hashMap = new HashMap();
        synchronized (ekyf.c) {
            for (Map.Entry entry : ekyf.c.entrySet()) {
                elat elatVar = ((elao) entry.getValue()).c;
                if (elatVar != null) {
                    hashMap.put((Thread) entry.getKey(), elatVar);
                }
            }
        }
        enin eninVar = new enin();
        Iterator<E> it = enhkVar.keySet().iterator();
        while (it.hasNext()) {
            eninVar.c(((elat) it.next()).e());
        }
        enip g = eninVar.g();
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (elat elatVar2 : enhkVar.keySet()) {
            if (elatVar2 instanceof elen) {
                elen elenVar = (elen) elatVar2;
                if (elenVar.f() < i2) {
                    i2 = elenVar.f();
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Thread thread = (Thread) entry2.getKey();
            elat elatVar3 = (elat) entry2.getValue();
            if (thread != Thread.currentThread()) {
                if (g.contains(elatVar3.e())) {
                    elat elatVar4 = elatVar3;
                    while (elatVar4 != null && (!(elatVar4 instanceof elen) || ((elen) elatVar4).f() >= i2)) {
                        if (hashMap2.containsKey(elatVar4)) {
                            elatVar4 = (elat) hashMap2.get(elatVar4);
                            break;
                        } else if (enhkVar.containsKey(elatVar4)) {
                            break;
                        } else {
                            elatVar4 = elatVar4.a();
                        }
                    }
                    elatVar4 = null;
                    for (elat elatVar5 = elatVar3; elatVar5 != elatVar4 && !hashMap2.containsKey(elatVar5); elatVar5 = elatVar5.a()) {
                        hashMap2.put(elatVar5, elatVar4);
                    }
                    i = emxc.i(elatVar4);
                } else {
                    i = emux.a;
                }
                if (i.g()) {
                    Throwable th = (Throwable) enhkVar.get(i.c());
                    dtnh dtnhVar = new dtnh(thread);
                    dtnhVar.addSuppressed(new eldx(null, l(elatVar3, ((elat) i.c()).a())));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement("tk_trace", d(dtnhVar.getMessage()), null, 0));
                    Collections.addAll(arrayList, dtnhVar.getStackTrace());
                    arrayList.toArray(new StackTraceElement[0]);
                    th.addSuppressed(dtnhVar);
                }
            }
        }
    }

    public static void g(elat elatVar, Throwable th) {
        if (eleg.e(elatVar)) {
            f(enhk.l(elatVar, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(enhk enhkVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        enqu listIterator = enhkVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            elat elatVar = (elat) entry.getKey();
            if (elatVar instanceof elen) {
                eldq eldqVar = (eldq) hashMap.get(((elat) entry.getKey()).e());
                if (eldqVar == null) {
                    eldqVar = ((ekwu) ((elen) elatVar).g()).c;
                    hashMap.put(elatVar.e(), eldqVar);
                }
                Map map = (Map) hashMap2.get(eldqVar);
                if (map == null) {
                    map = new HashMap();
                    hashMap2.put(eldqVar, map);
                }
                map.put(Integer.valueOf(((elen) elatVar).f()), (Throwable) entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            eldq eldqVar2 = (eldq) entry2.getKey();
            int intValue = ((Integer) Collections.min(((Map) entry2.getValue()).keySet())).intValue();
            HashMap hashMap3 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = eldqVar2.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ((((ekzx) it.next()).b & 32) == 0) {
                        break;
                    }
                } else {
                    arrayList.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            }
            ekxg ekxgVar = eldqVar2.i;
            if (ekxgVar == null) {
                ekxgVar = ekxg.a;
            }
            if ((ekxgVar.b & 1) != 0) {
                Locale locale = Locale.US;
                String str = ((ekzx) eldqVar2.e.get(0)).c;
                ekxg ekxgVar2 = eldqVar2.i;
                if (ekxgVar2 == null) {
                    ekxgVar2 = ekxg.a;
                }
                ekxf ekxfVar = ekxgVar2.c;
                if (ekxfVar == null) {
                    ekxfVar = ekxf.a;
                }
                arrayList.add(new StackTraceElement("tk_trace", d(String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, Integer.valueOf(ekxfVar.c))), null, 0));
            }
            if (arrayList.isEmpty()) {
                j(eldqVar2, (Map) entry2.getValue(), intValue, hashMap3);
            } else {
                e(((Map) entry2.getValue()).values(), (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
    }

    public static void i(elat elatVar, Throwable th) {
        if (eleg.e(elatVar)) {
            h(enhk.l(elatVar, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(eldq eldqVar, Map map, int i, Map map2) {
        int i2;
        int i3 = 0;
        for (ekzx ekzxVar : enkr.f(eldqVar.e)) {
            Integer num = null;
            if (i3 >= 10) {
                e(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((ekzxVar.b & 32) == 0 && !map2.containsKey(ekzxVar)) {
                eygr eygrVar = eldqVar.e;
                Set keySet = map.keySet();
                boolean z = false;
                ekzx ekzxVar2 = ekzxVar;
                while (!z) {
                    if (map2.containsKey(ekzxVar2)) {
                        num = (Integer) map2.get(ekzxVar2);
                    } else if (keySet.contains(Integer.valueOf(ekzxVar2.d))) {
                        num = Integer.valueOf(ekzxVar2.d);
                    } else {
                        int i4 = ekzxVar2.e;
                        if (i4 >= i) {
                            ekzxVar2 = (ekzx) eygrVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                ekzx ekzxVar3 = ekzxVar;
                while (!z2) {
                    if (!map2.containsKey(ekzxVar3)) {
                        map2.put(ekzxVar3, num);
                        if ((num == null || ekzxVar3.e != num.intValue()) && (i2 = ekzxVar3.e) >= 0) {
                            ekzxVar3 = (ekzx) eygrVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                emxc i5 = emxc.i(num);
                if (i5.g()) {
                    i3++;
                    Throwable th = (Throwable) map.get(i5.c());
                    eygr eygrVar2 = eldqVar.e;
                    int intValue = ((Integer) i5.c()).intValue();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(m(ekzxVar));
                    while (ekzxVar.d != intValue) {
                        ekzxVar = (ekzx) eygrVar2.get(ekzxVar.e);
                        arrayList.add(m(ekzxVar));
                    }
                    th.addSuppressed(new eldw((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                }
            }
        }
    }

    public static void k(Throwable th) {
        ekxv.b(th);
        throw new eldx(th, l(ekyf.c(), null));
    }

    public static StackTraceElement[] l(elat elatVar, elat elatVar2) {
        ArrayList arrayList = new ArrayList();
        for (elat elatVar3 = elatVar; elatVar3 != elatVar2; elatVar3 = elatVar3.a()) {
            arrayList.add(new StackTraceElement("tk_trace", d(elatVar3.c()), null, 0));
        }
        if (elatVar instanceof ekxr) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement m(ekzx ekzxVar) {
        String str;
        if ((ekzxVar.b & 32) != 0) {
            str = " " + ekzxVar.h + " ms";
        } else {
            str = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", d(String.valueOf(ekzxVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
