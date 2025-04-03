package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ UUID c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dfjo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spu(ffgu ffguVar, spw spwVar, UUID uuid, boolean z, dfjo dfjoVar) {
        super(2, ffguVar);
        this.b = spwVar;
        this.c = uuid;
        this.d = z;
        this.e = dfjoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r9 != r0) goto L13;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L13
            if (r1 == r3) goto Lf
            defpackage.ffci.b(r9)
            goto Lc9
        Lf:
            defpackage.ffci.b(r9)
            goto L89
        L13:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.f
            ffsk r9 = (defpackage.ffsk) r9
            spw r9 = r8.b
            ffbr r9 = r9.h
            java.lang.Object r9 = r9.b()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            sra r9 = defpackage.sra.a
            eyfq r9 = r9.createBuilder()
            sqz r9 = (defpackage.sqz) r9
            r9.getClass()
            java.util.UUID r1 = r8.c
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r9.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r9.instance
            sra r4 = (defpackage.sra) r4
            int r5 = r4.b
            r5 = r5 | r3
            r4.b = r5
            r4.c = r1
            boolean r1 = r8.d
            r9.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r9.instance
            sra r4 = (defpackage.sra) r4
            int r5 = r4.b
            r5 = r5 | r2
            r4.b = r5
            r4.d = r1
            eyfy r9 = r9.build()
            r9.getClass()
            spw r1 = r8.b
            sra r9 = (defpackage.sra) r9
            ffbr r1 = r1.i
            java.lang.Object r1 = r1.b()
            sql r1 = (defpackage.sql) r1
            r8.a = r3
            ffhd r4 = r1.a
            ffhd r4 = defpackage.ekxi.a(r4)
            sqj r5 = new sqj
            r6 = 0
            r5.<init>(r6, r1, r9)
            java.lang.Object r9 = defpackage.ffra.a(r4, r5, r8)
            ffhh r1 = defpackage.ffhh.a
            if (r9 == r1) goto L87
            ffcu r9 = defpackage.ffcu.a
        L87:
            if (r9 == r0) goto Lc8
        L89:
            spw r9 = r8.b
            java.util.UUID r1 = r8.c
            dksa r9 = r9.f
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "bugle"
            java.lang.String r5 = "rcs_provisioning_rcs_default_on_server_update_time_key"
            r9.j(r5, r1, r4)
            boolean r9 = r8.d
            if (r9 == 0) goto Lcb
            dfjo r9 = r8.e
            int r1 = r9.b
            if (r1 != r3) goto La9
            java.lang.Object r9 = r9.c
            dfkf r9 = (defpackage.dfkf) r9
            goto Lab
        La9:
            dfkf r9 = defpackage.dfkf.a
        Lab:
            long r4 = r9.d
            r6 = 70
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto Lb4
            goto Lb5
        Lb4:
            r3 = 0
        Lb5:
            bbim r9 = new bbim
            r9.<init>(r3)
            spw r1 = r8.b
            java.util.UUID r3 = r8.c
            bbhs r1 = r1.e
            r8.a = r2
            java.lang.Object r9 = r1.b(r9, r3, r8)
            if (r9 != r0) goto Lc9
        Lc8:
            return r0
        Lc9:
            java.io.File r9 = (java.io.File) r9
        Lcb:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spu spuVar = new spu(ffguVar, this.b, this.c, this.d, this.e);
        spuVar.f = obj;
        return spuVar;
    }
}
