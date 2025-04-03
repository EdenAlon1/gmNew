package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawl implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ LoadMessagesReceiver b;

    public dawl(ffxy ffxyVar, LoadMessagesReceiver loadMessagesReceiver) {
        this.b = loadMessagesReceiver;
        this.a = ffxyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r8.fQ(r9, r0) != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dawk
            if (r0 == 0) goto L13
            r0 = r9
            dawk r0 = (defpackage.dawk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dawk r0 = new dawk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.ffci.b(r9)
            goto L77
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.d
            defpackage.ffci.b(r9)
            goto L6b
        L38:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r2 = ","
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r8 = defpackage.ffpc.V(r8, r2, r4, r4)
            int r2 = r8.size()
            if (r2 != r4) goto L7b
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r2 = r7.b
            r5 = 0
            java.lang.Object r5 = r8.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            r0.d = r9
            r0.b = r3
            java.lang.Object r8 = r2.j(r5, r8, r0)
            if (r8 == r1) goto L7a
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r2 = 0
            r0.d = r2
            r0.b = r4
            java.lang.Object r8 = r8.fQ(r9, r0)
            if (r8 != r1) goto L77
            goto L7a
        L77:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L7a:
            return r1
        L7b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawl.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
