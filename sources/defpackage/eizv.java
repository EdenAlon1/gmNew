package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizv implements ejny {
    public final eiyh a;
    private final eiyx b;
    private final Executor c;

    public eizv(eiyx eiyxVar, eiyh eiyhVar, Executor executor) {
        this.b = eiyxVar;
        this.a = eiyhVar;
        this.c = executor;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        return erny.f(erny.g(erqc.o(this.b.e()), eldl.d(new eroh() { // from class: eizu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return (((eize) obj).b & 1) != 0 ? erqt.i(null) : eizv.this.a.b();
            }
        }), this.c), eldl.a(new emwn(new ppp())), erpp.a);
    }
}
