package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvmd {
    static final ejui a = new ejtz("StatelessSignatureDataService");
    public static final entd b = entd.c("StatelessDataService");
    public final adgk c;
    public final errl d;
    private final ejvb e;
    private final ejvp f;

    public cvmd(ejvb ejvbVar, adgk adgkVar, errl errlVar, ejvp ejvpVar) {
        this.e = ejvbVar;
        this.c = adgkVar;
        this.d = errlVar;
        this.f = ejvpVar;
    }

    public final ejuh a() {
        eros erosVar = new eros() { // from class: cvmc
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                cvmd cvmdVar = cvmd.this;
                final elfl a2 = cvmdVar.c.a();
                final elfl i = a2.i(new eroh() { // from class: cvma
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Optional optional = (Optional) obj;
                        entd entdVar = cvmd.b;
                        optional.getClass();
                        if (!optional.isEmpty()) {
                            return ((cvlg) optional.get()).a();
                        }
                        ((ensz) cvmd.b.n().h("com/google/android/apps/messaging/signature/dataservice/StatelessSignatureDataService", "loadSignatureFromFeatureIfPresent", 55, "StatelessSignatureDataService.java")).q("The signature feature was not available.");
                        return elfo.e(Optional.empty());
                    }
                }, cvmdVar.d);
                return new erph(elfo.m(a2, i).a(new Callable() { // from class: cvmb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = cvmd.b;
                        Optional optional = (Optional) erqt.q(elfl.this);
                        if (optional.isEmpty()) {
                            ((ensz) cvmd.b.n().h("com/google/android/apps/messaging/signature/dataservice/StatelessSignatureDataService", "loadDataFromFeature", 76, "StatelessSignatureDataService.java")).q("No signature was provided.");
                            return Optional.empty();
                        }
                        elfl elflVar = a2;
                        ((ensz) cvmd.b.n().h("com/google/android/apps/messaging/signature/dataservice/StatelessSignatureDataService", "loadDataFromFeature", 80, "StatelessSignatureDataService.java")).q("Found a signature.");
                        String str = (String) optional.get();
                        return Optional.of(new cvly(str));
                    }
                }, cvmdVar.d));
            }
        };
        ejui ejuiVar = a;
        ejuy ejuyVar = new ejuy(this.e, erosVar, ejuiVar);
        this.f.a(elfo.e(null), ejuiVar);
        return ejuyVar;
    }
}
