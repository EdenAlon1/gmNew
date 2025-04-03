package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cihd implements eroh {
    public final /* synthetic */ cihh a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        final cihh cihhVar = this.a;
        String str = cihhVar.g;
        final fcdu fcduVar = (fcdu) obj;
        enwb a = enwg.a();
        a.c(new enwo("PullHandler", str));
        try {
            return (elfl) new enwa(a, new Callable() { // from class: cihe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cihh.this.c(fcduVar);
                }
            }).call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("checked exception caught during context call", e2);
        }
    }
}
