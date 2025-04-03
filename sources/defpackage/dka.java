package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dka {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.iju r8, defpackage.ffgu r9) {
        /*
            boolean r0 = r9 instanceof defpackage.djx
            if (r0 == 0) goto L13
            r0 = r9
            djx r0 = (defpackage.djx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            djx r0 = new djx
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
        L34:
            r0.a = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.ijt.a(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            iki r9 = (defpackage.iki) r9
            int r2 = r9.c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4f:
            if (r6 >= r4) goto L61
            java.lang.Object r7 = r2.get(r6)
            iku r7 = (defpackage.iku) r7
            boolean r7 = defpackage.ikj.c(r7)
            if (r7 != 0) goto L5e
            goto L34
        L5e:
            int r6 = r6 + 1
            goto L4f
        L61:
            java.util.List r8 = r9.a
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dka.a(iju, ffgu):java.lang.Object");
    }
}
