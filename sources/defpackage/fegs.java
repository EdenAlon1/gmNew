package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegs extends fegu {
    private final feuf d;

    public fegs(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new feuf(executor);
    }

    @Override // defpackage.fegu
    public final void a(final int i, fegy fegyVar) {
        final Parcel a = fegyVar.a();
        this.d.execute(new Runnable() { // from class: fegr
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (fegs.this.c(i, a)) {
                        return;
                    }
                    fegu.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                } catch (Exception e) {
                    fegu.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
                }
            }
        });
        fegyVar.b();
    }
}
