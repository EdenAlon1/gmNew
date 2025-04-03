package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enaj<K, V> extends emzk<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    final enan b;
    final enan c;
    final emwj d;
    final emwj e;
    final long f;
    final long g;
    final long h;
    final int i;
    final emyv j;
    final emzi k;
    transient emyz l;
    final emze m;
    final emzd n;

    public enaj(enbf enbfVar) {
        enan enanVar = enbfVar.j;
        enan enanVar2 = enbfVar.k;
        emwj emwjVar = enbfVar.h;
        emwj emwjVar2 = enbfVar.i;
        long j = enbfVar.n;
        long j2 = enbfVar.m;
        long j3 = enbfVar.l;
        emze emzeVar = enbfVar.v;
        int i = enbfVar.g;
        emzd emzdVar = enbfVar.w;
        emyv emyvVar = enbfVar.p;
        emzi emziVar = enbfVar.r;
        this.b = enanVar;
        this.c = enanVar2;
        this.d = emwjVar;
        this.e = emwjVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.m = emzeVar;
        this.i = i;
        this.n = emzdVar;
        this.j = (emyvVar == emyv.b || emyvVar == emzf.b) ? null : emyvVar;
        this.k = emziVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.l = e().a();
    }

    private Object readResolve() {
        return this.l;
    }

    final emzf e() {
        emzf emzfVar = new emzf();
        enan enanVar = emzfVar.g;
        emxf.p(enanVar == null, "Key strength was already set to %s", enanVar);
        enan enanVar2 = this.b;
        enanVar2.getClass();
        emzfVar.g = enanVar2;
        enan enanVar3 = emzfVar.h;
        emxf.p(enanVar3 == null, "Value strength was already set to %s", enanVar3);
        enan enanVar4 = this.c;
        enanVar4.getClass();
        emzfVar.h = enanVar4;
        emwj emwjVar = emzfVar.k;
        emxf.p(emwjVar == null, "key equivalence was already set to %s", emwjVar);
        emwj emwjVar2 = this.d;
        emwjVar2.getClass();
        emzfVar.k = emwjVar2;
        emwj emwjVar3 = emzfVar.l;
        emxf.p(emwjVar3 == null, "value equivalence was already set to %s", emwjVar3);
        emwj emwjVar4 = this.e;
        emwjVar4.getClass();
        emzfVar.l = emwjVar4;
        int i = emzfVar.d;
        emxf.n(i == -1, "concurrency level was already set to %s", i);
        int i2 = this.i;
        emxf.a(i2 > 0);
        emzfVar.d = i2;
        emxf.l(emzfVar.p == null);
        emzd emzdVar = this.n;
        emzdVar.getClass();
        emzfVar.p = emzdVar;
        emzfVar.c = false;
        long j = this.f;
        if (j > 0) {
            emzfVar.e(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.g;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = emzfVar.j;
            emxf.o(j3 == -1, "expireAfterAccess was already set to %s ns", j3);
            emxf.u(true, j2, timeUnit);
            emzfVar.j = timeUnit.toNanos(j2);
        }
        emze emzeVar = this.m;
        if (emzeVar != emze.a) {
            emxf.l(emzfVar.o == null);
            if (emzfVar.c) {
                long j4 = emzfVar.e;
                emxf.o(j4 == -1, "weigher can not be combined with maximum size (%s provided)", j4);
            }
            emzeVar.getClass();
            emzfVar.o = emzeVar;
            long j5 = this.h;
            if (j5 != -1) {
                long j6 = emzfVar.f;
                emxf.o(j6 == -1, "maximum weight was already set to %s", j6);
                long j7 = emzfVar.e;
                emxf.o(j7 == -1, "maximum size was already set to %s", j7);
                emxf.b(j5 >= 0, "maximum weight must not be negative");
                emzfVar.f = j5;
            }
        } else {
            long j8 = this.h;
            if (j8 != -1) {
                emzfVar.f(j8);
            }
        }
        emyv emyvVar = this.j;
        if (emyvVar != null) {
            emxf.l(emzfVar.m == null);
            emzfVar.m = emyvVar;
        }
        return emzfVar;
    }

    @Override // defpackage.emzk, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.l;
    }
}
