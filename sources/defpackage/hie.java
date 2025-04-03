package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hie implements hhh {
    public final hhc a = new hhc();
    private final hhh b;

    public hie(hhh hhhVar) {
        this.b = hhhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.hhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.hid
            if (r0 == 0) goto L13
            r0 = r8
            hid r0 = (defpackage.hid) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hid r0 = new hid
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            hie r2 = r0.e
            defpackage.ffci.b(r8)
            goto L78
        L3a:
            defpackage.ffci.b(r8)
            hhc r8 = r6.a
            r0.e = r6
            r0.a = r7
            r0.d = r4
            boolean r2 = r8.a()
            if (r2 == 0) goto L4e
            ffcu r8 = defpackage.ffcu.a
            goto L75
        L4e:
            ffrh r2 = new ffrh
            ffgu r5 = defpackage.ffhi.c(r0)
            r2.<init>(r5, r4)
            r2.B()
            java.lang.Object r4 = r8.a
            monitor-enter(r4)
            java.util.List r5 = r8.b     // Catch: java.lang.Throwable -> L8a
            r5.add(r2)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r4)
            hhb r4 = new hhb
            r4.<init>(r8, r2)
            r2.d(r4)
            java.lang.Object r8 = r2.m()
            ffhh r2 = defpackage.ffhh.a
            if (r8 == r2) goto L75
            ffcu r8 = defpackage.ffcu.a
        L75:
            if (r8 == r1) goto L89
            r2 = r6
        L78:
            hhh r8 = r2.b
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L88
            goto L89
        L88:
            return r7
        L89:
            return r1
        L8a:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hie.a(ffji, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public final /* synthetic */ ffhb getKey() {
        return hhh.e;
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }
}
