package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dayt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayp(dayt daytVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = daytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d2, code lost:
    
        if (defpackage.fgfz.c(r9, r8) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r9 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007e, code lost:
    
        if (r9 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d2 -> B:6:0x0037). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 == r2) goto L12
            java.lang.Object r1 = r8.a
            defpackage.ffci.b(r9)
            goto L37
        L12:
            java.lang.Object r1 = r8.a
            defpackage.ffci.b(r9)
            goto L80
        L18:
            defpackage.ffci.b(r9)
            goto L31
        L1c:
            defpackage.ffci.b(r9)
            dayt r9 = r8.c
            ffbr r9 = r9.k
            java.lang.Object r9 = r9.b()
            djsi r9 = (defpackage.djsi) r9
            r8.b = r3
            java.lang.Object r9 = r9.j(r8)
            if (r9 == r0) goto Ld8
        L31:
            java.util.Set r9 = (java.util.Set) r9
            java.util.Iterator r1 = r9.iterator()
        L37:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Ld5
            java.lang.Object r9 = r1.next()
            djrj r9 = (defpackage.djrj) r9
            enru r3 = defpackage.dayt.a
            ensk r3 = r3.h()
            ensn r4 = defpackage.ente.a
            java.lang.String r5 = "BugleCms"
            r3.Y(r4, r5)
            java.lang.String r4 = "invokeSuspend"
            r5 = 442(0x1ba, float:6.2E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl$getPhoneAccountInfo$1"
            java.lang.String r7 = "CloudStoreDebugMenuProviderImpl.kt"
            ensk r3 = r3.h(r6, r4, r5, r7)
            enrr r3 = (defpackage.enrr) r3
            java.lang.String r4 = "Getting MDE account info for a phone number."
            r3.q(r4)
            dayt r3 = r8.c
            ffbr r3 = r3.l
            java.lang.Object r3 = r3.b()
            chbx r3 = (defpackage.chbx) r3
            java.lang.String r9 = r9.a
            elfl r9 = r3.b(r9)
            r9.getClass()
            r8.a = r1
            r8.b = r2
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto Ld8
        L80:
            chbu r9 = (defpackage.chbu) r9
            ffbr r3 = r9.i
            java.lang.Object r3 = r3.b()
            akif r3 = (defpackage.akif) r3
            ciii r3 = r9.j
            chwm r4 = new chwm
            r4.<init>(r3)
            chpy r3 = r9.m()
            elfl r3 = r3.c()
            elfl r3 = defpackage.elfl.g(r3)
            chbc r5 = new chbc
            r5.<init>()
            errm r6 = r9.k
            elfl r3 = r3.i(r5, r6)
            chbd r5 = new chbd
            r5.<init>()
            errl r6 = r9.q
            elfl r3 = r3.i(r5, r6)
            chbf r5 = new chbf
            r5.<init>()
            errm r9 = r9.k
            elfl r9 = r3.i(r5, r9)
            chbg r3 = new chbg
            r3.<init>()
            erpp r4 = defpackage.erpp.a
            elfl r9 = r9.h(r3, r4)
            r8.a = r1
            r3 = 3
            r8.b = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 != r0) goto L37
            goto Ld8
        Ld5:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dayp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dayp(this.c, ffguVar);
    }
}
