package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwe {
    private final lwd c;
    private lwc f;
    private final ArrayDeque d = new ArrayDeque();
    private final ArrayDeque e = new ArrayDeque();
    public final PriorityQueue a = new PriorityQueue();
    public int b = -1;

    public lwe(lwd lwdVar) {
        this.c = lwdVar;
    }

    private final void d(int i) {
        while (this.a.size() > i) {
            lwc lwcVar = (lwc) this.a.poll();
            int i2 = lvf.a;
            for (int i3 = 0; i3 < lwcVar.a.size(); i3++) {
                this.c.a(lwcVar.b, (luv) lwcVar.a.get(i3));
                this.d.push((luv) lwcVar.a.get(i3));
            }
            lwcVar.a.clear();
            lwc lwcVar2 = this.f;
            if (lwcVar2 != null && lwcVar2.b == lwcVar.b) {
                this.f = null;
            }
            this.e.push(lwcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r7 < r0.b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r7, defpackage.luv r9) {
        /*
            r6 = this;
            int r0 = r6.b
            if (r0 == 0) goto La1
            r1 = -1
            if (r0 == r1) goto L23
            java.util.PriorityQueue r0 = r6.a
            int r0 = r0.size()
            int r2 = r6.b
            if (r0 < r2) goto L23
            java.util.PriorityQueue r0 = r6.a
            java.lang.Object r0 = r0.peek()
            lwc r0 = (defpackage.lwc) r0
            int r2 = defpackage.lvf.a
            long r2 = r0.b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto La1
        L23:
            java.util.ArrayDeque r0 = r6.d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            luv r0 = new luv
            r0.<init>()
            goto L39
        L31:
            java.util.ArrayDeque r0 = r6.d
            java.lang.Object r0 = r0.pop()
            luv r0 = (defpackage.luv) r0
        L39:
            int r2 = r9.b()
            r0.G(r2)
            byte[] r2 = r9.a
            int r9 = r9.b
            byte[] r3 = r0.a
            int r4 = r0.b()
            r5 = 0
            java.lang.System.arraycopy(r2, r9, r3, r5, r4)
            lwc r9 = r6.f
            if (r9 == 0) goto L5f
            long r2 = r9.b
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L59
            goto L5f
        L59:
            java.util.List r7 = r9.a
            r7.add(r0)
            return
        L5f:
            java.util.ArrayDeque r9 = r6.e
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L6d
            lwc r9 = new lwc
            r9.<init>()
            goto L75
        L6d:
            java.util.ArrayDeque r9 = r6.e
            java.lang.Object r9 = r9.pop()
            lwc r9 = (defpackage.lwc) r9
        L75:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L7f
            r5 = 1
        L7f:
            defpackage.lti.a(r5)
            java.util.List r2 = r9.a
            boolean r2 = r2.isEmpty()
            defpackage.lti.c(r2)
            r9.b = r7
            java.util.List r7 = r9.a
            r7.add(r0)
            java.util.PriorityQueue r7 = r6.a
            r7.add(r9)
            r6.f = r9
            int r7 = r6.b
            if (r7 == r1) goto La0
            r6.d(r7)
        La0:
            return
        La1:
            lwd r0 = r6.c
            r0.a(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwe.a(long, luv):void");
    }

    public final void b() {
        d(0);
    }

    public final void c(int i) {
        lti.c(i >= 0);
        this.b = i;
        d(i);
    }
}
