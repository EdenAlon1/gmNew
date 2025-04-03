package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbu implements ffsk {
    public final View a;
    public final jvw b;
    public final ffsk c;
    public final AtomicReference d = new AtomicReference(null);

    public jbu(View view, jvw jvwVar, ffsk ffskVar) {
        this.a = view;
        this.b = jvwVar;
        this.c = ffskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jfg r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jbp
            if (r0 == 0) goto L13
            r0 = r7
            jbp r0 = (defpackage.jbp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jbp r0 = new jbp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.ffci.b(r7)
            goto L48
        L2f:
            defpackage.ffci.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.d
            jbr r2 = new jbr
            r2.<init>(r6, r5)
            jbt r6 = new jbt
            r4 = 0
            r6.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.hvq.b(r7, r2, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            ffbx r6 = new ffbx
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbu.a(jfg, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffsk
    public final ffhd hT() {
        return this.c.hT();
    }
}
