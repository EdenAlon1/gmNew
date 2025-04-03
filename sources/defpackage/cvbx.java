package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cvbx implements eroh {
    public final /* synthetic */ cvcg a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        final Exception exc = (Exception) obj;
        if (!((Boolean) cvcg.b.e()).booleanValue() || (exc instanceof CancellationException)) {
            return elfo.d(exc);
        }
        cvcg cvcgVar = this.a;
        return cvcgVar.e.b(exc).i(new eroh() { // from class: cvcd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                cskc cskcVar = cvcg.a;
                return elfo.d(exc);
            }
        }, cvcgVar.d);
    }
}
