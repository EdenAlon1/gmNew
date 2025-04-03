package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlb implements cdwr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreWorkItemProcessor");
    private static final List b = ffdx.g(byyu.CMS_MEDIA_DOWNLOAD_NOT_STARTED, byyu.CMS_MEDIA_DOWNLOAD_FAILED, byyu.CMS_MEDIA_DOWNLOADING);
    private final babm c;
    private final cdjy d;
    private final cdlk e;
    private final Context f;
    private final csum g;
    private final fgjb h;
    private final axdf i;
    private final asiq j;
    private final asjj k;
    private final cqoh l;
    private final asyg m;
    private final ffbr n;

    public cdlb(babm babmVar, cdjy cdjyVar, cdlk cdlkVar, Context context, csum csumVar, fgjb fgjbVar, axdf axdfVar, asiq asiqVar, asjj asjjVar, cqoh cqohVar, asyg asygVar, ffbr ffbrVar) {
        babmVar.getClass();
        context.getClass();
        csumVar.getClass();
        fgjbVar.getClass();
        axdfVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        this.c = babmVar;
        this.d = cdjyVar;
        this.e = cdlkVar;
        this.f = context;
        this.g = csumVar;
        this.h = fgjbVar;
        this.i = axdfVar;
        this.j = asiqVar;
        this.k = asjjVar;
        this.l = cqohVar;
        this.m = asygVar;
        this.n = ffbrVar;
    }

    private final ceyt f(Exception exc, String str, MessageIdType messageIdType, ConversationIdType conversationIdType) {
        boolean z = this.k.a() ? (exc instanceof CronetException) || (exc instanceof fedn) : exc instanceof CronetException;
        ensk j = a.j();
        j.Y(ente.a, "BugleCmsMediaRestore");
        ((enrr) ((enrr) j).g(exc).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreWorkItemProcessor", "failWithException", 294, "CmsLocalMediaRestoreWorkItemProcessor.kt")).D("Unexpected exception occurred during media restore for part %s. Failing %s retry.", str, true != z ? "without" : "with");
        this.e.b(((Boolean) ((cfup) csfu.n.get()).e()).booleanValue() ? byyu.CMS_MEDIA_DOWNLOAD_FAILED : byyu.CMS_MEDIA_DOWNLOAD_NOT_STARTED, conversationIdType, messageIdType, str);
        return z ? ceyt.m() : ceyt.k();
    }

    private final void g(Throwable th, int i) {
        this.i.w(7, true, i, th, 0, null);
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cejh) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v6, types: [comc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cejh r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdlb.b(cejh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(4:(1:(2:12|(10:14|15|16|17|18|19|20|21|22|23)(2:41|42))(11:43|44|45|46|47|48|50|51|52|53|(3:55|(7:57|18|19|20|21|22|23)|58)(3:59|60|61)))(11:89|90|91|92|93|94|95|96|97|(8:99|47|48|50|51|52|53|(0)(0))|58)|88|80|81)(1:112))(3:153|(1:155)|58)|113|114|(3:116|(1:118)|119)(9:121|(3:132|133|(2:138|(7:140|124|125|(1:127)|128|(1:130)|131)(5:141|142|143|(7:145|93|94|95|96|97|(0))|58)))|123|124|125|(0)|128|(0)|131)|120|22|23))|158|6|7|(0)(0)|113|114|(0)(0)|120|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x041e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x035c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x035d, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177 A[Catch: all -> 0x041e, TryCatch #21 {all -> 0x041e, blocks: (B:114:0x014f, B:116:0x0177, B:118:0x019b, B:119:0x01a5, B:121:0x01ac, B:125:0x03a1, B:127:0x03eb, B:128:0x03f3, B:130:0x0407, B:131:0x0414), top: B:113:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ac A[Catch: all -> 0x041e, TRY_LEAVE, TryCatch #21 {all -> 0x041e, blocks: (B:114:0x014f, B:116:0x0177, B:118:0x019b, B:119:0x01a5, B:121:0x01ac, B:125:0x03a1, B:127:0x03eb, B:128:0x03f3, B:130:0x0407, B:131:0x0414), top: B:113:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03eb A[Catch: all -> 0x041e, TryCatch #21 {all -> 0x041e, blocks: (B:114:0x014f, B:116:0x0177, B:118:0x019b, B:119:0x01a5, B:121:0x01ac, B:125:0x03a1, B:127:0x03eb, B:128:0x03f3, B:130:0x0407, B:131:0x0414), top: B:113:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0407 A[Catch: all -> 0x041e, TryCatch #21 {all -> 0x041e, blocks: (B:114:0x014f, B:116:0x0177, B:118:0x019b, B:119:0x01a5, B:121:0x01ac, B:125:0x03a1, B:127:0x03eb, B:128:0x03f3, B:130:0x0407, B:131:0x0414), top: B:113:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0341 A[Catch: all -> 0x02d8, TryCatch #15 {all -> 0x02d8, blocks: (B:19:0x02b1, B:27:0x0339, B:29:0x0341, B:30:0x0344), top: B:18:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028a A[Catch: all -> 0x02dd, Exception -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x02df, all -> 0x02dd, blocks: (B:55:0x028a, B:60:0x02e5, B:61:0x0329), top: B:53:0x0288 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0388 A[Catch: all -> 0x036c, TryCatch #9 {all -> 0x036c, blocks: (B:73:0x0380, B:75:0x0388, B:76:0x038b, B:97:0x0248), top: B:96:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r30, int r31, defpackage.ceuw r32, defpackage.ffgu r33) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdlb.c(java.lang.String, int, ceuw, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return e(ceuwVar, (cejh) obj2, ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        if (b(r9, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ceuw r8, defpackage.cejh r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdlb.e(ceuw, cejh, ffgu):java.lang.Object");
    }
}
