package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffop implements Iterator, fflg {
    final /* synthetic */ ffoq a;
    private int b = -1;
    private int c;
    private int d;
    private ffmj e;
    private int f;

    public ffop(ffoq ffoqVar) {
        this.a = ffoqVar;
        int i = ffmk.i(0, 0, ffoqVar.a.length());
        this.c = i;
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            r7 = this;
            int r0 = r7.d
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.b = r1
            r0 = 0
            r7.e = r0
            return
        Lb:
            ffoq r2 = r7.a
            int r3 = r2.b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f
            int r6 = r6 + r5
            r7.f = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r2 = r2.a
            int r2 = r2.length()
            if (r0 <= r2) goto L36
        L22:
            ffmj r0 = new ffmj
            int r1 = r7.c
            ffoq r2 = r7.a
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.ffpc.u(r2)
            r0.<init>(r1, r2)
            r7.e = r0
            r7.d = r4
            goto L7f
        L36:
            ffoq r0 = r7.a
            int r2 = r7.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            ffjm r3 = r0.c
            java.lang.CharSequence r0 = r0.a
            java.lang.Object r0 = r3.a(r0, r2)
            if (r0 != 0) goto L5c
            ffmj r0 = new ffmj
            int r1 = r7.c
            ffoq r2 = r7.a
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.ffpc.u(r2)
            r0.<init>(r1, r2)
            r7.e = r0
            r7.d = r4
            goto L7f
        L5c:
            ffcf r0 = (defpackage.ffcf) r0
            java.lang.Object r2 = r0.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.c
            ffmj r3 = defpackage.ffmk.q(r3, r2)
            r7.e = r3
            int r2 = r2 + r0
            r7.c = r2
            if (r0 != 0) goto L7c
            r1 = r5
        L7c:
            int r2 = r2 + r1
            r7.d = r2
        L7f:
            r7.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffop.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        ffmj ffmjVar = this.e;
        ffmjVar.getClass();
        this.e = null;
        this.b = -1;
        return ffmjVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
