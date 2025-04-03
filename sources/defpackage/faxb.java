package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class faxb implements fawj {
    public final fawx a;
    public final faxd b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final favs f;
    private final CronetEngine g;
    private final ExecutorService h;

    public faxb(String str, String str2, favs favsVar, CronetEngine cronetEngine, ExecutorService executorService, fawx fawxVar, faxd faxdVar) {
        this.d = str;
        this.e = str2;
        this.f = favsVar;
        this.g = cronetEngine;
        this.h = executorService;
        this.a = fawxVar;
        this.b = faxdVar;
    }

    @Override // defpackage.fawj
    public final long a() {
        return this.b.a.get();
    }

    @Override // defpackage.fawj
    public final ListenableFuture b() {
        UrlRequest.Builder newUrlRequestBuilder = this.g.newUrlRequestBuilder(this.d, this.a, this.h);
        newUrlRequestBuilder.setHttpMethod(this.e);
        for (String str : this.f.c()) {
            Iterator it = this.f.b(str).iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(str, (String) it.next());
            }
        }
        if (!this.f.f(fhpi.a)) {
            newUrlRequestBuilder.addHeader(fhpi.a, erly.b.toString());
        }
        faxd faxdVar = this.b;
        newUrlRequestBuilder.addHeader("Content-Length", String.valueOf(faxdVar != null ? faxdVar.c : 0L));
        faxd faxdVar2 = this.b;
        if (faxdVar2 != null) {
            newUrlRequestBuilder.setUploadDataProvider(faxdVar2, this.h);
        }
        if (newUrlRequestBuilder instanceof ExperimentalUrlRequest.Builder) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) newUrlRequestBuilder;
            builder.setTrafficStatsTag(-1);
            builder.setTrafficStatsUid(-1);
        }
        this.c = newUrlRequestBuilder.build();
        this.h.execute(new Runnable() { // from class: faxa
            @Override // java.lang.Runnable
            public final void run() {
                faxb.this.c.start();
            }
        });
        return this.a.a;
    }

    @Override // defpackage.fawj
    public final String d() {
        return this.d;
    }

    @Override // defpackage.fawj
    public final void e(final fawn fawnVar, final int i, final int i2) {
        this.h.execute(new Runnable() { // from class: fawz
            @Override // java.lang.Runnable
            public final void run() {
                faxb faxbVar = faxb.this;
                faxd faxdVar = faxbVar.b;
                if (faxdVar != null) {
                    int i3 = i2;
                    int i4 = i;
                    fawn fawnVar2 = fawnVar;
                    faxdVar.d = i4;
                    faxdVar.e = i3;
                    faxdVar.b = new faxc(fawnVar2, faxbVar);
                }
            }
        });
    }

    @Override // defpackage.fawj
    public final void f() {
        if (this.c != null) {
            this.h.execute(new Runnable() { // from class: fawy
                @Override // java.lang.Runnable
                public final void run() {
                    faxb.this.c.cancel();
                }
            });
        }
    }
}
