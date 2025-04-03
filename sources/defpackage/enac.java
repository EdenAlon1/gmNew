package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class enac implements Iterator {
    int a;
    int b = -1;
    enal c;
    AtomicReferenceArray d;
    enbg e;
    enbe f;
    enbe g;
    final /* synthetic */ enbf h;

    public enac(enbf enbfVar) {
        this.h = enbfVar;
        this.a = enbfVar.f.length - 1;
        b();
    }

    final enbe a() {
        enbe enbeVar = this.f;
        if (enbeVar == null) {
            throw new NoSuchElementException();
        }
        this.g = enbeVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            enbf enbfVar = this.h;
            this.a = i - 1;
            enal enalVar = enbfVar.f[i];
            this.c = enalVar;
            if (enalVar.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r6.f = new defpackage.enbe(r6.h, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean c(defpackage.enbg r7) {
        /*
            r6 = this;
            enbf r0 = r6.h     // Catch: java.lang.Throwable -> L3d
            emyv r0 = r0.p     // Catch: java.lang.Throwable -> L3d
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r7.j()     // Catch: java.lang.Throwable -> L3d
            enbf r3 = r6.h     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r7.j()     // Catch: java.lang.Throwable -> L3d
            r5 = 0
            if (r4 != 0) goto L16
            goto L29
        L16:
            enau r4 = r7.d()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L21
            goto L29
        L21:
            boolean r7 = r3.k(r7, r0)     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L28
            goto L29
        L28:
            r5 = r4
        L29:
            if (r5 == 0) goto L36
            enbe r7 = new enbe     // Catch: java.lang.Throwable -> L3d
            enbf r0 = r6.h     // Catch: java.lang.Throwable -> L3d
            r7.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L3d
            r6.f = r7     // Catch: java.lang.Throwable -> L3d
            r7 = 1
            goto L37
        L36:
            r7 = 0
        L37:
            enal r0 = r6.c
            r0.o()
            return r7
        L3d:
            r7 = move-exception
            enal r0 = r6.c
            r0.o()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enac.c(enbg):boolean");
    }

    final boolean d() {
        enbg enbgVar = this.e;
        if (enbgVar == null) {
            return false;
        }
        while (true) {
            this.e = enbgVar.e();
            enbg enbgVar2 = this.e;
            if (enbgVar2 == null) {
                return false;
            }
            if (c(enbgVar2)) {
                return true;
            }
            enbgVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            enbg enbgVar = (enbg) atomicReferenceArray.get(i);
            this.e = enbgVar;
            if (enbgVar != null && (c(enbgVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        emxf.l(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
