package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqmn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ezgn b;
    final /* synthetic */ cqmo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqmn(ezgn ezgnVar, cqmo cqmoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ezgnVar;
        this.c = cqmoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqmn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 3
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler$processPendingWorkItemAsync$1"
            java.lang.String r5 = "TelephonyDatabaseUpdateWorkItemHandler.kt"
            java.lang.String r6 = "BugleTelephony"
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L1f
            if (r1 == r8) goto L1b
            defpackage.ffci.b(r10)
            if (r1 == r7) goto L1a
            if (r1 == r2) goto L80
        L1a:
            return r10
        L1b:
            defpackage.ffci.b(r10)
            goto L53
        L1f:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.cqmo.a
            ensk r10 = r10.h()
            ensn r1 = defpackage.ente.a
            r10.Y(r1, r6)
            r1 = 51
            ensk r10 = r10.h(r4, r3, r1, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r1 = "Initiating Telephony Database update work."
            r10.q(r1)
            ezgn r10 = r9.b
            int r10 = r10.b
            if (r10 != r8) goto L67
            cqmo r10 = r9.c
            ffbr r10 = r10.c
            java.lang.Object r10 = r10.b()
            cqoa r10 = (defpackage.cqoa) r10
            r9.a = r8
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L53
            goto Lab
        L53:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L67
            cqmo r10 = r9.c
            r9.a = r7
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L66
            goto Lab
        L66:
            return r10
        L67:
            ezgn r10 = r9.b
            int r10 = r10.b
            if (r10 != r7) goto Lad
            cqmo r10 = r9.c
            ffbr r10 = r10.c
            java.lang.Object r10 = r10.b()
            cqoa r10 = (defpackage.cqoa) r10
            r9.a = r2
            java.lang.Object r10 = r10.b(r9)
            if (r10 != r0) goto L80
            goto Lab
        L80:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lad
            enru r10 = defpackage.cqmo.a
            ensk r10 = r10.h()
            ensn r1 = defpackage.ente.a
            r10.Y(r1, r6)
            r1 = 65
            ensk r10 = r10.h(r4, r3, r1, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r1 = "Scheduling message thread Id update for messages in thread zero."
            r10.q(r1)
            cqmo r10 = r9.c
            r1 = 4
            r9.a = r1
            java.lang.Object r10 = r10.l(r9)
            if (r10 != r0) goto Lac
        Lab:
            return r0
        Lac:
            return r10
        Lad:
            enru r10 = defpackage.cqmo.a
            ensk r10 = r10.j()
            ensn r0 = defpackage.ente.a
            r10.Y(r0, r6)
            r0 = 68
            ensk r10 = r10.h(r4, r3, r0, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "No work scheduled"
            r10.q(r0)
            ceyt r10 = defpackage.ceyt.k()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqmn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqmn(this.b, this.c, ffguVar);
    }
}
