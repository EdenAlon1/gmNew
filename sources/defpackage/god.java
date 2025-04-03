package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class god {
    private final fgjb a = new fgjf();
    private final hho b = new hic(null, hla.a);

    private final void e(goa goaVar) {
        this.b.b(goaVar);
    }

    public final goa a() {
        return (goa) this.b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:26:0x0061, B:28:0x008a), top: B:25:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gob r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.goc
            if (r0 == 0) goto L13
            r0 = r9
            goc r0 = (defpackage.goc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            goc r0 = new goc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            goc r8 = r0.e
            fgjf r8 = r0.g
            gob r1 = r0.f
            god r0 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L33
            goto L93
        L33:
            r9 = move-exception
            goto La1
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            fgjf r8 = r0.g
            gob r2 = r0.f
            god r6 = r0.d
            defpackage.ffci.b(r9)
            r9 = r8
            r8 = r2
            goto L61
        L4a:
            defpackage.ffci.b(r9)
            fgjb r9 = r7.a
            r0.d = r7
            r0.f = r8
            r2 = r9
            fgjf r2 = (defpackage.fgjf) r2
            r0.g = r2
            r0.c = r4
            java.lang.Object r2 = r9.a(r5, r0)
            if (r2 == r1) goto La9
            r6 = r7
        L61:
            r0.d = r6     // Catch: java.lang.Throwable -> L9c
            r0.f = r8     // Catch: java.lang.Throwable -> L9c
            r2 = r9
            fgjf r2 = (defpackage.fgjf) r2     // Catch: java.lang.Throwable -> L9c
            r0.g = r2     // Catch: java.lang.Throwable -> L9c
            r0.e = r0     // Catch: java.lang.Throwable -> L9c
            r0.c = r3     // Catch: java.lang.Throwable -> L9c
            ffrh r2 = new ffrh     // Catch: java.lang.Throwable -> L9c
            ffgu r3 = defpackage.ffhi.c(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.B()     // Catch: java.lang.Throwable -> L9c
            goa r3 = new goa     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r8, r2)     // Catch: java.lang.Throwable -> L9c
            r6.e(r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = r2.m()     // Catch: java.lang.Throwable -> L9c
            ffhh r2 = defpackage.ffhh.a     // Catch: java.lang.Throwable -> L9c
            if (r8 != r2) goto L8d
            r0.getClass()     // Catch: java.lang.Throwable -> L9c
        L8d:
            if (r8 == r1) goto La9
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        L93:
            r0.e(r5)     // Catch: java.lang.Throwable -> L9a
            r8.b(r5)
            return r9
        L9a:
            r9 = move-exception
            goto La5
        L9c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        La1:
            r0.e(r5)     // Catch: java.lang.Throwable -> L9a
            throw r9     // Catch: java.lang.Throwable -> L9a
        La5:
            r8.b(r5)
            throw r9
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.god.b(gob, ffgu):java.lang.Object");
    }

    public final Object c(String str, String str2, boolean z, int i, ffgu ffguVar) {
        return b(new gob(str, str2, z, i), ffguVar);
    }
}
