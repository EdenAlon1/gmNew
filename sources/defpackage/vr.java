package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vr {
    public vs k = null;
    private final ArrayList a = new ArrayList();
    public long h = 120;
    public long i = 120;
    public long j = 250;

    public static int l(wr wrVar) {
        int i = wrVar.j;
        int i2 = i & 14;
        if (wrVar.t()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i3 = wrVar.d;
            int fq = wrVar.fq();
            if (i3 != -1 && fq != -1 && i3 != fq) {
                return i2 | 2048;
            }
        }
        return i2;
    }

    public abstract void b(wr wrVar);

    public abstract void c();

    public abstract void d();

    public boolean h(wr wrVar, List list) {
        return v(wrVar);
    }

    public abstract boolean i();

    public long m() {
        return this.j;
    }

    public vq n(wo woVar, wr wrVar) {
        vq vqVar = new vq();
        vqVar.a(wrVar);
        return vqVar;
    }

    public vq o(wo woVar, wr wrVar, int i, List list) {
        vq vqVar = new vq();
        vqVar.a(wrVar);
        return vqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.wr r9) {
        /*
            r8 = this;
            vs r0 = r8.k
            if (r0 == 0) goto L99
            r1 = 1
            r9.n(r1)
            wr r2 = r9.h
            r3 = 0
            if (r2 == 0) goto L13
            wr r2 = r9.i
            if (r2 != 0) goto L13
            r9.h = r3
        L13:
            r9.i = r3
            int r2 = r9.j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L99
        L1d:
            android.view.View r2 = r9.a
            android.support.v7.widget.RecyclerView r3 = r0.a
            r3.av()
            si r4 = r3.h
            int r5 = r4.c
            r6 = 0
            if (r5 != r1) goto L39
            android.view.View r1 = r4.d
            if (r1 != r2) goto L31
        L2f:
            r1 = r6
            goto L68
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r9.<init>(r0)
            throw r9
        L39:
            r7 = 2
            if (r5 == r7) goto L91
            r4.c = r7     // Catch: java.lang.Throwable -> L8d
            vi r5 = r4.e     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.b(r2)     // Catch: java.lang.Throwable -> L8d
            r7 = -1
            if (r5 != r7) goto L4d
            r4.l(r2)     // Catch: java.lang.Throwable -> L8d
            r4.c = r6
            goto L68
        L4d:
            sh r7 = r4.a     // Catch: java.lang.Throwable -> L8d
            boolean r7 = r7.f(r5)     // Catch: java.lang.Throwable -> L8d
            if (r7 == 0) goto L65
            sh r7 = r4.a     // Catch: java.lang.Throwable -> L8d
            r7.g(r5)     // Catch: java.lang.Throwable -> L8d
            r4.l(r2)     // Catch: java.lang.Throwable -> L8d
            vi r7 = r4.e     // Catch: java.lang.Throwable -> L8d
            r7.e(r5)     // Catch: java.lang.Throwable -> L8d
            r4.c = r6
            goto L68
        L65:
            r4.c = r6
            goto L2f
        L68:
            if (r1 == 0) goto L78
            wr r2 = android.support.v7.widget.RecyclerView.l(r2)
            wf r4 = r3.e
            r4.o(r2)
            wf r4 = r3.e
            r4.m(r2)
        L78:
            r2 = r1 ^ 1
            r3.aw(r2)
            if (r1 != 0) goto L99
            boolean r1 = r9.x()
            if (r1 == 0) goto L99
            android.support.v7.widget.RecyclerView r0 = r0.a
            android.view.View r9 = r9.a
            r0.removeDetachedView(r9, r6)
            return
        L8d:
            r9 = move-exception
            r4.c = r6
            throw r9
        L91:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r9.<init>(r0)
            throw r9
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.p(wr):void");
    }

    public final void q() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((vp) this.a.get(i)).a();
        }
        this.a.clear();
    }

    public abstract boolean r(wr wrVar, vq vqVar, vq vqVar2);

    public abstract boolean s(wr wrVar, wr wrVar2, vq vqVar, vq vqVar2);

    public abstract boolean t(wr wrVar, vq vqVar, vq vqVar2);

    public abstract boolean u(wr wrVar, vq vqVar, vq vqVar2);

    public boolean v(wr wrVar) {
        throw null;
    }

    public final void w() {
        this.h = 217L;
    }

    public final void x() {
        this.i = 217L;
    }
}
