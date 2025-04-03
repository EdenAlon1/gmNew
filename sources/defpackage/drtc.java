package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtc implements drsz {
    public final fdxk a;
    private final ffbz b;

    public drtc(fdxk fdxkVar) {
        fdxkVar.getClass();
        this.a = fdxkVar;
        this.b = ffca.a(new ffix() { // from class: drta
            @Override // defpackage.ffix
            public final Object invoke() {
                return new edfo(drtc.this.a, fdxj.a);
            }
        });
    }

    private static final Exception b(Exception exc, Status status) {
        int ordinal = status.getCode().ordinal();
        return ordinal != 3 ? ordinal != 7 ? ordinal != 12 ? ordinal != 16 ? exc : new drrr(exc.getMessage()) : new drrs(exc.getMessage()) : new drrq(exc.getMessage()) : new drrp(exc.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.drsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffjm r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.drtb
            if (r0 == 0) goto L13
            r0 = r6
            drtb r0 = (defpackage.drtb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            drtb r0 = new drtb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            drtc r5 = r0.d
            defpackage.ffci.b(r6)     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            return r6
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbz r6 = r4.b     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            java.lang.Object r6 = r6.a()     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            edfo r6 = (defpackage.edfo) r6     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            r0.d = r4     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            r0.c = r3     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: defpackage.fedn -> L48 io.grpc.StatusException -> L53
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        L48:
            r5 = move-exception
            io.grpc.Status r6 = r5.a
            r6.getClass()
            java.lang.Exception r5 = b(r5, r6)
            throw r5
        L53:
            r5 = move-exception
            io.grpc.Status r6 = r5.a
            r6.getClass()
            java.lang.Exception r5 = b(r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drtc.a(ffjm, ffgu):java.lang.Object");
    }
}
