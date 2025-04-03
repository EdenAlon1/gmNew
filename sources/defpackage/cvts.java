package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvts implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ olu b;
    final /* synthetic */ dmyw c;
    final /* synthetic */ List d;

    public cvts(ffxy ffxyVar, olu oluVar, dmyw dmywVar, List list) {
        this.a = ffxyVar;
        this.b = oluVar;
        this.c = dmywVar;
        this.d = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cvtr
            if (r0 == 0) goto L13
            r0 = r9
            cvtr r0 = (defpackage.cvtr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvtr r0 = new cvtr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r9)
            goto Ldc
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            java.util.List r8 = (java.util.List) r8
            olu r2 = r7.b
            int r2 = r2.a()
            r4 = 0
            if (r2 == 0) goto L6a
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L4c
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L4c
            goto Lcf
        L4c:
            java.util.Iterator r2 = r8.iterator()
        L50:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lcf
            java.lang.Object r5 = r2.next()
            eei r5 = (defpackage.eei) r5
            java.lang.Object r5 = r5.d
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "contact_"
            boolean r5 = defpackage.ffpc.t(r5, r6)
            if (r5 == 0) goto L50
        L6a:
            dmyw r2 = r7.c
            java.util.List r2 = r2.b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9d
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L7f
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L7f
            goto Lcf
        L7f:
            java.util.Iterator r2 = r8.iterator()
        L83:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lcf
            java.lang.Object r5 = r2.next()
            eei r5 = (defpackage.eei) r5
            java.lang.Object r5 = r5.d
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "favorite"
            boolean r5 = defpackage.ffpc.t(r5, r6)
            if (r5 == 0) goto L83
        L9d:
            java.util.List r2 = r7.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lce
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto Lb0
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto Lb0
            goto Lcf
        Lb0:
            java.util.Iterator r8 = r8.iterator()
        Lb4:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r8.next()
            eei r2 = (defpackage.eei) r2
            java.lang.Object r2 = r2.d
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "group_chat_"
            boolean r2 = defpackage.ffpc.t(r2, r5)
            if (r2 == 0) goto Lb4
        Lce:
            r4 = r3
        Lcf:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r0.b = r3
            java.lang.Object r8 = r9.fQ(r8, r0)
            if (r8 != r1) goto Ldc
            return r1
        Ldc:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvts.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
