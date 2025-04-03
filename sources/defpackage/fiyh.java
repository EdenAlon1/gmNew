package defpackage;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyh implements Cloneable {
    private static final fizg[] c = new fizg[0];
    private static final fizd[] d = new fizd[0];
    public fixp a;
    public List[] b;
    private int e;

    public fiyh(fixp fixpVar) {
        this.b = new List[4];
        this.a = fixpVar;
    }

    public final int a() {
        int d2 = this.a.d();
        fiyw b = b();
        return b != null ? d2 + (b.f() << 4) : d2;
    }

    public final fiyw b() {
        for (fizg fizgVar : f(3)) {
            if (fizgVar instanceof fiyw) {
                return (fiyw) fizgVar;
            }
        }
        return null;
    }

    public final fizg c() {
        List list = this.b[0];
        if (list == null || list.size() == 0) {
            return null;
        }
        return (fizg) list.get(0);
    }

    public final Object clone() {
        fiyh fiyhVar = new fiyh();
        int i = 0;
        while (true) {
            List[] listArr = this.b;
            int length = listArr.length;
            if (i >= 4) {
                fiyhVar.a = (fixp) this.a.clone();
                fiyhVar.e = this.e;
                return fiyhVar;
            }
            List list = listArr[i];
            if (list != null) {
                fiyhVar.b[i] = new LinkedList(list);
            }
            i++;
        }
    }

    public final void d(fizg fizgVar, int i) {
        List[] listArr = this.b;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        int[] iArr = this.a.b;
        int i2 = iArr[i];
        if (i2 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i] = i2 + 1;
        this.b[i].add(fizgVar);
    }

    public final fizd[] e(int i) {
        if (this.b[i] == null) {
            return d;
        }
        LinkedList linkedList = new LinkedList();
        fizg[] f = f(i);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < f.length; i2++) {
            fiyt fiytVar = f[i2].f;
            if (hashSet.contains(fiytVar)) {
                int size = linkedList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    fizd fizdVar = (fizd) linkedList.get(size);
                    if (fizdVar.c() == f[i2].g() && fizdVar.d() == f[i2].h && fizdVar.g().equals(fiytVar)) {
                        fizdVar.i(f[i2]);
                        break;
                    }
                }
            }
            linkedList.add(new fizd(f[i2]));
            hashSet.add(fiytVar);
        }
        return (fizd[]) linkedList.toArray(new fizd[linkedList.size()]);
    }

    public final fizg[] f(int i) {
        List list = this.b[i];
        return list == null ? c : (fizg[]) list.toArray(new fizg[list.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
    
        r1.a(r2);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        if (r9 == r20.a.a) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        r1.e(r9, r18 + 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
    
        if (r12 == r20.a.a(3)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        r1.e(r12, r18 + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        r20.e = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012e, code lost:
    
        return r1.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] g() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiyh.g():byte[]");
    }

    public final String toString() {
        String stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (b() != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(this.a.e(a()));
            stringBuffer3.append("\n");
            stringBuffer2.append(stringBuffer3.toString());
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(this.a);
            stringBuffer4.append("\n");
            stringBuffer2.append(stringBuffer4.toString());
        }
        for (int i = 0; i < 4; i++) {
            if (this.a.c() != 5) {
                StringBuffer stringBuffer5 = new StringBuffer(";; ");
                fizr.a.a(i);
                stringBuffer5.append(fizr.b[i]);
                stringBuffer5.append(":\n");
                stringBuffer2.append(stringBuffer5.toString());
            } else {
                StringBuffer stringBuffer6 = new StringBuffer(";; ");
                fizr.a.a(i);
                stringBuffer6.append(fizr.c[i]);
                stringBuffer6.append(":\n");
                stringBuffer2.append(stringBuffer6.toString());
            }
            StringBuffer stringBuffer7 = new StringBuffer();
            if (i > 3) {
                stringBuffer = null;
            } else {
                StringBuffer stringBuffer8 = new StringBuffer();
                for (fizg fizgVar : f(i)) {
                    if (i == 0) {
                        StringBuffer stringBuffer9 = new StringBuffer(";;\t");
                        stringBuffer9.append(fizgVar.f);
                        stringBuffer8.append(stringBuffer9.toString());
                        StringBuffer stringBuffer10 = new StringBuffer(", type = ");
                        stringBuffer10.append(fjaf.a(fizgVar.g));
                        stringBuffer8.append(stringBuffer10.toString());
                        StringBuffer stringBuffer11 = new StringBuffer(", class = ");
                        stringBuffer11.append(fiwx.a(fizgVar.h));
                        stringBuffer8.append(stringBuffer11.toString());
                    } else {
                        stringBuffer8.append(fizgVar);
                    }
                    stringBuffer8.append("\n");
                }
                stringBuffer = stringBuffer8.toString();
            }
            stringBuffer7.append(stringBuffer);
            stringBuffer7.append("\n");
            stringBuffer2.append(stringBuffer7.toString());
        }
        StringBuffer stringBuffer12 = new StringBuffer(";; Message size: ");
        stringBuffer12.append(this.e);
        stringBuffer12.append(" bytes");
        stringBuffer2.append(stringBuffer12.toString());
        return stringBuffer2.toString();
    }

    public fiyh() {
        this(new fixp());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fiyh(byte[] r14) {
        /*
            r13 = this;
            fixb r1 = new fixb
            r1.<init>(r14)
            fixp r14 = new fixp
            r14.<init>(r1)
            r13.<init>(r14)
            fixp r14 = r13.a
            int r14 = r14.c()
            fixp r0 = r13.a
            r2 = 6
            boolean r2 = r0.g(r2)
            r0 = 0
            r3 = r0
        L1c:
            r4 = 4
            if (r3 >= r4) goto Lb9
            fixp r4 = r13.a     // Catch: defpackage.fjan -> Lb3
            int r4 = r4.a(r3)     // Catch: defpackage.fjan -> Lb3
            if (r4 <= 0) goto L30
            java.util.List[] r5 = r13.b     // Catch: defpackage.fjan -> Lb3
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: defpackage.fjan -> Lb3
            r6.<init>(r4)     // Catch: defpackage.fjan -> Lb3
            r5[r3] = r6     // Catch: defpackage.fjan -> Lb3
        L30:
            r5 = r0
        L31:
            if (r5 >= r4) goto Laf
            r1.a()     // Catch: defpackage.fjan -> Lb3
            int r6 = defpackage.fizg.j     // Catch: defpackage.fjan -> Lb3
            fiyt r7 = new fiyt     // Catch: defpackage.fjan -> Lb3
            r7.<init>(r1)     // Catch: defpackage.fjan -> Lb3
            int r8 = r1.b()     // Catch: defpackage.fjan -> Lb3
            int r9 = r1.b()     // Catch: defpackage.fjan -> Lb3
            if (r3 != 0) goto L4e
            fizg r6 = defpackage.fizg.l(r7, r8, r9)     // Catch: defpackage.fjan -> Lb3
            r7 = r6
        L4c:
            r6 = r3
            goto L8a
        L4e:
            long r10 = r1.e()     // Catch: defpackage.fjan -> Lb3
            int r6 = r1.b()     // Catch: defpackage.fjan -> Lb3
            if (r6 != 0) goto L69
            r6 = 5
            if (r14 != r6) goto L68
            r6 = 1
            if (r3 == r6) goto L62
            r6 = 2
            if (r3 != r6) goto L68
            goto L63
        L62:
            r6 = r3
        L63:
            fizg r7 = defpackage.fizg.m(r7, r8, r9, r10)     // Catch: defpackage.fjan -> Lb3
            goto L8a
        L68:
            r6 = r0
        L69:
            r12 = 1
            fizg r7 = defpackage.fizg.k(r7, r8, r9, r10, r12)     // Catch: defpackage.fjan -> Lb3
            int r8 = r1.d()     // Catch: defpackage.fjan -> Lb3
            if (r8 < r6) goto La7
            r1.g(r6)     // Catch: defpackage.fjan -> Lb3
            r7.c(r1)     // Catch: defpackage.fjan -> Lb3
            int r6 = r1.d()     // Catch: defpackage.fjan -> Lb3
            if (r6 > 0) goto L9f
            java.nio.ByteBuffer r6 = r1.a     // Catch: defpackage.fjan -> Lb3
            int r8 = r6.capacity()     // Catch: defpackage.fjan -> Lb3
            r6.limit(r8)     // Catch: defpackage.fjan -> Lb3
            goto L4c
        L8a:
            java.util.List[] r8 = r13.b     // Catch: defpackage.fjan -> Lb3
            r8 = r8[r6]     // Catch: defpackage.fjan -> Lb3
            r8.add(r7)     // Catch: defpackage.fjan -> Lb3
            r8 = 3
            if (r6 != r8) goto L9c
            int r6 = r7.g     // Catch: defpackage.fjan -> Lb3
            r8 = 24
            if (r6 != r8) goto L9c
            fizl r7 = (defpackage.fizl) r7     // Catch: defpackage.fjan -> Lb3
        L9c:
            int r5 = r5 + 1
            goto L31
        L9f:
            fjan r14 = new fjan     // Catch: defpackage.fjan -> Lb3
            java.lang.String r0 = "invalid record length"
            r14.<init>(r0)     // Catch: defpackage.fjan -> Lb3
            throw r14     // Catch: defpackage.fjan -> Lb3
        La7:
            fjan r14 = new fjan     // Catch: defpackage.fjan -> Lb3
            java.lang.String r0 = "truncated record"
            r14.<init>(r0)     // Catch: defpackage.fjan -> Lb3
            throw r14     // Catch: defpackage.fjan -> Lb3
        Laf:
            int r3 = r3 + 1
            goto L1c
        Lb3:
            r0 = move-exception
            r14 = r0
            if (r2 == 0) goto Lb8
            goto Lb9
        Lb8:
            throw r14
        Lb9:
            int r14 = r1.a()
            r13.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiyh.<init>(byte[]):void");
    }
}
