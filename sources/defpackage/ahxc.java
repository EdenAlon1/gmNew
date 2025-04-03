package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahxd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxc(ahxd ahxdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahxdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r4 = (defpackage.xhu) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r0 = r3.b;
        r0.e.c(new defpackage.ahxb(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r4 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r4 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        r4 = (defpackage.ycu) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        r0 = r3.b;
        r0.e.c(new defpackage.ahxa(r4));
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2f
            goto L5a
        Ld:
            ahxd r4 = r3.b
            ffbr r4 = r4.f
            java.lang.Object r4 = r4.b()
            atdn r4 = (defpackage.atdn) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L46
            ahxd r4 = r3.b
            ffbr r4 = r4.d
            java.lang.Object r4 = r4.b()
            ycv r4 = (defpackage.ycv) r4
            r3.a = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 == r0) goto L59
        L2f:
            ycu r4 = (defpackage.ycu) r4
            if (r4 == 0) goto L36
            xhu r4 = r4.a
            goto L37
        L36:
            r4 = 0
        L37:
            if (r4 == 0) goto L6a
            ahxd r0 = r3.b
            ahxa r1 = new ahxa
            r1.<init>()
            ydb r4 = r0.e
            r4.c(r1)
            goto L6a
        L46:
            ahxd r4 = r3.b
            ffbr r4 = r4.c
            java.lang.Object r4 = r4.b()
            ycs r4 = (defpackage.ycs) r4
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L5a
        L59:
            return r0
        L5a:
            xhu r4 = (defpackage.xhu) r4
            if (r4 == 0) goto L6a
            ahxd r0 = r3.b
            ahxb r1 = new ahxb
            r1.<init>()
            ydb r4 = r0.e
            r4.c(r1)
        L6a:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahxc(this.b, ffguVar);
    }
}
