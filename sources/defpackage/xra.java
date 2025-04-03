package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xra {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter");
    public final Context b;
    public final ffsk c;
    public final ffbr d;
    public final ajjc e;
    public final ffbr f;
    private final fazb g;
    private final ydb h;
    private final atcv i;

    public xra(Context context, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ajjc ajjcVar, ffbr ffbrVar2, fazb fazbVar, ydb ydbVar, atcv atcvVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ajjcVar.getClass();
        ffbrVar2.getClass();
        fazbVar.getClass();
        ydbVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = ffbrVar;
        this.e = ajjcVar;
        this.f = ffbrVar2;
        this.g = fazbVar;
        this.h = ydbVar;
        this.i = atcvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xqt
            if (r0 == 0) goto L13
            r0 = r5
            xqt r0 = (defpackage.xqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xqt r0 = new xqt
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.f
            java.lang.Object r5 = r5.b()
            comc r5 = (defpackage.comc) r5
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L4e
        L42:
            ctau r5 = (defpackage.ctau) r5
            boolean r5 = r5.e
            if (r5 == 0) goto L4b
            xrc r5 = defpackage.xrc.a
            return r5
        L4b:
            xrc r5 = defpackage.xrc.b
            return r5
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xra.a(ffgu):java.lang.Object");
    }

    public final void b() {
        if (!this.i.a()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 172, "DirectSendImageCompressionUiAdapter.kt")).q("Skipping cancelAllAttachmentPostProcessing");
            return;
        }
        List<xhp> list = ((xhu) this.h.a.c()).b;
        ensk g = a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 178, "DirectSendImageCompressionUiAdapter.kt")).t("Cancelling attachment post processing after image compression settings change for %s", list);
        final ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (xhp xhpVar : list) {
            if ((xhpVar instanceof xho) && ffkj.e(xhq.b(xhpVar), drlu.a)) {
                ensk e2 = a.e();
                e2.Y(ente.a, "BugleComposeRow2");
                ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 188, "DirectSendImageCompressionUiAdapter.kt")).t("Cancelling post processing for %s", xhpVar);
                xhpVar = ((xzv) this.g.b()).a((xho) xhpVar);
            }
            arrayList.add(xhpVar);
        }
        List list2 = this.h.a(new ffji() { // from class: xqi
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhu.c(xhuVar, null, arrayList, null, false, null, null, false, 0, 1021);
            }
        }).b;
        if (!ffkj.e(list2, list)) {
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DirectSendImageCompressionUiAdapter.kt")).t("Attachments changed while cancelling attachment post processing, expected: %s", list);
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 209, "DirectSendImageCompressionUiAdapter.kt")).D("Cancelled attachment post processing and updated attachments to %s from %s", arrayList, list2);
    }

    public final Object c(xrc xrcVar, xrc xrcVar2) {
        ((akzt) this.d.b()).e("Bugle.DirectSend.FastImageSending.OptionSelected.Count", xrd.a(xrcVar, xrcVar2) - 1);
        return ffcu.a;
    }
}
