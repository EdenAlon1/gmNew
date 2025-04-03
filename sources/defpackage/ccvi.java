package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvi extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ ccvj g;
    final /* synthetic */ ccvl h;
    final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvi(ccvj ccvjVar, ccvl ccvlVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = ccvjVar;
        this.h = ccvlVar;
        this.i = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccvi) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        if (r8.e.d(r11) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006f, code lost:
    
        if (r9 != r6) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0010, B:8:0x0134, B:18:0x0028, B:20:0x011e, B:25:0x003e, B:27:0x00d5, B:28:0x00e1, B:29:0x00e4, B:30:0x015f, B:31:0x0162, B:32:0x00e8, B:33:0x00ed, B:34:0x00ee, B:37:0x00ff, B:40:0x00f7, B:42:0x013a, B:47:0x0152, B:48:0x015e, B:50:0x0053, B:52:0x0071, B:54:0x0080, B:55:0x00b1, B:59:0x008a, B:61:0x0091, B:62:0x009b, B:64:0x00a3, B:65:0x00ad, B:67:0x0062), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0010, B:8:0x0134, B:18:0x0028, B:20:0x011e, B:25:0x003e, B:27:0x00d5, B:28:0x00e1, B:29:0x00e4, B:30:0x015f, B:31:0x0162, B:32:0x00e8, B:33:0x00ed, B:34:0x00ee, B:37:0x00ff, B:40:0x00f7, B:42:0x013a, B:47:0x0152, B:48:0x015e, B:50:0x0053, B:52:0x0071, B:54:0x0080, B:55:0x00b1, B:59:0x008a, B:61:0x0091, B:62:0x009b, B:64:0x00a3, B:65:0x00ad, B:67:0x0062), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0010, B:8:0x0134, B:18:0x0028, B:20:0x011e, B:25:0x003e, B:27:0x00d5, B:28:0x00e1, B:29:0x00e4, B:30:0x015f, B:31:0x0162, B:32:0x00e8, B:33:0x00ed, B:34:0x00ee, B:37:0x00ff, B:40:0x00f7, B:42:0x013a, B:47:0x0152, B:48:0x015e, B:50:0x0053, B:52:0x0071, B:54:0x0080, B:55:0x00b1, B:59:0x008a, B:61:0x0091, B:62:0x009b, B:64:0x00a3, B:65:0x00ad, B:67:0x0062), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0010, B:8:0x0134, B:18:0x0028, B:20:0x011e, B:25:0x003e, B:27:0x00d5, B:28:0x00e1, B:29:0x00e4, B:30:0x015f, B:31:0x0162, B:32:0x00e8, B:33:0x00ed, B:34:0x00ee, B:37:0x00ff, B:40:0x00f7, B:42:0x013a, B:47:0x0152, B:48:0x015e, B:50:0x0053, B:52:0x0071, B:54:0x0080, B:55:0x00b1, B:59:0x008a, B:61:0x0091, B:62:0x009b, B:64:0x00a3, B:65:0x00ad, B:67:0x0062), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0010, B:8:0x0134, B:18:0x0028, B:20:0x011e, B:25:0x003e, B:27:0x00d5, B:28:0x00e1, B:29:0x00e4, B:30:0x015f, B:31:0x0162, B:32:0x00e8, B:33:0x00ed, B:34:0x00ee, B:37:0x00ff, B:40:0x00f7, B:42:0x013a, B:47:0x0152, B:48:0x015e, B:50:0x0053, B:52:0x0071, B:54:0x0080, B:55:0x00b1, B:59:0x008a, B:61:0x0091, B:62:0x009b, B:64:0x00a3, B:65:0x00ad, B:67:0x0062), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccvi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccvi(this.g, this.h, this.i, ffguVar);
    }
}
