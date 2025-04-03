package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cunu implements cuna {
    private static final ffpa a = new ffpa("[0-9]");
    private static final ffpa b = new ffpa("\\p{C}");
    private final cwln c;
    private final ewzb d;

    public cunu(cwln cwlnVar) {
        cwlnVar.getClass();
        this.c = cwlnVar;
        ewza ewzaVar = new ewza();
        ewzaVar.b = ffdx.g("email", "url");
        ewzaVar.b();
        this.d = ewzaVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cuna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cunt
            if (r0 == 0) goto L13
            r0 = r9
            cunt r0 = (defpackage.cunt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cunt r0 = new cunt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.d
            defpackage.ffci.b(r9)
            goto L57
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            r8.getClass()
            java.lang.String r9 = "0"
            ffpa r2 = defpackage.cunu.a
            java.lang.String r8 = r2.a(r8, r9)
            java.lang.String r9 = ""
            ffpa r2 = defpackage.cunu.b
            java.lang.String r8 = r2.a(r8, r9)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 == r1) goto Lc9
        L57:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lc8
            java.nio.charset.Charset r0 = defpackage.ffoo.a
            byte[] r8 = r8.getBytes(r0)
            r8.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
        L72:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r9.next()
            cuml r2 = (defpackage.cuml) r2
            int r3 = r2.a
            int r4 = r2.b
            if (r1 > r3) goto L72
            int r3 = r3 - r1
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = defpackage.ffoo.a
            r5.<init>(r8, r1, r3, r6)
            r0.append(r5)
            java.lang.String r2 = r2.c
            java.lang.String r3 = "URL_BASIC"
            boolean r3 = defpackage.ffkj.e(r2, r3)
            if (r3 == 0) goto L9c
            java.lang.String r2 = "[url]"
            goto La9
        L9c:
            java.lang.String r3 = "EMAIL_ADDRESS"
            boolean r2 = defpackage.ffkj.e(r2, r3)
            if (r2 == 0) goto La7
            java.lang.String r2 = "[email]"
            goto La9
        La7:
            java.lang.String r2 = "[unk]"
        La9:
            r0.append(r2)
            if (r1 >= r4) goto Lb0
            r1 = r4
            goto L72
        Lb0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
        Lb8:
            int r9 = r8.length
            int r9 = r9 - r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = defpackage.ffoo.a
            r2.<init>(r8, r1, r9, r3)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
        Lc8:
            return r8
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cunu.a(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cuns
            if (r0 == 0) goto L13
            r0 = r11
            cuns r0 = (defpackage.cuns) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuns r0 = new cuns
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r10 = r0.e
            cunu r0 = r0.d
            defpackage.ffci.b(r11)
            goto L49
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.ffci.b(r11)
            cwln r11 = r9.c
            elfl r11 = r11.a()
            r0.d = r9
            r0.e = r10
            r0.c = r3
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 == r1) goto Ld9
            r0 = r9
        L49:
            r11.getClass()
            j$.util.Optional r11 = (j$.util.Optional) r11
            java.lang.Object r11 = defpackage.fflm.b(r11)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib r11 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib) r11
            if (r11 != 0) goto L59
            ffel r10 = defpackage.ffel.a
            return r10
        L59:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            exak r2 = new exak
            r2.<init>(r10)
            ewzb r10 = r0.d
            r2.a = r10
            exal r10 = r2.a()
            exap r10 = r11.b(r10)
            java.util.List r10 = r10.d
            java.util.Iterator r10 = r10.iterator()
        L75:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lcb
            java.lang.Object r11 = r10.next()
            exam r11 = (defpackage.exam) r11
            int r0 = r11.a()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L75
            r2 = 0
        L8a:
            java.lang.String r3 = r11.b(r2)
            r3.getClass()
            ewxv r4 = r11.a
            cmh r5 = r4.a
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto La8
            cmh r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto La9
        La8:
            r4 = 0
        La9:
            cfup r5 = defpackage.ctim.a
            java.lang.Object r5 = r5.e()
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r7 = (double) r4
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto Lc6
            int r4 = r11.b
            int r5 = r11.c
            cuml r6 = new cuml
            r6.<init>(r4, r5, r3)
            r1.add(r6)
        Lc6:
            if (r2 == r0) goto L75
            int r2 = r2 + 1
            goto L8a
        Lcb:
            java.util.List r10 = defpackage.ffdx.ak(r1)
            cunr r11 = new cunr
            r11.<init>()
            java.util.List r10 = defpackage.ffdx.ah(r10, r11)
            return r10
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cunu.b(java.lang.String, ffgu):java.lang.Object");
    }
}
