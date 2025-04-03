package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdqs implements cdwr {
    public final axkm b;
    private final Context d;
    private final ffbr e;
    private final ffbr f;
    private final asjk g;
    private final dtuu h;
    private final cdoa i;
    private final bcwz j;
    private final axdf k;
    private final cqoh l;
    private final asid m;
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/queuer/CmsMediaUploadQueuerWorkItemProcessor");
    public static final List a = ffdx.g(csgg.SUCCEED_VIA_BATCH_BACKUP, csgg.MERGED_FROM_CMS);

    /* compiled from: PG */
    public interface a {
        cdnd cb();
    }

    public cdqs(Context context, ffbr ffbrVar, ffbr ffbrVar2, asjk asjkVar, dtuu dtuuVar, axkm axkmVar, cdoa cdoaVar, bcwz bcwzVar, axdf axdfVar, cqoh cqohVar, asid asidVar) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        dtuuVar.getClass();
        axkmVar.getClass();
        bcwzVar.getClass();
        axdfVar.getClass();
        cqohVar.getClass();
        asidVar.getClass();
        this.d = context;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = asjkVar;
        this.h = dtuuVar;
        this.b = axkmVar;
        this.i = cdoaVar;
        this.j = bcwzVar;
        this.k = axdfVar;
        this.l = cqohVar;
        this.m = asidVar;
    }

    private final Object h() {
        eper eperVar = (eper) epes.a.createBuilder();
        eperVar.getClass();
        epna.g(2, eperVar);
        epna.d(0L, eperVar);
        epna.c(eobe.a, eperVar);
        epna.e(epfx.MEDIA_BACKUP, eperVar);
        epna.b(true, eperVar);
        this.k.o(epna.a(eperVar));
        return ffcu.a;
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cdvx) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cdqu
            if (r0 == 0) goto L13
            r0 = r6
            cdqu r0 = (defpackage.cdqu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdqu r0 = new cdqu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Class r5 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r6)
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            android.content.Context r6 = r4.d
            ffbr r2 = r4.f
            java.lang.Object r2 = r2.b()
            babm r2 = (defpackage.babm) r2
            elfl r5 = r2.b(r5)
            r0.a = r6
            java.lang.Class<cdqs$a> r2 = cdqs.a.class
            r0.e = r2
            r0.d = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L64
            r0 = r6
            r6 = r5
            r5 = r2
        L55:
            eisx r6 = (defpackage.eisx) r6
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r5 = defpackage.ekhv.a(r0, r5, r6)
            cdqs$a r5 = (cdqs.a) r5
            cdnd r5 = r5.cb()
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdqs.b(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r17, int r18, defpackage.eyja r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdqs.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, int, eyja, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return f((cdvx) obj2, ffguVar);
    }

    public final boolean e(String str, csgh csghVar, axez axezVar, cdnd cdndVar, eyja eyjaVar) {
        try {
            ensk h = c.h();
            h.Y(ente.a, "BugleCmsMediaBackup");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/queuer/CmsMediaUploadQueuerWorkItemProcessor", "enqueueSinglePartIdForMediaBackup", 236, "CmsMediaUploadQueuerWorkItemProcessor.kt")).J("%s Queuing part ID = %s of type %s for media upload", "CmsMediaUploadQueuerWorkItemProcessor:", str, csghVar);
            if (this.m.a()) {
                cdndVar.d(str, csghVar, true, axezVar.d, cdqt.a(axezVar), 0, eyjaVar);
                return true;
            }
            cdndVar.c(str, csghVar, true, axezVar.d, cdqt.a(axezVar), 0);
            return true;
        } catch (Exception e) {
            ensk i = c.i();
            i.Y(ente.a, "BugleCmsMediaBackup");
            ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/queuer/CmsMediaUploadQueuerWorkItemProcessor", "enqueueSinglePartIdForMediaBackup", 271, "CmsMediaUploadQueuerWorkItemProcessor.kt")).D("%s Exception when queuing media upload for part ID = %s", "CmsMediaUploadQueuerWorkItemProcessor:", str);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d3, code lost:
    
        if (r7.h() == r2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0316, code lost:
    
        if (r0 == r2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0351, code lost:
    
        if (r15.g(3, r17, r18, true, r0, r9) != r2) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b2 A[Catch: all -> 0x0375, LOOP:2: B:94:0x02ac->B:96:0x02b2, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0375, blocks: (B:93:0x02a9, B:94:0x02ac, B:96:0x02b2), top: B:92:0x02a9 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0316 -> B:16:0x0319). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cdvx r26, defpackage.ffgu r27) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdqs.f(cdvx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(3:18|19|20))(2:30|(4:32|33|(1:35)|23)(1:36))|21))|39|6|7|(0)(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (defpackage.fgfz.c(r0, r3) != r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
    
        r14 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r17, defpackage.eyja r18, int r19, boolean r20, int r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdqs.g(int, eyja, int, boolean, int, ffgu):java.lang.Object");
    }
}
