package defpackage;

import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbio extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler");
    private final cbit b;
    private final errl c;
    private final errl d;

    public cbio(cbit cbitVar, errl errlVar, errl errlVar2) {
        this.b = cbitVar;
        this.c = errlVar;
        this.d = errlVar2;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ResizingHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cbiv.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cbiq a2;
        cbiv cbivVar = (cbiv) eyhsVar;
        awup awupVar = cbivVar.d;
        if (awupVar == null) {
            awupVar = awup.a;
        }
        ContentType d = awuq.d(awupVar);
        ensk h = a.h();
        h.Y(ente.a, "BugleResizing");
        enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler", "processPendingWorkItemAsync", 60, "ResizingHandler.java");
        awup awupVar2 = cbivVar.d;
        if (awupVar2 == null) {
            awupVar2 = awup.a;
        }
        enrrVar.D("Original content type: %s. Resolved content type: %s", awupVar2, d);
        cbit cbitVar = this.b;
        cbiy cbiyVar = cbivVar.c;
        if (cbiyVar == null) {
            cbiyVar = cbiy.a;
        }
        if (cbit.d(d)) {
            a2 = cbitVar.c.a(cbiyVar, d);
        } else {
            if (!cbit.e(d)) {
                ensk j = cbit.a.j();
                j.Y(ente.a, "BugleResizing");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "createResizingJob", 95, "ResizingManagerV2.java")).t("Unsupported type for input Uri: %s", cbiyVar.c);
                ((akzt) cbitVar.e.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
                throw new IllegalArgumentException("Unsupported input uri: ".concat(String.valueOf(cbiyVar.c)));
            }
            a2 = cbitVar.d.a(cbiyVar, d);
        }
        return a2.c().h(new emwl() { // from class: cbim
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Bundle bundle = new Bundle();
                cbiq cbiqVar = cbiq.this;
                bundle.putCharArray("output_uri", cbiqVar.b.toString().toCharArray());
                bundle.putInt("status", cbjb.a(cbiqVar.d()));
                ContentType contentType = cbiqVar.e;
                bundle.putCharArray("content_type", (contentType != null ? contentType.toString() : "*/*").toCharArray());
                ceys h2 = ceyt.h();
                h2.b(true);
                h2.c(false);
                h2.d(false);
                ((cetn) h2).c = bundle;
                return h2.a();
            }
        }, this.c).e(Exception.class, new emwl() { // from class: cbin
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j2 = cbio.a.j();
                j2.Y(ente.a, "BugleResizing");
                ((enrr) ((enrr) ((enrr) j2).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler", "processPendingWorkItemAsync", 94, "ResizingHandler.java")).q("ResizingHandler failed.");
                return ceyt.k();
            }
        }, this.d);
    }
}
