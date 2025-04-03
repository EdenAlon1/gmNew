package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpl {
    public static final Set a = ffdo.N(le.b);
    public static final Set b = ffdo.N(le.a);
    public static final List c = ffdx.g("address", "datetime", "email", "phone", "url");
    public static final List d = ffdx.g("flight", "other", "");
    private static final Map e = ffew.g(new ffcf("datetime", cvqh.a), new ffcf("url", cvqh.b), new ffcf("phone", cvqh.c), new ffcf("email", cvqh.d), new ffcf("address", cvqh.e));
    private final ffsk f;
    private final cwln g;

    public cvpl(ffsk ffskVar, ffbr ffbrVar, cwln cwlnVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        cwlnVar.getClass();
        this.f = ffskVar;
        this.g = cwlnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cvpj
            if (r0 == 0) goto L13
            r0 = r9
            cvpj r0 = (defpackage.cvpj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvpj r0 = new cvpj
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r8 = r0.d
            defpackage.ffci.b(r9)
            goto L52
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.ffci.b(r9)
            ffsk r9 = r7.f
            ffhe r2 = defpackage.ffhe.a
            ffsm r5 = defpackage.ffsm.a
            ffhd r2 = defpackage.ekxi.a(r2)
            cvpi r6 = new cvpi
            r6.<init>(r3, r7, r8)
            ffss r9 = defpackage.ffra.b(r9, r2, r5, r6)
            r0.d = r8
            r0.c = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto Ld6
        L52:
            j$.util.Optional r9 = (j$.util.Optional) r9
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lcf
            fffs r0 = new fffs
            r0.<init>(r3)
            java.lang.Object r9 = r9.get()
            exap r9 = (defpackage.exap) r9
            java.util.List r9 = r9.d
            java.util.Iterator r9 = r9.iterator()
        L6b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r9.next()
            r1.getClass()
            exam r1 = (defpackage.exam) r1
            int r2 = r1.a()
            if (r2 <= 0) goto L6b
            java.util.Map r2 = defpackage.cvpl.e
            r3 = 0
            java.lang.String r4 = r1.b(r3)
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L6b
            java.lang.String r3 = r1.b(r3)
            r3.getClass()
            java.lang.String r4 = "url"
            boolean r4 = defpackage.ffkj.e(r3, r4)
            if (r4 == 0) goto Lb4
            int r4 = r1.b
            int r1 = r1.c
            java.lang.CharSequence r1 = r8.subSequence(r4, r1)
            java.lang.String r1 = r1.toString()
            boolean r1 = defpackage.cuxu.c(r1)
            if (r1 == 0) goto Lb4
            cvqh r1 = defpackage.cvqh.f
            r0.add(r1)
            goto L6b
        Lb4:
            java.lang.Object r1 = r2.get(r3)
            r1.getClass()
            r0.add(r1)
            goto L6b
        Lbf:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto Lca
            cvqh r8 = defpackage.cvqh.i
            r0.add(r8)
        Lca:
            java.util.List r8 = defpackage.ffdx.a(r0)
            return r8
        Lcf:
            cvqh r8 = defpackage.cvqh.i
            java.util.List r8 = defpackage.ffdx.b(r8)
            return r8
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpl.a(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cvpk
            if (r0 == 0) goto L13
            r0 = r6
            cvpk r0 = (defpackage.cvpk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvpk r0 = new cvpk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.ffci.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            cwln r6 = r4.g
            elfl r6 = r6.a()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            j$.util.Optional r6 = (j$.util.Optional) r6
            cvpg r0 = new cvpg
            r0.<init>()
            cvph r5 = new cvph
            r5.<init>()
            j$.util.Optional r5 = r6.map(r5)
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpl.b(java.lang.String, ffgu):java.lang.Object");
    }
}
