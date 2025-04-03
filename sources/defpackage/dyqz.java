package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqz {
    private final ConcurrentMap a = new ConcurrentHashMap();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final ConcurrentMap d = new ConcurrentHashMap();
    private final Context e;
    private final dzhn f;
    private final emxc g;
    private final emxc h;

    public dyqz(Context context, dzhn dzhnVar, emxc emxcVar, emxc emxcVar2) {
        this.e = context;
        this.f = dzhnVar;
        this.g = emxcVar;
        this.h = emxcVar2;
    }

    public final synchronized dyqy a(long j) {
        ConcurrentMap concurrentMap = this.d;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return (dyqy) this.d.get(valueOf);
        }
        dyqy dyqyVar = new dyqy(this.e, j);
        return (dyqy) emxc.i((dyqy) this.d.putIfAbsent(valueOf, dyqyVar)).e(dyqyVar);
    }

    public final synchronized dzwo b(dzja dzjaVar) {
        long a = dzjaVar.a();
        Long valueOf = Long.valueOf(a);
        if (this.a.containsKey(valueOf)) {
            return (dzwo) this.a.get(valueOf);
        }
        Context context = this.e;
        dzhn dzhnVar = this.f;
        valueOf.getClass();
        dyqy a2 = a(a);
        valueOf.getClass();
        dyti c = c(a);
        valueOf.getClass();
        dyta dytaVar = new dyta(context, dzjaVar, dzhnVar, a2, c, a, this.h);
        return (dzwo) emxc.i((dzwo) this.a.putIfAbsent(valueOf, dytaVar)).e(dytaVar);
    }

    public final synchronized dyti c(long j) {
        ConcurrentMap concurrentMap = this.c;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return (dyti) this.c.get(valueOf);
        }
        dyti dytiVar = new dyti(a(j));
        return (dyti) emxc.i((dyti) this.c.putIfAbsent(valueOf, dytiVar)).e(dytiVar);
    }

    public final synchronized dyrb d(dzja dzjaVar) {
        long a = dzjaVar.a();
        Long valueOf = Long.valueOf(a);
        if (this.b.containsKey(valueOf)) {
            return (dyrb) this.b.get(valueOf);
        }
        Context context = this.e;
        valueOf.getClass();
        dyti c = c(a);
        valueOf.getClass();
        dyrb dyrbVar = new dyrb(context, c, a);
        return (dyrb) emxc.i((dyrb) this.b.putIfAbsent(valueOf, dyrbVar)).e(dyrbVar);
    }
}
