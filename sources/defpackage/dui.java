package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dui {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r6 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.iju r4, defpackage.dlz r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.due
            if (r0 == 0) goto L13
            r0 = r6
            due r0 = (defpackage.due) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            due r0 = new due
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dlz r5 = r0.d
            java.lang.Object r4 = r0.a
            defpackage.ffci.b(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ffci.b(r6)
            r0.a = r4
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ijt.a(r4, r0)
            if (r6 == r1) goto L7f
        L42:
            iki r6 = (defpackage.iki) r6
            int r0 = r6.d
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r0 == 0) goto L7f
            int r0 = r6.e
            r2 = 6
            boolean r0 = defpackage.ikm.a(r0, r2)
            if (r0 != 0) goto L55
            goto L7f
        L55:
            r4.b()
            long r4 = r5.a(r4, r6)
            r2 = 0
            boolean r0 = defpackage.iak.i(r4, r2)
            if (r0 != 0) goto L7f
            java.util.List r6 = r6.a
            int r0 = r6.size()
            r1 = 0
        L6b:
            if (r1 >= r0) goto L79
            java.lang.Object r2 = r6.get(r1)
            iku r2 = (defpackage.iku) r2
            r2.b()
            int r1 = r1 + 1
            goto L6b
        L79:
            iak r6 = new iak
            r6.<init>(r4)
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dui.a(iju, dlz, ffgu):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0043 -> B:10:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.iju r5, defpackage.dlz r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.duf
            if (r0 == 0) goto L13
            r0 = r7
            duf r0 = (defpackage.duf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            duf r0 = new duf
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            dlz r5 = r0.d
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            defpackage.ffci.b(r7)
        L39:
            r0.a = r5
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = a(r5, r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            iak r7 = (defpackage.iak) r7
            if (r7 != 0) goto L4b
            goto L39
        L4b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dui.b(iju, dlz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0239, code lost:
    
        if (r14 != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x023b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ac, code lost:
    
        if (((java.lang.Boolean) r10.invoke(new defpackage.iak(r4))).booleanValue() != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0240 A[EDGE_INSN: B:88:0x0240->B:87:0x0240 BREAK  A[LOOP:0: B:13:0x022b->B:16:0x023d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0210 -> B:12:0x0222). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(defpackage.iju r26, defpackage.ffwm r27, defpackage.ffji r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dui.c(iju, ffwm, ffji, ffgu):java.lang.Object");
    }
}
