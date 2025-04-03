package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwj implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ cvwo b;

    public cvwj(ffxy ffxyVar, cvwo cvwoVar) {
        this.a = ffxyVar;
        this.b = cvwoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.cvwi
            if (r0 == 0) goto L13
            r0 = r14
            cvwi r0 = (defpackage.cvwi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvwi r0 = new cvwi
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r14)
            goto La9
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            defpackage.ffci.b(r14)
            ffxy r14 = r12.a
            amar r13 = (defpackage.amar) r13
            cvwo r2 = r12.b
            cwis r2 = r2.c
            cwir r2 = r2.e()
            if (r13 != 0) goto L44
            ffel r13 = defpackage.ffel.a
            goto La0
        L44:
            engw r4 = r13.b()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ffdx.n(r4, r6)
            r5.<init>(r6)
            enqv r4 = r4.iterator()
        L57:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r4.next()
            ambh r6 = (defpackage.ambh) r6
            aoku r7 = r6.a
            aokr r7 = r7.H(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = defpackage.cuxh.b(r7)
            java.lang.String r8 = r6.a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " "
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            aoku r8 = r6.a
            cvwg r9 = new cvwg
            boolean r8 = r2.b(r8)
            cvwo r10 = r12.b
            cvwn r11 = new cvwn
            r11.<init>(r10, r13, r6, r2)
            r9.<init>(r7, r8, r11)
            r5.add(r9)
            goto L57
        L9f:
            r13 = r5
        La0:
            r0.b = r3
            java.lang.Object r13 = r14.fQ(r13, r0)
            if (r13 != r1) goto La9
            return r1
        La9:
            ffcu r13 = defpackage.ffcu.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvwj.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
