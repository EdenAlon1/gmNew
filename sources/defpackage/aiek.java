package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiek implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ aiew b;

    public aiek(ffxy ffxyVar, aiew aiewVar) {
        this.a = ffxyVar;
        this.b = aiewVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.aiej
            if (r0 == 0) goto L13
            r0 = r11
            aiej r0 = (defpackage.aiej) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aiej r0 = new aiej
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r11)
            goto Ld1
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.ffci.b(r11)
            ffxy r11 = r9.a
            java.lang.String r10 = (java.lang.String) r10
            aiew r2 = r9.b
            aids r4 = new aids
            int r5 = r10.length()
            r6 = 0
            if (r5 != 0) goto L44
            goto Lc5
        L44:
            android.content.Context r2 = r2.b
            java.util.Locale r2 = defpackage.ctid.c(r2)
            r2.getClass()
            java.lang.String r2 = r10.toLowerCase(r2)
            r2.getClass()
            ffpa r5 = new ffpa
            java.lang.String r7 = "\\W+"
            r5.<init>(r7)
            java.util.List r2 = r5.f(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L68:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L7f
            java.lang.Object r7 = r2.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L68
            r5.add(r7)
            goto L68
        L7f:
            java.util.List r2 = defpackage.ffdx.ak(r5)
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L8a
            goto Lc5
        L8a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L94:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = r2.next()
            int r8 = r6 + 1
            if (r6 >= 0) goto La5
            defpackage.ffdx.l()
        La5:
            java.lang.String r7 = (java.lang.String) r7
            if (r6 <= 0) goto Lae
            java.lang.String r6 = "|"
            r5.append(r6)
        Lae:
            java.lang.String r6 = "(\\b\\Q"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = "\\E)"
            r5.append(r6)
            r6 = r8
            goto L94
        Lbd:
            java.lang.String r2 = r5.toString()
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r2)
        Lc5:
            r4.<init>(r10, r6)
            r0.b = r3
            java.lang.Object r10 = r11.fQ(r4, r0)
            if (r10 != r1) goto Ld1
            return r1
        Ld1:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiek.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
