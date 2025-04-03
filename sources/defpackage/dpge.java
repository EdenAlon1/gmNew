package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpge extends okl {
    private final dpft a;
    private final int b;
    private final int c = 20;

    public dpge(dpft dpftVar) {
        this.a = dpftVar;
    }

    @Override // defpackage.okl
    public final /* bridge */ /* synthetic */ Object b(okm okmVar) {
        Integer num;
        Integer num2;
        Integer num3 = okmVar.b;
        if (num3 != null) {
            int intValue = num3.intValue();
            oki a = okmVar.a(intValue);
            if (a != null && (num2 = (Integer) a.c) != null) {
                return Integer.valueOf(num2.intValue() + 1);
            }
            oki a2 = okmVar.a(intValue);
            if (a2 != null && (num = (Integer) a2.d) != null) {
                return Integer.valueOf(num.intValue() - 1);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.okl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.oke r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dpgd
            if (r0 == 0) goto L13
            r0 = r9
            dpgd r0 = (defpackage.dpgd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpgd r0 = new dpgd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            int r8 = r0.a
            dpge r0 = r0.e
            defpackage.ffci.b(r9)     // Catch: java.lang.Exception -> L9e
            goto L67
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r9)
            java.lang.Object r8 = r8.a()     // Catch: java.lang.Exception -> L9e
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L9e
            if (r8 == 0) goto L44
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L9e
            goto L45
        L44:
            r8 = 0
        L45:
            dpft r9 = r7.a     // Catch: java.lang.Exception -> L9e
            int r2 = r8 * 20
            r0.e = r7     // Catch: java.lang.Exception -> L9e
            r0.a = r8     // Catch: java.lang.Exception -> L9e
            r0.d = r4     // Catch: java.lang.Exception -> L9e
            r5 = r9
            dpfz r5 = (defpackage.dpfz) r5     // Catch: java.lang.Exception -> L9e
            ffsk r5 = r5.b     // Catch: java.lang.Exception -> L9e
            ffhd r5 = r5.hT()     // Catch: java.lang.Exception -> L9e
            dpfy r6 = new dpfy     // Catch: java.lang.Exception -> L9e
            dpfz r9 = (defpackage.dpfz) r9     // Catch: java.lang.Exception -> L9e
            r6.<init>(r9, r2, r3)     // Catch: java.lang.Exception -> L9e
            java.lang.Object r9 = defpackage.ffra.a(r5, r6, r0)     // Catch: java.lang.Exception -> L9e
            if (r9 != r1) goto L66
            return r1
        L66:
            r0 = r7
        L67:
            dpfs r9 = (defpackage.dpfs) r9     // Catch: java.lang.Exception -> L9e
            java.util.List r1 = r9.a     // Catch: java.lang.Exception -> L9e
            int r2 = r8 + (-1)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L9e
            r5.<init>(r2)     // Catch: java.lang.Exception -> L9e
            r5.intValue()     // Catch: java.lang.Exception -> L9e
            int r2 = r0.b     // Catch: java.lang.Exception -> L9e
            if (r8 != 0) goto L7a
            r5 = r3
        L7a:
            int r8 = r8 + r4
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L9e
            r2.<init>(r8)     // Catch: java.lang.Exception -> L9e
            r2.intValue()     // Catch: java.lang.Exception -> L9e
            java.util.List r8 = r9.a     // Catch: java.lang.Exception -> L9e
            int r8 = r8.size()     // Catch: java.lang.Exception -> L9e
            java.util.List r9 = r9.b     // Catch: java.lang.Exception -> L9e
            int r9 = r9.size()     // Catch: java.lang.Exception -> L9e
            int r8 = r8 + r9
            int r9 = r0.c     // Catch: java.lang.Exception -> L9e
            r9 = 20
            if (r8 >= r9) goto L97
            goto L98
        L97:
            r3 = r2
        L98:
            oki r8 = new oki     // Catch: java.lang.Exception -> L9e
            r8.<init>(r1, r5, r3)     // Catch: java.lang.Exception -> L9e
            return r8
        L9e:
            r8 = move-exception
            okf r9 = new okf
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpge.c(oke, ffgu):java.lang.Object");
    }
}
