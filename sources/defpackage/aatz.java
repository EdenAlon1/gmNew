package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatz extends okl implements aasu {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource");
    private final ecrj b;
    private final alxy c;
    private final aaul d;
    private final aauf e;
    private final aauo f;
    private final aaup g;
    private final aaue h;
    private final aasz i = new aasz();
    private final aaua j;

    public aatz(ecrj ecrjVar, alxy alxyVar, aaul aaulVar, aauf aaufVar, aauo aauoVar, aaup aaupVar) {
        this.b = ecrjVar;
        this.c = alxyVar;
        this.d = aaulVar;
        this.e = aaufVar;
        this.f = aauoVar;
        this.g = aaupVar;
        this.h = new aaue(alxyVar);
        this.j = new aaua(this, aauoVar, alxyVar);
    }

    private final void i(oke okeVar) {
        ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "logInfo", 374, "MessageListPagingSource.kt")).B("pagingKey: %s, load size: %d", okeVar.a(), okeVar.b);
    }

    private final void j(oke okeVar) {
        ((enrr) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "logWarn", 378, "MessageListPagingSource.kt")).B("pagingKey: %s, load size: %d", okeVar.a(), okeVar.b);
    }

    private final void k(ecri ecriVar) {
        this.b.f(ecriVar, alrv.b, null, ecrh.SUCCESS);
        ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "onPagingDone", 232, "MessageListPagingSource.kt")).q("MessageListPagingSource load complete.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0396, code lost:
    
        if (r5.isBefore(r6.n()) != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x052d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0325 A[Catch: all -> 0x0768, TryCatch #1 {all -> 0x0768, blocks: (B:31:0x0313, B:33:0x0325, B:35:0x032c, B:37:0x0339, B:38:0x033f, B:40:0x0345, B:42:0x0366, B:44:0x0375, B:45:0x037b, B:47:0x0381, B:49:0x0385, B:53:0x03a2, B:56:0x03af, B:62:0x03bf), top: B:30:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0345 A[Catch: all -> 0x0768, TryCatch #1 {all -> 0x0768, blocks: (B:31:0x0313, B:33:0x0325, B:35:0x032c, B:37:0x0339, B:38:0x033f, B:40:0x0345, B:42:0x0366, B:44:0x0375, B:45:0x037b, B:47:0x0381, B:49:0x0385, B:53:0x03a2, B:56:0x03af, B:62:0x03bf), top: B:30:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03a2 A[Catch: all -> 0x0768, TryCatch #1 {all -> 0x0768, blocks: (B:31:0x0313, B:33:0x0325, B:35:0x032c, B:37:0x0339, B:38:0x033f, B:40:0x0345, B:42:0x0366, B:44:0x0375, B:45:0x037b, B:47:0x0381, B:49:0x0385, B:53:0x03a2, B:56:0x03af, B:62:0x03bf), top: B:30:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03af A[Catch: all -> 0x0768, TryCatch #1 {all -> 0x0768, blocks: (B:31:0x0313, B:33:0x0325, B:35:0x032c, B:37:0x0339, B:38:0x033f, B:40:0x0345, B:42:0x0366, B:44:0x0375, B:45:0x037b, B:47:0x0381, B:49:0x0385, B:53:0x03a2, B:56:0x03af, B:62:0x03bf), top: B:30:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046f  */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.oke r26, defpackage.ffgu r27) {
        /*
            Method dump skipped, instructions count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aatz.a(oke, ffgu):java.lang.Object");
    }

    @Override // defpackage.okl
    public final /* bridge */ /* synthetic */ Object b(okm okmVar) {
        Integer num = okmVar.b;
        alxw b = num != null ? this.c.b(num) : null;
        ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "getRefreshKey", 69, "MessageListPagingSource.kt")).D("Refreshing from key %s and and position %d", b, okmVar.b);
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:21:0x008f, B:23:0x0099, B:27:0x00a8, B:30:0x00da, B:32:0x00f3, B:36:0x0114, B:37:0x0129, B:39:0x0142, B:40:0x0163), top: B:20:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[Catch: all -> 0x0181, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:21:0x008f, B:23:0x0099, B:27:0x00a8, B:30:0x00da, B:32:0x00f3, B:36:0x0114, B:37:0x0129, B:39:0x0142, B:40:0x0163), top: B:20:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.okl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.oke r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aatz.c(oke, ffgu):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    @Override // defpackage.okl
    public final boolean d() {
        return true;
    }
}
