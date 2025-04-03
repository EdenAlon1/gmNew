package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpc {
    static final /* synthetic */ aqpc a = new aqpc();

    private aqpc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009a -> B:11:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aqge r7, int r8, defpackage.aqpd r9, defpackage.ffgu r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.aqoz
            if (r0 == 0) goto L13
            r0 = r10
            aqoz r0 = (defpackage.aqoz) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            aqoz r0 = new aqoz
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.e
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.d
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            int r5 = r0.h
            defpackage.ffci.b(r10)
            goto L9b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r9 = r0.a
            int r8 = r0.h
            defpackage.ffci.b(r10)
            goto L5a
        L44:
            defpackage.ffci.b(r10)
            elfl r7 = r7.b()
            r7.getClass()
            r0.h = r8
            r0.a = r9
            r0.g = r4
            java.lang.Object r10 = defpackage.fgfz.c(r7, r0)
            if (r10 == r1) goto Lcc
        L5a:
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r10, r2)
            r7.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
            r5 = r8
            r2 = r9
            r8 = r10
        L71:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La2
            java.lang.Object r9 = r8.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r9
            aqge r9 = r9.E(r5)
            elfl r9 = r9.b()
            r9.getClass()
            r0.h = r5
            r0.a = r2
            r0.b = r7
            r0.c = r8
            r0.d = r7
            r0.g = r3
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)
            if (r10 == r1) goto Lcc
            r9 = r7
        L9b:
            aqpf r10 = (defpackage.aqpf) r10
            r7.add(r10)
            r7 = r9
            goto L71
        La2:
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto Lad
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto Lad
            goto Lc7
        Lad:
            java.util.Iterator r7 = r7.iterator()
        Lb1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc7
            java.lang.Object r8 = r7.next()
            aqpf r8 = (defpackage.aqpf) r8
            r8.getClass()
            boolean r8 = r2.a(r8)
            if (r8 != 0) goto Lb1
            r4 = 0
        Lc7:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqpc.a(aqge, int, aqpd, ffgu):java.lang.Object");
    }
}
