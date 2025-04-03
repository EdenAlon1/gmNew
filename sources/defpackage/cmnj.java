package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmnj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmnk b;
    final /* synthetic */ djrm c;
    final /* synthetic */ eyxa d;
    final /* synthetic */ eqws e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmnj(cmnk cmnkVar, djrm djrmVar, eyxa eyxaVar, eqws eqwsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmnkVar;
        this.c = djrmVar;
        this.d = eyxaVar;
        this.e = eqwsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmnj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ba, code lost:
    
        r1 = r9.b;
        r4 = r9.d;
        r5 = r9.e;
        r9.a = 3;
        r6 = r10.c;
        r6.getClass();
        r10 = r10.d;
        r7 = r1.e.a(r10);
        r7.getClass();
        r8 = r7.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        if (r8 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r8 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        ((defpackage.ensz) defpackage.cmnk.a.j()).t("RcsProvisioningTrigger: Provisioning Engine version is unknown due to temporary Telephony platform unavailability. %s", r7.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0109, code lost:
    
        r10 = defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0129, code lost:
    
        if (r10 == defpackage.ffhh.a) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012b, code lost:
    
        r10 = defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x012d, code lost:
    
        if (r10 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0142, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
    
        ((defpackage.ensz) defpackage.cmnk.a.h()).t("RcsProvisioningTrigger: DR is active, initializing DR provisioning. %s", r7.name());
        ((defpackage.cmne) r1.d.b()).k(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010c, code lost:
    
        ((defpackage.ensz) defpackage.cmnk.a.h()).t("RcsProvisioningTrigger: Single Registration Provisioning Engine is active, initializing SR provisioning. %s", r7.name());
        r10 = r1.f(r10, r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0123, code lost:
    
        if (r10 == defpackage.ffhh.a) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0125, code lost:
    
        r10 = defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
    
        ((defpackage.ensz) defpackage.cmnk.a.h()).t("No SimSubscriptionInfo for rcsProvisioningId: %s", r9.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0141, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r10 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        if (r10 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a9, code lost:
    
        r10 = (defpackage.cosz) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ab, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ad, code lost:
    
        r1 = r10.c;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b6, code lost:
    
        if (r1.length() != 0) goto L25;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmnj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmnj(this.b, this.c, this.d, this.e, ffguVar);
    }
}
