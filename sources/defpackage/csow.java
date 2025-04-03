package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csow {
    public static final entd a = entd.c("BugleConnectivity");
    public final errl b;
    public final ffbr c;
    public final ffbr d;
    public final Context e;
    public final csmn f;
    public final IntentFilter g;
    public final Map h = new cmh();
    public final Map i = new cmh();
    public final Object j = new Object();
    private final ffbr k;

    public csow(Context context, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.e = context;
        this.b = errlVar2;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.k = ffbrVar3;
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f = new csmn(errlVar, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r8 >= ((defpackage.ctwb) r7.d.b()).f()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.csoe a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.j
            monitor-enter(r0)
            java.util.Map r1 = r7.h     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L83
            csof r1 = (defpackage.csof) r1     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L60
            ffbr r1 = r7.k     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L83
            atqv r1 = (defpackage.atqv) r1     // Catch: java.lang.Throwable -> L83
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L22
            if (r8 < 0) goto L41
            goto L30
        L22:
            ffbr r1 = r7.d     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L83
            ctwb r1 = (defpackage.ctwb) r1     // Catch: java.lang.Throwable -> L83
            int r1 = r1.f()     // Catch: java.lang.Throwable -> L83
            if (r8 < r1) goto L41
        L30:
            java.util.Map r1 = r7.h     // Catch: java.lang.Throwable -> L83
            csot r3 = new csot     // Catch: java.lang.Throwable -> L83
            r3.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = j$.util.Map.EL.computeIfAbsent(r1, r2, r3)     // Catch: java.lang.Throwable -> L83
            csof r1 = (defpackage.csof) r1     // Catch: java.lang.Throwable -> L83
            r1.b()     // Catch: java.lang.Throwable -> L83
            goto L60
        L41:
            entd r1 = defpackage.csow.a     // Catch: java.lang.Throwable -> L83
            ensk r1 = r1.j()     // Catch: java.lang.Throwable -> L83
            ensz r1 = (defpackage.ensz) r1     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager"
            java.lang.String r3 = "getNetworkState"
            java.lang.String r4 = "NetworkStateMonitorManager.java"
            r5 = 209(0xd1, float:2.93E-43)
            ensk r1 = r1.h(r2, r3, r5, r4)     // Catch: java.lang.Throwable -> L83
            ensz r1 = (defpackage.ensz) r1     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "getNetworkState: NetworkStateMonitor can't be registered for invalid subId %d."
            r1.r(r2, r8)     // Catch: java.lang.Throwable -> L83
            csoe r8 = defpackage.csoe.UNKNOWN     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return r8
        L60:
            entd r2 = defpackage.csow.a     // Catch: java.lang.Throwable -> L83
            ensk r2 = r2.n()     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager"
            java.lang.String r4 = "getNetworkState"
            java.lang.String r5 = "NetworkStateMonitorManager.java"
            r6 = 216(0xd8, float:3.03E-43)
            ensk r2 = r2.h(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> L83
            ensz r2 = (defpackage.ensz) r2     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "getNetworkState for subId %d: %s."
            csoe r4 = r1.a()     // Catch: java.lang.Throwable -> L83
            r2.w(r3, r8, r4)     // Catch: java.lang.Throwable -> L83
            csoe r8 = r1.a()     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return r8
        L83:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csow.a(int):csoe");
    }

    public final void b(csmx csmxVar, int i) {
        Integer valueOf = Integer.valueOf(i);
        Map.EL.putIfAbsent(this.i, valueOf, new ArrayList());
        List list = (List) this.i.get(valueOf);
        if (list == null || list.contains(csmxVar)) {
            return;
        }
        list.add(csmxVar);
    }

    public final void c(int i) {
        ((csof) Map.EL.computeIfAbsent(this.h, Integer.valueOf(i), new Function() { // from class: csoq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csow csowVar = csow.this;
                return ((csog) csowVar.c.b()).a(new csov(csowVar), ((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).b();
    }

    public final boolean d() {
        synchronized (this.j) {
            java.util.Map map = this.i;
            if (!map.isEmpty()) {
                enqu listIterator = enip.o(map.keySet()).listIterator();
                while (listIterator.hasNext()) {
                    if (!e(((Integer) listIterator.next()).intValue())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final boolean e(int i) {
        List list = (List) this.i.get(Integer.valueOf(i));
        return list == null || list.isEmpty();
    }
}
