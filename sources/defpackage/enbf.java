package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enbf extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final Logger a = Logger.getLogger(enbf.class.getName());
    static final enau b = new emzm();
    static final Queue c = new emzn();
    public static final /* synthetic */ int x = 0;
    final int d;
    final int e;
    final enal[] f;
    final int g;
    final emwj h;
    final emwj i;
    final enan j;
    final enan k;
    final long l;
    final long m;
    final long n;
    final Queue o;
    final emyv p;
    final emzz q;
    final emzi r;
    Set s;
    Collection t;
    Set u;
    final emze v;
    final emzd w;

    /* JADX WARN: Type inference failed for: r1v0, types: [enbf, java.util.AbstractMap] */
    public enbf(emzf emzfVar, emzi emziVar) {
        ?? abstractMap = new AbstractMap();
        int i = emzfVar.d;
        abstractMap.g = Math.min(i == -1 ? 4 : i, 65536);
        enan c2 = emzfVar.c();
        abstractMap.j = c2;
        abstractMap.k = emzfVar.d();
        abstractMap.h = (emwj) emxa.c(emzfVar.k, emzfVar.c().a());
        abstractMap.i = (emwj) emxa.c(emzfVar.l, emzfVar.d().a());
        long j = (emzfVar.i == 0 || emzfVar.j == 0) ? 0L : emzfVar.o == null ? emzfVar.e : emzfVar.f;
        abstractMap.l = j;
        abstractMap.v = (emze) emxa.c(emzfVar.o, emze.a);
        long j2 = emzfVar.j;
        abstractMap.m = j2 == -1 ? 0L : j2;
        long j3 = emzfVar.i;
        abstractMap.n = j3 != -1 ? j3 : 0L;
        emzd emzdVar = (emzd) emxa.c(emzfVar.p, emzd.a);
        abstractMap.w = emzdVar;
        abstractMap.o = emzdVar == emzd.a ? c : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.l() || abstractMap.i();
        emyv emyvVar = emzfVar.m;
        abstractMap.p = emyvVar == null ? z ? emyv.b : emzf.b : emyvVar;
        char c3 = (abstractMap.m() || abstractMap.i()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.j() || abstractMap.l();
        emzz emzzVar = emzz.a;
        abstractMap.q = emzz.i[(c2 != enan.WEAK ? (char) 0 : (char) 4) | c3 | (true != z2 ? 0 : 2)];
        abstractMap.r = emziVar;
        int min = Math.min(16, 1073741824);
        if (abstractMap.h() && !abstractMap.g()) {
            min = (int) Math.min(min, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.h() || i5 * 20 <= abstractMap.l)) {
            i4++;
            i5 += i5;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new enal[i5];
        int i6 = min / i5;
        while (i3 < (i6 * i5 < min ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (abstractMap.h()) {
            long j4 = i5;
            long j5 = abstractMap.l;
            long j6 = (j5 / j4) + 1;
            long j7 = j5 % j4;
            while (true) {
                enal[] enalVarArr = abstractMap.f;
                if (i2 >= enalVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                enalVarArr[i2] = new enal(abstractMap, i3, j8, (emza) ((emyr) emzfVar.n).a);
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            enbf enbfVar = abstractMap;
            while (true) {
                enal[] enalVarArr2 = enbfVar.f;
                if (i2 >= enalVarArr2.length) {
                    return;
                }
                enalVarArr2[i2] = new enal(enbfVar, i7, -1L, (emza) ((emyr) emzfVar.n).a);
                i2++;
                enbfVar = this;
            }
        }
    }

    static void c(enbg enbgVar, enbg enbgVar2) {
        enbgVar.l(enbgVar2);
        enbgVar2.n(enbgVar);
    }

    static void d(enbg enbgVar, enbg enbgVar2) {
        enbgVar.m(enbgVar2);
        enbgVar2.o(enbgVar);
    }

    static void e(enbg enbgVar) {
        enak enakVar = enak.a;
        enbgVar.l(enakVar);
        enbgVar.n(enakVar);
    }

    static void f(enbg enbgVar) {
        enak enakVar = enak.a;
        enbgVar.m(enakVar);
        enbgVar.o(enakVar);
    }

    final int a(Object obj) {
        int c2 = this.h.c(obj);
        int i = c2 + ((c2 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final enal b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        enal[] enalVarArr = this.f;
        int length = enalVarArr.length;
        for (int i = 0; i < length; i++) {
            enal enalVar = enalVarArr[i];
            if (enalVar.b != 0) {
                enalVar.lock();
                try {
                    enalVar.s(enalVar.a.p.a());
                    AtomicReferenceArray atomicReferenceArray = enalVar.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (enbg enbgVar = (enbg) atomicReferenceArray.get(i2); enbgVar != null; enbgVar = enbgVar.e()) {
                            if (enbgVar.d().f()) {
                                Object j = enbgVar.j();
                                Object obj = enbgVar.d().get();
                                int i3 = 3;
                                if (j != null && obj != null) {
                                    i3 = 1;
                                }
                                enbgVar.a();
                                enalVar.x(j, obj, enbgVar.d().a(), i3);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (enalVar.a.n()) {
                        while (enalVar.h.poll() != null) {
                        }
                    }
                    if (enalVar.a.o()) {
                        while (enalVar.i.poll() != null) {
                        }
                    }
                    enalVar.l.clear();
                    enalVar.m.clear();
                    enalVar.k.set(0);
                    enalVar.d++;
                    enalVar.b = 0;
                } finally {
                    enalVar.unlock();
                    enalVar.t();
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        enal b2 = b(a2);
        try {
            if (b2.b == 0) {
                return false;
            }
            enbg c2 = b2.c(obj, a2, b2.a.p.a());
            if (c2 == null) {
                return false;
            }
            return c2.d().get() != null;
        } finally {
            b2.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            emyv r3 = r0.p
            enal[] r4 = r0.f
            long r5 = r3.a()
            r7 = -1
            r3 = r2
        L13:
            r9 = 3
            if (r3 >= r9) goto L6e
            int r9 = r4.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L5f
            r13 = r4[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L52
            java.lang.Object r2 = r14.get(r15)
            enbg r2 = (defpackage.enbg) r2
        L31:
            r17 = r3
            if (r2 == 0) goto L4f
            java.lang.Object r3 = r13.g(r2, r5)
            r18 = r2
            if (r3 == 0) goto L48
            emwj r2 = r0.i
            boolean r2 = r2.d(r1, r3)
            if (r2 != 0) goto L46
            goto L48
        L46:
            r1 = 1
            return r1
        L48:
            enbg r2 = r18.e()
            r3 = r17
            goto L31
        L4f:
            int r15 = r15 + 1
            goto L25
        L52:
            r17 = r3
            int r2 = r13.d
            long r2 = (long) r2
            long r10 = r10 + r2
            int r12 = r12 + 1
            r2 = r16
            r3 = r17
            goto L1a
        L5f:
            r16 = r2
            r17 = r3
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L68
            goto L70
        L68:
            int r3 = r17 + 1
            r7 = r10
            r2 = r16
            goto L13
        L6e:
            r16 = r2
        L70:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enbf.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.u;
        if (set != null) {
            return set;
        }
        enab enabVar = new enab(this);
        this.u = enabVar;
        return enabVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.v != emze.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return b(a2).f(obj, a2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    final boolean h() {
        return this.l >= 0;
    }

    final boolean i() {
        return this.m > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        enal[] enalVarArr = this.f;
        long j = 0;
        for (enal enalVar : enalVarArr) {
            if (enalVar.b != 0) {
                return false;
            }
            j += r8.d;
        }
        if (j == 0) {
            return true;
        }
        for (enal enalVar2 : enalVarArr) {
            if (enalVar2.b != 0) {
                return false;
            }
            j -= r9.d;
        }
        return j == 0;
    }

    final boolean j() {
        return this.n > 0;
    }

    final boolean k(enbg enbgVar, long j) {
        enbgVar.getClass();
        if (!i() || j - enbgVar.b() < this.m) {
            return j() && j - enbgVar.c() >= this.n;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.s;
        if (set != null) {
            return set;
        }
        enae enaeVar = new enae(this);
        this.s = enaeVar;
        return enaeVar;
    }

    final boolean l() {
        return j();
    }

    final boolean m() {
        return i() || h();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return this.j != enan.STRONG;
    }

    final boolean o() {
        return this.k != enan.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        return b(a2).h(obj, a2, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        return b(a2).h(obj, a2, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7 = r4.d();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r2.d++;
        r12 = r2.y(r3, r4, r5, r6, r7, r8);
        r0 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r0;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r7.f() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        r8 = 3;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r11.a(r12)
            enal r2 = r11.b(r1)
            r2.lock()
            enbf r3 = r2.a     // Catch: java.lang.Throwable -> L7a
            emyv r3 = r3.p     // Catch: java.lang.Throwable -> L7a
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L7a
            r2.s(r3)     // Catch: java.lang.Throwable -> L7a
            int r3 = r2.b     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L7a
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L7a
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L7a
            enbg r3 = (defpackage.enbg) r3     // Catch: java.lang.Throwable -> L7a
            r4 = r3
        L2d:
            if (r4 == 0) goto L73
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L7a
            int r6 = r4.a()     // Catch: java.lang.Throwable -> L7a
            if (r6 != r1) goto L6e
            if (r5 == 0) goto L6e
            enbf r6 = r2.a     // Catch: java.lang.Throwable -> L7a
            emwj r6 = r6.h     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r6.d(r12, r5)     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L6e
            enau r7 = r4.d()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L7a
            r12 = 1
            if (r6 == 0) goto L52
            r8 = r12
            goto L5a
        L52:
            boolean r1 = r7.f()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L73
            r0 = 3
            r8 = r0
        L5a:
            int r0 = r2.d     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + r12
            r2.d = r0     // Catch: java.lang.Throwable -> L7a
            enbg r12 = r2.y(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7a
            int r0 = r2.b     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L7a
            r2.b = r0     // Catch: java.lang.Throwable -> L7a
            r0 = r6
            goto L73
        L6e:
            enbg r4 = r4.e()     // Catch: java.lang.Throwable -> L7a
            goto L2d
        L73:
            r2.unlock()
            r2.t()
            return r0
        L7a:
            r0 = move-exception
            r12 = r0
            r2.unlock()
            r2.t()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enbf.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        enal b2 = b(a2);
        b2.lock();
        try {
            long a3 = b2.a.p.a();
            b2.s(a3);
            AtomicReferenceArray atomicReferenceArray = b2.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            enbg enbgVar = (enbg) atomicReferenceArray.get(length);
            long j = a3;
            enbg enbgVar2 = enbgVar;
            while (true) {
                obj3 = null;
                if (enbgVar2 == null) {
                    break;
                }
                enbg enbgVar3 = enbgVar;
                Object j2 = enbgVar2.j();
                if (enbgVar2.a() == a2 && j2 != null && b2.a.h.d(obj, j2)) {
                    long j3 = j;
                    enau d = enbgVar2.d();
                    Object obj4 = d.get();
                    if (obj4 != null) {
                        b2.d++;
                        b2.x(obj, obj4, d.a(), 2);
                        b2.z(enbgVar2, obj2, j3);
                        b2.l(enbgVar2);
                        obj3 = obj4;
                    } else if (d.f()) {
                        int i = b2.b;
                        b2.d++;
                        enbg y = b2.y(enbgVar3, enbgVar2, j2, null, d, 3);
                        int i2 = b2.b - 1;
                        atomicReferenceArray.set(length, y);
                        b2.b = i2;
                    }
                } else {
                    long j4 = j;
                    enbgVar2 = enbgVar2.e();
                    enbgVar = enbgVar3;
                    j = j4;
                }
            }
            return obj3;
        } finally {
            b2.unlock();
            b2.t();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.f.length; i++) {
            j += Math.max(0, r0[i].b);
        }
        return ermn.g(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.t;
        if (collection != null) {
            return collection;
        }
        enav enavVar = new enav(this);
        this.t = enavVar;
        return enavVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r4.d();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r2.a.i.d(r13, r12) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r6 = r12;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r2.d++;
        r12 = r2.y(r3, r4, r5, r6, r7, r8);
        r13 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r8 != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r12 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r7.f() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = 3;
        r6 = null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L94
            if (r13 != 0) goto L7
            goto L94
        L7:
            int r1 = r11.a(r12)
            enal r2 = r11.b(r1)
            r2.lock()
            enbf r3 = r2.a     // Catch: java.lang.Throwable -> L8b
            emyv r3 = r3.p     // Catch: java.lang.Throwable -> L8b
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L8b
            r2.s(r3)     // Catch: java.lang.Throwable -> L8b
            int r3 = r2.b     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L8b
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L8b
            enbg r3 = (defpackage.enbg) r3     // Catch: java.lang.Throwable -> L8b
            r4 = r3
        L30:
            if (r4 == 0) goto L7f
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L8b
            int r6 = r4.a()     // Catch: java.lang.Throwable -> L8b
            if (r6 != r1) goto L86
            if (r5 == 0) goto L86
            enbf r6 = r2.a     // Catch: java.lang.Throwable -> L8b
            emwj r6 = r6.h     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r6.d(r12, r5)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L86
            enau r7 = r4.d()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L8b
            enbf r1 = r2.a     // Catch: java.lang.Throwable -> L8b
            emwj r1 = r1.i     // Catch: java.lang.Throwable -> L8b
            boolean r13 = r1.d(r13, r12)     // Catch: java.lang.Throwable -> L8b
            r1 = 1
            if (r13 == 0) goto L5e
            r6 = r12
            r8 = r1
            goto L6a
        L5e:
            if (r12 != 0) goto L7f
            boolean r12 = r7.f()     // Catch: java.lang.Throwable -> L8b
            if (r12 == 0) goto L7f
            r12 = 3
            r13 = 0
            r8 = r12
            r6 = r13
        L6a:
            int r12 = r2.d     // Catch: java.lang.Throwable -> L8b
            int r12 = r12 + r1
            r2.d = r12     // Catch: java.lang.Throwable -> L8b
            enbg r12 = r2.y(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8b
            int r13 = r2.b     // Catch: java.lang.Throwable -> L8b
            int r13 = r13 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L8b
            r2.b = r13     // Catch: java.lang.Throwable -> L8b
            if (r8 != r1) goto L7f
            r0 = r1
        L7f:
            r2.unlock()
            r2.t()
            return r0
        L86:
            enbg r4 = r4.e()     // Catch: java.lang.Throwable -> L8b
            goto L30
        L8b:
            r0 = move-exception
            r12 = r0
            r2.unlock()
            r2.t()
            throw r12
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enbf.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        enal b2 = b(a2);
        b2.lock();
        try {
            long a3 = b2.a.p.a();
            b2.s(a3);
            AtomicReferenceArray atomicReferenceArray = b2.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            enbg enbgVar = (enbg) atomicReferenceArray.get(length);
            long j = a3;
            enbg enbgVar2 = enbgVar;
            while (true) {
                if (enbgVar2 == null) {
                    break;
                }
                enbg enbgVar3 = enbgVar;
                Object j2 = enbgVar2.j();
                if (enbgVar2.a() == a2 && j2 != null && b2.a.h.d(obj, j2)) {
                    long j3 = j;
                    enau d = enbgVar2.d();
                    Object obj4 = d.get();
                    if (obj4 == null) {
                        if (d.f()) {
                            int i = b2.b;
                            b2.d++;
                            enbg y = b2.y(enbgVar3, enbgVar2, j2, null, d, 3);
                            int i2 = b2.b - 1;
                            atomicReferenceArray.set(length, y);
                            b2.b = i2;
                        }
                    } else if (b2.a.i.d(obj2, obj4)) {
                        b2.d++;
                        b2.x(obj, obj4, d.a(), 2);
                        b2.z(enbgVar2, obj3, j3);
                        b2.l(enbgVar2);
                        z = true;
                    } else {
                        b2.p(enbgVar2, j3);
                    }
                } else {
                    enbgVar = enbgVar3;
                    long j4 = j;
                    enbgVar2 = enbgVar2.e();
                    j = j4;
                }
            }
            return z;
        } finally {
            b2.unlock();
            b2.t();
        }
    }
}
