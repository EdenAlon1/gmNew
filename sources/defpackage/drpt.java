package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffji c;
    final /* synthetic */ drpu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drpt(ffji ffjiVar, drpu drpuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjiVar;
        this.d = drpuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drpt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:(6:4|5|6|7|(1:9)(1:67)|(9:11|12|13|15|(6:17|(4:26|27|28|(7:33|(3:35|36|(3:44|(1:46)|47))|(5:51|52|(1:54)|55|56)|49|(1:21)(1:25)|22|23)(1:32))|19|(0)(0)|22|23)|60|(0)(0)|22|23)(2:64|65))(1:76))(1:105)|77|78|79|80|81|82|(3:84|(1:86)|(1:88)(2:89|90))|12|13|15|(0)|60|(0)(0)|22|23|(4:(0)|(1:101)|(1:72)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0028, code lost:
    
        if (r0 != r2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007c, code lost:
    
        ((defpackage.enrr) ((defpackage.enrr) defpackage.drpu.a.j()).g(r0).h("com/google/android/libraries/compose/media/metadata/ImageMetadataResolver$resolve$2", "invokeSuspend", 30, "ImageMetadataResolver.kt")).q("Failed to resolve size from EXIF, retrying with BitmapFactory");
        r0 = r16.c;
        r16.a = r7;
        r16.b = 2;
        r0 = r0.invoke(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a6, code lost:
    
        if (r0 != r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drpt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drpt(this.c, this.d, ffguVar);
    }
}
