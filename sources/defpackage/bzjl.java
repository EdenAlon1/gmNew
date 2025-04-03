package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjl extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjl(bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzjl) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r7 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r1 = r6.b
            enqu r1 = (defpackage.enqu) r1
            defpackage.ffci.b(r7)
            goto L3e
        L11:
            defpackage.ffci.b(r7)
            goto L35
        L15:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.b
            java.lang.String r7 = (java.lang.String) r7
            bzid r1 = r6.c
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            bzgd r1 = (defpackage.bzgd) r1
            elfl r7 = r1.i(r7)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L9b
        L35:
            engw r7 = (defpackage.engw) r7
            enqv r1 = r7.iterator()
            r1.getClass()
        L3e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r1.next()
            bsrt r7 = (defpackage.bsrt) r7
            bzid r2 = r6.c
            ffbr r3 = r2.d
            java.lang.Object r3 = r3.b()
            bzgd r3 = (defpackage.bzgd) r3
            java.lang.String r4 = r7.q()
            java.lang.String r5 = r7.r()
            j$.util.Optional r7 = r3.m(r7)
            bzge r7 = r3.g(r4, r5, r7)
            chvu r2 = r2.e
            elfl r7 = r2.b(r7)
            r6.b = r1
            r2 = 2
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto L3e
            goto L9b
        L76:
            bzid r7 = r6.c
            enru r7 = r7.l
            ensk r7 = r7.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleGDitto"
            r7.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 280(0x118, float:3.92E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$unpairGaiaClients$2"
            java.lang.String r3 = "GaiaDevicePairingManagerDelegateImpl.kt"
            ensk r7 = r7.h(r2, r0, r1, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r0 = "Gaia Desktops have been unpaired"
            r7.q(r0)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzjl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzjl bzjlVar = new bzjl(this.c, ffguVar);
        bzjlVar.b = obj;
        return bzjlVar;
    }
}
