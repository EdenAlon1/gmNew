package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coo<E> extends cpe<E> implements Set<E>, ffll {
    public final col a;

    public coo(col colVar) {
        super(colVar);
        this.a = colVar;
    }

    @Override // defpackage.cpe, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.cpe, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        col colVar = this.a;
        int i = colVar.g;
        for (Object obj : collection) {
            int a = colVar.a(obj);
            colVar.b[a] = obj;
            long[] jArr = colVar.c;
            int i2 = colVar.d;
            jArr[a] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((2147483647L & a) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            colVar.d = a;
            if (colVar.e == Integer.MAX_VALUE) {
                colVar.e = a;
            }
        }
        return i != colVar.g;
    }

    @Override // defpackage.cpe, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.b();
    }

    @Override // defpackage.cpe, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new con(this);
    }

    @Override // defpackage.cpe, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.e(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (((((~r10) << 6) & r10) & r14) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        r12 = -1;
     */
    @Override // defpackage.cpe, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r21.getClass()
            r0 = r20
            col r1 = r0.a
            int r2 = r1.g
            java.util.Iterator r3 = r21.iterator()
        Ld:
            boolean r4 = r3.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La0
            java.lang.Object r4 = r3.next()
            if (r4 == 0) goto L20
            int r7 = r4.hashCode()
            goto L21
        L20:
            r7 = r6
        L21:
            int r8 = r1.f
            r9 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r9
            int r9 = r7 << 16
            r7 = r7 ^ r9
            int r9 = r7 >>> 7
            r9 = r9 & r8
        L2d:
            r10 = r7 & 127(0x7f, float:1.78E-43)
            long[] r11 = r1.a
            r12 = r9 & 7
            int r13 = r9 >> 3
            r14 = r11[r13]
            int r12 = r12 << 3
            long r14 = r14 >>> r12
            int r13 = r13 + r5
            r16 = r11[r13]
            int r11 = 64 - r12
            long r16 = r16 << r11
            long r11 = (long) r12
            long r11 = -r11
            r21 = r5
            r13 = r6
            long r5 = (long) r10
            r10 = 63
            long r10 = r11 >> r10
            long r10 = r16 & r10
            long r10 = r10 | r14
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r14
            long r5 = r5 ^ r10
            r14 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r14 = r14 + r5
            long r5 = ~r5
            long r5 = r5 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r14
        L63:
            r16 = 0
            int r12 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r12 == 0) goto L85
            int r12 = java.lang.Long.numberOfTrailingZeros(r5)
            int r12 = r12 >> 3
            int r12 = r12 + r9
            r12 = r12 & r8
            r18 = r14
            java.lang.Object[] r14 = r1.b
            r14 = r14[r12]
            boolean r14 = defpackage.ffkj.e(r14, r4)
            if (r14 == 0) goto L7e
            goto L92
        L7e:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            r14 = r18
            goto L63
        L85:
            r18 = r14
            long r5 = ~r10
            r12 = 6
            long r5 = r5 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L99
            r12 = -1
        L92:
            if (r12 < 0) goto Ld
            r1.c(r12)
            goto Ld
        L99:
            int r6 = r13 + 8
            int r9 = r9 + r6
            r9 = r9 & r8
            r5 = r21
            goto L2d
        La0:
            r21 = r5
            int r1 = r1.g
            if (r2 == r1) goto La7
            return r21
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coo.removeAll(java.util.Collection):boolean");
    }

    @Override // defpackage.cpe, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.a.f(collection);
    }
}
