package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elem extends AtomicInteger {
    public static final elei a;
    public final elem b;
    public final String c;
    public volatile elej<?> currentMetadata;
    public final long d;
    public final elae e;
    public int f;
    public elem g;
    public boolean h;
    public volatile long i;
    int j;

    static {
        elei elelVar;
        try {
            elelVar = new elek();
        } catch (Error | RuntimeException unused) {
            elelVar = new elel();
        }
        a = elelVar;
    }

    public elem(elem elemVar, String str, long j, elae elaeVar) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = elemVar.f() ? elemVar.b : elemVar;
        this.c = str;
        this.f = -1;
        this.d = j;
        this.e = elaeVar;
    }

    final int a() {
        elem elemVar = this.b;
        if (elemVar == null) {
            return -1;
        }
        return elemVar.f;
    }

    public final ekzx b(boolean z, int i) {
        ekzu ekzuVar = (ekzu) ekzx.a.createBuilder();
        ekzuVar.copyOnWrite();
        ekzx ekzxVar = (ekzx) ekzuVar.instance;
        String str = this.c;
        str.getClass();
        ekzxVar.b |= 1;
        ekzxVar.c = str;
        int i2 = this.f;
        ekzuVar.copyOnWrite();
        ekzx ekzxVar2 = (ekzx) ekzuVar.instance;
        ekzxVar2.b |= 2;
        ekzxVar2.d = i2;
        ekzuVar.copyOnWrite();
        ekzx ekzxVar3 = (ekzx) ekzuVar.instance;
        ekzxVar3.b |= 4;
        ekzxVar3.e = i;
        int i3 = this.j;
        ekzuVar.copyOnWrite();
        ekzx ekzxVar4 = (ekzx) ekzuVar.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        ekzxVar4.l = i4;
        ekzxVar4.b |= 512;
        boolean z2 = this.h;
        ekzuVar.copyOnWrite();
        ekzx ekzxVar5 = (ekzx) ekzuVar.instance;
        ekzxVar5.b |= 1024;
        ekzxVar5.m = z2;
        long j = this.d;
        ekzuVar.copyOnWrite();
        ekzx ekzxVar6 = (ekzx) ekzuVar.instance;
        ekzxVar6.b |= 8;
        ekzxVar6.f = j / 1000000;
        long j2 = this.i;
        if (j2 != 0) {
            emxf.l(true);
            ekzuVar.copyOnWrite();
            ekzx ekzxVar7 = (ekzx) ekzuVar.instance;
            ekzxVar7.b |= 32;
            ekzxVar7.h = (4611686018427387903L & j2) / 1000000;
            emxf.l(true);
            boolean z3 = (j2 & 4611686018427387904L) != 0;
            ekzuVar.copyOnWrite();
            ekzx ekzxVar8 = (ekzx) ekzuVar.instance;
            ekzxVar8.b |= 256;
            ekzxVar8.k = z3;
        }
        if (z) {
            int i5 = get();
            ekzuVar.copyOnWrite();
            ekzx ekzxVar9 = (ekzx) ekzuVar.instance;
            ekzxVar9.b |= 128;
            ekzxVar9.j = i5;
        }
        return (ekzx) ekzuVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final elae c() {
        elej a2 = a.a(this);
        if (a2 == null) {
            return elad.a;
        }
        elac b = elae.b();
        while (a2 != null) {
            b.a(a2.a, a2.b);
            a2 = a2.c;
        }
        return ((elae) b).f();
    }

    final void d(int i, elem elemVar) {
        this.f = i;
        this.g = elemVar;
    }

    final boolean e() {
        return this.i != 0;
    }

    final boolean f() {
        return this.f < 0;
    }

    public elem(String str, elae elaeVar, int i) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = null;
        this.c = str;
        this.f = 0;
        this.d = 0L;
        this.e = elaeVar;
        this.i = i != 2 ? Long.MIN_VALUE : 0L;
    }
}
