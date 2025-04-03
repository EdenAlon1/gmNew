package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpu {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (c(r7) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.iju r7, defpackage.ikk r8, defpackage.ffgu r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dps
            if (r0 == 0) goto L13
            r0 = r9
            dps r0 = (defpackage.dps) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dps r0 = new dps
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ikk r7 = r0.d
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.ffci.b(r9)
            boolean r9 = c(r7)
            if (r9 != 0) goto L65
        L3f:
            r0.a = r7
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r7.r(r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            iki r9 = (defpackage.iki) r9
            java.util.List r9 = r9.a
            int r2 = r9.size()
            r4 = 0
        L55:
            if (r4 >= r2) goto L65
            java.lang.Object r5 = r9.get(r4)
            iku r5 = (defpackage.iku) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L62
            goto L3f
        L62:
            int r4 = r4 + 1
            goto L55
        L65:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpu.a(iju, ikk, ffgu):java.lang.Object");
    }

    public static final Object b(ild ildVar, ffjm ffjmVar, ffgu ffguVar) {
        Object p = ildVar.p(new dpt(ffguVar.u(), ffjmVar, null), ffguVar);
        return p == ffhh.a ? p : ffcu.a;
    }

    public static final boolean c(iju ijuVar) {
        List list = ijuVar.p().a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((iku) list.get(i)).d) {
                return false;
            }
        }
        return true;
    }
}
