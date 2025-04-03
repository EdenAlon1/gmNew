package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfc implements dqkk {
    private final elbx a;
    private final ejqy b;

    public dsfc(elbx elbxVar, ejqy ejqyVar) {
        elbxVar.getClass();
        this.a = elbxVar;
        this.b = ejqyVar;
    }

    @Override // defpackage.dqkk
    public final TextWatcher a(String str, TextWatcher textWatcher) {
        return new elbq(this.a, textWatcher, str);
    }

    @Override // defpackage.dqkk
    public final View.OnClickListener b(String str, View.OnClickListener onClickListener) {
        return new elay(this.a, str, onClickListener);
    }

    @Override // defpackage.dqkk
    public final View.OnLongClickListener c(String str, View.OnLongClickListener onLongClickListener) {
        return new elbv(this.a, str, onLongClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.dqkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dsfa
            if (r0 == 0) goto L13
            r0 = r7
            dsfa r0 = (defpackage.dsfa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsfa r0 = new dsfa
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r5 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L44
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            ekzz r5 = defpackage.eleg.f(r5)
            r0.d = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 == r1) goto L49
        L44:
            r6 = 0
            defpackage.ffig.a(r5, r6)
            return r7
        L49:
            return r1
        L4a:
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r7 = move-exception
            defpackage.ffig.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsfc.d(java.lang.String, ffji, ffgu):java.lang.Object");
    }

    @Override // defpackage.dqkk
    public final Object e(String str, ffix ffixVar) {
        ekzz f = eleg.f(str);
        try {
            Object invoke = ffixVar.invoke();
            ffig.a(f, null);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.dqkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dsfb
            if (r0 == 0) goto L13
            r0 = r7
            dsfb r0 = (defpackage.dsfb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsfb r0 = new dsfb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r6 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            elbx r7 = r4.a
            ekzm r5 = r7.b(r5)
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L47
            return r1
        L47:
            r6 = 0
            defpackage.ffig.a(r5, r6)
            return r7
        L4c:
            throw r6     // Catch: java.lang.Throwable -> L4d
        L4d:
            r7 = move-exception
            defpackage.ffig.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsfc.f(java.lang.String, ffji, ffgu):java.lang.Object");
    }

    @Override // defpackage.dqkk
    public final Object g(String str, ffix ffixVar) {
        ekzm b = this.a.b(str);
        try {
            Object invoke = ffixVar.invoke();
            ffig.a(b, null);
            return invoke;
        } finally {
        }
    }

    @Override // defpackage.dqkk
    public final ffhd h(ScheduledExecutorService scheduledExecutorService) {
        return this.b.a(scheduledExecutorService);
    }
}
