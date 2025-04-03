package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djsh b;
    final /* synthetic */ cosz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsc(ffgu ffguVar, djsh djshVar, cosz coszVar) {
        super(2, ffguVar);
        this.b = djshVar;
        this.c = coszVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r10 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r10 != r0) goto L9;
     */
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
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/ims/provisioning/api/identitymapping/IdentityMappingProducerImpl$getAvailableIdentity$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "IdentityMappingProducerImpl.kt"
            java.lang.String r6 = "IdentityMappingPopulator"
            r7 = 0
            if (r1 == 0) goto L1a
            if (r1 == r2) goto L16
            defpackage.ffci.b(r10)
            goto L75
        L16:
            defpackage.ffci.b(r10)
            goto L3d
        L1a:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.d
            ffsk r10 = (defpackage.ffsk) r10
            djsh r10 = r9.b
            cosz r1 = r9.c
            java.lang.String r1 = r1.c
            r1.getClass()
            r9.a = r2
            ffhd r2 = r10.f
            ffhd r2 = defpackage.ekxi.a(r2)
            djsf r8 = new djsf
            r8.<init>(r7, r10, r1)
            java.lang.Object r10 = defpackage.ffra.a(r2, r8, r9)
            if (r10 == r0) goto Ld8
        L3d:
            djtp r10 = (defpackage.djtp) r10
            if (r10 != 0) goto L5e
            enru r10 = defpackage.djsh.a
            ensk r10 = r10.j()
            ensn r0 = defpackage.ente.a
            r10.Y(r0, r6)
            r0 = 59
            ensk r10 = r10.h(r4, r3, r0, r5)
            enrr r10 = (defpackage.enrr) r10
            cosz r0 = r9.c
            java.lang.String r1 = "No RCS configuration found for sim id: %s"
            java.lang.String r0 = r0.c
            r10.t(r1, r0)
            return r7
        L5e:
            djsh r1 = r9.b
            r2 = 2
            r9.a = r2
            ffhd r2 = r1.f
            ffhd r2 = defpackage.ekxi.a(r2)
            djse r8 = new djse
            r8.<init>(r7, r1, r10)
            java.lang.Object r10 = defpackage.ffra.a(r2, r8, r9)
            if (r10 != r0) goto L75
            goto Ld8
        L75:
            djrj r10 = (defpackage.djrj) r10
            if (r10 != 0) goto Lc2
            enru r0 = defpackage.djsh.a
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            r1 = 64
            ensk r0 = r0.h(r4, r3, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            cosz r1 = r9.c
            java.lang.String r2 = "No phone number found for sim id: %s"
            java.lang.String r1 = r1.c
            r0.t(r2, r1)
            djsh r0 = r9.b
            ffbr r0 = r0.d
            java.lang.Object r0 = r0.b()
            dkvu r0 = (defpackage.dkvu) r0
            cosz r1 = r9.c
            int r1 = r1.d
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto Lc2
            enru r10 = defpackage.djsh.a
            ensk r10 = r10.j()
            ensn r0 = defpackage.ente.a
            r10.Y(r0, r6)
            r0 = 66
            ensk r10 = r10.h(r4, r3, r0, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "No phone number found for non-single registration transport."
            r10.q(r0)
            return r7
        Lc2:
            cosz r0 = r9.c
            djrz r1 = new djrz
            djro r2 = new djro
            java.lang.String r0 = r0.c
            r0.getClass()
            r2.<init>(r0)
            cosz r0 = r9.c
            int r0 = r0.d
            r1.<init>(r2, r10, r0)
            return r1
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djsc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsc djscVar = new djsc(ffguVar, this.b, this.c);
        djscVar.d = obj;
        return djscVar;
    }
}
