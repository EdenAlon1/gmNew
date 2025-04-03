package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkp {
    private static final enru d = enru.c("com/google/android/apps/messaging/conversation2/messagelist/LazyPagingScrollHelper");
    public final olu a;
    public final hho b = new hic(false, hla.a);
    public final ffbz c = ffca.a(new ffix() { // from class: zkn
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = wpl.a;
            return (Boolean) wpl.f.e();
        }
    });
    private final eey e;

    public zkp(eey eeyVar, olu oluVar) {
        this.e = eeyVar;
        this.a = oluVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zko
            if (r0 == 0) goto L13
            r0 = r8
            zko r0 = (defpackage.zko) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zko r0 = new zko
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            int r7 = r0.a
            zkp r0 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2c java.lang.IndexOutOfBoundsException -> L5c
            goto L75
        L2c:
            r7 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.ffci.b(r8)
            hho r8 = r6.b     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            r8.b(r2)     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            olu r8 = r6.a     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            r8.f(r7)     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            eey r8 = r6.e     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            r0.e = r6     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            r0.a = r7     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            r0.d = r4     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            java.lang.Object r7 = r8.j(r7, r3, r0)     // Catch: java.lang.Throwable -> L58 java.lang.IndexOutOfBoundsException -> L5b
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r6
            goto L75
        L58:
            r7 = move-exception
            r0 = r6
            goto L81
        L5b:
            r0 = r6
        L5c:
            enru r8 = defpackage.zkp.d     // Catch: java.lang.Throwable -> L2c
            ensk r8 = r8.j()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "com/google/android/apps/messaging/conversation2/messagelist/LazyPagingScrollHelper"
            java.lang.String r2 = "animateScrollToItem"
            java.lang.String r4 = "PagedMessageListScrollHelper.kt"
            r5 = 46
            ensk r8 = r8.h(r1, r2, r5, r4)     // Catch: java.lang.Throwable -> L2c
            enrr r8 = (defpackage.enrr) r8     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Failed to scroll to item, invalid item index: %d"
            r8.r(r1, r7)     // Catch: java.lang.Throwable -> L2c
        L75:
            hho r7 = r0.b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r7.b(r8)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L81:
            hho r8 = r0.b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r8.b(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkp.a(int, ffgu):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkp)) {
            return false;
        }
        zkp zkpVar = (zkp) obj;
        return ffkj.e(this.e, zkpVar.e) && ffkj.e(this.a, zkpVar.a);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "LazyPagingScrollHelper(messageListState=" + this.e + ", lazyMessages=" + this.a + ")";
    }
}
