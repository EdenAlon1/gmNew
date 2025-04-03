package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egex {
    public final egcn a;
    public final errl b;
    public final ewjg c;
    public final egct d;
    public final egjw e;
    public volatile ListenableFuture f;
    public final llg g = new llg();
    private final eghe h;
    private final dulp i;

    public egex(egcn egcnVar, errl errlVar, ewjg ewjgVar, egct egctVar, eghe egheVar, dulp dulpVar, egjw egjwVar) {
        this.a = egcnVar;
        this.b = errlVar;
        this.c = ewjgVar;
        this.d = egctVar;
        this.h = egheVar;
        this.i = dulpVar;
        this.e = egjwVar;
    }

    public final void a(List list, emwl emwlVar) {
        int i = true != this.i.b((Uri) enjk.i(list, null)) ? 3 : 2;
        final eghe egheVar = this.h;
        this.f = erqt.e(enkr.g(list, new emwl() { // from class: eghd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Uri uri = (Uri) obj;
                egal egalVar = new egal();
                egalVar.b();
                egalVar.d();
                int b = (int) fdrj.a.get().b();
                eghe egheVar2 = eghe.this;
                qqo q = egheVar2.b.b(qpt.c(egheVar2.a).b(), uri, egalVar).q(new rig().Q(b, b));
                if (egaj.a.contains(uri.getScheme())) {
                    q = (qqo) ((qqo) q.D(qvx.c)).ai();
                }
                return qsl.a((qqo) q.z());
            }
        }));
        erqt.r(this.f, new egew(this, emwlVar, i), this.b);
    }
}
