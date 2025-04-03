package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayaq extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ayar c;
    final /* synthetic */ ceuw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayaq(ayar ayarVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ayarVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayaq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        if (r8 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003b, code lost:
    
        if (r8 != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0166 A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x000f, B:8:0x0156, B:10:0x0166, B:14:0x0014, B:15:0x010d, B:19:0x00cb, B:21:0x00d2, B:25:0x0120, B:27:0x0150), top: B:2:0x0007 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayaq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayaq(this.c, this.d, ffguVar);
    }
}
