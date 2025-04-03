package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xjo extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ xle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjo(xle xleVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = xleVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xjo xjoVar = new xjo(this.c, (ffgu) obj3);
        xjoVar.a = (xje) obj;
        xjoVar.b = (xhu) obj2;
        return xjoVar.b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, xje] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.a
            java.lang.Object r0 = r9.b
            xlt r2 = r10.b()
            xhu r0 = (defpackage.xhu) r0
            j$.time.Instant r1 = r0.g
            xle r3 = r9.c
            ffbr r3 = r3.e
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L27
            com.google.android.apps.messaging.shared.conversation.draft.EditingData r3 = r0.f
            if (r3 == 0) goto L27
            r3 = r4
            goto L29
        L27:
            r3 = r4
            r4 = r5
        L29:
            java.util.List r6 = r0.b
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L33
        L31:
            r6 = r5
            goto L49
        L33:
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L31
            java.lang.Object r7 = r6.next()
            xhp r7 = (defpackage.xhp) r7
            boolean r7 = r7 instanceof defpackage.xhm
            if (r7 == 0) goto L37
            r6 = r5
            r5 = r3
        L49:
            xle r7 = r9.c
            ffbr r7 = r7.e
            java.lang.Object r7 = r7.b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6c
            com.google.android.apps.messaging.shared.conversation.draft.EditingData r7 = r0.f
            if (r7 == 0) goto L60
            java.lang.String r7 = r7.b
            goto L61
        L60:
            r7 = 0
        L61:
            java.lang.String r8 = r0.a
            boolean r7 = defpackage.ffpc.o(r7, r8)
            if (r7 != 0) goto L6c
            r7 = r6
            r6 = r3
            goto L6d
        L6c:
            r7 = r6
        L6d:
            boolean r0 = r0.b()
            xlu r10 = r10.c()
            if (r10 == 0) goto L7b
            boolean r10 = r10.c
            r8 = r10
            goto L7c
        L7b:
            r8 = r7
        L7c:
            if (r1 == 0) goto L7f
            goto L80
        L7f:
            r3 = r7
        L80:
            xlg r1 = new xlg
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjo.b(java.lang.Object):java.lang.Object");
    }
}
