package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eahi extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ eahj f;
    final /* synthetic */ pot g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eahi(eahj eahjVar, pot potVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = eahjVar;
        this.g = potVar;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eahi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x012c: INVOKE (r5 I:java.io.Closeable), (r12 I:java.lang.Throwable) STATIC call: ffig.a(java.io.Closeable, java.lang.Throwable):void A[MD:(java.io.Closeable, java.lang.Throwable):void (m)] (LINE:301), block:B:53:0x012c */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:5:0x0010, B:6:0x00b8, B:10:0x00c9, B:11:0x0100, B:14:0x010c, B:19:0x0114, B:20:0x011a, B:21:0x0120, B:22:0x00df, B:23:0x00f5, B:25:0x0029, B:28:0x0033, B:30:0x0044, B:33:0x0048, B:35:0x0069, B:38:0x007f, B:40:0x0089, B:43:0x009f, B:47:0x0062), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #0 {all -> 0x0015, blocks: (B:5:0x0010, B:6:0x00b8, B:10:0x00c9, B:11:0x0100, B:14:0x010c, B:19:0x0114, B:20:0x011a, B:21:0x0120, B:22:0x00df, B:23:0x00f5, B:25:0x0029, B:28:0x0033, B:30:0x0044, B:33:0x0048, B:35:0x0069, B:38:0x007f, B:40:0x0089, B:43:0x009f, B:47:0x0062), top: B:2:0x0006 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eahi(this.f, this.g, this.h, ffguVar);
    }
}
