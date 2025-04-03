package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caad extends ffhv implements ffjm {
    int a;
    final /* synthetic */ caag b;
    final /* synthetic */ enip c;
    final /* synthetic */ eozn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caad(ffgu ffguVar, caag caagVar, enip enipVar, eozn eoznVar) {
        super(2, ffguVar);
        this.b = caagVar;
        this.c = enipVar;
        this.d = eoznVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caad) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl$downloadRemoteInstances$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "EtouffeeSessionSetupImpl.kt"
            java.lang.String r5 = "BugleEtouffee"
            r6 = 1
            if (r1 == 0) goto L1c
            if (r1 == r6) goto L15
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L5b
        L15:
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L43
        L19:
            r9 = move-exception
            goto L98
        L1c:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.e
            ffsk r9 = (defpackage.ffsk) r9
            caag r9 = r8.b     // Catch: java.lang.Throwable -> L19
            ffbr r9 = r9.c     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> L19
            bzqc r9 = (defpackage.bzqc) r9     // Catch: java.lang.Throwable -> L19
            caag r1 = r8.b     // Catch: java.lang.Throwable -> L19
            awui r1 = r1.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.d     // Catch: java.lang.Throwable -> L19
            elfl r9 = r9.e(r1)     // Catch: java.lang.Throwable -> L19
            r9.getClass()     // Catch: java.lang.Throwable -> L19
            r8.a = r6     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L43
            goto L5a
        L43:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L5e
            caag r9 = r8.b     // Catch: java.lang.Throwable -> L19
            enip r1 = r8.c     // Catch: java.lang.Throwable -> L19
            eozn r6 = r8.d     // Catch: java.lang.Throwable -> L19
            r7 = 2
            r8.a = r7     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.d(r1, r6, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L5b
        L5a:
            return r0
        L5b:
            ppq r9 = (defpackage.ppq) r9     // Catch: java.lang.Throwable -> L19
            return r9
        L5e:
            caag r9 = r8.b     // Catch: java.lang.Throwable -> L19
            ffbr r9 = r9.k     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> L19
            akzt r9 = (defpackage.akzt) r9     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "Bugle.Etouffee.Session.Not.Provisioned.Count"
            r9.c(r0)     // Catch: java.lang.Throwable -> L19
            enru r9 = defpackage.caag.a     // Catch: java.lang.Throwable -> L19
            ensk r9 = r9.j()     // Catch: java.lang.Throwable -> L19
            ensn r0 = defpackage.ente.a     // Catch: java.lang.Throwable -> L19
            r9.Y(r0, r5)     // Catch: java.lang.Throwable -> L19
            enrr r9 = (defpackage.enrr) r9     // Catch: java.lang.Throwable -> L19
            ensn r0 = defpackage.csux.E     // Catch: java.lang.Throwable -> L19
            caag r1 = r8.b     // Catch: java.lang.Throwable -> L19
            awui r1 = r1.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.d     // Catch: java.lang.Throwable -> L19
            r9.Y(r0, r1)     // Catch: java.lang.Throwable -> L19
            r0 = 83
            ensk r9 = r9.h(r3, r2, r0, r4)     // Catch: java.lang.Throwable -> L19
            enrr r9 = (defpackage.enrr) r9     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "E2EE is not provisioned when trying to download remote instance."
            r9.q(r0)     // Catch: java.lang.Throwable -> L19
            ppn r9 = new ppn     // Catch: java.lang.Throwable -> L19
            r9.<init>()     // Catch: java.lang.Throwable -> L19
            return r9
        L98:
            enru r0 = defpackage.caag.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r5)
            enrr r0 = (defpackage.enrr) r0
            ensk r0 = r0.g(r9)
            r1 = 87
            ensk r0 = r0.h(r3, r2, r1, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Failed to download registration IDs."
            r0.q(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caad.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        caad caadVar = new caad(ffguVar, this.b, this.c, this.d);
        caadVar.e = obj;
        return caadVar;
    }
}
