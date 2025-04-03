package defpackage;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avvj implements avvo {
    final /* synthetic */ avvq a;

    public avvj(avvq avvqVar) {
        this.a = avvqVar;
    }

    @Override // defpackage.avvo
    public final String a() {
        return "FinalState";
    }

    @Override // defpackage.avvo
    public final void b(avvi avviVar) {
        Object a;
        ensz enszVar = (ensz) avvq.a.h();
        enszVar.Y(cqpo.a, this.a.c);
        enszVar.Y(cqpo.i, "FinalState");
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$FinalState", "enter", 256, "InProgressFileTransfer.java")).q("Finalizing the HTTP execution flow.");
        int b = avviVar.b() - 1;
        if (b != 2) {
            if (b != 3) {
                throw new IllegalStateException(String.format("Transfer id %s finished with wrong event: %s.", this.a.c, avvh.a(avviVar.b())));
            }
            this.a.j.a.b(new avxb(avviVar.c()));
            return;
        }
        avvq avvqVar = this.a;
        UrlResponseInfo urlResponseInfo = ((avur) avviVar.d()).a;
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        avxm avxmVar = avvqVar.j;
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (httpStatusCode == 200 || httpStatusCode == 206) {
            a = avxf.a(avxmVar.b);
        } else {
            avvc g = avvd.g();
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            g.e(httpStatusCode);
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            Comparator comparator2 = eniz.a;
            comparator.getClass();
            g.d(eniz.a(allHeaders, comparator));
            a = new avxb(g.a());
        }
        avxmVar.a.b(a);
    }

    @Override // defpackage.avvo
    public final void c() {
        throw new IllegalStateException(String.format("Transfer id %s can't exit from %s.", this.a.c, "FinalState"));
    }
}
