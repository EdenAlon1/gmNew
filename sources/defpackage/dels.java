package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dels extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ delt c;
    final /* synthetic */ WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dels(delt deltVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = deltVar;
        this.d = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dels) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01fa, code lost:
    
        if (r11.d(r10) != r2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ad, code lost:
    
        if (r11.h(r0, r10) != r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if (r11 != r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0082, code lost:
    
        if (r11 != r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016a A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0054 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x000f, B:5:0x01fd, B:8:0x0014, B:9:0x01af, B:10:0x01ea, B:14:0x001b, B:15:0x0162, B:17:0x016a, B:19:0x0178, B:21:0x018c, B:23:0x01cd, B:25:0x0022, B:26:0x00e6, B:28:0x00ea, B:30:0x00f5, B:36:0x0104, B:37:0x0109, B:38:0x010a, B:40:0x012b, B:42:0x0149, B:45:0x011a, B:46:0x0027, B:47:0x00ba, B:49:0x00be, B:51:0x00c9, B:54:0x002c, B:55:0x0084, B:57:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a8, B:65:0x0030, B:66:0x004e, B:68:0x0054, B:70:0x0072, B:73:0x003a), top: B:2:0x000c }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dels.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dels(this.c, this.d, ffguVar);
    }
}
