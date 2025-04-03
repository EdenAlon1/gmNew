package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efil extends efet {
    private final eyhs a;

    public efil(eyhs eyhsVar) {
        this.a = eyhsVar;
    }

    @Override // defpackage.efet
    public final ListenableFuture a(final IOException iOException, efeu efeuVar) {
        return !(iOException.getCause() instanceof eygu) ? erqt.h(iOException) : ernq.g(efeuVar.a(erqt.i(this.a)), IOException.class, new eroh() { // from class: efik
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, erpp.a);
    }
}
