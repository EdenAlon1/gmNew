package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cely implements cdwp {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/CmsSimFallbackErrorHandler");
    private final cbwj b;

    public cely(cbwj cbwjVar) {
        cbwjVar.getClass();
        this.b = cbwjVar;
    }

    @Override // defpackage.cdwp
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, ceuw ceuwVar, cdws cdwsVar, Exception exc, ffgu ffguVar) {
        celz celzVar = (celz) obj;
        cemd cemdVar = (cemd) obj2;
        if ((exc instanceof CancellationException) || ceuwVar.b()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).g(exc).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/CmsSimFallbackErrorHandler", "handlePermanentFailure", 54, "CmsSimFallbackErrorHandler.kt")).t("Phone Fallback Message Sending was cancelled for CmdId: %s", cemdVar.c);
            return ffcu.a;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) j).g(exc).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/CmsSimFallbackErrorHandler", "handlePermanentFailure", 61, "CmsSimFallbackErrorHandler.kt")).D("Could not send message via Phone Fallback. CmsId: %s, Processor: %s", cemdVar.c, cdwsVar.getClass().getName());
        String str = cemdVar.c;
        str.getClass();
        Object b = b(celzVar, str, ffguVar);
        return b != ffhh.a ? ffcu.a : b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (defpackage.fgfz.c(r11, r0) != r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:20:0x004a, B:21:0x00a6, B:26:0x005c, B:44:0x00d4, B:46:0x00de, B:49:0x0104), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104 A[Catch: all -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:20:0x004a, B:21:0x00a6, B:26:0x005c, B:44:0x00d4, B:46:0x00de, B:49:0x0104), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [celz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.celz r10, final java.lang.String r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cely.b(celz, java.lang.String, ffgu):java.lang.Object");
    }
}
