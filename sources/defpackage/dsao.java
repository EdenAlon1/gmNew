package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dsao {
    public static final List b = ffdx.g(dsal.a, dsag.a);
    public static final enru c = enru.c("com/google/android/libraries/compose/proxy/ui/search/SearchSuggestionsSource");
    private final ffji a = new ffji() { // from class: dsaa
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            List list = dsao.b;
            ((String) obj).getClass();
            return true;
        }
    };

    public abstract ffji a();

    public abstract ffji b();

    protected ffji c() {
        return this.a;
    }

    public abstract ffji d();

    public abstract ffjo e();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.drzi r11, defpackage.dtan r12, java.lang.String r13, int r14, defpackage.ffgu r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.dsam
            if (r0 == 0) goto L13
            r0 = r15
            dsam r0 = (defpackage.dsam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsam r0 = new dsam
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r15)
            goto L6f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r15)
            ffji r15 = r10.b()
            java.lang.Object r12 = r15.invoke(r12)
            if (r12 == 0) goto L75
            ffji r15 = r10.c()
            java.lang.Object r15 = r15.invoke(r13)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r3 == r15) goto L4d
            r12 = 0
        L4d:
            r6 = r12
            if (r6 == 0) goto L75
            ffji r12 = r10.a()
            java.lang.Object r11 = r12.invoke(r11)
            ffsk r11 = (defpackage.ffsk) r11
            ffhd r11 = r11.hT()
            dsan r4 = new dsan
            r9 = 0
            r5 = r10
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r15 = defpackage.ffra.a(r11, r4, r0)
            if (r15 == r1) goto L74
        L6f:
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L75
            return r15
        L74:
            return r1
        L75:
            ffel r11 = defpackage.ffel.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsao.f(drzi, dtan, java.lang.String, int, ffgu):java.lang.Object");
    }
}
