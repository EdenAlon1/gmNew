package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmu extends AbstractMap implements Serializable {
    public static final Comparator a = new evmn();
    evmt b;
    int c;
    int d;
    final evmt e;
    private final Comparator f;
    private final boolean g;
    private evmp h;
    private evmr i;

    public evmu() {
        this(a, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(defpackage.evmt r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            evmt r0 = r9.b
            evmt r1 = r9.c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            evmt r0 = r1.b
            evmt r3 = r1.c
            if (r3 == 0) goto L22
            int r3 = r3.i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            evmt r1 = r0.b
            evmt r3 = r0.c
            if (r3 == 0) goto L4e
            int r3 = r3.i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            evmt r9 = r9.a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evmu.f(evmt, boolean):void");
    }

    private final void g(evmt evmtVar, evmt evmtVar2) {
        evmt evmtVar3 = evmtVar.a;
        evmtVar.a = null;
        if (evmtVar2 != null) {
            evmtVar2.a = evmtVar3;
        }
        if (evmtVar3 == null) {
            this.b = evmtVar2;
        } else if (evmtVar3.b == evmtVar) {
            evmtVar3.b = evmtVar2;
        } else {
            evmtVar3.c = evmtVar2;
        }
    }

    private final void h(evmt evmtVar) {
        evmt evmtVar2 = evmtVar.b;
        evmt evmtVar3 = evmtVar.c;
        evmt evmtVar4 = evmtVar3.b;
        evmt evmtVar5 = evmtVar3.c;
        evmtVar.c = evmtVar4;
        if (evmtVar4 != null) {
            evmtVar4.a = evmtVar;
        }
        g(evmtVar, evmtVar3);
        evmtVar3.b = evmtVar;
        evmtVar.a = evmtVar3;
        int max = Math.max(evmtVar2 != null ? evmtVar2.i : 0, evmtVar4 != null ? evmtVar4.i : 0) + 1;
        evmtVar.i = max;
        evmtVar3.i = Math.max(max, evmtVar5 != null ? evmtVar5.i : 0) + 1;
    }

    private final void i(evmt evmtVar) {
        evmt evmtVar2 = evmtVar.b;
        evmt evmtVar3 = evmtVar.c;
        evmt evmtVar4 = evmtVar2.b;
        evmt evmtVar5 = evmtVar2.c;
        evmtVar.b = evmtVar5;
        if (evmtVar5 != null) {
            evmtVar5.a = evmtVar;
        }
        g(evmtVar, evmtVar2);
        evmtVar2.c = evmtVar;
        evmtVar.a = evmtVar2;
        int max = Math.max(evmtVar3 != null ? evmtVar3.i : 0, evmtVar5 != null ? evmtVar5.i : 0) + 1;
        evmtVar.i = max;
        evmtVar2.i = Math.max(max, evmtVar4 != null ? evmtVar4.i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final evmt a(Object obj, boolean z) {
        int i;
        evmt evmtVar;
        Comparator comparator = this.f;
        evmt evmtVar2 = this.b;
        if (evmtVar2 != null) {
            Comparable comparable = comparator == a ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(evmtVar2.f) : comparator.compare(obj, evmtVar2.f);
                if (i == 0) {
                    return evmtVar2;
                }
                evmt evmtVar3 = i < 0 ? evmtVar2.b : evmtVar2.c;
                if (evmtVar3 == null) {
                    break;
                }
                evmtVar2 = evmtVar3;
            }
        } else {
            i = 0;
        }
        int i2 = i;
        if (!z) {
            return null;
        }
        evmt evmtVar4 = this.e;
        if (evmtVar2 != null) {
            evmt evmtVar5 = evmtVar2;
            evmtVar = new evmt(this.g, evmtVar5, obj, evmtVar4, evmtVar4.e);
            if (i2 < 0) {
                evmtVar5.b = evmtVar;
            } else {
                evmtVar5.c = evmtVar;
            }
            f(evmtVar5, true);
        } else {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            evmtVar = new evmt(this.g, null, obj, evmtVar4, evmtVar4.e);
            this.b = evmtVar;
        }
        this.c++;
        this.d++;
        return evmtVar;
    }

    final evmt b(Map.Entry entry) {
        evmt c = c(entry.getKey());
        if (c == null || !Objects.equals(c.h, entry.getValue())) {
            return null;
        }
        return c;
    }

    final evmt c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        evmt evmtVar = this.e;
        evmtVar.e = evmtVar;
        evmtVar.d = evmtVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    final evmt d(Object obj) {
        evmt c = c(obj);
        if (c != null) {
            e(c, true);
        }
        return c;
    }

    final void e(evmt evmtVar, boolean z) {
        evmt evmtVar2;
        evmt evmtVar3;
        int i;
        if (z) {
            evmt evmtVar4 = evmtVar.e;
            evmtVar4.d = evmtVar.d;
            evmtVar.d.e = evmtVar4;
        }
        evmt evmtVar5 = evmtVar.b;
        evmt evmtVar6 = evmtVar.c;
        evmt evmtVar7 = evmtVar.a;
        int i2 = 0;
        if (evmtVar5 == null || evmtVar6 == null) {
            if (evmtVar5 != null) {
                g(evmtVar, evmtVar5);
                evmtVar.b = null;
            } else if (evmtVar6 != null) {
                g(evmtVar, evmtVar6);
                evmtVar.c = null;
            } else {
                g(evmtVar, null);
            }
            f(evmtVar7, false);
            this.c--;
            this.d++;
            return;
        }
        if (evmtVar5.i > evmtVar6.i) {
            do {
                evmtVar3 = evmtVar5;
                evmtVar5 = evmtVar5.c;
            } while (evmtVar5 != null);
        } else {
            do {
                evmtVar2 = evmtVar6;
                evmtVar6 = evmtVar6.b;
            } while (evmtVar6 != null);
            evmtVar3 = evmtVar2;
        }
        e(evmtVar3, false);
        evmt evmtVar8 = evmtVar.b;
        if (evmtVar8 != null) {
            i = evmtVar8.i;
            evmtVar3.b = evmtVar8;
            evmtVar8.a = evmtVar3;
            evmtVar.b = null;
        } else {
            i = 0;
        }
        evmt evmtVar9 = evmtVar.c;
        if (evmtVar9 != null) {
            i2 = evmtVar9.i;
            evmtVar3.c = evmtVar9;
            evmtVar9.a = evmtVar3;
            evmtVar.c = null;
        }
        evmtVar3.i = Math.max(i, i2) + 1;
        g(evmtVar, evmtVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        evmp evmpVar = this.h;
        if (evmpVar != null) {
            return evmpVar;
        }
        evmp evmpVar2 = new evmp(this);
        this.h = evmpVar2;
        return evmpVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        evmt c = c(obj);
        if (c != null) {
            return c.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        evmr evmrVar = this.i;
        if (evmrVar != null) {
            return evmrVar;
        }
        evmr evmrVar2 = new evmr(this);
        this.i = evmrVar2;
        return evmrVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        evmt a2 = a(obj, true);
        Object obj3 = a2.h;
        a2.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        evmt d = d(obj);
        if (d != null) {
            return d.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public evmu(Comparator comparator, boolean z) {
        this.c = 0;
        this.d = 0;
        this.f = comparator;
        this.g = z;
        this.e = new evmt(z);
    }
}
