package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdid extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cdif e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdid(cdif cdifVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = cdifVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdid) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        r11 = r9.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        if (r9.l() != defpackage.epeg.NO_SQS_STORAGE_QUOTA_FOR_MEDIA) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        r12 = defpackage.csgh.MEDIA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r13 = defpackage.cdig.a.h();
        r13.Y(defpackage.ente.a, "BugleCms");
        r13 = (defpackage.enrr) r13;
        r13.W(10, java.util.concurrent.TimeUnit.SECONDS);
        ((defpackage.enrr) r13.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/ResumeSqsMediaUploadWorkDelegateImpl$InternalResumeSqsMediaUploadWorkDelegateImpl$resumeSqsMediaUpload$2", "invokeSuspend", 128, "ResumeSqsMediaUploadWorkDelegateImpl.kt")).t("Starting to restore media with part id %s", r10);
        r9 = r9.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        if (r9 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
    
        r9 = r9.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        r14 = new defpackage.pon();
        r14.g("media_upload_type_key", r12.e);
        r14.e("target_id_key", r10);
        r14.f("is_initial_sync", false);
        r14.g("attempt_count_key", r9 + 1);
        r9 = r14.a();
        r12 = r17.e;
        r17.a = r2;
        r17.b = r10;
        r17.c = r11;
        r17.d = 2;
        r9 = r12.c(r10, r9, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0127, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
    
        r10 = r2;
        r2 = r11;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        r12 = defpackage.csgh.COMPRESSED_IMAGE;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x014a -> B:7:0x00a7). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdid.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdid(this.e, ffguVar);
    }
}
