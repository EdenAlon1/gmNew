package defpackage;

import com.google.android.ims.filetransfer.http.runnable.GbaBootstrapAuthenticationException;
import org.apache.http.HttpResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dish implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ disi c;

    public dish(disi disiVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = disiVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d.b(this.a, ((HttpResponse) obj).getStatusLine().getStatusCode(), dkvj.a().longValue() - this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (((Boolean) disi.b.a()).booleanValue()) {
            if (!(th instanceof GbaBootstrapAuthenticationException)) {
                dkty.j(th, disi.a, "unexpected exception during GBA HTTP request processing", new Object[0]);
                this.c.d.a(eyyl.FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION);
            } else {
                dkty.j(th, disi.a, "GbaBootstrapAuthenticationException from content server %s", this.a);
                this.c.d.a(eyyl.FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE);
            }
        }
    }
}
