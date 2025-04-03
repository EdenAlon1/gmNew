package defpackage;

import j$.util.concurrent.ConcurrentMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enme extends AbstractMap implements ConcurrentMap, Serializable, j$.util.concurrent.ConcurrentMap {
    static final enmb a = new enkt();
    public static final /* synthetic */ int k = 0;
    private static final long serialVersionUID = 5;
    final transient int b;
    final transient int c;
    final transient enlf[] d;
    final int e;
    final emwj f;
    final transient enlc g;
    transient Set h;
    transient Collection i;
    transient Set j;

    public enme(enks enksVar, enlc enlcVar) {
        this.e = Math.min(enksVar.a(), 65536);
        this.f = (emwj) emxa.c(enksVar.f, enksVar.c().a());
        this.g = enlcVar;
        int min = Math.min(enksVar.b(), 1073741824);
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.e) {
            i4++;
            i3 += i3;
        }
        this.c = 32 - i4;
        this.b = i3 - 1;
        this.d = new enlf[i3];
        int i5 = min / i3;
        while (i < (i3 * i5 < min ? i5 + 1 : i5)) {
            i += i;
        }
        while (true) {
            enlf[] enlfVarArr = this.d;
            if (i2 >= enlfVarArr.length) {
                return;
            }
            enlfVarArr[i2] = this.g.c(this, i);
            i2++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    final int a(Object obj) {
        int c = this.f.c(obj);
        int i = c + ((c << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final emwj b() {
        return this.g.e().a();
    }

    final enlf c(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        enlf[] enlfVarArr = this.d;
        int length = enlfVarArr.length;
        for (int i = 0; i < length; i++) {
            enlf enlfVar = enlfVarArr[i];
            if (enlfVar.b != 0) {
                enlfVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = enlfVar.e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    enlfVar.g();
                    enlfVar.f.set(0);
                    enlfVar.c++;
                    enlfVar.b = 0;
                } finally {
                    enlfVar.unlock();
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
        enlb b;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        enlf c = c(a2);
        try {
            if (c.b != 0 && (b = c.b(obj, a2)) != null) {
                if (b.d() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            c.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object d;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        enlf[] enlfVarArr = this.d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = enlfVarArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                enlf enlfVar = enlfVarArr[r10];
                int i2 = enlfVar.b;
                ?? r12 = enlfVar.e;
                for (?? r13 = z; r13 < r12.length(); r13++) {
                    enlb enlbVar = (enlb) r12.get(r13);
                    while (enlbVar != null) {
                        if (enlbVar.c() == null) {
                            enlfVar.l();
                        } else {
                            d = enlbVar.d();
                            if (d == null) {
                                enlfVar.l();
                            }
                            boolean z2 = z;
                            if (d == null && b().d(obj, d)) {
                                return true;
                            }
                            enlbVar = enlbVar.b();
                            z = z2;
                        }
                        d = null;
                        boolean z22 = z;
                        if (d == null) {
                        }
                        enlbVar = enlbVar.b();
                        z = z22;
                    }
                }
                j2 += enlfVar.c;
                z = z;
            }
            boolean z3 = z;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        enkz enkzVar = new enkz(this);
        this.j = enkzVar;
        return enkzVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        enlf c = c(a2);
        try {
            enlb b = c.b(obj, a2);
            if (b != null && (obj2 = b.d()) == null) {
                c.l();
            }
            return obj2;
        } finally {
            c.i();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        int i = 0;
        long j = 0;
        while (true) {
            enlf[] enlfVarArr = this.d;
            if (i >= enlfVarArr.length) {
                if (j == 0) {
                    return true;
                }
                for (int i2 = 0; i2 < enlfVarArr.length; i2++) {
                    if (enlfVarArr[i2].b != 0) {
                        return false;
                    }
                    j -= enlfVarArr[i2].c;
                }
                return j == 0;
            }
            if (enlfVarArr[i].b != 0) {
                return false;
            }
            j += enlfVarArr[i].c;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        enle enleVar = new enle(this);
        this.h = enleVar;
        return enleVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        return c(a2).d(obj, a2, obj2, false);
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
        return c(a2).d(obj, a2, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r10 = r6.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r2.c++;
        r0 = r2.c(r5, r6);
        r1 = r2.b - 1;
        r3.set(r4, r0);
        r2.b = r1;
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (defpackage.enlf.m(r6) != false) goto L19;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            enlf r2 = r9.c(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L68
            int r3 = r2.b     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L68
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L68
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            enlb r5 = (defpackage.enlb) r5     // Catch: java.lang.Throwable -> L68
            r6 = r5
        L24:
            if (r6 == 0) goto L64
            java.lang.Object r7 = r6.c()     // Catch: java.lang.Throwable -> L68
            int r8 = r6.a()     // Catch: java.lang.Throwable -> L68
            if (r8 != r1) goto L5f
            if (r7 == 0) goto L5f
            enme r8 = r2.a     // Catch: java.lang.Throwable -> L68
            emwj r8 = r8.f     // Catch: java.lang.Throwable -> L68
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L5f
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L43
            goto L4a
        L43:
            boolean r1 = defpackage.enlf.m(r6)     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L4a
            goto L64
        L4a:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + 1
            r2.c = r0     // Catch: java.lang.Throwable -> L68
            enlb r0 = r2.c(r5, r6)     // Catch: java.lang.Throwable -> L68
            int r1 = r2.b     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L68
            r2.b = r1     // Catch: java.lang.Throwable -> L68
            r0 = r10
            goto L64
        L5f:
            enlb r6 = r6.b()     // Catch: java.lang.Throwable -> L68
            goto L24
        L64:
            r2.unlock()
            return r0
        L68:
            r10 = move-exception
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enme.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        enlf c = c(a2);
        c.lock();
        try {
            c.j();
            AtomicReferenceArray atomicReferenceArray = c.e;
            int length = (atomicReferenceArray.length() - 1) & a2;
            enlb enlbVar = (enlb) atomicReferenceArray.get(length);
            enlb enlbVar2 = enlbVar;
            while (true) {
                obj3 = null;
                if (enlbVar2 == null) {
                    break;
                }
                Object c2 = enlbVar2.c();
                if (enlbVar2.a() == a2 && c2 != null && c.a.f.d(obj, c2)) {
                    Object d = enlbVar2.d();
                    if (d != null) {
                        c.c++;
                        c.k(enlbVar2, obj2);
                        obj3 = d;
                    } else if (enlf.m(enlbVar2)) {
                        int i = c.b;
                        c.c++;
                        enlb c3 = c.c(enlbVar, enlbVar2);
                        int i2 = c.b - 1;
                        atomicReferenceArray.set(length, c3);
                        c.b = i2;
                    }
                } else {
                    enlbVar2 = enlbVar2.b();
                }
            }
            return obj3;
        } finally {
            c.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = 0;
        long j = 0;
        while (true) {
            if (i >= this.d.length) {
                return ermn.g(j);
            }
            j += r3[i].b;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        enlr enlrVar = new enlr(this);
        this.i = enlrVar;
        return enlrVar;
    }

    Object writeReplace() {
        enlc enlcVar = this.g;
        enlh d = enlcVar.d();
        enlh e = enlcVar.e();
        enlcVar.e().a();
        return new enlg(d, e, this.f, this.e, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r2.a.b().d(r11, r6.d()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r2.c++;
        r10 = r2.c(r5, r6);
        r11 = r2.b - 1;
        r3.set(r4, r10);
        r2.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (defpackage.enlf.m(r6) == false) goto L22;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L79
            if (r11 != 0) goto L7
            goto L79
        L7:
            int r1 = r9.a(r10)
            enlf r2 = r9.c(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L74
            int r3 = r2.b     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L74
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L74
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L74
            enlb r5 = (defpackage.enlb) r5     // Catch: java.lang.Throwable -> L74
            r6 = r5
        L27:
            if (r6 == 0) goto L70
            java.lang.Object r7 = r6.c()     // Catch: java.lang.Throwable -> L74
            int r8 = r6.a()     // Catch: java.lang.Throwable -> L74
            if (r8 != r1) goto L6b
            if (r7 == 0) goto L6b
            enme r8 = r2.a     // Catch: java.lang.Throwable -> L74
            emwj r8 = r8.f     // Catch: java.lang.Throwable -> L74
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L6b
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L74
            enme r1 = r2.a     // Catch: java.lang.Throwable -> L74
            emwj r1 = r1.b()     // Catch: java.lang.Throwable -> L74
            boolean r10 = r1.d(r11, r10)     // Catch: java.lang.Throwable -> L74
            r11 = 1
            if (r10 == 0) goto L52
            r0 = r11
            goto L58
        L52:
            boolean r10 = defpackage.enlf.m(r6)     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L70
        L58:
            int r10 = r2.c     // Catch: java.lang.Throwable -> L74
            int r10 = r10 + r11
            r2.c = r10     // Catch: java.lang.Throwable -> L74
            enlb r10 = r2.c(r5, r6)     // Catch: java.lang.Throwable -> L74
            int r11 = r2.b     // Catch: java.lang.Throwable -> L74
            int r11 = r11 + (-1)
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L74
            r2.b = r11     // Catch: java.lang.Throwable -> L74
            goto L70
        L6b:
            enlb r6 = r6.b()     // Catch: java.lang.Throwable -> L74
            goto L27
        L70:
            r2.unlock()
            return r0
        L74:
            r10 = move-exception
            r2.unlock()
            throw r10
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enme.remove(java.lang.Object, java.lang.Object):boolean");
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
        enlf c = c(a2);
        c.lock();
        try {
            c.j();
            AtomicReferenceArray atomicReferenceArray = c.e;
            int length = (atomicReferenceArray.length() - 1) & a2;
            enlb enlbVar = (enlb) atomicReferenceArray.get(length);
            enlb enlbVar2 = enlbVar;
            while (true) {
                if (enlbVar2 == null) {
                    break;
                }
                Object c2 = enlbVar2.c();
                if (enlbVar2.a() == a2 && c2 != null && c.a.f.d(obj, c2)) {
                    Object d = enlbVar2.d();
                    if (d == null) {
                        if (enlf.m(enlbVar2)) {
                            int i = c.b;
                            c.c++;
                            enlb c3 = c.c(enlbVar, enlbVar2);
                            int i2 = c.b - 1;
                            atomicReferenceArray.set(length, c3);
                            c.b = i2;
                        }
                    } else if (c.a.b().d(obj2, d)) {
                        c.c++;
                        c.k(enlbVar2, obj3);
                        z = true;
                    }
                } else {
                    enlbVar2 = enlbVar2.b();
                }
            }
            return z;
        } finally {
            c.unlock();
        }
    }
}
